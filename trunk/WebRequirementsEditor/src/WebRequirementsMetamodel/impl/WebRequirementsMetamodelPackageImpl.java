/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.impl;

import WebRequirementsMetamodel.Actor;
import WebRequirementsMetamodel.Argumentable;
import WebRequirementsMetamodel.Belief;
import WebRequirementsMetamodel.Content;
import WebRequirementsMetamodel.Contribution;
import WebRequirementsMetamodel.ContributionType;
import WebRequirementsMetamodel.Correlation;
import WebRequirementsMetamodel.CorrelationType;
import WebRequirementsMetamodel.Criticality;
import WebRequirementsMetamodel.Decomposition;
import WebRequirementsMetamodel.Dependable;
import WebRequirementsMetamodel.Evaluation;
import WebRequirementsMetamodel.Goal;
import WebRequirementsMetamodel.IDependency;
import WebRequirementsMetamodel.InitialStatus;
import WebRequirementsMetamodel.IntentionalElement;
import WebRequirementsMetamodel.Layout;
import WebRequirementsMetamodel.MeansEnd;
import WebRequirementsMetamodel.Navigational;
import WebRequirementsMetamodel.Personalization;
import WebRequirementsMetamodel.Relationship;
import WebRequirementsMetamodel.Resource;
import WebRequirementsMetamodel.RichInternetApplication;
import WebRequirementsMetamodel.Service;
import WebRequirementsMetamodel.Softgoal;
import WebRequirementsMetamodel.Task;
import WebRequirementsMetamodel.WebRequirements;
import WebRequirementsMetamodel.WebRequirementsMetamodelFactory;
import WebRequirementsMetamodel.WebRequirementsMetamodelPackage;
import WebRequirementsMetamodel.WeightValue;
import WebRequirementsMetamodel.stakeholders;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebRequirementsMetamodelPackageImpl extends EPackageImpl implements WebRequirementsMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentionalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beliefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softgoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meansEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum criticalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initialStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stakeholdersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contributionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum correlationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum richInternetApplicationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weightValueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebRequirementsMetamodelPackageImpl() {
		super(eNS_URI, WebRequirementsMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebRequirementsMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebRequirementsMetamodelPackage init() {
		if (isInited) return (WebRequirementsMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(WebRequirementsMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		WebRequirementsMetamodelPackageImpl theWebRequirementsMetamodelPackage = (WebRequirementsMetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebRequirementsMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebRequirementsMetamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWebRequirementsMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theWebRequirementsMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebRequirementsMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebRequirementsMetamodelPackage.eNS_URI, theWebRequirementsMetamodelPackage);
		return theWebRequirementsMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSD() {
		return sdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSD_Name() {
		return (EAttribute)sdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSD_Description() {
		return (EAttribute)sdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSD_CreationDate() {
		return (EAttribute)sdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSD_Dependencies() {
		return (EReference)sdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSD_Actors() {
		return (EReference)sdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSD_StrategicDependencies() {
		return (EReference)sdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSR() {
		return srEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSR_IRelationships() {
		return (EReference)srEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSR_IElement() {
		return (EReference)srEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSR_Description() {
		return (EAttribute)srEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentionalElement() {
		return intentionalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_Name() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Description() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_IBeliefs() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Name() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_StrategicRelationships() {
		return (EReference)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBelief() {
		return beliefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftgoal() {
		return softgoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentable() {
		return argumentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentable_Criticality() {
		return (EAttribute)argumentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentable_Evaluation() {
		return (EAttribute)argumentableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebRequirements() {
		return webRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebRequirements_InitialStatus() {
		return (EAttribute)webRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebRequirements_SolicitedBy() {
		return (EAttribute)webRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebRequirements_ImplementedIn() {
		return (EAttribute)webRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigational() {
		return navigationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalization() {
		return personalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Description() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecomposition() {
		return decompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposition_Element() {
		return (EReference)decompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposition_SubElement() {
		return (EReference)decompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeansEnd() {
		return meansEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeansEnd_Means() {
		return (EReference)meansEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeansEnd_Ends() {
		return (EReference)meansEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Contributor() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Contributed() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Type() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_WeightOnClient() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_WeightOnServer() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelation() {
		return correlationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelation_Type() {
		return (EAttribute)correlationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDependency() {
		return iDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIDependency_DependencyTo() {
		return (EReference)iDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIDependency_DependencyFrom() {
		return (EReference)iDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDependency_Name() {
		return (EAttribute)iDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependable() {
		return dependableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependable_DependencyFrom() {
		return (EReference)dependableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependable_DependencyTo() {
		return (EReference)dependableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCriticality() {
		return criticalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaluation() {
		return evaluationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitialStatus() {
		return initialStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getstakeholders() {
		return stakeholdersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContributionType() {
		return contributionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCorrelationType() {
		return correlationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRichInternetApplication() {
		return richInternetApplicationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeightValue() {
		return weightValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRequirementsMetamodelFactory getWebRequirementsMetamodelFactory() {
		return (WebRequirementsMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sdEClass = createEClass(SD);
		createEAttribute(sdEClass, SD__NAME);
		createEAttribute(sdEClass, SD__DESCRIPTION);
		createEAttribute(sdEClass, SD__CREATION_DATE);
		createEReference(sdEClass, SD__DEPENDENCIES);
		createEReference(sdEClass, SD__ACTORS);
		createEReference(sdEClass, SD__STRATEGIC_DEPENDENCIES);

		srEClass = createEClass(SR);
		createEReference(srEClass, SR__IRELATIONSHIPS);
		createEReference(srEClass, SR__IELEMENT);
		createEAttribute(srEClass, SR__DESCRIPTION);

		intentionalElementEClass = createEClass(INTENTIONAL_ELEMENT);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__NAME);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__DESCRIPTION);
		createEReference(actorEClass, ACTOR__IBELIEFS);
		createEAttribute(actorEClass, ACTOR__NAME);
		createEReference(actorEClass, ACTOR__STRATEGIC_RELATIONSHIPS);

		beliefEClass = createEClass(BELIEF);

		goalEClass = createEClass(GOAL);

		taskEClass = createEClass(TASK);

		resourceEClass = createEClass(RESOURCE);

		softgoalEClass = createEClass(SOFTGOAL);

		argumentableEClass = createEClass(ARGUMENTABLE);
		createEAttribute(argumentableEClass, ARGUMENTABLE__CRITICALITY);
		createEAttribute(argumentableEClass, ARGUMENTABLE__EVALUATION);

		contentEClass = createEClass(CONTENT);

		webRequirementsEClass = createEClass(WEB_REQUIREMENTS);
		createEAttribute(webRequirementsEClass, WEB_REQUIREMENTS__INITIAL_STATUS);
		createEAttribute(webRequirementsEClass, WEB_REQUIREMENTS__SOLICITED_BY);
		createEAttribute(webRequirementsEClass, WEB_REQUIREMENTS__IMPLEMENTED_IN);

		navigationalEClass = createEClass(NAVIGATIONAL);

		serviceEClass = createEClass(SERVICE);

		personalizationEClass = createEClass(PERSONALIZATION);

		layoutEClass = createEClass(LAYOUT);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__DESCRIPTION);

		decompositionEClass = createEClass(DECOMPOSITION);
		createEReference(decompositionEClass, DECOMPOSITION__ELEMENT);
		createEReference(decompositionEClass, DECOMPOSITION__SUB_ELEMENT);

		meansEndEClass = createEClass(MEANS_END);
		createEReference(meansEndEClass, MEANS_END__MEANS);
		createEReference(meansEndEClass, MEANS_END__ENDS);

		contributionEClass = createEClass(CONTRIBUTION);
		createEReference(contributionEClass, CONTRIBUTION__CONTRIBUTOR);
		createEReference(contributionEClass, CONTRIBUTION__CONTRIBUTED);
		createEAttribute(contributionEClass, CONTRIBUTION__TYPE);
		createEAttribute(contributionEClass, CONTRIBUTION__WEIGHT_ON_CLIENT);
		createEAttribute(contributionEClass, CONTRIBUTION__WEIGHT_ON_SERVER);

		correlationEClass = createEClass(CORRELATION);
		createEAttribute(correlationEClass, CORRELATION__TYPE);

		iDependencyEClass = createEClass(IDEPENDENCY);
		createEReference(iDependencyEClass, IDEPENDENCY__DEPENDENCY_TO);
		createEReference(iDependencyEClass, IDEPENDENCY__DEPENDENCY_FROM);
		createEAttribute(iDependencyEClass, IDEPENDENCY__NAME);

		dependableEClass = createEClass(DEPENDABLE);
		createEReference(dependableEClass, DEPENDABLE__DEPENDENCY_FROM);
		createEReference(dependableEClass, DEPENDABLE__DEPENDENCY_TO);

		// Create enums
		criticalityEEnum = createEEnum(CRITICALITY);
		evaluationEEnum = createEEnum(EVALUATION);
		initialStatusEEnum = createEEnum(INITIAL_STATUS);
		stakeholdersEEnum = createEEnum(STAKEHOLDERS);
		contributionTypeEEnum = createEEnum(CONTRIBUTION_TYPE);
		correlationTypeEEnum = createEEnum(CORRELATION_TYPE);
		richInternetApplicationEEnum = createEEnum(RICH_INTERNET_APPLICATION);
		weightValueEEnum = createEEnum(WEIGHT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actorEClass.getESuperTypes().add(this.getDependable());
		beliefEClass.getESuperTypes().add(this.getIntentionalElement());
		goalEClass.getESuperTypes().add(this.getArgumentable());
		taskEClass.getESuperTypes().add(this.getArgumentable());
		resourceEClass.getESuperTypes().add(this.getArgumentable());
		softgoalEClass.getESuperTypes().add(this.getArgumentable());
		argumentableEClass.getESuperTypes().add(this.getIntentionalElement());
		argumentableEClass.getESuperTypes().add(this.getDependable());
		contentEClass.getESuperTypes().add(this.getResource());
		contentEClass.getESuperTypes().add(this.getWebRequirements());
		navigationalEClass.getESuperTypes().add(this.getTask());
		navigationalEClass.getESuperTypes().add(this.getWebRequirements());
		serviceEClass.getESuperTypes().add(this.getTask());
		serviceEClass.getESuperTypes().add(this.getWebRequirements());
		personalizationEClass.getESuperTypes().add(this.getTask());
		personalizationEClass.getESuperTypes().add(this.getWebRequirements());
		layoutEClass.getESuperTypes().add(this.getTask());
		layoutEClass.getESuperTypes().add(this.getWebRequirements());
		decompositionEClass.getESuperTypes().add(this.getRelationship());
		meansEndEClass.getESuperTypes().add(this.getRelationship());
		contributionEClass.getESuperTypes().add(this.getRelationship());
		correlationEClass.getESuperTypes().add(this.getRelationship());
		iDependencyEClass.getESuperTypes().add(this.getRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(sdEClass, WebRequirementsMetamodel.SD.class, "SD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSD_Name(), ecorePackage.getEString(), "Name", null, 1, 1, WebRequirementsMetamodel.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSD_Description(), ecorePackage.getEString(), "Description", null, 0, 1, WebRequirementsMetamodel.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSD_CreationDate(), ecorePackage.getEString(), "creationDate", "21/03/2001", 1, 1, WebRequirementsMetamodel.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSD_Dependencies(), this.getIDependency(), null, "dependencies", null, 0, -1, WebRequirementsMetamodel.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSD_Actors(), this.getActor(), null, "actors", null, 0, -1, WebRequirementsMetamodel.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSD_StrategicDependencies(), this.getArgumentable(), null, "StrategicDependencies", null, 0, -1, WebRequirementsMetamodel.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srEClass, WebRequirementsMetamodel.SR.class, "SR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSR_IRelationships(), this.getRelationship(), null, "iRelationships", null, 0, -1, WebRequirementsMetamodel.SR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSR_IElement(), this.getIntentionalElement(), null, "iElement", null, 0, -1, WebRequirementsMetamodel.SR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSR_Description(), ecorePackage.getEString(), "Description", null, 1, 1, WebRequirementsMetamodel.SR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentionalElementEClass, IntentionalElement.class, "IntentionalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentionalElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_IBeliefs(), this.getBelief(), null, "iBeliefs", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_StrategicRelationships(), this.getSR(), null, "StrategicRelationships", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beliefEClass, Belief.class, "Belief", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentableEClass, Argumentable.class, "Argumentable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentable_Criticality(), this.getCriticality(), "criticality", null, 0, 1, Argumentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgumentable_Evaluation(), this.getEvaluation(), "evaluation", null, 0, 1, Argumentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webRequirementsEClass, WebRequirements.class, "WebRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebRequirements_InitialStatus(), this.getInitialStatus(), "InitialStatus", null, 0, 1, WebRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebRequirements_SolicitedBy(), this.getstakeholders(), "SolicitedBy", null, 0, 1, WebRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebRequirements_ImplementedIn(), this.getRichInternetApplication(), "ImplementedIn", null, 1, 1, WebRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationalEClass, Navigational.class, "Navigational", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personalizationEClass, Personalization.class, "Personalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Description(), ecorePackage.getEString(), "Description", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decompositionEClass, Decomposition.class, "Decomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecomposition_Element(), this.getIntentionalElement(), null, "Element", null, 1, 1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposition_SubElement(), this.getIntentionalElement(), null, "SubElement", null, 1, 1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meansEndEClass, MeansEnd.class, "MeansEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeansEnd_Means(), this.getIntentionalElement(), null, "Means", null, 1, 1, MeansEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeansEnd_Ends(), this.getIntentionalElement(), null, "Ends", null, 1, 1, MeansEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContribution_Contributor(), this.getIntentionalElement(), null, "Contributor", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContribution_Contributed(), this.getIntentionalElement(), null, "Contributed", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_Type(), this.getContributionType(), "type", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_WeightOnClient(), this.getWeightValue(), "WeightOnClient", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_WeightOnServer(), this.getWeightValue(), "WeightOnServer", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correlationEClass, Correlation.class, "Correlation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrelation_Type(), this.getCorrelationType(), "type", null, 0, 1, Correlation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iDependencyEClass, IDependency.class, "IDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIDependency_DependencyTo(), this.getDependable(), this.getDependable_DependencyFrom(), "DependencyTo", null, 0, -1, IDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIDependency_DependencyFrom(), this.getDependable(), this.getDependable_DependencyTo(), "DependencyFrom", null, 0, -1, IDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDependency_Name(), ecorePackage.getEString(), "name", null, 1, 1, IDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependableEClass, Dependable.class, "Dependable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependable_DependencyFrom(), this.getIDependency(), this.getIDependency_DependencyTo(), "DependencyFrom", null, 0, 1, Dependable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependable_DependencyTo(), this.getIDependency(), this.getIDependency_DependencyFrom(), "DependencyTo", null, 0, 1, Dependable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(criticalityEEnum, Criticality.class, "Criticality");
		addEEnumLiteral(criticalityEEnum, Criticality.OPEN);
		addEEnumLiteral(criticalityEEnum, Criticality.CRITICAL);

		initEEnum(evaluationEEnum, Evaluation.class, "Evaluation");
		addEEnumLiteral(evaluationEEnum, Evaluation.SATISFACIED);
		addEEnumLiteral(evaluationEEnum, Evaluation.DENIED);
		addEEnumLiteral(evaluationEEnum, Evaluation.WEAKLY_SATISFACIED);
		addEEnumLiteral(evaluationEEnum, Evaluation.WEAKLY_DENIED);
		addEEnumLiteral(evaluationEEnum, Evaluation.UNDECIDED);
		addEEnumLiteral(evaluationEEnum, Evaluation.CONFLICT);

		initEEnum(initialStatusEEnum, InitialStatus.class, "InitialStatus");
		addEEnumLiteral(initialStatusEEnum, InitialStatus.IMPLEMENTED);
		addEEnumLiteral(initialStatusEEnum, InitialStatus.NO_IMPLEMENTED);

		initEEnum(stakeholdersEEnum, stakeholders.class, "stakeholders");
		addEEnumLiteral(stakeholdersEEnum, stakeholders.CLIENT);
		addEEnumLiteral(stakeholdersEEnum, stakeholders.DEVELOPER);
		addEEnumLiteral(stakeholdersEEnum, stakeholders.END_USER);

		initEEnum(contributionTypeEEnum, ContributionType.class, "ContributionType");
		addEEnumLiteral(contributionTypeEEnum, ContributionType.AND);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.OR);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.BREAK);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.HURT);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.SOME_NEGATIVE);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.UNKNOW);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.EQUAL);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.SOME_POSITIVE);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.HELP);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.MAKE);

		initEEnum(correlationTypeEEnum, CorrelationType.class, "CorrelationType");
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.BREAK);
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.HURT);
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.SOME_NEGATIVE);
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.UNKNOW);
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.EQUAL);
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.SOME_POSITIVE);
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.MAKE);
		addEEnumLiteral(correlationTypeEEnum, CorrelationType.HELP);

		initEEnum(richInternetApplicationEEnum, RichInternetApplication.class, "RichInternetApplication");
		addEEnumLiteral(richInternetApplicationEEnum, RichInternetApplication.SERVER_SIDE);
		addEEnumLiteral(richInternetApplicationEEnum, RichInternetApplication.CLIENT_SIDE);
		addEEnumLiteral(richInternetApplicationEEnum, RichInternetApplication.UNDEFINED);

		initEEnum(weightValueEEnum, WeightValue.class, "WeightValue");
		addEEnumLiteral(weightValueEEnum, WeightValue.NO);
		addEEnumLiteral(weightValueEEnum, WeightValue.HELP);
		addEEnumLiteral(weightValueEEnum, WeightValue.HURT);
		addEEnumLiteral(weightValueEEnum, WeightValue.SOME_POSITIVE);
		addEEnumLiteral(weightValueEEnum, WeightValue.SOME_NEGATIVE);
		addEEnumLiteral(weightValueEEnum, WeightValue.BREAK);
		addEEnumLiteral(weightValueEEnum, WeightValue.MAKE);

		// Create resource
		createResource(eNS_URI);
	}

} //WebRequirementsMetamodelPackageImpl
