/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface WebRequirementsMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WebRequirementsMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://WebRequirementsMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WebRequirementsMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebRequirementsMetamodelPackage eINSTANCE = WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.SDImpl <em>SD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.SDImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getSD()
	 * @generated
	 */
	int SD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__ACTORS = 4;

	/**
	 * The feature id for the '<em><b>Strategic Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__STRATEGIC_DEPENDENCIES = 5;

	/**
	 * The number of structural features of the '<em>SD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.SRImpl <em>SR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.SRImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getSR()
	 * @generated
	 */
	int SR = 1;

	/**
	 * The feature id for the '<em><b>IRelationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR__IRELATIONSHIPS = 0;

	/**
	 * The feature id for the '<em><b>IElement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR__IELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>SR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.IntentionalElementImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getIntentionalElement()
	 * @generated
	 */
	int INTENTIONAL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Intentional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.DependableImpl <em>Dependable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.DependableImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getDependable()
	 * @generated
	 */
	int DEPENDABLE = 22;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE__DEPENDENCY_FROM = 0;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE__DEPENDENCY_TO = 1;

	/**
	 * The number of structural features of the '<em>Dependable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.ActorImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DEPENDENCY_FROM = DEPENDABLE__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DEPENDENCY_TO = DEPENDABLE__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = DEPENDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBeliefs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IBELIEFS = DEPENDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = DEPENDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategic Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STRATEGIC_RELATIONSHIPS = DEPENDABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = DEPENDABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.BeliefImpl <em>Belief</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.BeliefImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getBelief()
	 * @generated
	 */
	int BELIEF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__NAME = INTENTIONAL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Belief</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.ArgumentableImpl <em>Argumentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.ArgumentableImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getArgumentable()
	 * @generated
	 */
	int ARGUMENTABLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE__NAME = INTENTIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE__DEPENDENCY_FROM = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE__DEPENDENCY_TO = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE__CRITICALITY = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE__EVALUATION = INTENTIONAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Argumentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.GoalImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = ARGUMENTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEPENDENCY_FROM = ARGUMENTABLE__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEPENDENCY_TO = ARGUMENTABLE__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CRITICALITY = ARGUMENTABLE__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EVALUATION = ARGUMENTABLE__EVALUATION;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = ARGUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.TaskImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ARGUMENTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCY_FROM = ARGUMENTABLE__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCY_TO = ARGUMENTABLE__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CRITICALITY = ARGUMENTABLE__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EVALUATION = ARGUMENTABLE__EVALUATION;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ARGUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.ResourceImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ARGUMENTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEPENDENCY_FROM = ARGUMENTABLE__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEPENDENCY_TO = ARGUMENTABLE__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CRITICALITY = ARGUMENTABLE__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EVALUATION = ARGUMENTABLE__EVALUATION;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ARGUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.SoftgoalImpl <em>Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.SoftgoalImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getSoftgoal()
	 * @generated
	 */
	int SOFTGOAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__NAME = ARGUMENTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__DEPENDENCY_FROM = ARGUMENTABLE__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__DEPENDENCY_TO = ARGUMENTABLE__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CRITICALITY = ARGUMENTABLE__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__EVALUATION = ARGUMENTABLE__EVALUATION;

	/**
	 * The number of structural features of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL_FEATURE_COUNT = ARGUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.ContentImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DEPENDENCY_FROM = RESOURCE__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DEPENDENCY_TO = RESOURCE__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CRITICALITY = RESOURCE__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__EVALUATION = RESOURCE__EVALUATION;

	/**
	 * The feature id for the '<em><b>Initial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__INITIAL_STATUS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solicited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__SOLICITED_BY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__IMPLEMENTED_IN = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.WebRequirementsImpl <em>Web Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.WebRequirementsImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getWebRequirements()
	 * @generated
	 */
	int WEB_REQUIREMENTS = 11;

	/**
	 * The feature id for the '<em><b>Initial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_REQUIREMENTS__INITIAL_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Solicited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_REQUIREMENTS__SOLICITED_BY = 1;

	/**
	 * The feature id for the '<em><b>Implemented In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_REQUIREMENTS__IMPLEMENTED_IN = 2;

	/**
	 * The number of structural features of the '<em>Web Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_REQUIREMENTS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.NavigationalImpl <em>Navigational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.NavigationalImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getNavigational()
	 * @generated
	 */
	int NAVIGATIONAL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__DEPENDENCY_FROM = TASK__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__DEPENDENCY_TO = TASK__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__CRITICALITY = TASK__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__EVALUATION = TASK__EVALUATION;

	/**
	 * The feature id for the '<em><b>Initial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__INITIAL_STATUS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solicited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__SOLICITED_BY = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL__IMPLEMENTED_IN = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Navigational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATIONAL_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.ServiceImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPENDENCY_FROM = TASK__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPENDENCY_TO = TASK__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CRITICALITY = TASK__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EVALUATION = TASK__EVALUATION;

	/**
	 * The feature id for the '<em><b>Initial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INITIAL_STATUS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solicited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SOLICITED_BY = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMPLEMENTED_IN = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.PersonalizationImpl <em>Personalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.PersonalizationImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getPersonalization()
	 * @generated
	 */
	int PERSONALIZATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__DEPENDENCY_FROM = TASK__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__DEPENDENCY_TO = TASK__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__CRITICALITY = TASK__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__EVALUATION = TASK__EVALUATION;

	/**
	 * The feature id for the '<em><b>Initial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__INITIAL_STATUS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solicited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__SOLICITED_BY = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION__IMPLEMENTED_IN = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Personalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZATION_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.LayoutImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__DEPENDENCY_FROM = TASK__DEPENDENCY_FROM;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__DEPENDENCY_TO = TASK__DEPENDENCY_TO;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CRITICALITY = TASK__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__EVALUATION = TASK__EVALUATION;

	/**
	 * The feature id for the '<em><b>Initial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__INITIAL_STATUS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solicited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SOLICITED_BY = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__IMPLEMENTED_IN = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.RelationshipImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.DecompositionImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__DESCRIPTION = RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__ELEMENT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__SUB_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.MeansEndImpl <em>Means End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.MeansEndImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getMeansEnd()
	 * @generated
	 */
	int MEANS_END = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END__DESCRIPTION = RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Means</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END__MEANS = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END__ENDS = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Means End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.ContributionImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DESCRIPTION = RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONTRIBUTOR = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contributed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONTRIBUTED = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TYPE = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weight On Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__WEIGHT_ON_CLIENT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weight On Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__WEIGHT_ON_SERVER = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.CorrelationImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__DESCRIPTION = RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.impl.IDependencyImpl <em>IDependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.impl.IDependencyImpl
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getIDependency()
	 * @generated
	 */
	int IDEPENDENCY = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEPENDENCY__DESCRIPTION = RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEPENDENCY__DEPENDENCY_TO = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEPENDENCY__DEPENDENCY_FROM = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEPENDENCY__NAME = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IDependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEPENDENCY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.Criticality <em>Criticality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.Criticality
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getCriticality()
	 * @generated
	 */
	int CRITICALITY = 23;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.Evaluation <em>Evaluation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.Evaluation
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 24;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.InitialStatus <em>Initial Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.InitialStatus
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getInitialStatus()
	 * @generated
	 */
	int INITIAL_STATUS = 25;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.stakeholders <em>stakeholders</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.stakeholders
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getstakeholders()
	 * @generated
	 */
	int STAKEHOLDERS = 26;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.ContributionType <em>Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.ContributionType
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getContributionType()
	 * @generated
	 */
	int CONTRIBUTION_TYPE = 27;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.CorrelationType <em>Correlation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.CorrelationType
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getCorrelationType()
	 * @generated
	 */
	int CORRELATION_TYPE = 28;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.RichInternetApplication <em>Rich Internet Application</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.RichInternetApplication
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getRichInternetApplication()
	 * @generated
	 */
	int RICH_INTERNET_APPLICATION = 29;

	/**
	 * The meta object id for the '{@link WebRequirementsMetamodel.WeightValue <em>Weight Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebRequirementsMetamodel.WeightValue
	 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getWeightValue()
	 * @generated
	 */
	int WEIGHT_VALUE = 30;


	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.SD <em>SD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SD</em>'.
	 * @see WebRequirementsMetamodel.SD
	 * @generated
	 */
	EClass getSD();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.SD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebRequirementsMetamodel.SD#getName()
	 * @see #getSD()
	 * @generated
	 */
	EAttribute getSD_Name();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.SD#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WebRequirementsMetamodel.SD#getDescription()
	 * @see #getSD()
	 * @generated
	 */
	EAttribute getSD_Description();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.SD#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see WebRequirementsMetamodel.SD#getCreationDate()
	 * @see #getSD()
	 * @generated
	 */
	EAttribute getSD_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link WebRequirementsMetamodel.SD#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see WebRequirementsMetamodel.SD#getDependencies()
	 * @see #getSD()
	 * @generated
	 */
	EReference getSD_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link WebRequirementsMetamodel.SD#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see WebRequirementsMetamodel.SD#getActors()
	 * @see #getSD()
	 * @generated
	 */
	EReference getSD_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link WebRequirementsMetamodel.SD#getStrategicDependencies <em>Strategic Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategic Dependencies</em>'.
	 * @see WebRequirementsMetamodel.SD#getStrategicDependencies()
	 * @see #getSD()
	 * @generated
	 */
	EReference getSD_StrategicDependencies();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.SR <em>SR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SR</em>'.
	 * @see WebRequirementsMetamodel.SR
	 * @generated
	 */
	EClass getSR();

	/**
	 * Returns the meta object for the containment reference list '{@link WebRequirementsMetamodel.SR#getIRelationships <em>IRelationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IRelationships</em>'.
	 * @see WebRequirementsMetamodel.SR#getIRelationships()
	 * @see #getSR()
	 * @generated
	 */
	EReference getSR_IRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link WebRequirementsMetamodel.SR#getIElement <em>IElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IElement</em>'.
	 * @see WebRequirementsMetamodel.SR#getIElement()
	 * @see #getSR()
	 * @generated
	 */
	EReference getSR_IElement();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.SR#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WebRequirementsMetamodel.SR#getDescription()
	 * @see #getSR()
	 * @generated
	 */
	EAttribute getSR_Description();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intentional Element</em>'.
	 * @see WebRequirementsMetamodel.IntentionalElement
	 * @generated
	 */
	EClass getIntentionalElement();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.IntentionalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebRequirementsMetamodel.IntentionalElement#getName()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_Name();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see WebRequirementsMetamodel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Actor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WebRequirementsMetamodel.Actor#getDescription()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link WebRequirementsMetamodel.Actor#getIBeliefs <em>IBeliefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IBeliefs</em>'.
	 * @see WebRequirementsMetamodel.Actor#getIBeliefs()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_IBeliefs();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebRequirementsMetamodel.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WebRequirementsMetamodel.Actor#getStrategicRelationships <em>Strategic Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategic Relationships</em>'.
	 * @see WebRequirementsMetamodel.Actor#getStrategicRelationships()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_StrategicRelationships();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belief</em>'.
	 * @see WebRequirementsMetamodel.Belief
	 * @generated
	 */
	EClass getBelief();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see WebRequirementsMetamodel.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see WebRequirementsMetamodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see WebRequirementsMetamodel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softgoal</em>'.
	 * @see WebRequirementsMetamodel.Softgoal
	 * @generated
	 */
	EClass getSoftgoal();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Argumentable <em>Argumentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argumentable</em>'.
	 * @see WebRequirementsMetamodel.Argumentable
	 * @generated
	 */
	EClass getArgumentable();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Argumentable#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see WebRequirementsMetamodel.Argumentable#getCriticality()
	 * @see #getArgumentable()
	 * @generated
	 */
	EAttribute getArgumentable_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Argumentable#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation</em>'.
	 * @see WebRequirementsMetamodel.Argumentable#getEvaluation()
	 * @see #getArgumentable()
	 * @generated
	 */
	EAttribute getArgumentable_Evaluation();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see WebRequirementsMetamodel.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.WebRequirements <em>Web Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Requirements</em>'.
	 * @see WebRequirementsMetamodel.WebRequirements
	 * @generated
	 */
	EClass getWebRequirements();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.WebRequirements#getInitialStatus <em>Initial Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Status</em>'.
	 * @see WebRequirementsMetamodel.WebRequirements#getInitialStatus()
	 * @see #getWebRequirements()
	 * @generated
	 */
	EAttribute getWebRequirements_InitialStatus();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.WebRequirements#getSolicitedBy <em>Solicited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solicited By</em>'.
	 * @see WebRequirementsMetamodel.WebRequirements#getSolicitedBy()
	 * @see #getWebRequirements()
	 * @generated
	 */
	EAttribute getWebRequirements_SolicitedBy();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.WebRequirements#getImplementedIn <em>Implemented In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implemented In</em>'.
	 * @see WebRequirementsMetamodel.WebRequirements#getImplementedIn()
	 * @see #getWebRequirements()
	 * @generated
	 */
	EAttribute getWebRequirements_ImplementedIn();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Navigational <em>Navigational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigational</em>'.
	 * @see WebRequirementsMetamodel.Navigational
	 * @generated
	 */
	EClass getNavigational();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see WebRequirementsMetamodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Personalization <em>Personalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personalization</em>'.
	 * @see WebRequirementsMetamodel.Personalization
	 * @generated
	 */
	EClass getPersonalization();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see WebRequirementsMetamodel.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see WebRequirementsMetamodel.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Relationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WebRequirementsMetamodel.Relationship#getDescription()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Description();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see WebRequirementsMetamodel.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.Decomposition#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see WebRequirementsMetamodel.Decomposition#getElement()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Element();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.Decomposition#getSubElement <em>Sub Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Element</em>'.
	 * @see WebRequirementsMetamodel.Decomposition#getSubElement()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_SubElement();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.MeansEnd <em>Means End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Means End</em>'.
	 * @see WebRequirementsMetamodel.MeansEnd
	 * @generated
	 */
	EClass getMeansEnd();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.MeansEnd#getMeans <em>Means</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Means</em>'.
	 * @see WebRequirementsMetamodel.MeansEnd#getMeans()
	 * @see #getMeansEnd()
	 * @generated
	 */
	EReference getMeansEnd_Means();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.MeansEnd#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ends</em>'.
	 * @see WebRequirementsMetamodel.MeansEnd#getEnds()
	 * @see #getMeansEnd()
	 * @generated
	 */
	EReference getMeansEnd_Ends();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see WebRequirementsMetamodel.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.Contribution#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contributor</em>'.
	 * @see WebRequirementsMetamodel.Contribution#getContributor()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Contributor();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.Contribution#getContributed <em>Contributed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contributed</em>'.
	 * @see WebRequirementsMetamodel.Contribution#getContributed()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Contributed();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Contribution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see WebRequirementsMetamodel.Contribution#getType()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Type();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Contribution#getWeightOnClient <em>Weight On Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight On Client</em>'.
	 * @see WebRequirementsMetamodel.Contribution#getWeightOnClient()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_WeightOnClient();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Contribution#getWeightOnServer <em>Weight On Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight On Server</em>'.
	 * @see WebRequirementsMetamodel.Contribution#getWeightOnServer()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_WeightOnServer();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see WebRequirementsMetamodel.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.Correlation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see WebRequirementsMetamodel.Correlation#getType()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Type();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.IDependency <em>IDependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDependency</em>'.
	 * @see WebRequirementsMetamodel.IDependency
	 * @generated
	 */
	EClass getIDependency();

	/**
	 * Returns the meta object for the reference list '{@link WebRequirementsMetamodel.IDependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency To</em>'.
	 * @see WebRequirementsMetamodel.IDependency#getDependencyTo()
	 * @see #getIDependency()
	 * @generated
	 */
	EReference getIDependency_DependencyTo();

	/**
	 * Returns the meta object for the reference list '{@link WebRequirementsMetamodel.IDependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency From</em>'.
	 * @see WebRequirementsMetamodel.IDependency#getDependencyFrom()
	 * @see #getIDependency()
	 * @generated
	 */
	EReference getIDependency_DependencyFrom();

	/**
	 * Returns the meta object for the attribute '{@link WebRequirementsMetamodel.IDependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebRequirementsMetamodel.IDependency#getName()
	 * @see #getIDependency()
	 * @generated
	 */
	EAttribute getIDependency_Name();

	/**
	 * Returns the meta object for class '{@link WebRequirementsMetamodel.Dependable <em>Dependable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependable</em>'.
	 * @see WebRequirementsMetamodel.Dependable
	 * @generated
	 */
	EClass getDependable();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.Dependable#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency From</em>'.
	 * @see WebRequirementsMetamodel.Dependable#getDependencyFrom()
	 * @see #getDependable()
	 * @generated
	 */
	EReference getDependable_DependencyFrom();

	/**
	 * Returns the meta object for the reference '{@link WebRequirementsMetamodel.Dependable#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency To</em>'.
	 * @see WebRequirementsMetamodel.Dependable#getDependencyTo()
	 * @see #getDependable()
	 * @generated
	 */
	EReference getDependable_DependencyTo();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.Criticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Criticality</em>'.
	 * @see WebRequirementsMetamodel.Criticality
	 * @generated
	 */
	EEnum getCriticality();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation</em>'.
	 * @see WebRequirementsMetamodel.Evaluation
	 * @generated
	 */
	EEnum getEvaluation();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.InitialStatus <em>Initial Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initial Status</em>'.
	 * @see WebRequirementsMetamodel.InitialStatus
	 * @generated
	 */
	EEnum getInitialStatus();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.stakeholders <em>stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>stakeholders</em>'.
	 * @see WebRequirementsMetamodel.stakeholders
	 * @generated
	 */
	EEnum getstakeholders();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.ContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contribution Type</em>'.
	 * @see WebRequirementsMetamodel.ContributionType
	 * @generated
	 */
	EEnum getContributionType();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.CorrelationType <em>Correlation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Correlation Type</em>'.
	 * @see WebRequirementsMetamodel.CorrelationType
	 * @generated
	 */
	EEnum getCorrelationType();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.RichInternetApplication <em>Rich Internet Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rich Internet Application</em>'.
	 * @see WebRequirementsMetamodel.RichInternetApplication
	 * @generated
	 */
	EEnum getRichInternetApplication();

	/**
	 * Returns the meta object for enum '{@link WebRequirementsMetamodel.WeightValue <em>Weight Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weight Value</em>'.
	 * @see WebRequirementsMetamodel.WeightValue
	 * @generated
	 */
	EEnum getWeightValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebRequirementsMetamodelFactory getWebRequirementsMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.SDImpl <em>SD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.SDImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getSD()
		 * @generated
		 */
		EClass SD = eINSTANCE.getSD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD__NAME = eINSTANCE.getSD_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD__DESCRIPTION = eINSTANCE.getSD_Description();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD__CREATION_DATE = eINSTANCE.getSD_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD__DEPENDENCIES = eINSTANCE.getSD_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD__ACTORS = eINSTANCE.getSD_Actors();

		/**
		 * The meta object literal for the '<em><b>Strategic Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD__STRATEGIC_DEPENDENCIES = eINSTANCE.getSD_StrategicDependencies();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.SRImpl <em>SR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.SRImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getSR()
		 * @generated
		 */
		EClass SR = eINSTANCE.getSR();

		/**
		 * The meta object literal for the '<em><b>IRelationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SR__IRELATIONSHIPS = eINSTANCE.getSR_IRelationships();

		/**
		 * The meta object literal for the '<em><b>IElement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SR__IELEMENT = eINSTANCE.getSR_IElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SR__DESCRIPTION = eINSTANCE.getSR_Description();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.IntentionalElementImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getIntentionalElement()
		 * @generated
		 */
		EClass INTENTIONAL_ELEMENT = eINSTANCE.getIntentionalElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__NAME = eINSTANCE.getIntentionalElement_Name();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.ActorImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__DESCRIPTION = eINSTANCE.getActor_Description();

		/**
		 * The meta object literal for the '<em><b>IBeliefs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__IBELIEFS = eINSTANCE.getActor_IBeliefs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Strategic Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__STRATEGIC_RELATIONSHIPS = eINSTANCE.getActor_StrategicRelationships();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.BeliefImpl <em>Belief</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.BeliefImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getBelief()
		 * @generated
		 */
		EClass BELIEF = eINSTANCE.getBelief();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.GoalImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.TaskImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.ResourceImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.SoftgoalImpl <em>Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.SoftgoalImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getSoftgoal()
		 * @generated
		 */
		EClass SOFTGOAL = eINSTANCE.getSoftgoal();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.ArgumentableImpl <em>Argumentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.ArgumentableImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getArgumentable()
		 * @generated
		 */
		EClass ARGUMENTABLE = eINSTANCE.getArgumentable();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTABLE__CRITICALITY = eINSTANCE.getArgumentable_Criticality();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTABLE__EVALUATION = eINSTANCE.getArgumentable_Evaluation();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.ContentImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.WebRequirementsImpl <em>Web Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.WebRequirementsImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getWebRequirements()
		 * @generated
		 */
		EClass WEB_REQUIREMENTS = eINSTANCE.getWebRequirements();

		/**
		 * The meta object literal for the '<em><b>Initial Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_REQUIREMENTS__INITIAL_STATUS = eINSTANCE.getWebRequirements_InitialStatus();

		/**
		 * The meta object literal for the '<em><b>Solicited By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_REQUIREMENTS__SOLICITED_BY = eINSTANCE.getWebRequirements_SolicitedBy();

		/**
		 * The meta object literal for the '<em><b>Implemented In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_REQUIREMENTS__IMPLEMENTED_IN = eINSTANCE.getWebRequirements_ImplementedIn();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.NavigationalImpl <em>Navigational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.NavigationalImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getNavigational()
		 * @generated
		 */
		EClass NAVIGATIONAL = eINSTANCE.getNavigational();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.ServiceImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.PersonalizationImpl <em>Personalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.PersonalizationImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getPersonalization()
		 * @generated
		 */
		EClass PERSONALIZATION = eINSTANCE.getPersonalization();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.LayoutImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.RelationshipImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__DESCRIPTION = eINSTANCE.getRelationship_Description();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.DecompositionImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__ELEMENT = eINSTANCE.getDecomposition_Element();

		/**
		 * The meta object literal for the '<em><b>Sub Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__SUB_ELEMENT = eINSTANCE.getDecomposition_SubElement();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.MeansEndImpl <em>Means End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.MeansEndImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getMeansEnd()
		 * @generated
		 */
		EClass MEANS_END = eINSTANCE.getMeansEnd();

		/**
		 * The meta object literal for the '<em><b>Means</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEANS_END__MEANS = eINSTANCE.getMeansEnd_Means();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEANS_END__ENDS = eINSTANCE.getMeansEnd_Ends();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.ContributionImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__CONTRIBUTOR = eINSTANCE.getContribution_Contributor();

		/**
		 * The meta object literal for the '<em><b>Contributed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__CONTRIBUTED = eINSTANCE.getContribution_Contributed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__TYPE = eINSTANCE.getContribution_Type();

		/**
		 * The meta object literal for the '<em><b>Weight On Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__WEIGHT_ON_CLIENT = eINSTANCE.getContribution_WeightOnClient();

		/**
		 * The meta object literal for the '<em><b>Weight On Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__WEIGHT_ON_SERVER = eINSTANCE.getContribution_WeightOnServer();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.CorrelationImpl <em>Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.CorrelationImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getCorrelation()
		 * @generated
		 */
		EClass CORRELATION = eINSTANCE.getCorrelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__TYPE = eINSTANCE.getCorrelation_Type();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.IDependencyImpl <em>IDependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.IDependencyImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getIDependency()
		 * @generated
		 */
		EClass IDEPENDENCY = eINSTANCE.getIDependency();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEPENDENCY__DEPENDENCY_TO = eINSTANCE.getIDependency_DependencyTo();

		/**
		 * The meta object literal for the '<em><b>Dependency From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEPENDENCY__DEPENDENCY_FROM = eINSTANCE.getIDependency_DependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDEPENDENCY__NAME = eINSTANCE.getIDependency_Name();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.impl.DependableImpl <em>Dependable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.impl.DependableImpl
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getDependable()
		 * @generated
		 */
		EClass DEPENDABLE = eINSTANCE.getDependable();

		/**
		 * The meta object literal for the '<em><b>Dependency From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABLE__DEPENDENCY_FROM = eINSTANCE.getDependable_DependencyFrom();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABLE__DEPENDENCY_TO = eINSTANCE.getDependable_DependencyTo();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.Criticality <em>Criticality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.Criticality
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getCriticality()
		 * @generated
		 */
		EEnum CRITICALITY = eINSTANCE.getCriticality();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.Evaluation <em>Evaluation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.Evaluation
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getEvaluation()
		 * @generated
		 */
		EEnum EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.InitialStatus <em>Initial Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.InitialStatus
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getInitialStatus()
		 * @generated
		 */
		EEnum INITIAL_STATUS = eINSTANCE.getInitialStatus();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.stakeholders <em>stakeholders</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.stakeholders
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getstakeholders()
		 * @generated
		 */
		EEnum STAKEHOLDERS = eINSTANCE.getstakeholders();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.ContributionType <em>Contribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.ContributionType
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getContributionType()
		 * @generated
		 */
		EEnum CONTRIBUTION_TYPE = eINSTANCE.getContributionType();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.CorrelationType <em>Correlation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.CorrelationType
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getCorrelationType()
		 * @generated
		 */
		EEnum CORRELATION_TYPE = eINSTANCE.getCorrelationType();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.RichInternetApplication <em>Rich Internet Application</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.RichInternetApplication
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getRichInternetApplication()
		 * @generated
		 */
		EEnum RICH_INTERNET_APPLICATION = eINSTANCE.getRichInternetApplication();

		/**
		 * The meta object literal for the '{@link WebRequirementsMetamodel.WeightValue <em>Weight Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebRequirementsMetamodel.WeightValue
		 * @see WebRequirementsMetamodel.impl.WebRequirementsMetamodelPackageImpl#getWeightValue()
		 * @generated
		 */
		EEnum WEIGHT_VALUE = eINSTANCE.getWeightValue();

	}

} //WebRequirementsMetamodelPackage
