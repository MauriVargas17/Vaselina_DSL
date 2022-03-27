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
import org.xtext.example.mydsl.vaselina.numRef
import org.xtext.example.mydsl.vaselina.varAssignment
import org.xtext.example.mydsl.vaselina.varDeclared
import org.xtext.example.mydsl.vaselina.varExpression
import org.xtext.example.mydsl.vaselina.varRef
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
	public static val INVALID_FUNCTION_DUPLICATE = 'is_fucntion_duplicate'
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
			error('Break statement does not belong here...', VaselinaPackage.Literals.BRK_STR__BRK, INVALID_BREAK)
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
			error("Declaring keeping type is not applicable here...", null);
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
			
			if ((b instanceof ReturnDeclaration) && targetV){
				flag = true
			} else if ((b instanceof varReturn) && targetR){
				flag = true
			} else if (b instanceof ReturnDeclaration){
				targetR = true
				rtnDec = b
			} else if (b instanceof varReturn){
				targetV = true
				varExterno = b
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
				error("Type keeping for function is not equal to the actual type returned", null);
			}
		}else{
			error("Not enough keep values are provided for return type. If using an If structure, do not forget adding (yes) and (no) options", null);
		}
	} else {
		var rtnExterno = varExterno.rtn.typeReturn
		if(!(rtnExterno.equals(rtnDec.rtnType))){
			error("Type keeping for function is not equal to the actual type returned", null);
		}
	}
		
}
		
		
//		if(flag){
//			warning("Watch out declaring a type return and returning a different type", null,
//				INVALID_TYPES);
//		}
	}
	
	@Check
	def varAssignmentcheck(varAssignment vas) {
		var varType = vas.variable.varRefs.type
		var exprType = vas.expr.typeReturn
		
		if (exprType == ""){
			exprType = "Unknown"
		}
		
		if(!exprType.equals(varType)){
			error("Incompatible types. This variable receives expressions of " + varType + " type." + " Type received is "+ exprType, null,
				INVALID_TYPES);
		}
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
			if (ar.index !== null) {
				error("Array Index should be NUM.", null);
			}

			// BigDecimal to Integer
			if (Integer.valueOf(ar.size.intValue()) < 1) {
				error("Array Size should be more than number 1.", null);
			}
		}
	}

	@Check
	def checkArrayDimension(arrayRef ar) {
		
		val arRef = ar.varRef
		var arlen = 0
		if(arRef instanceof varDeclared){
			arlen = arRef.dim.length
		}
		
		//if arRef is a FuncParameter, this token will be excluded as a target of validation. just skip.
		if(arRef instanceof FuncParameter){
			arlen = ar.dim.length
		}
		// arr = arr[3]
		if (ar.dim.length != arlen) {
			val size = arlen//ar.varRef?.dim.length
			error("Array Dimension Size is Incompatible. Dimension Size is " + size.toString + ".", null);
		}

		if (ar.dim.size < 1) {
			error("Array Size should be more than number 1.", null);
		}
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
				case "O": type = "number or string or bool"
			}

			val itm = inputarg.get(i)
			val tyitm = typeReturn(itm)
			if (!type.toString.equals(tyitm)) {
				if (!(type.toString == "number or string or bool" && (tyitm.contains("numb")))) {
					if (!containsDigit(type.toString, tyitm)) {
						if (type.equals("number or string or bool")) {
							type = "Number or String or Bool" // for Message
						}
						errormsg.append((i + 1).toString + ": " + type + "type inserted: "+ tyitm +"\n")
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
			error("function arguments size is incompatible. function's arguments size is " + sizearg.toString + ".", null);
		} else {
			//warning("pruebita",null)
			val errormsg = argsTypeCompare(sf, sub.args)
			if (!errormsg.empty) {
				error("function arguments type is incompatible.\n" + errormsg, null);
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
						errormsg.append((i + 1).toString + ": " + item.toString + "\n")
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
			arrayRef: rtn = t.varRef?.type
			varRef: rtn = t.varRef?.type
			Inside: rtn = t.inside.typeReturn
			StdFunction: if(getStdReturnType(t.name).contains("S")){rtn="strange"} 
			else if(getStdReturnType(t.name).contains("N")){rtn="numb"}
			else if(getStdReturnType(t.name).contains("O")){rtn="bull"}
			FuncCall: for(f: t.func.body){if (f instanceof ReturnDeclaration){rtn=f.rtnType} else if(f instanceof varReturn){rtn=f.rtn.typeReturn}}
		}
		return rtn
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
			case "printstr": buff = "S"
			case "strjoin": buff = "SS"
			case "strsplit": buff = "SS"
			case "numtostr": buff = "N"
			case "equals": buff = "OO" // num or string or bool
			case "getargs" : buff = "N"
		}
		return buff
	}
	
	def getStdReturnType(String d) {
		var buff = ""
		switch d {
			case "printstr": buff = ""
			case "strjoin": buff = "S"
			case "strsplit": buff = "SS"
			case "numtostr": buff = "S"
			case "equals": buff = "OO" // num or string or bool
			case "getargs" : buff = "N"
		}
		return buff
	}
	
	@Check
	def compileReturn(varReturn v){
		if(v.eContainer instanceof DoWhileExpression){
			error("Value of return cannot be declared inside a Loop", null);
		}
		
//		if(v.rtn instanceof AbstractMethodCall)
    }
}

