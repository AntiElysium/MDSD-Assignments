/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Divide
import dk.sdu.mmmi.mdsd.math.Exp
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Multiply
import dk.sdu.mmmi.mdsd.math.Number
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.Primary
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.OriginExp
import dk.sdu.mmmi.mdsd.math.Parenthesis
import dk.sdu.mmmi.mdsd.math.VariableUse
import dk.sdu.mmmi.mdsd.math.Letend

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {

	static Map<String, Integer> variables = new HashMap();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val root = resource.allContents.filter(OriginExp).next
		val result = root.compute
		
		// You can replace with hovering, see Bettini Chapter 8
		result.displayPanel
	}
	
	//
	// Compute function: computes value of expression
	// Note: written according to illegal left-recursive grammar, requires fix
	//
	
	def static compute(OriginExp root) { 
		for(MathExp exp : root.expressions){
			var localVariables = new HashMap<String, Integer>();
			localVariables.putAll(variables)
			variables.put(exp.name,exp.exp.computeExp(localVariables))
		}
		return variables
	}
	
	def static int computeExp(Exp exp, Map<String,Integer> localVariables) {
		switch exp {
			Plus: exp.left.computeExp(localVariables)+exp.right.computeExp(localVariables)
			Minus: exp.left.computeExp(localVariables)-exp.right.computeExp(localVariables)
			Multiply: exp.left.computeExp(localVariables)*exp.right.computeExp(localVariables)
			Divide: exp.left.computeExp(localVariables)/exp.right.computeExp(localVariables)
			Primary: exp.primaryCase(localVariables)
		}
	}
	
	def static int primaryCase(Primary exp, Map<String,Integer> localVariables){
		switch exp {
			Number: exp.value
			Parenthesis: exp.exp.computeExp(localVariables)
			VariableUse: exp.variableCase(localVariables)
			Letend: exp.letendCase(localVariables)
		}
	}
	
	def static int variableCase(VariableUse exp, Map<String, Integer> localVariables) {
		switch exp.ref {
			MathExp: {
				var	globalVariables = new HashMap<String,Integer>
				globalVariables.putAll(variables)
				var temp = (exp.ref as MathExp).exp.computeExp(globalVariables)
				localVariables.put((exp.ref as MathExp).name, temp)
				return temp	
			}
			Letend: localVariables.get((exp.ref as Letend).name)
		}
	}
	
	def static int letendCase(Letend exp, Map<String, Integer> localVariables){
		val oldStored = localVariables.get(exp.name)
		localVariables.put(exp.name,exp.^val.computeExp(localVariables))
		val stored = exp.exp.computeExp(localVariables)
		localVariables.put(exp.name, oldStored)
		return stored
	}
	
	def static int computePrim(Primary factor) { 
		87
	}

	def void displayPanel(Map<String, Integer> result) {
		var resultString = ""
		for (entry : result.entrySet()) {
         	resultString += "var " + entry.getKey() + " = " + entry.getValue() + "\n"
        }
		
		JOptionPane.showMessageDialog(null, resultString ,"Math Language", JOptionPane.INFORMATION_MESSAGE)
	}

}
