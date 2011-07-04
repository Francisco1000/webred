/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt.impl;

import mzt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebRequirementsMetamodelFactoryImpl extends EFactoryImpl implements WebRequirementsMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebRequirementsMetamodelFactory init() {
		try {
			WebRequirementsMetamodelFactory theWebRequirementsMetamodelFactory = (WebRequirementsMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://WebRequirementsMetamodel"); 
			if (theWebRequirementsMetamodelFactory != null) {
				return theWebRequirementsMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebRequirementsMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRequirementsMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebRequirementsMetamodelPackage.SD: return createSD();
			case WebRequirementsMetamodelPackage.SR: return createSR();
			case WebRequirementsMetamodelPackage.ACTOR: return createActor();
			case WebRequirementsMetamodelPackage.BELIEF: return createBelief();
			case WebRequirementsMetamodelPackage.GOAL: return createGoal();
			case WebRequirementsMetamodelPackage.TASK: return createTask();
			case WebRequirementsMetamodelPackage.RESOURCE: return createResource();
			case WebRequirementsMetamodelPackage.SOFTGOAL: return createSoftgoal();
			case WebRequirementsMetamodelPackage.CONTENT: return createContent();
			case WebRequirementsMetamodelPackage.WEB_REQUIREMENTS: return createWebRequirements();
			case WebRequirementsMetamodelPackage.NAVIGATIONAL: return createNavigational();
			case WebRequirementsMetamodelPackage.SERVICE: return createService();
			case WebRequirementsMetamodelPackage.PERSONALIZATION: return createPersonalization();
			case WebRequirementsMetamodelPackage.LAYOUT: return createLayout();
			case WebRequirementsMetamodelPackage.DECOMPOSITION: return createDecomposition();
			case WebRequirementsMetamodelPackage.MEANS_END: return createMeansEnd();
			case WebRequirementsMetamodelPackage.CONTRIBUTION: return createContribution();
			case WebRequirementsMetamodelPackage.CORRELATION: return createCorrelation();
			case WebRequirementsMetamodelPackage.IDEPENDENCY: return createIDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WebRequirementsMetamodelPackage.CRITICALITY:
				return createCriticalityFromString(eDataType, initialValue);
			case WebRequirementsMetamodelPackage.EVALUATION:
				return createEvaluationFromString(eDataType, initialValue);
			case WebRequirementsMetamodelPackage.INITIAL_STATUS:
				return createInitialStatusFromString(eDataType, initialValue);
			case WebRequirementsMetamodelPackage.STAKEHOLDERS:
				return createstakeholdersFromString(eDataType, initialValue);
			case WebRequirementsMetamodelPackage.CONTRIBUTION_TYPE:
				return createContributionTypeFromString(eDataType, initialValue);
			case WebRequirementsMetamodelPackage.CORRELATION_TYPE:
				return createCorrelationTypeFromString(eDataType, initialValue);
			case WebRequirementsMetamodelPackage.RICH_INTERNET_APPLICATION:
				return createRichInternetApplicationFromString(eDataType, initialValue);
			case WebRequirementsMetamodelPackage.WEIGHT_VALUE:
				return createWeightValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WebRequirementsMetamodelPackage.CRITICALITY:
				return convertCriticalityToString(eDataType, instanceValue);
			case WebRequirementsMetamodelPackage.EVALUATION:
				return convertEvaluationToString(eDataType, instanceValue);
			case WebRequirementsMetamodelPackage.INITIAL_STATUS:
				return convertInitialStatusToString(eDataType, instanceValue);
			case WebRequirementsMetamodelPackage.STAKEHOLDERS:
				return convertstakeholdersToString(eDataType, instanceValue);
			case WebRequirementsMetamodelPackage.CONTRIBUTION_TYPE:
				return convertContributionTypeToString(eDataType, instanceValue);
			case WebRequirementsMetamodelPackage.CORRELATION_TYPE:
				return convertCorrelationTypeToString(eDataType, instanceValue);
			case WebRequirementsMetamodelPackage.RICH_INTERNET_APPLICATION:
				return convertRichInternetApplicationToString(eDataType, instanceValue);
			case WebRequirementsMetamodelPackage.WEIGHT_VALUE:
				return convertWeightValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SD createSD() {
		SDImpl sd = new SDImpl();
		return sd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SR createSR() {
		SRImpl sr = new SRImpl();
		return sr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Belief createBelief() {
		BeliefImpl belief = new BeliefImpl();
		return belief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal createSoftgoal() {
		SoftgoalImpl softgoal = new SoftgoalImpl();
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRequirements createWebRequirements() {
		WebRequirementsImpl webRequirements = new WebRequirementsImpl();
		return webRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigational createNavigational() {
		NavigationalImpl navigational = new NavigationalImpl();
		return navigational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personalization createPersonalization() {
		PersonalizationImpl personalization = new PersonalizationImpl();
		return personalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition createDecomposition() {
		DecompositionImpl decomposition = new DecompositionImpl();
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeansEnd createMeansEnd() {
		MeansEndImpl meansEnd = new MeansEndImpl();
		return meansEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation createCorrelation() {
		CorrelationImpl correlation = new CorrelationImpl();
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDependency createIDependency() {
		IDependencyImpl iDependency = new IDependencyImpl();
		return iDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criticality createCriticalityFromString(EDataType eDataType, String initialValue) {
		Criticality result = Criticality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriticalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluationFromString(EDataType eDataType, String initialValue) {
		Evaluation result = Evaluation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStatus createInitialStatusFromString(EDataType eDataType, String initialValue) {
		InitialStatus result = InitialStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stakeholders createstakeholdersFromString(EDataType eDataType, String initialValue) {
		stakeholders result = stakeholders.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstakeholdersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionType createContributionTypeFromString(EDataType eDataType, String initialValue) {
		ContributionType result = ContributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationType createCorrelationTypeFromString(EDataType eDataType, String initialValue) {
		CorrelationType result = CorrelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorrelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichInternetApplication createRichInternetApplicationFromString(EDataType eDataType, String initialValue) {
		RichInternetApplication result = RichInternetApplication.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRichInternetApplicationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightValue createWeightValueFromString(EDataType eDataType, String initialValue) {
		WeightValue result = WeightValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeightValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRequirementsMetamodelPackage getWebRequirementsMetamodelPackage() {
		return (WebRequirementsMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebRequirementsMetamodelPackage getPackage() {
		return WebRequirementsMetamodelPackage.eINSTANCE;
	}

} //WebRequirementsMetamodelFactoryImpl
