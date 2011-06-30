package WebRequirementsMetamodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class IDependencyReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public IDependencyReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof WebRequirementsMetamodel.IDependency) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof WebRequirementsMetamodel.Dependable && newEnd instanceof WebRequirementsMetamodel.Dependable)) {
			return false;
		}
		if (getLink().getDependencyTo().size() != 1) {
			return false;
		}
		WebRequirementsMetamodel.Dependable target = (WebRequirementsMetamodel.Dependable) getLink()
				.getDependencyTo().get(0);
		if (!(getLink().eContainer() instanceof WebRequirementsMetamodel.SD)) {
			return false;
		}
		WebRequirementsMetamodel.SD container = (WebRequirementsMetamodel.SD) getLink()
				.eContainer();
		return WebRequirementsMetamodel.diagram.edit.policies.WebRequirementsMetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistIDependency_4004(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof WebRequirementsMetamodel.Dependable && newEnd instanceof WebRequirementsMetamodel.Dependable)) {
			return false;
		}
		if (getLink().getDependencyFrom().size() != 1) {
			return false;
		}
		WebRequirementsMetamodel.Dependable source = (WebRequirementsMetamodel.Dependable) getLink()
				.getDependencyFrom().get(0);
		if (!(getLink().eContainer() instanceof WebRequirementsMetamodel.SD)) {
			return false;
		}
		WebRequirementsMetamodel.SD container = (WebRequirementsMetamodel.SD) getLink()
				.eContainer();
		return WebRequirementsMetamodel.diagram.edit.policies.WebRequirementsMetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistIDependency_4004(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getDependencyFrom().remove(getOldSource());
		getLink().getDependencyFrom().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getDependencyTo().remove(getOldTarget());
		getLink().getDependencyTo().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.IDependency getLink() {
		return (WebRequirementsMetamodel.IDependency) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.Dependable getOldSource() {
		return (WebRequirementsMetamodel.Dependable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.Dependable getNewSource() {
		return (WebRequirementsMetamodel.Dependable) newEnd;
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.Dependable getOldTarget() {
		return (WebRequirementsMetamodel.Dependable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.Dependable getNewTarget() {
		return (WebRequirementsMetamodel.Dependable) newEnd;
	}
}
