/*
 * 
 */
package POUEX.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import POUEX.Mascota;
import POUEX.POUEXPackage;
import POUEX.diagram.edit.parts.AccionesEditPart;
import POUEX.diagram.edit.parts.AccionesNombreEditPart;
import POUEX.diagram.edit.parts.CaracteristicasEditPart;
import POUEX.diagram.edit.parts.CaracteristicasNombreEditPart;
import POUEX.diagram.edit.parts.CriticosEditPart;
import POUEX.diagram.edit.parts.CriticosNombreEditPart;
import POUEX.diagram.edit.parts.EfectosEditPart;
import POUEX.diagram.edit.parts.EfectosValorModificaEditPart;
import POUEX.diagram.edit.parts.EmocionalesEditPart;
import POUEX.diagram.edit.parts.EmocionalesNombreEditPart;
import POUEX.diagram.edit.parts.EstadosEditPart;
import POUEX.diagram.edit.parts.EstadosNombreEditPart;
import POUEX.diagram.edit.parts.FisicasEditPart;
import POUEX.diagram.edit.parts.FisicasNombreEditPart;
import POUEX.diagram.edit.parts.MascotaEditPart;
import POUEX.diagram.edit.parts.NormalesEditPart;
import POUEX.diagram.edit.parts.NormalesNombreEditPart;
import POUEX.diagram.edit.parts.TransicionesEditPart;
import POUEX.diagram.edit.parts.TransicionesValorCambioEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class POUEXVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "POUEX.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MascotaEditPart.MODEL_ID.equals(view.getType())) {
				return MascotaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return POUEX.diagram.part.POUEXVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				POUEXDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (POUEXPackage.eINSTANCE.getMascota().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Mascota) domainElement)) {
			return MascotaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = POUEX.diagram.part.POUEXVisualIDRegistry
				.getModelID(containerView);
		if (!MascotaEditPart.MODEL_ID.equals(containerModelID)
				&& !"POUEX".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MascotaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = POUEX.diagram.part.POUEXVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MascotaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MascotaEditPart.VISUAL_ID:
			if (POUEXPackage.eINSTANCE.getFisicas().isSuperTypeOf(
					domainElement.eClass())) {
				return FisicasEditPart.VISUAL_ID;
			}
			if (POUEXPackage.eINSTANCE.getEmocionales().isSuperTypeOf(
					domainElement.eClass())) {
				return EmocionalesEditPart.VISUAL_ID;
			}
			if (POUEXPackage.eINSTANCE.getNormales().isSuperTypeOf(
					domainElement.eClass())) {
				return NormalesEditPart.VISUAL_ID;
			}
			if (POUEXPackage.eINSTANCE.getCriticos().isSuperTypeOf(
					domainElement.eClass())) {
				return CriticosEditPart.VISUAL_ID;
			}
			if (POUEXPackage.eINSTANCE.getAcciones().isSuperTypeOf(
					domainElement.eClass())) {
				return AccionesEditPart.VISUAL_ID;
			}
			if (POUEXPackage.eINSTANCE.getCaracteristicas().isSuperTypeOf(
					domainElement.eClass())) {
				return CaracteristicasEditPart.VISUAL_ID;
			}
			if (POUEXPackage.eINSTANCE.getEstados().isSuperTypeOf(
					domainElement.eClass())) {
				return EstadosEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = POUEX.diagram.part.POUEXVisualIDRegistry
				.getModelID(containerView);
		if (!MascotaEditPart.MODEL_ID.equals(containerModelID)
				&& !"POUEX".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MascotaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = POUEX.diagram.part.POUEXVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MascotaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MascotaEditPart.VISUAL_ID:
			if (FisicasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmocionalesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NormalesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CriticosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AccionesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EstadosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FisicasEditPart.VISUAL_ID:
			if (FisicasNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmocionalesEditPart.VISUAL_ID:
			if (EmocionalesNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NormalesEditPart.VISUAL_ID:
			if (NormalesNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CriticosEditPart.VISUAL_ID:
			if (CriticosNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AccionesEditPart.VISUAL_ID:
			if (AccionesNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicasEditPart.VISUAL_ID:
			if (CaracteristicasNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EstadosEditPart.VISUAL_ID:
			if (EstadosNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EfectosEditPart.VISUAL_ID:
			if (EfectosValorModificaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransicionesEditPart.VISUAL_ID:
			if (TransicionesValorCambioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (POUEXPackage.eINSTANCE.getEfectos().isSuperTypeOf(
				domainElement.eClass())) {
			return EfectosEditPart.VISUAL_ID;
		}
		if (POUEXPackage.eINSTANCE.getTransiciones().isSuperTypeOf(
				domainElement.eClass())) {
			return TransicionesEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Mascota element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MascotaEditPart.VISUAL_ID:
			return false;
		case FisicasEditPart.VISUAL_ID:
		case EmocionalesEditPart.VISUAL_ID:
		case NormalesEditPart.VISUAL_ID:
		case CriticosEditPart.VISUAL_ID:
		case AccionesEditPart.VISUAL_ID:
		case CaracteristicasEditPart.VISUAL_ID:
		case EstadosEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return POUEX.diagram.part.POUEXVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return POUEX.diagram.part.POUEXVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return POUEX.diagram.part.POUEXVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return POUEX.diagram.part.POUEXVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return POUEX.diagram.part.POUEXVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return POUEX.diagram.part.POUEXVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
