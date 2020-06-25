/*
 * 
 */
package POUEX.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import POUEX.diagram.part.POUEXVisualIDRegistry;

/**
 * @generated
 */
public class POUEXEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (POUEXVisualIDRegistry.getVisualID(view)) {

			case MascotaEditPart.VISUAL_ID:
				return new MascotaEditPart(view);

			case FisicasEditPart.VISUAL_ID:
				return new FisicasEditPart(view);

			case FisicasNombreEditPart.VISUAL_ID:
				return new FisicasNombreEditPart(view);

			case EmocionalesEditPart.VISUAL_ID:
				return new EmocionalesEditPart(view);

			case EmocionalesNombreEditPart.VISUAL_ID:
				return new EmocionalesNombreEditPart(view);

			case NormalesEditPart.VISUAL_ID:
				return new NormalesEditPart(view);

			case NormalesNombreEditPart.VISUAL_ID:
				return new NormalesNombreEditPart(view);

			case CriticosEditPart.VISUAL_ID:
				return new CriticosEditPart(view);

			case CriticosNombreEditPart.VISUAL_ID:
				return new CriticosNombreEditPart(view);

			case AccionesEditPart.VISUAL_ID:
				return new AccionesEditPart(view);

			case AccionesNombreEditPart.VISUAL_ID:
				return new AccionesNombreEditPart(view);

			case CaracteristicasEditPart.VISUAL_ID:
				return new CaracteristicasEditPart(view);

			case CaracteristicasNombreEditPart.VISUAL_ID:
				return new CaracteristicasNombreEditPart(view);

			case EstadosEditPart.VISUAL_ID:
				return new EstadosEditPart(view);

			case EstadosNombreEditPart.VISUAL_ID:
				return new EstadosNombreEditPart(view);

			case EfectosEditPart.VISUAL_ID:
				return new EfectosEditPart(view);

			case EfectosValorModificaEditPart.VISUAL_ID:
				return new EfectosValorModificaEditPart(view);

			case TransicionesEditPart.VISUAL_ID:
				return new TransicionesEditPart(view);

			case TransicionesValorCambioEditPart.VISUAL_ID:
				return new TransicionesValorCambioEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
