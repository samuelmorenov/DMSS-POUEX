/*
 * 
 */
package POUEX.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import POUEX.diagram.edit.parts.MascotaEditPart;
import POUEX.diagram.edit.parts.POUEXEditPartFactory;
import POUEX.diagram.part.POUEXVisualIDRegistry;

/**
 * @generated
 */
public class POUEXEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public POUEXEditPartProvider() {
		super(new POUEXEditPartFactory(), POUEXVisualIDRegistry.TYPED_INSTANCE,
				MascotaEditPart.MODEL_ID);
	}

}
