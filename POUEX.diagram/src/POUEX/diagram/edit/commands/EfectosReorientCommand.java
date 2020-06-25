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

import POUEX.Acciones;
import POUEX.Caracteristicas;
import POUEX.Efectos;
import POUEX.diagram.edit.policies.POUEXBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class EfectosReorientCommand extends EditElementCommand {

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
	public EfectosReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Efectos) {
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
		if (!(oldEnd instanceof Acciones && newEnd instanceof Acciones)) {
			return false;
		}
		Caracteristicas target = getLink().getModifica();
		if (!(getLink().eContainer() instanceof Acciones)) {
			return false;
		}
		Acciones container = (Acciones) getLink().eContainer();
		return POUEXBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEfectos_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Caracteristicas && newEnd instanceof Caracteristicas)) {
			return false;
		}
		Acciones source = getLink().getCausada();
		if (!(getLink().eContainer() instanceof Acciones)) {
			return false;
		}
		Acciones container = (Acciones) getLink().eContainer();
		return POUEXBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEfectos_4001(container, getLink(), source,
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
		getLink().setCausada(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setModifica(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Efectos getLink() {
		return (Efectos) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Acciones getOldSource() {
		return (Acciones) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Acciones getNewSource() {
		return (Acciones) newEnd;
	}

	/**
	 * @generated
	 */
	protected Caracteristicas getOldTarget() {
		return (Caracteristicas) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Caracteristicas getNewTarget() {
		return (Caracteristicas) newEnd;
	}
}
