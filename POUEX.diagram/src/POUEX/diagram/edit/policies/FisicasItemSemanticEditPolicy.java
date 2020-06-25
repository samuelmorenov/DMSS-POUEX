/*
 * 
 */
package POUEX.diagram.edit.policies;

import java.util.Iterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import POUEX.diagram.edit.commands.EfectosCreateCommand;
import POUEX.diagram.edit.commands.EfectosReorientCommand;
import POUEX.diagram.edit.commands.TransicionesCreateCommand;
import POUEX.diagram.edit.commands.TransicionesReorientCommand;
import POUEX.diagram.edit.parts.EfectosEditPart;
import POUEX.diagram.edit.parts.TransicionesEditPart;
import POUEX.diagram.part.POUEXVisualIDRegistry;
import POUEX.diagram.providers.POUEXElementTypes;

/**
 * @generated
 */
public class FisicasItemSemanticEditPolicy extends
		POUEXBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FisicasItemSemanticEditPolicy() {
		super(POUEXElementTypes.Fisicas_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (POUEXVisualIDRegistry.getVisualID(incomingLink) == EfectosEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (POUEXVisualIDRegistry.getVisualID(outgoingLink) == TransicionesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (POUEXElementTypes.Efectos_4001 == req.getElementType()) {
			return null;
		}
		if (POUEXElementTypes.Transiciones_4002 == req.getElementType()) {
			return getGEFWrapper(new TransicionesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (POUEXElementTypes.Efectos_4001 == req.getElementType()) {
			return getGEFWrapper(new EfectosCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (POUEXElementTypes.Transiciones_4002 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EfectosEditPart.VISUAL_ID:
			return getGEFWrapper(new EfectosReorientCommand(req));
		case TransicionesEditPart.VISUAL_ID:
			return getGEFWrapper(new TransicionesReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
