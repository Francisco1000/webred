package WebRequirementsMetamodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ContributionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public ContributionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new WebRequirementsMetamodel.diagram.edit.policies.ContributionItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ContributionFigure();
	}

	/**
	 * @generated
	 */
	public ContributionFigure getPrimaryShape() {
		return (ContributionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ContributionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContributionDescriptionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContributionTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContributionWeightOnClientFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContributionWeightOnServerFigure;

		/**
		 * @generated
		 */
		public ContributionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContributionDescriptionFigure = new WrappingLabel();
			fFigureContributionDescriptionFigure.setText("<...>");

			this.add(fFigureContributionDescriptionFigure);

			fFigureContributionTypeFigure = new WrappingLabel();
			fFigureContributionTypeFigure.setText("<...>");

			this.add(fFigureContributionTypeFigure);

			fFigureContributionWeightOnClientFigure = new WrappingLabel();
			fFigureContributionWeightOnClientFigure.setText("<...>");

			this.add(fFigureContributionWeightOnClientFigure);

			fFigureContributionWeightOnServerFigure = new WrappingLabel();
			fFigureContributionWeightOnServerFigure.setText("<...>");

			this.add(fFigureContributionWeightOnServerFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContributionDescriptionFigure() {
			return fFigureContributionDescriptionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContributionTypeFigure() {
			return fFigureContributionTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContributionWeightOnClientFigure() {
			return fFigureContributionWeightOnClientFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContributionWeightOnServerFigure() {
			return fFigureContributionWeightOnServerFigure;
		}

	}

}
