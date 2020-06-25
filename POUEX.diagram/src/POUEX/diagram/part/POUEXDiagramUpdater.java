/*
 * 
 */
package POUEX.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import POUEX.Acciones;
import POUEX.Caracteristicas;
import POUEX.Criticos;
import POUEX.Efectos;
import POUEX.Emocionales;
import POUEX.Estados;
import POUEX.Fisicas;
import POUEX.Mascota;
import POUEX.Normales;
import POUEX.POUEXPackage;
import POUEX.Transiciones;
import POUEX.diagram.edit.parts.AccionesEditPart;
import POUEX.diagram.edit.parts.CaracteristicasEditPart;
import POUEX.diagram.edit.parts.CriticosEditPart;
import POUEX.diagram.edit.parts.EfectosEditPart;
import POUEX.diagram.edit.parts.EmocionalesEditPart;
import POUEX.diagram.edit.parts.EstadosEditPart;
import POUEX.diagram.edit.parts.FisicasEditPart;
import POUEX.diagram.edit.parts.MascotaEditPart;
import POUEX.diagram.edit.parts.NormalesEditPart;
import POUEX.diagram.edit.parts.TransicionesEditPart;
import POUEX.diagram.providers.POUEXElementTypes;

/**
 * @generated
 */
public class POUEXDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<POUEXNodeDescriptor> getSemanticChildren(View view) {
		switch (POUEXVisualIDRegistry.getVisualID(view)) {
		case MascotaEditPart.VISUAL_ID:
			return getMascota_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXNodeDescriptor> getMascota_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Mascota modelElement = (Mascota) view.getElement();
		LinkedList<POUEXNodeDescriptor> result = new LinkedList<POUEXNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPoseer().iterator(); it.hasNext();) {
			Caracteristicas childElement = (Caracteristicas) it.next();
			int visualID = POUEXVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FisicasEditPart.VISUAL_ID) {
				result.add(new POUEXNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EmocionalesEditPart.VISUAL_ID) {
				result.add(new POUEXNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaracteristicasEditPart.VISUAL_ID) {
				result.add(new POUEXNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEstar().iterator(); it.hasNext();) {
			Estados childElement = (Estados) it.next();
			int visualID = POUEXVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NormalesEditPart.VISUAL_ID) {
				result.add(new POUEXNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CriticosEditPart.VISUAL_ID) {
				result.add(new POUEXNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EstadosEditPart.VISUAL_ID) {
				result.add(new POUEXNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRealizar().iterator(); it
				.hasNext();) {
			Acciones childElement = (Acciones) it.next();
			int visualID = POUEXVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AccionesEditPart.VISUAL_ID) {
				result.add(new POUEXNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getContainedLinks(View view) {
		switch (POUEXVisualIDRegistry.getVisualID(view)) {
		case MascotaEditPart.VISUAL_ID:
			return getMascota_1000ContainedLinks(view);
		case FisicasEditPart.VISUAL_ID:
			return getFisicas_2001ContainedLinks(view);
		case EmocionalesEditPart.VISUAL_ID:
			return getEmocionales_2002ContainedLinks(view);
		case NormalesEditPart.VISUAL_ID:
			return getNormales_2003ContainedLinks(view);
		case CriticosEditPart.VISUAL_ID:
			return getCriticos_2004ContainedLinks(view);
		case AccionesEditPart.VISUAL_ID:
			return getAcciones_2005ContainedLinks(view);
		case CaracteristicasEditPart.VISUAL_ID:
			return getCaracteristicas_2006ContainedLinks(view);
		case EstadosEditPart.VISUAL_ID:
			return getEstados_2007ContainedLinks(view);
		case EfectosEditPart.VISUAL_ID:
			return getEfectos_4001ContainedLinks(view);
		case TransicionesEditPart.VISUAL_ID:
			return getTransiciones_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getIncomingLinks(View view) {
		switch (POUEXVisualIDRegistry.getVisualID(view)) {
		case FisicasEditPart.VISUAL_ID:
			return getFisicas_2001IncomingLinks(view);
		case EmocionalesEditPart.VISUAL_ID:
			return getEmocionales_2002IncomingLinks(view);
		case NormalesEditPart.VISUAL_ID:
			return getNormales_2003IncomingLinks(view);
		case CriticosEditPart.VISUAL_ID:
			return getCriticos_2004IncomingLinks(view);
		case AccionesEditPart.VISUAL_ID:
			return getAcciones_2005IncomingLinks(view);
		case CaracteristicasEditPart.VISUAL_ID:
			return getCaracteristicas_2006IncomingLinks(view);
		case EstadosEditPart.VISUAL_ID:
			return getEstados_2007IncomingLinks(view);
		case EfectosEditPart.VISUAL_ID:
			return getEfectos_4001IncomingLinks(view);
		case TransicionesEditPart.VISUAL_ID:
			return getTransiciones_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getOutgoingLinks(View view) {
		switch (POUEXVisualIDRegistry.getVisualID(view)) {
		case FisicasEditPart.VISUAL_ID:
			return getFisicas_2001OutgoingLinks(view);
		case EmocionalesEditPart.VISUAL_ID:
			return getEmocionales_2002OutgoingLinks(view);
		case NormalesEditPart.VISUAL_ID:
			return getNormales_2003OutgoingLinks(view);
		case CriticosEditPart.VISUAL_ID:
			return getCriticos_2004OutgoingLinks(view);
		case AccionesEditPart.VISUAL_ID:
			return getAcciones_2005OutgoingLinks(view);
		case CaracteristicasEditPart.VISUAL_ID:
			return getCaracteristicas_2006OutgoingLinks(view);
		case EstadosEditPart.VISUAL_ID:
			return getEstados_2007OutgoingLinks(view);
		case EfectosEditPart.VISUAL_ID:
			return getEfectos_4001OutgoingLinks(view);
		case TransicionesEditPart.VISUAL_ID:
			return getTransiciones_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getMascota_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getFisicas_2001ContainedLinks(
			View view) {
		Fisicas modelElement = (Fisicas) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transiciones_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEmocionales_2002ContainedLinks(
			View view) {
		Emocionales modelElement = (Emocionales) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transiciones_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getNormales_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getCriticos_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getAcciones_2005ContainedLinks(
			View view) {
		Acciones modelElement = (Acciones) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Efectos_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getCaracteristicas_2006ContainedLinks(
			View view) {
		Caracteristicas modelElement = (Caracteristicas) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transiciones_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEstados_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEfectos_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getTransiciones_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getFisicas_2001IncomingLinks(
			View view) {
		Fisicas modelElement = (Fisicas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Efectos_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEmocionales_2002IncomingLinks(
			View view) {
		Emocionales modelElement = (Emocionales) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Efectos_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getNormales_2003IncomingLinks(
			View view) {
		Normales modelElement = (Normales) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transiciones_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getCriticos_2004IncomingLinks(
			View view) {
		Criticos modelElement = (Criticos) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transiciones_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getAcciones_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getCaracteristicas_2006IncomingLinks(
			View view) {
		Caracteristicas modelElement = (Caracteristicas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Efectos_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEstados_2007IncomingLinks(
			View view) {
		Estados modelElement = (Estados) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transiciones_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEfectos_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getTransiciones_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getFisicas_2001OutgoingLinks(
			View view) {
		Fisicas modelElement = (Fisicas) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transiciones_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEmocionales_2002OutgoingLinks(
			View view) {
		Emocionales modelElement = (Emocionales) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transiciones_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getNormales_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getCriticos_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getAcciones_2005OutgoingLinks(
			View view) {
		Acciones modelElement = (Acciones) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Efectos_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getCaracteristicas_2006OutgoingLinks(
			View view) {
		Caracteristicas modelElement = (Caracteristicas) view.getElement();
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transiciones_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEstados_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getEfectos_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<POUEXLinkDescriptor> getTransiciones_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<POUEXLinkDescriptor> getContainedTypeModelFacetLinks_Efectos_4001(
			Acciones container) {
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		for (Iterator<?> links = container.getCausa().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Efectos) {
				continue;
			}
			Efectos link = (Efectos) linkObject;
			if (EfectosEditPart.VISUAL_ID != POUEXVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Caracteristicas dst = link.getModifica();
			Acciones src = link.getCausada();
			result.add(new POUEXLinkDescriptor(src, dst, link,
					POUEXElementTypes.Efectos_4001, EfectosEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<POUEXLinkDescriptor> getContainedTypeModelFacetLinks_Transiciones_4002(
			Caracteristicas container) {
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		for (Iterator<?> links = container.getCausar().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transiciones) {
				continue;
			}
			Transiciones link = (Transiciones) linkObject;
			if (TransicionesEditPart.VISUAL_ID != POUEXVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Estados dst = link.getModificar();
			Caracteristicas src = link.getProducida();
			result.add(new POUEXLinkDescriptor(src, dst, link,
					POUEXElementTypes.Transiciones_4002,
					TransicionesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<POUEXLinkDescriptor> getIncomingTypeModelFacetLinks_Efectos_4001(
			Caracteristicas target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != POUEXPackage.eINSTANCE
					.getEfectos_Modifica()
					|| false == setting.getEObject() instanceof Efectos) {
				continue;
			}
			Efectos link = (Efectos) setting.getEObject();
			if (EfectosEditPart.VISUAL_ID != POUEXVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Acciones src = link.getCausada();
			result.add(new POUEXLinkDescriptor(src, target, link,
					POUEXElementTypes.Efectos_4001, EfectosEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<POUEXLinkDescriptor> getIncomingTypeModelFacetLinks_Transiciones_4002(
			Estados target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != POUEXPackage.eINSTANCE
					.getTransiciones_Modificar()
					|| false == setting.getEObject() instanceof Transiciones) {
				continue;
			}
			Transiciones link = (Transiciones) setting.getEObject();
			if (TransicionesEditPart.VISUAL_ID != POUEXVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Caracteristicas src = link.getProducida();
			result.add(new POUEXLinkDescriptor(src, target, link,
					POUEXElementTypes.Transiciones_4002,
					TransicionesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<POUEXLinkDescriptor> getOutgoingTypeModelFacetLinks_Efectos_4001(
			Acciones source) {
		Acciones container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Acciones) {
				container = (Acciones) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		for (Iterator<?> links = container.getCausa().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Efectos) {
				continue;
			}
			Efectos link = (Efectos) linkObject;
			if (EfectosEditPart.VISUAL_ID != POUEXVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Caracteristicas dst = link.getModifica();
			Acciones src = link.getCausada();
			if (src != source) {
				continue;
			}
			result.add(new POUEXLinkDescriptor(src, dst, link,
					POUEXElementTypes.Efectos_4001, EfectosEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<POUEXLinkDescriptor> getOutgoingTypeModelFacetLinks_Transiciones_4002(
			Caracteristicas source) {
		Caracteristicas container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Caracteristicas) {
				container = (Caracteristicas) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<POUEXLinkDescriptor> result = new LinkedList<POUEXLinkDescriptor>();
		for (Iterator<?> links = container.getCausar().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transiciones) {
				continue;
			}
			Transiciones link = (Transiciones) linkObject;
			if (TransicionesEditPart.VISUAL_ID != POUEXVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Estados dst = link.getModificar();
			Caracteristicas src = link.getProducida();
			if (src != source) {
				continue;
			}
			result.add(new POUEXLinkDescriptor(src, dst, link,
					POUEXElementTypes.Transiciones_4002,
					TransicionesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<POUEXNodeDescriptor> getSemanticChildren(View view) {
			return POUEXDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<POUEXLinkDescriptor> getContainedLinks(View view) {
			return POUEXDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<POUEXLinkDescriptor> getIncomingLinks(View view) {
			return POUEXDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<POUEXLinkDescriptor> getOutgoingLinks(View view) {
			return POUEXDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
