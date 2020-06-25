/*
 * 
 */
package POUEX.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import POUEX.diagram.edit.parts.AccionesEditPart;
import POUEX.diagram.edit.parts.CaracteristicasEditPart;
import POUEX.diagram.edit.parts.EmocionalesEditPart;
import POUEX.diagram.edit.parts.FisicasEditPart;
import POUEX.diagram.providers.POUEXElementTypes;
import POUEX.diagram.providers.POUEXModelingAssistantProvider;

/**
 * @generated
 */
public class POUEXModelingAssistantProviderOfAccionesEditPart extends
		POUEXModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AccionesEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(AccionesEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(POUEXElementTypes.Efectos_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(AccionesEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			AccionesEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FisicasEditPart) {
			types.add(POUEXElementTypes.Efectos_4001);
		}
		if (targetEditPart instanceof EmocionalesEditPart) {
			types.add(POUEXElementTypes.Efectos_4001);
		}
		if (targetEditPart instanceof CaracteristicasEditPart) {
			types.add(POUEXElementTypes.Efectos_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AccionesEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(AccionesEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == POUEXElementTypes.Efectos_4001) {
			types.add(POUEXElementTypes.Fisicas_2001);
			types.add(POUEXElementTypes.Emocionales_2002);
			types.add(POUEXElementTypes.Caracteristicas_2006);
		}
		return types;
	}

}
