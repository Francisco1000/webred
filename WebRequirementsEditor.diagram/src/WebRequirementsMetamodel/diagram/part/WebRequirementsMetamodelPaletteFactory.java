package WebRequirementsMetamodel.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WebRequirementsMetamodelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createWebRequirementsMetamodel1Group());
		paletteRoot.add(createIntentionalElements2Group());
		paletteRoot.add(createWebRequirements3Group());
		paletteRoot.add(createLinks4Group());
	}

	/**
	 * Creates "WebRequirementsMetamodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createWebRequirementsMetamodel1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodel1Group_title);
		paletteContainer.setId("createWebRequirementsMetamodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createSR1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Intentional Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createIntentionalElements2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				WebRequirementsMetamodel.diagram.part.Messages.IntentionalElements2Group_title);
		paletteContainer.setId("createIntentionalElements2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(WebRequirementsMetamodel.diagram.part.Messages.IntentionalElements2Group_desc);
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createBelief2CreationTool());
		paletteContainer.add(createGoal3CreationTool());
		paletteContainer.add(createSoftgoal4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Web Requirements" palette tool group
	 * @generated
	 */
	private PaletteContainer createWebRequirements3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				WebRequirementsMetamodel.diagram.part.Messages.WebRequirements3Group_title);
		paletteContainer.setId("createWebRequirements3Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(WebRequirementsMetamodel.diagram.part.Messages.WebRequirements3Group_desc);
		paletteContainer.add(createContent1CreationTool());
		paletteContainer.add(createNavigational2CreationTool());
		paletteContainer.add(createService3CreationTool());
		paletteContainer.add(createPersonalization4CreationTool());
		paletteContainer.add(createLayout5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				WebRequirementsMetamodel.diagram.part.Messages.Links4Group_title);
		paletteContainer.setId("createLinks4Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(WebRequirementsMetamodel.diagram.part.Messages.Links4Group_desc);
		paletteContainer.add(createDecomposition1CreationTool());
		paletteContainer.add(createMeansEnd2CreationTool());
		paletteContainer.add(createContribution3CreationTool());
		paletteContainer.add(createDependency4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSR1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.SR1CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.SR1CreationTool_desc,
				Collections
						.singletonList(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.SR_3001));
		entry.setId("createSR1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.SR_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Actor1CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Actor1CreationTool_desc,
				Collections
						.singletonList(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBelief2CreationTool() {
		ToolEntry entry = new ToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Belief2CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Belief2CreationTool_desc,
				null, null) {
		};
		entry.setId("createBelief2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Goal3CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Goal3CreationTool_desc,
				types);
		entry.setId("createGoal3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftgoal4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Softgoal4CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Softgoal4CreationTool_desc,
				types);
		entry.setId("createSoftgoal4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContent1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Content1CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Content1CreationTool_desc,
				types);
		entry.setId("createContent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNavigational2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Navigational2CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Navigational2CreationTool_desc,
				types);
		entry.setId("createNavigational2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createService3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Service3CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Service3CreationTool_desc,
				types);
		entry.setId("createService3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPersonalization4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Personalization4CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Personalization4CreationTool_desc,
				types);
		entry.setId("createPersonalization4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayout5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
		NodeToolEntry entry = new NodeToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Layout5CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Layout5CreationTool_desc,
				types);
		entry.setId("createLayout5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecomposition1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Decomposition1CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Decomposition1CreationTool_desc,
				Collections
						.singletonList(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001));
		entry.setId("createDecomposition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeansEnd2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.MeansEnd2CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.MeansEnd2CreationTool_desc,
				Collections
						.singletonList(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002));
		entry.setId("createMeansEnd2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContribution3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Contribution3CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Contribution3CreationTool_desc,
				Collections
						.singletonList(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003));
		entry.setId("createContribution3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				WebRequirementsMetamodel.diagram.part.Messages.Dependency4CreationTool_title,
				WebRequirementsMetamodel.diagram.part.Messages.Dependency4CreationTool_desc,
				Collections
						.singletonList(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004));
		entry.setId("createDependency4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
				.getImageDescriptor(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
