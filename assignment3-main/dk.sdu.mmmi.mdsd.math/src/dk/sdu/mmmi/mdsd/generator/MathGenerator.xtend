/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.MathNumber
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VarBinding
import dk.sdu.mmmi.mdsd.math.VariableUse
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.Program
import dk.sdu.mmmi.mdsd.math.External
import dk.sdu.mmmi.mdsd.math.Expression
import dk.sdu.mmmi.mdsd.math.Parentheses
import dk.sdu.mmmi.mdsd.math.Binding
import dk.sdu.mmmi.mdsd.math.Method
import java.util.Random

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {
	
	//static Map<String, Integer> variables = newHashMap;
	static Map<String, String> variables = newHashMap;
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val p = resource.allContents.filter(Program).next
		fsa.generateFile("math_expression/" + p.name + ".java", p.compile)
	}
	
	
	def compile(Program program){
		'''
		package math_expression.test;
		
		public class «program.name» {
			«FOR varBinding: program.mathExps.variables»
			public int «varBinding.name»;
			«ENDFOR»
			
			public void compute() {
				«FOR varBinding: program.mathExps.variables»
				«varBinding.name» = «varBinding.expression.resolve»;
				«ENDFOR»
			}
			
			«IF !program.externals.empty»
			private External external;	
			
			public «program.name»(External external){
				this.external = external;
			}
			
			interface External {		
			«FOR external : program.externals»
				public int «external.name» («external.listAll»);
			«ENDFOR»
			}
			«ENDIF»
		}
		'''
	}
	
	def String resolve(Expression expression){
		var output = ""
		switch (expression) {
			MathNumber: output += expression.value
			Parentheses: output += '''( «expression.exp.resolve» )'''
			VariableUse: output += expression.ref.resolveBinding
			Method: output += '''this.external.«expression.ref.name»(«expression.listAllExpressions»)'''
			Plus: output += '''«expression.left.resolve» + «expression.right.resolve»'''
			Minus: output += '''«expression.left.resolve» - «expression.right.resolve»'''
			Div: output += '''«expression.left.resolve» / «expression.right.resolve»'''
			Mult: output += '''«expression.left.resolve» * «expression.right.resolve»'''
		}
		return output
	}
	
	def String resolveBinding(Binding binding) {
		switch (binding) {
			VarBinding: '''«binding.name» = «binding.expression.resolve»'''
			LetBinding: "1" //binding.letBindings Couldn't get let bindings to work
		}
	}	
	
	def String letBindings(LetBinding binding) {
		variables.put(binding.name,binding.binding.resolve)
		binding.body.resolveBody
		return "I don't know man"
	}
	
	def String resolveBody(Expression expression) {
		return "¯\\_(ツ)_/¯";
	}
	
	def String listAllExpressions(Method method){
		var output = ""
		for(exp : method.exps){
			output += exp.resolve + ", "
		}
		if(output.length() > 2) 
			output = output.substring(0, output.length() - 2)
		return output
	}
	
	Random r = new Random()
	def String listAll(External external) {
		var output = ""
		for(arg : external.args){
			output += '''«arg» n«r.nextInt(1000000)»«System.currentTimeMillis()», '''
		}
		if(output.length() > 2) 
			output = output.substring(0, output.length() - 2)
		return output
	}
}
