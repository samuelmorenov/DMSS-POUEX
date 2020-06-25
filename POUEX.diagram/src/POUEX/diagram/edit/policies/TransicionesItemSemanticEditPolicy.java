/*
 * 
 */
package POUEX.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import POUEX.diagram.providers.POUEXElementTypes;

/**
 * @generated
 */
public class TransicionesItemSemanticEditPolicy extends
		POUEXBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransicionesItemSemanticEditPolicy() {
		super(POUEXElementTypes.Transiciones_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
