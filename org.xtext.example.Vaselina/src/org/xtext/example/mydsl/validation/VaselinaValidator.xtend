package org.xtext.example.mydsl.validation

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.types.VaselinaTypes
import org.xtext.example.mydsl.vaselina.BrkStr
import org.xtext.example.mydsl.vaselina.DoWhileExpression
import org.xtext.example.mydsl.vaselina.FuncCall
import org.xtext.example.mydsl.vaselina.FuncDefinition
import org.xtext.example.mydsl.vaselina.FuncParameter
import org.xtext.example.mydsl.vaselina.IfExpression
import org.xtext.example.mydsl.vaselina.StdFunction
import org.xtext.example.mydsl.vaselina.StringRef
import org.xtext.example.mydsl.vaselina.arrayDimension
import org.xtext.example.mydsl.vaselina.arrayRef
import org.xtext.example.mydsl.vaselina.arrayRefs
import org.xtext.example.mydsl.vaselina.numRef
import org.xtext.example.mydsl.vaselina.varAssignment
import org.xtext.example.mydsl.vaselina.varDeclared
import org.xtext.example.mydsl.vaselina.varExpression
import org.xtext.example.mydsl.vaselina.varRef
import org.xtext.example.mydsl.vaselina.varRefs
import org.xtext.example.mydsl.vaselina.doubleRef
import org.xtext.example.mydsl.vaselina.VaselinaPackage
import org.xtext.example.mydsl.vaselina.Or
import org.xtext.example.mydsl.vaselina.And
import org.xtext.example.mydsl.vaselina.Equality
import org.xtext.example.mydsl.vaselina.Comparison
import org.xtext.example.mydsl.vaselina.PlusOrMinus
import org.xtext.example.mydsl.vaselina.MulOrDiv
import org.xtext.example.mydsl.vaselina.Module
import org.xtext.example.mydsl.vaselina.Not
import org.xtext.example.mydsl.vaselina.boolRef
import org.xtext.example.mydsl.vaselina.varReturn
import org.xtext.example.mydsl.vaselina.Inside
import org.xtext.example.mydsl.vaselina.ReturnDeclaration
import org.xtext.example.mydsl.vaselina.AbstractMethodCall

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class VaselinaValidator extends AbstractVaselinaValidator { //	public static final String INVALID_NAME = "invalidName";

	@Inject extension VaselinaTypes

	public static val INVALID_NAME = 'uppercase_only'
	public static val INVALID_DUPLICATE = 'is_duplicate'
	public static val INVALID_FUNCTION_DUPLICATE = 'is_function_duplicate'
	public static val INVALID_BREAK = 'not_valid_break'
	public static val INVALID_TYPES = 'not_valid_type'
	
	@Check
	def checkBreakStr(BrkStr brk) {
		var isTarget = true
		if (brk.eContainer instanceof IfExpression) {
			if (brk.eContainer.eContainer instanceof DoWhileExpression) {
				isTarget = false
			}
			
		}

		if (isTarget) {
			error('Break statement should go inside an If when used to stop a Loop', VaselinaPackage.Literals.BRK_STR__BRK, INVALID_BREAK)
		}
	}

	@Check
	def checkDuplicateVar(varDeclared check) {
		var mapping_cnt = 0
		for (itemto : check.eContainer.eContents) {
			if (itemto instanceof varDeclared) {
				if (check.name.equalsIgnoreCase(itemto.name)) {
					mapping_cnt += 1
				}
			}
		}

		if (mapping_cnt > 1) {
			error('The Variable must be not duplicated.', VaselinaPackage.Literals.VAR_SYMBOL__NAME, INVALID_DUPLICATE)
		}
	}

	@Check
	def checkDuplicateFuncName(FuncDefinition check) {
		var mapping_cnt = 0
		for (itemto : check.eContainer.eContents) {
			if (itemto instanceof FuncDefinition) {
				if (check.name.equalsIgnoreCase(itemto.name)) {
					mapping_cnt += 1
				}
			}
		}

		if (mapping_cnt > 1) {
			error('The Function name must be not duplicated.', VaselinaPackage.Literals.FUNC_DEFINITION__NAME,
				INVALID_FUNCTION_DUPLICATE)
		}
	}

	@Check
	def void checkCompatibleTypes(varExpression exp) {
		val actualType = exp.typeFor
		val expectedType = exp.expectedType

		if (expectedType === null || actualType === null)
			return; // nothing to check
		if (!actualType.isConformant(expectedType)) {
			error("Incompatible types. This expression should not be of " + expectedType + " type.", null,
				INVALID_TYPES);
		}
	}
	
	@Check
	def void checkReturnDeclaration(ReturnDeclaration r){
		if(!(r.eContainer instanceof FuncDefinition)){
			error("Declaring keeping type is not applicable outside a Function definition", null);
		}
	}
	
	
	@Check
	def funcStructurecheck(FuncDefinition f) {
		var targetR = false
		var targetV = false
		var flag = false
		var flagInternal1 = false
		var flagInternal2 = false
		var varReturn varRtn1 
		var varReturn varRtn2
		var ReturnDeclaration rtnDec
		var varReturn varExterno
		
		for(b: f.body){
			
			if ((b instanceof ReturnDeclaration)){
				if (targetV){
					flag = true
				} else {
					targetR = true
				}
				rtnDec = b
				
			} else if ((b instanceof varReturn)){
				if(targetR){
					flag = true
				} else {
					targetV = true
				}
				varExterno = b
			} 
		}

		if(flag){
			if(!(varExterno.rtn.typeReturn.equals(rtnDec.rtnType))){
				error("Type keeping for function is not equal to the actual type kept", null);
			}
		} 
		
		
		if(targetR){
			if(!flag){
			for(b: f.body){
			if (b instanceof IfExpression){
				
				for(bb: b.then){
					if (bb instanceof varReturn){
						flagInternal1 = true
						varRtn1 = bb
					}
				} 
				for(bb: b.^else){
					if (bb instanceof varReturn){
						flagInternal2 = true
						varRtn2 = bb
					}
				}   
				
			}
		}
		
		if(flagInternal1 && flagInternal2){
			var rtnInt1 = varRtn1.rtn.typeReturn
			var rtnInt2 = varRtn2.rtn.typeReturn
			if(!(rtnInt1.equals(rtnDec.rtnType) && rtnInt2.equals(rtnDec.rtnType))){
				error("Type keeping for function is not equal to the actual type kept", null);
			}
		}else{
			error("Not enough keep values are provided for keeping type. If using an If structure, do not forget adding (yes) and (no) options", null);
		}
	} else {
		var rtnExterno = varExterno.rtn.typeReturn
		if(!(rtnExterno.equals(rtnDec.rtnType))){
			error("Type keeping for function is not equal to the actual type kept", null);
		}
	}
		
}
		
		
//		if(flag){
//			warning("Watch out declaring a type return and returning a different type", null,
//				INVALID_TYPES);
//		}
	}
	
//	@Check
//	def keepPresentInIf(FuncDefinition f){
//		var flagInternal1 = false
//		var flagInternal2 = false
//		var varReturn varRtn1 
//		var varReturn varRtn2
//		
//		for(b: f.body){
//			if (b instanceof IfExpression){
//				
//				for(bb: b.then){
//					if (bb instanceof varReturn){
//						flagInternal1 = true
//						varRtn1 = bb
//					}
//				} 
//				for(bb: b.^else){
//					if (bb instanceof varReturn){
//						flagInternal2 = true
//						varRtn2 = bb
//					}
//				}   
//				
//			}
//		}
//		
//		
//		
//		
//	}
	
	def wrongDivision(varExpression v){
		var flag = false
		switch (v) {
			MulOrDiv: if(v.op.equals('/')){
				var r = v.right
				switch(r){
					numRef: if(r.value == 0) {flag = true}
					doubleRef: if(r.value.integer == 0 && r.value.decimal == 0) {flag = true}
				}
				
			}
		}
		return flag
	}
	
	
		
	@Check
	def oper_ifOrLoopcheck(varExpression vas) {
		var isConditionOp = false
		var isTarget = false
		if (vas.eContainer instanceof IfExpression || vas.eContainer instanceof DoWhileExpression) {
			if (vas.eContainingFeature.name.equals("ifconditon") ||
				vas.eContainingFeature.name.equals("loopConditon")) {
				isTarget = true
			

//				for (op : vas.op) {
//					if (op.equals(">=") || op.equals("<=") || op.equals("==") || op.equals("!=") || op.equals("<") ||
//						op.equals(">")|| op.equals("and") || op.equals("or")) {
//						isConditionOp = true
//						return
//					}
//				}

				if(typeReturn(vas).equals("bull")){
					isConditionOp = true
			}
		} 

		if (isTarget && !isConditionOp) {
			error("Incompatible expression. Expression should be of bull type", null);
		}

//		if (vas.op.size > 2) {
//			error("Not allowed multiple operation in Right Assignment", null)
//		}
	}
	
	
	}

	@Check
	def checkArrayInDataArea(arrayDimension ar) {
		if (ar.eContainer instanceof varDeclared) {
			if (!ar.index.typeReturn.equals("numb")) {
				error("Array Index should be numb.", null);
				
			}
			
//			if (Integer.valueOf(ar.index.intValue()) < 1) {
//				error("Array Size should be more than number 1.", null);
//			}

			// BigDecimal to Integer
			
		}
		if (ar.eContainer.eContainer instanceof varAssignment){
			if (!ar.index.typeReturn.equals("numb")) {
				error("Array Index should be numb.", null);
				
			}
		}
	}
	
//	def intValue(varExpression v){
//		var rtn = ""
//		if (v.typeReturn.equals("numb")){
//			rtn += v.toString
//		}
//	}

	@Check
	def checkArrayDimension(arrayRefs ar) {
		
		val arRefs = ar.arrRefs
		var arlen = 0
		if(arRefs instanceof varDeclared){
			arlen = arRefs.dim.length
			
		}
		
		//if arRef is a FuncParameter, this token will be excluded as a target of validation. just skip.
		if(arRefs instanceof FuncParameter){
			arlen = ar.dims.length
		}
		// arr = arr[3]
		if (ar.dims.length != arlen) {
			val size = arlen//ar.varRef?.dim.length
			error("Array Dimension Size is Incompatible. Dimension Size is " + size.toString + ".", null);
		}
	
		}
		
	@Check
	def checkArrayDimensionAsExpression(arrayRef ar) {
		
		val arRefs = ar.varRef
		var arlen = 0
		if(arRefs instanceof varDeclared){
			arlen = arRefs.dim.length
			
		}
		
		//if arRef is a FuncParameter, this token will be excluded as a target of validation. just skip.
		if(arRefs instanceof FuncParameter){
			arlen = ar.dim.length
		}
		// arr = arr[3]
		if (ar.dim.length != arlen) {
			val size = arlen//ar.varRef?.dim.length
			error("Array Dimension Size is Incompatible. Dimension Size is " + size.toString + ".", null);
		}
		
		

//		if (ar.dims.size < 1) {
//			error("Array Size should be more than number 1.", null);
//		}
	}
	
	@Check
	def checkStdFuctionArgSize(StdFunction std) {
		val args = std.args.length
		val dfi = getStdDefinition(std.name)
		val defargs = dfi.toCharArray.size

		if (defargs !== args) {
			error("Standard Function arguments size is incompatible. \nThe arguments size is " + defargs.toString + ".",
				null);
		} else {
			val errormsg = stdArgsTypeCompare(std.args, dfi)
			if (!errormsg.empty) {
				error("Standard Function arguments type is incompatible.\n" + errormsg, null);
			}
		}
	}

	def stdArgsTypeCompare(EList<varExpression> inputarg, String dfi) {
		val dfarr = dfi.toCharArray
		var errormsg = new StringBuilder()
		var i = 0

		for (ia : dfarr) {
			var type = ""
			switch ia.toString {
				case "N": type = "numb"
				case "S": type = "strange"
				case "A": type = "any"
				case "O": type = "any"
				case "R": type = "array"
			}

			val itm = inputarg.get(i)
			val tyitm = typeReturn(itm)
			if (!tyitm.contains(type)) {
				if (!(type.equals("any") && (tyitm.contains("numb") || tyitm.contains("bull") || tyitm.contains("strange") || tyitm.contains("dribble") || tyitm.contains("array")))) {
					if (!containsDigit(type, tyitm)) {
						if (type.equals("any")) {
							type = "Numb, Strange, Bull or Dribble" // for Message
						}
						errormsg.append((i + 1).toString + ": " + type + ". Type inserted: "+ tyitm +"\n")
					}
				}
			}
			i += 1
		}

		return errormsg.toString
	}

	def containsDigit(String a, String b) {
		var hasDigit = false

		if (a.equals("numb") && b.equals("numb")) {
			hasDigit = true
		}

		return hasDigit
	}

	@Check
	def checkFuncArgSize(FuncCall sub) {
		val args = sub.args.length
		var sizearg = sub.func.args.size
		val sf = sub.func

		if (sizearg !== args) {
			error("Function arguments size is incompatible. Function's arguments size is " + sizearg.toString + ".", null);
		} else {
			val errormsg = argsTypeCompare(sf, sub.args)
			if (!errormsg.empty) {
				error("Function arguments type is incompatible.\n" + errormsg, null);
			}
		}
	}

	def argsTypeCompare(FuncDefinition defarg, EList<varExpression> callarg) {
		var errormsg = new StringBuilder()
		val dg = defarg.args

		for (item : dg) {
			
			val i = dg.indexOf(item)
				if (item.type != typeReturn(callarg.get(i))) {
					if (containsDigit(item.type, typeReturn(callarg.get(i))) == false) {
						errormsg.append("Required: \n" + (i + 1).toString + ": " + item.type.toString + "\n")
					}
				}

//			if (item instanceof arrayRef) {
//				val i = dg.indexOf(item)
//				if (item.varRef.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.varRef.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
//			
//			if(item instanceof varRef){
//				val i = dg.indexOf(item)
//				if (item.varRef.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.varRef.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
//			
//			if(item instanceof boolRef){
//				val i = dg.indexOf(item)
//				if (item.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
//			
//			if(item instanceof numRef){
//				val i = dg.indexOf(item)
//				if (item.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
//			
//			if(item instanceof StringRef){
//				val i = dg.indexOf(item)
//				if (item.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
//			
//			if(item instanceof doubleRef){
//				val i = dg.indexOf(item)
//				if (item.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
//			
//			if(item instanceof FuncCall){
//				val i = dg.indexOf(item)
//				if (item.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
//			
//			if(item instanceof StdFunction){
//				val i = dg.indexOf(item)
//				if (item.type != typeReturn(callarg.get(i))) {
//					if (containsDigit(item.type, typeReturn(callarg.get(i))) == false) {
//						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
//					}
//				}
//			}
		}

		return errormsg.toString
	}

	def String typeReturn(varExpression t) {
		var rtn = ""
		switch (t) {
			Or: if(t.left.typeReturn.equals("bull") && t.right.typeReturn.equals("bull")) {rtn="bull"}
			And: if(t.left.typeReturn.equals("bull") && t.right.typeReturn.equals("bull")) {rtn="bull"}
			Equality: if(t.left.typeReturn.equals("bull") && t.right.typeReturn.equals("bull") || t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("numb")) {rtn="bull"}
			Comparison: if(t.left.typeReturn.equals("dribble") && t.right.typeReturn.equals("dribble") || t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("numb")) {rtn="bull"}
			PlusOrMinus: if(t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("numb")) {rtn="numb"} else if (t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("dribble")
			||t.left.typeReturn.equals("dribble") && t.right.typeReturn.equals("dribble")||t.left.typeReturn.equals("dribble") && t.right.typeReturn.equals("numb")) {rtn="dribble"} 
			else if (t.left.typeReturn.equals("strange") && t.right.typeReturn.equals("numb") || t.left.typeReturn.equals("strange") && t.right.typeReturn.equals("strange") || t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("strange")) {rtn="strange"} 
			MulOrDiv: if(t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("numb")) {rtn="numb"} else if (t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("dribble")
			||t.left.typeReturn.equals("dribble") && t.right.typeReturn.equals("dribble")||t.left.typeReturn.equals("dribble") && t.right.typeReturn.equals("numb")) {rtn="dribble"}
			Not: if(t.expression.typeReturn.equals("bull")){rtn="bull"}
			Module: if(t.left.typeReturn.equals("numb") && t.right.typeReturn.equals("numb")) {rtn="numb"} 
			numRef: rtn = "numb"
			StringRef: rtn = "strange"
			doubleRef: rtn = "dribble"
			boolRef: rtn = "bull"
			varRef: if(true){var w = t.varRef if(w instanceof varDeclared){ 
				if(w.scope.equals("boxes")){rtn += "array of " 
					var i = 1
					while (i < w.dim.length){
						rtn += "array of "
						i++
					}
					rtn += t.varRef?.type} else {rtn = t.varRef?.type}}else{rtn = t.varRef?.type}}
			arrayRef: rtn = t.varRef?.type
			Inside: rtn = t.inside.typeReturn
			StdFunction: if(getStdReturnType(t.name).contains("S")){rtn="strange"} 
			else if(getStdReturnType(t.name).contains("N")){rtn="numb"}
			else if(getStdReturnType(t.name).contains("O")){rtn="bull"}
			else if(getStdReturnType(t.name).contains("R")){rtn="numb"}
			FuncCall: for(f: t.func.body){if (f instanceof ReturnDeclaration){rtn=f.rtnType} else if(f instanceof varReturn){rtn=f.rtn.typeReturn} else if (f instanceof IfExpression) 
			{for(ff: f.then){if(ff instanceof varReturn){rtn=ff.rtn.typeReturn}}}
			}
		}
		if (rtn.equals("")){
			rtn = "Unknown"
		}
		return rtn
	}
	
	@Check
	def varAssignmentcheck(varAssignment vas) {
		var v = vas.variable		
		var varType = ""
		var exprType = vas.expr.typeReturn
		
		if(v instanceof arrayRefs){
			varType = v.arrRefs.type
//			if (possibleArray instanceof arrayRefs){
//				if(variableAssigning.scope.equals('boxes') && !variableAssigning.dim.isEmpty){
//					varType = "array of " + varType
//				} 
//			}
			
			
		} else if (v instanceof varRefs){
			var w = v.vaRefs
			if (w instanceof varDeclared){
				if (w.scope.equals("boxes")) {
					varType += "array of "
					var i = 1
					while (i < w.dim.length){
						varType += "array of "
						i++
					}
					varType += w.type
				} else {
					varType = v.vaRefs.type
				}
				
			} else {
				varType = v.vaRefs.type
			}
		} 
		
		if (exprType == ""){
			exprType = "Unknown"
		}
		
		if(!exprType.equals(varType)){
			error("Incompatible types. This variable receives expressions of " + varType + " type." + " Type received is "+ exprType, null,
				INVALID_TYPES);
		}
		
		if(exprType.equals("numb") || exprType.equals("dribble")){
			if (wrongDivision(vas.expr)) {
				error("Do not divide by zero, you idiot",null)
			} 
		}
	}

	def tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	def getStdDefinition(String d) {
		var buff = ""
		switch d {
			case "display": buff = "A" //void
			case "printstr": buff = "S"
			case "strjoin": buff = "SS"
			case "strsplit": buff = "SS"
			case "anytostr": buff = "A"
			case "equals": buff = "OO" // numb or strange or bull or dribble
			case "getargs" : buff = "N"
			case "length" : buff = "R"
		}
		return buff
	}
	
	def getStdReturnType(String d) {
		var buff = ""
		switch d {
			case "display": buff = "A" //void
			case "printstr": buff = ""
			case "strjoin": buff = "S"
			case "strsplit": buff = "SS"
			case "anytostr": buff = "S"
			case "equals": buff = "OO" // num or string or bool
			case "getargs" : buff = "N"
			case "length" : buff = "N"
		}
		return buff
	}
	
	@Check
	def compileReturn(varReturn v){
		if(v.eContainer instanceof DoWhileExpression){
			error("Value kept cannot be declared inside a Loop", null);
		}
		
//		if(v.rtn instanceof AbstractMethodCall)
    }
}

