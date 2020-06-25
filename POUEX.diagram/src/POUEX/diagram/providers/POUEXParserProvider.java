/*
 * 
 */
package POUEX.diagram.providers;

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

import POUEX.POUEXPackage;
import POUEX.diagram.edit.parts.AccionesNombreEditPart;
import POUEX.diagram.edit.parts.CaracteristicasNombreEditPart;
import POUEX.diagram.edit.parts.CriticosNombreEditPart;
import POUEX.diagram.edit.parts.EfectosValorModificaEditPart;
import POUEX.diagram.edit.parts.EmocionalesNombreEditPart;
import POUEX.diagram.edit.parts.EstadosNombreEditPart;
import POUEX.diagram.edit.parts.FisicasNombreEditPart;
import POUEX.diagram.edit.parts.NormalesNombreEditPart;
import POUEX.diagram.edit.parts.TransicionesValorCambioEditPart;
import POUEX.diagram.parsers.MessageFormatParser;
import POUEX.diagram.part.POUEXVisualIDRegistry;

/**
 * @generated
 */
public class POUEXParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser fisicasNombre_5001Parser;

	/**
	 * @generated
	 */
	private IParser getFisicasNombre_5001Parser() {
		if (fisicasNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getCaracteristicas_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fisicasNombre_5001Parser = parser;
		}
		return fisicasNombre_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser emocionalesNombre_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEmocionalesNombre_5002Parser() {
		if (emocionalesNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getCaracteristicas_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emocionalesNombre_5002Parser = parser;
		}
		return emocionalesNombre_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser normalesNombre_5003Parser;

	/**
	 * @generated
	 */
	private IParser getNormalesNombre_5003Parser() {
		if (normalesNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getEstados_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			normalesNombre_5003Parser = parser;
		}
		return normalesNombre_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser criticosNombre_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCriticosNombre_5004Parser() {
		if (criticosNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getEstados_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			criticosNombre_5004Parser = parser;
		}
		return criticosNombre_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser accionesNombre_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAccionesNombre_5005Parser() {
		if (accionesNombre_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getAcciones_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			accionesNombre_5005Parser = parser;
		}
		return accionesNombre_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicasNombre_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicasNombre_5006Parser() {
		if (caracteristicasNombre_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getCaracteristicas_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicasNombre_5006Parser = parser;
		}
		return caracteristicasNombre_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser estadosNombre_5007Parser;

	/**
	 * @generated
	 */
	private IParser getEstadosNombre_5007Parser() {
		if (estadosNombre_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getEstados_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			estadosNombre_5007Parser = parser;
		}
		return estadosNombre_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser efectosValorModifica_6001Parser;

	/**
	 * @generated
	 */
	private IParser getEfectosValorModifica_6001Parser() {
		if (efectosValorModifica_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getEfectos_ValorModifica() };
			MessageFormatParser parser = new MessageFormatParser(features);
			efectosValorModifica_6001Parser = parser;
		}
		return efectosValorModifica_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transicionesValorCambio_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTransicionesValorCambio_6002Parser() {
		if (transicionesValorCambio_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { POUEXPackage.eINSTANCE
					.getTransiciones_ValorCambio() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transicionesValorCambio_6002Parser = parser;
		}
		return transicionesValorCambio_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FisicasNombreEditPart.VISUAL_ID:
			return getFisicasNombre_5001Parser();
		case EmocionalesNombreEditPart.VISUAL_ID:
			return getEmocionalesNombre_5002Parser();
		case NormalesNombreEditPart.VISUAL_ID:
			return getNormalesNombre_5003Parser();
		case CriticosNombreEditPart.VISUAL_ID:
			return getCriticosNombre_5004Parser();
		case AccionesNombreEditPart.VISUAL_ID:
			return getAccionesNombre_5005Parser();
		case CaracteristicasNombreEditPart.VISUAL_ID:
			return getCaracteristicasNombre_5006Parser();
		case EstadosNombreEditPart.VISUAL_ID:
			return getEstadosNombre_5007Parser();
		case EfectosValorModificaEditPart.VISUAL_ID:
			return getEfectosValorModifica_6001Parser();
		case TransicionesValorCambioEditPart.VISUAL_ID:
			return getTransicionesValorCambio_6002Parser();
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
			return getParser(POUEXVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(POUEXVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (POUEXElementTypes.getElement(hint) == null) {
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
