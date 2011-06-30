package WebRequirementsMetamodel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		WebRequirementsMetamodel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		WebRequirementsMetamodel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		WebRequirementsMetamodel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		WebRequirementsMetamodel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		WebRequirementsMetamodel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
