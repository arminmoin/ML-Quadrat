/*
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.thingml.annotations.AnnotationRegistry
import org.thingml.xtext.constraints.ThingMLHelpers

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ThingMLProposalProvider extends AbstractThingMLProposalProvider {
	
		override public void completePlatformAnnotation_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			println("completePlatformAnnotation_Name")
			super.completePlatformAnnotation_Name(model, assignment, context, acceptor)
			
			AnnotationRegistry.availableAnnotations(model).forEach[a | 
				val String proposal = "@" + a + " \"...\""
				acceptor.accept(createCompletionProposal(proposal, context))
			]
		}
		
		def completeActionAndExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			val thing = ThingMLHelpers.findContainingThing(model)
			if (thing != null) {
				ThingMLHelpers.allProperties(thing).forEach[p |
					val String proposal = p.name
					acceptor.accept(createCompletionProposal(proposal, context))
				]
				
				ThingMLHelpers.allFunctions(thing).forEach[f |
					val String proposal = f.name
					acceptor.accept(createCompletionProposal(proposal, context))
				]			
			}
			
			val state = ThingMLHelpers.findContainingState(model)
			if (state != null) {
				ThingMLHelpers.allProperties(state).forEach[p |
					val String proposal = p.name
					acceptor.accept(createCompletionProposal(proposal, context))
				]
			}
		}
		
		override public void complete_Expression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			completeActionAndExpression(model, ruleCall, context, acceptor)
		}
		
		override public void complete_Action(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			completeActionAndExpression(model, ruleCall, context, acceptor)
		}		

    	override public void completeThing_Messages(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    		super.completeThing_Messages(model, assignment, context, acceptor)    		
 
			//compute the plain proposal
			val String proposal0 = "message m()"
  			val String proposal = "message m(...)"
 			
  			acceptor.accept(createCompletionProposal(proposal0, context))
  			acceptor.accept(createCompletionProposal(proposal, context))    		    		
		}
		
		override public void completeThing_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    		super.completeThing_Properties(model, assignment, context, acceptor)
 
			//compute the plain proposal
			val String proposal0 = "property p : "
  			val String proposal = "readonly property p : "
 
  			acceptor.accept(createCompletionProposal(proposal0, context))
  			acceptor.accept(createCompletionProposal(proposal, context))
		}
		
		override public void complete_PrimitiveType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			super.complete_PrimitiveType(model, ruleCall, context, acceptor)
 
			//compute the plain proposal
			val String proposal0 = "datatype MyType<size>"
 
  			acceptor.accept(createCompletionProposal(proposal0, context))
		}		
		
		override public void complete_FunctionCallStatement(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			//super.complete_FunctionCallStatement(model, ruleCall, context, acceptor)
			ThingMLHelpers.allFunctions(ThingMLHelpers.findContainingThing(model)).forEach[
				//compute the plain proposal
				var String proposal = it.name + "("
				proposal += it.parameters.map[it.name + " as " + it.typeRef.type.name].join(", ")
				proposal += ")" 
  				acceptor.accept(createCompletionProposal(proposal, context))				
			]

		}
		
		override public void complete_FunctionCallExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			complete_FunctionCallStatement(model, ruleCall, context, acceptor)			
		}		
	
		override public void complete_SendAction(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			super.complete_SendAction(model, ruleCall, context, acceptor)
			ThingMLHelpers.allPorts(ThingMLHelpers.findContainingThing(model)).forEach[
				val port = it
				//compute the plain proposal				
				it.sends.forEach[
					var String proposal = port.name + "!"
					proposal += it.name + "("
					proposal += it.parameters.map[it.name + " as " + it.typeRef.type.name].join(", ")
					proposal += ")"
					acceptor.accept(createCompletionProposal(proposal, context)) 
				]								  						
			]
		}
}
