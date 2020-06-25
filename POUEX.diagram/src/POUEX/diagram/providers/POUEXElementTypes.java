/*
 * 
 */
package POUEX.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import POUEX.POUEXPackage;
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
import POUEX.diagram.part.POUEXDiagramEditorPlugin;

/**
 * @generated
 */
public class POUEXElementTypes {

	/**
	 * @generated
	 */
	private POUEXElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			POUEXDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Mascota_1000 = getElementType("POUEX.diagram.Mascota_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fisicas_2001 = getElementType("POUEX.diagram.Fisicas_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Emocionales_2002 = getElementType("POUEX.diagram.Emocionales_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Normales_2003 = getElementType("POUEX.diagram.Normales_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Criticos_2004 = getElementType("POUEX.diagram.Criticos_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Acciones_2005 = getElementType("POUEX.diagram.Acciones_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Caracteristicas_2006 = getElementType("POUEX.diagram.Caracteristicas_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Estados_2007 = getElementType("POUEX.diagram.Estados_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Efectos_4001 = getElementType("POUEX.diagram.Efectos_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transiciones_4002 = getElementType("POUEX.diagram.Transiciones_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Mascota_1000, POUEXPackage.eINSTANCE.getMascota());

			elements.put(Fisicas_2001, POUEXPackage.eINSTANCE.getFisicas());

			elements.put(Emocionales_2002,
					POUEXPackage.eINSTANCE.getEmocionales());

			elements.put(Normales_2003, POUEXPackage.eINSTANCE.getNormales());

			elements.put(Criticos_2004, POUEXPackage.eINSTANCE.getCriticos());

			elements.put(Acciones_2005, POUEXPackage.eINSTANCE.getAcciones());

			elements.put(Caracteristicas_2006,
					POUEXPackage.eINSTANCE.getCaracteristicas());

			elements.put(Estados_2007, POUEXPackage.eINSTANCE.getEstados());

			elements.put(Efectos_4001, POUEXPackage.eINSTANCE.getEfectos());

			elements.put(Transiciones_4002,
					POUEXPackage.eINSTANCE.getTransiciones());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Mascota_1000);
			KNOWN_ELEMENT_TYPES.add(Fisicas_2001);
			KNOWN_ELEMENT_TYPES.add(Emocionales_2002);
			KNOWN_ELEMENT_TYPES.add(Normales_2003);
			KNOWN_ELEMENT_TYPES.add(Criticos_2004);
			KNOWN_ELEMENT_TYPES.add(Acciones_2005);
			KNOWN_ELEMENT_TYPES.add(Caracteristicas_2006);
			KNOWN_ELEMENT_TYPES.add(Estados_2007);
			KNOWN_ELEMENT_TYPES.add(Efectos_4001);
			KNOWN_ELEMENT_TYPES.add(Transiciones_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MascotaEditPart.VISUAL_ID:
			return Mascota_1000;
		case FisicasEditPart.VISUAL_ID:
			return Fisicas_2001;
		case EmocionalesEditPart.VISUAL_ID:
			return Emocionales_2002;
		case NormalesEditPart.VISUAL_ID:
			return Normales_2003;
		case CriticosEditPart.VISUAL_ID:
			return Criticos_2004;
		case AccionesEditPart.VISUAL_ID:
			return Acciones_2005;
		case CaracteristicasEditPart.VISUAL_ID:
			return Caracteristicas_2006;
		case EstadosEditPart.VISUAL_ID:
			return Estados_2007;
		case EfectosEditPart.VISUAL_ID:
			return Efectos_4001;
		case TransicionesEditPart.VISUAL_ID:
			return Transiciones_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return POUEX.diagram.providers.POUEXElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return POUEX.diagram.providers.POUEXElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return POUEX.diagram.providers.POUEXElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
