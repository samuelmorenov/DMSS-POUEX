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
import POUEX.diagram.edit.parts.CriticosEditPart;
import POUEX.diagram.edit.parts.EmocionalesEditPart;
import POUEX.diagram.edit.parts.EstadosEditPart;
import POUEX.diagram.edit.parts.NormalesEditPart;
import POUEX.diagram.providers.POUEXElementTypes;
import POUEX.diagram.providers.POUEXModelingAssistantProvider;

/**
 * @generated
 */
public class POUEXModelingAssistantProviderOfEmocionalesEditPart extends
		POUEXModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EmocionalesEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(EmocionalesEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(POUEXElementTypes.Transiciones_4002);
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
				(EmocionalesEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			EmocionalesEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof NormalesEditPart) {
			types.add(POUEXElementTypes.Transiciones_4002);
		}
		if (targetEditPart instanceof CriticosEditPart) {
			types.add(POUEXElementTypes.Transiciones_4002);
		}
		if (targetEditPart instanceof EstadosEditPart) {
			types.add(POUEXElementTypes.Transiciones_4002);
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
		return doGetTypesForTarget((EmocionalesEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(EmocionalesEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == POUEXElementTypes.Transiciones_4002) {
			types.add(POUEXElementTypes.Normales_2003);
			types.add(POUEXElementTypes.Criticos_2004);
			types.add(POUEXElementTypes.Estados_2007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EmocionalesEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(EmocionalesEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(POUEXElementTypes.Efectos_4001);
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
		return doGetTypesForSource((EmocionalesEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(EmocionalesEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == POUEXElementTypes.Efectos_4001) {
			types.add(POUEXElementTypes.Acciones_2005);
		}
		return types;
	}

}
