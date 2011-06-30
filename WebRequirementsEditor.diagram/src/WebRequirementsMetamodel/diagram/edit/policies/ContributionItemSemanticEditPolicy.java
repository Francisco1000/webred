package WebRequirementsMetamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ContributionItemSemanticEditPolicy
		extends
		WebRequirementsMetamodel.diagram.edit.policies.WebRequirementsMetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContributionItemSemanticEditPolicy() {
		super(
				WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
