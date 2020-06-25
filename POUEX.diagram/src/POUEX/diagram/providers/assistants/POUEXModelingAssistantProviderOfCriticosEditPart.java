/*
 * 
 */
package POUEX.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import POUEX.diagram.edit.parts.CriticosEditPart;
import POUEX.diagram.providers.POUEXElementTypes;
import POUEX.diagram.providers.POUEXModelingAssistantProvider;

/**
 * @generated
 */
public class POUEXModelingAssistantProviderOfCriticosEditPart extends
		POUEXModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CriticosEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(CriticosEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(POUEXElementTypes.Transiciones_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CriticosEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(CriticosEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == POUEXElementTypes.Transiciones_4002) {
			types.add(POUEXElementTypes.Fisicas_2001);
			types.add(POUEXElementTypes.Emocionales_2002);
			types.add(POUEXElementTypes.Caracteristicas_2006);
		}
		return types;
	}

}
