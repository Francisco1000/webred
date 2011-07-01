/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.util;

import WebRequirementsMetamodel.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage
 * @generated
 */
public class WebRequirementsMetamodelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebRequirementsMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRequirementsMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = WebRequirementsMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebRequirementsMetamodelPackage.SD: {
				SD sd = (SD)theEObject;
				T result = caseSD(sd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.SR: {
				SR sr = (SR)theEObject;
				T result = caseSR(sr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.INTENTIONAL_ELEMENT: {
				IntentionalElement intentionalElement = (IntentionalElement)theEObject;
				T result = caseIntentionalElement(intentionalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseDependable(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.BELIEF: {
				Belief belief = (Belief)theEObject;
				T result = caseBelief(belief);
				if (result == null) result = caseIntentionalElement(belief);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseArgumentable(goal);
				if (result == null) result = caseIntentionalElement(goal);
				if (result == null) result = caseDependable(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseArgumentable(task);
				if (result == null) result = caseIntentionalElement(task);
				if (result == null) result = caseDependable(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseArgumentable(resource);
				if (result == null) result = caseIntentionalElement(resource);
				if (result == null) result = caseDependable(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.SOFTGOAL: {
				Softgoal softgoal = (Softgoal)theEObject;
				T result = caseSoftgoal(softgoal);
				if (result == null) result = caseArgumentable(softgoal);
				if (result == null) result = caseIntentionalElement(softgoal);
				if (result == null) result = caseDependable(softgoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.ARGUMENTABLE: {
				Argumentable argumentable = (Argumentable)theEObject;
				T result = caseArgumentable(argumentable);
				if (result == null) result = caseIntentionalElement(argumentable);
				if (result == null) result = caseDependable(argumentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = caseResource(content);
				if (result == null) result = caseWebRequirements(content);
				if (result == null) result = caseArgumentable(content);
				if (result == null) result = caseIntentionalElement(content);
				if (result == null) result = caseDependable(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.WEB_REQUIREMENTS: {
				WebRequirements webRequirements = (WebRequirements)theEObject;
				T result = caseWebRequirements(webRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.NAVIGATIONAL: {
				Navigational navigational = (Navigational)theEObject;
				T result = caseNavigational(navigational);
				if (result == null) result = caseTask(navigational);
				if (result == null) result = caseWebRequirements(navigational);
				if (result == null) result = caseArgumentable(navigational);
				if (result == null) result = caseIntentionalElement(navigational);
				if (result == null) result = caseDependable(navigational);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseTask(service);
				if (result == null) result = caseWebRequirements(service);
				if (result == null) result = caseArgumentable(service);
				if (result == null) result = caseIntentionalElement(service);
				if (result == null) result = caseDependable(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.PERSONALIZATION: {
				Personalization personalization = (Personalization)theEObject;
				T result = casePersonalization(personalization);
				if (result == null) result = caseTask(personalization);
				if (result == null) result = caseWebRequirements(personalization);
				if (result == null) result = caseArgumentable(personalization);
				if (result == null) result = caseIntentionalElement(personalization);
				if (result == null) result = caseDependable(personalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = caseTask(layout);
				if (result == null) result = caseWebRequirements(layout);
				if (result == null) result = caseArgumentable(layout);
				if (result == null) result = caseIntentionalElement(layout);
				if (result == null) result = caseDependable(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				T result = caseDecomposition(decomposition);
				if (result == null) result = caseRelationship(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.MEANS_END: {
				MeansEnd meansEnd = (MeansEnd)theEObject;
				T result = caseMeansEnd(meansEnd);
				if (result == null) result = caseRelationship(meansEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = caseRelationship(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.CORRELATION: {
				Correlation correlation = (Correlation)theEObject;
				T result = caseCorrelation(correlation);
				if (result == null) result = caseRelationship(correlation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.IDEPENDENCY: {
				IDependency iDependency = (IDependency)theEObject;
				T result = caseIDependency(iDependency);
				if (result == null) result = caseRelationship(iDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebRequirementsMetamodelPackage.DEPENDABLE: {
				Dependable dependable = (Dependable)theEObject;
				T result = caseDependable(dependable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSD(SD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSR(SR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionalElement(IntentionalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belief</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belief</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBelief(Belief object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Softgoal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftgoal(Softgoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentable(Argumentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebRequirements(WebRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigational(Navigational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalization(Personalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Means End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Means End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeansEnd(MeansEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelation(Correlation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDependency(IDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependable(Dependable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //WebRequirementsMetamodelSwitch
