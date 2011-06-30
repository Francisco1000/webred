package WebRequirementsMetamodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WebRequirementsMetamodelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser contentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getContentName_5001Parser() {
		if (contentName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			contentName_5001Parser = parser;
		}
		return contentName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser navigationalName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNavigationalName_5002Parser() {
		if (navigationalName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			navigationalName_5002Parser = parser;
		}
		return navigationalName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser personalizationName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPersonalizationName_5003Parser() {
		if (personalizationName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			personalizationName_5003Parser = parser;
		}
		return personalizationName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5004Parser() {
		if (goalName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			goalName_5004Parser = parser;
		}
		return goalName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_5005Parser() {
		if (softgoalName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			softgoalName_5005Parser = parser;
		}
		return softgoalName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getServiceName_5006Parser() {
		if (serviceName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			serviceName_5006Parser = parser;
		}
		return serviceName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser actorDescription_5007Parser;

	/**
	 * @generated
	 */
	private IParser getActorDescription_5007Parser() {
		if (actorDescription_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getActor_Description() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			actorDescription_5007Parser = parser;
		}
		return actorDescription_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser layoutName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getLayoutName_5008Parser() {
		if (layoutName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			layoutName_5008Parser = parser;
		}
		return layoutName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getServiceName_5009Parser() {
		if (serviceName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			serviceName_5009Parser = parser;
		}
		return serviceName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser personalizationName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPersonalizationName_5010Parser() {
		if (personalizationName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			personalizationName_5010Parser = parser;
		}
		return personalizationName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser navigationalName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getNavigationalName_5011Parser() {
		if (navigationalName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			navigationalName_5011Parser = parser;
		}
		return navigationalName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser layoutName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getLayoutName_5012Parser() {
		if (layoutName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			layoutName_5012Parser = parser;
		}
		return layoutName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser contentName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getContentName_5013Parser() {
		if (contentName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			contentName_5013Parser = parser;
		}
		return contentName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5014Parser() {
		if (goalName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			goalName_5014Parser = parser;
		}
		return goalName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_5015Parser() {
		if (softgoalName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIntentionalElement_Name() };
			WebRequirementsMetamodel.diagram.parsers.MessageFormatParser parser = new WebRequirementsMetamodel.diagram.parsers.MessageFormatParser(
					features);
			softgoalName_5015Parser = parser;
		}
		return softgoalName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WebRequirementsMetamodel.diagram.edit.parts.ContentNameEditPart.VISUAL_ID:
			return getContentName_5001Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalNameEditPart.VISUAL_ID:
			return getNavigationalName_5002Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationNameEditPart.VISUAL_ID:
			return getPersonalizationName_5003Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return getGoalName_5004Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalName_5005Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceNameEditPart.VISUAL_ID:
			return getServiceName_5006Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.ActorDescriptionEditPart.VISUAL_ID:
			return getActorDescription_5007Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutNameEditPart.VISUAL_ID:
			return getLayoutName_5008Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceName2EditPart.VISUAL_ID:
			return getServiceName_5009Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationName2EditPart.VISUAL_ID:
			return getPersonalizationName_5010Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalName2EditPart.VISUAL_ID:
			return getNavigationalName_5011Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart.VISUAL_ID:
			return getLayoutName_5012Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.ContentName2EditPart.VISUAL_ID:
			return getContentName_5013Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
			return getGoalName_5014Parser();
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
			return getSoftgoalName_5015Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
