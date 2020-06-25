/*
 * 
 */
package POUEX.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import POUEX.Caracteristicas;
import POUEX.Estados;
import POUEX.Transiciones;
import POUEX.diagram.edit.policies.POUEXBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransicionesReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TransicionesReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Transiciones) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Caracteristicas && newEnd instanceof Caracteristicas)) {
			return false;
		}
		Estados target = getLink().getModificar();
		if (!(getLink().eContainer() instanceof Caracteristicas)) {
			return false;
		}
		Caracteristicas container = (Caracteristicas) getLink().eContainer();
		return POUEXBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransiciones_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Estados && newEnd instanceof Estados)) {
			return false;
		}
		Caracteristicas source = getLink().getProducida();
		if (!(getLink().eContainer() instanceof Caracteristicas)) {
			return false;
		}
		Caracteristicas container = (Caracteristicas) getLink().eContainer();
		return POUEXBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransiciones_4002(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setProducida(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setModificar(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Transiciones getLink() {
		return (Transiciones) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Caracteristicas getOldSource() {
		return (Caracteristicas) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Caracteristicas getNewSource() {
		return (Caracteristicas) newEnd;
	}

	/**
	 * @generated
	 */
	protected Estados getOldTarget() {
		return (Estados) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Estados getNewTarget() {
		return (Estados) newEnd;
	}
}
