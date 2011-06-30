package WebRequirementsMetamodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class DecompositionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public DecompositionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new WebRequirementsMetamodel.diagram.edit.policies.DecompositionItemSemanticEditPolicy());
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
		return new DecompositionFigure();
	}

	/**
	 * @generated
	 */
	public DecompositionFigure getPrimaryShape() {
		return (DecompositionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DecompositionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDecompositionDescriptionFigure;

		/**
		 * @generated
		 */
		public DecompositionFigure() {
			this.setForegroundColor(THIS_FORE);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDecompositionDescriptionFigure = new WrappingLabel();
			fFigureDecompositionDescriptionFigure.setText("<Decomposition>");

			this.add(fFigureDecompositionDescriptionFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setBackgroundColor(DF_BACK);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(3));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(-3));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDecompositionDescriptionFigure() {
			return fFigureDecompositionDescriptionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);
	/**
	 * @generated
	 */
	static final Color DF_BACK = new Color(null, 255, 255, 255);

}
