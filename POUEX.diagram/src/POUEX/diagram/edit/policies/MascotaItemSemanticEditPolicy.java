/*
 * 
 */
package POUEX.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import POUEX.diagram.edit.commands.AccionesCreateCommand;
import POUEX.diagram.edit.commands.CaracteristicasCreateCommand;
import POUEX.diagram.edit.commands.CriticosCreateCommand;
import POUEX.diagram.edit.commands.EmocionalesCreateCommand;
import POUEX.diagram.edit.commands.EstadosCreateCommand;
import POUEX.diagram.edit.commands.FisicasCreateCommand;
import POUEX.diagram.edit.commands.NormalesCreateCommand;
import POUEX.diagram.providers.POUEXElementTypes;

/**
 * @generated
 */
public class MascotaItemSemanticEditPolicy extends
		POUEXBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MascotaItemSemanticEditPolicy() {
		super(POUEXElementTypes.Mascota_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (POUEXElementTypes.Fisicas_2001 == req.getElementType()) {
			return getGEFWrapper(new FisicasCreateCommand(req));
		}
		if (POUEXElementTypes.Emocionales_2002 == req.getElementType()) {
			return getGEFWrapper(new EmocionalesCreateCommand(req));
		}
		if (POUEXElementTypes.Normales_2003 == req.getElementType()) {
			return getGEFWrapper(new NormalesCreateCommand(req));
		}
		if (POUEXElementTypes.Criticos_2004 == req.getElementType()) {
			return getGEFWrapper(new CriticosCreateCommand(req));
		}
		if (POUEXElementTypes.Acciones_2005 == req.getElementType()) {
			return getGEFWrapper(new AccionesCreateCommand(req));
		}
		if (POUEXElementTypes.Caracteristicas_2006 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicasCreateCommand(req));
		}
		if (POUEXElementTypes.Estados_2007 == req.getElementType()) {
			return getGEFWrapper(new EstadosCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
