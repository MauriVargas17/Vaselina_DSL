package org.xtext.example.mydsl.types

import org.xtext.example.mydsl.vaselina.Or
import org.xtext.example.mydsl.vaselina.StringRef
import org.xtext.example.mydsl.vaselina.VaselinaPackage
import org.xtext.example.mydsl.vaselina.arrayRef
import org.xtext.example.mydsl.vaselina.doubleRef
import org.xtext.example.mydsl.vaselina.numRef
import org.xtext.example.mydsl.vaselina.varExpression
import org.xtext.example.mydsl.vaselina.varRef
import org.xtext.example.mydsl.vaselina.boolRef

class VaselinaTypes {
	val ep = VaselinaPackage::eINSTANCE

	def expectedType(varExpression e) {
		val c = e.eContainer
		val f = e.eContainingFeature

		switch (c) {
			Or case f == ep.getOr_Right:
				c.left.typeFor
		}
	}

	def typeFor(varExpression e) {
		
		switch (e) {
			numRef: "numb"
			StringRef: "strange"
			doubleRef: "dribble"
			boolRef: "bull"
			arrayRef: e.varRef?.type
			varRef: e.varRef?.type
		}
	}
	
	def isConformant(String c1, String c2) {
		(c1.conformsToDigit && c2.conformsToDigit) || (c1.conformsToString && c2.conformsToString) 
		|| (c1.conformsToBool && c2.conformsToBool) || (c1.conformsToDouble && c2.conformsToDouble) 
	}
	
	def conformsToString(String c) {
		c.equals("strange")
	}

	def conformsToDigit(String c) {
		c.equals("numb") 
	}
	
	def conformsToBool(String c) {
		c.equals("bull") 
	}
	
	def conformsToDouble(String c) {
		c.equals("dribble") 
	}
	
}