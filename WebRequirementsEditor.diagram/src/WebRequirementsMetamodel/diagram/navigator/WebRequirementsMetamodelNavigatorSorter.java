package WebRequirementsMetamodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class WebRequirementsMetamodelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem item = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) element;
			return WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
