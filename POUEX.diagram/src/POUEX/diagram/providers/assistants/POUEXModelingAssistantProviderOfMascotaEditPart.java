/*
 * 
 */
package POUEX.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import POUEX.diagram.providers.POUEXElementTypes;
import POUEX.diagram.providers.POUEXModelingAssistantProvider;

/**
 * @generated
 */
public class POUEXModelingAssistantProviderOfMascotaEditPart extends
		POUEXModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(POUEXElementTypes.Fisicas_2001);
		types.add(POUEXElementTypes.Emocionales_2002);
		types.add(POUEXElementTypes.Normales_2003);
		types.add(POUEXElementTypes.Criticos_2004);
		types.add(POUEXElementTypes.Acciones_2005);
		types.add(POUEXElementTypes.Caracteristicas_2006);
		types.add(POUEXElementTypes.Estados_2007);
		return types;
	}

}
