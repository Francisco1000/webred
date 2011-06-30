package WebRequirementsMetamodel.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WebRequirementsMetamodelNavigatorItem
		extends
		WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public WebRequirementsMetamodelNavigatorItem(View view, Object parent,
			boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
