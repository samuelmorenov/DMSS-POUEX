/*
 * 
 */
package POUEX.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import POUEX.Efectos;
import POUEX.Mascota;
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
import POUEX.diagram.part.POUEXDiagramEditorPlugin;
import POUEX.diagram.part.POUEXVisualIDRegistry;
import POUEX.diagram.providers.POUEXElementTypes;
import POUEX.diagram.providers.POUEXParserProvider;

/**
 * @generated
 */
public class POUEXNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		POUEXDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		POUEXDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof POUEXNavigatorItem
				&& !isOwnView(((POUEXNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof POUEXNavigatorGroup) {
			POUEXNavigatorGroup group = (POUEXNavigatorGroup) element;
			return POUEXDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof POUEXNavigatorItem) {
			POUEXNavigatorItem navigatorItem = (POUEXNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (POUEXVisualIDRegistry.getVisualID(view)) {
		case MascotaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://POUEX/1.0?Mascota", POUEXElementTypes.Mascota_1000); //$NON-NLS-1$
		case FisicasEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://POUEX/1.0?Fisicas", POUEXElementTypes.Fisicas_2001); //$NON-NLS-1$
		case EmocionalesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://POUEX/1.0?Emocionales", POUEXElementTypes.Emocionales_2002); //$NON-NLS-1$
		case NormalesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://POUEX/1.0?Normales", POUEXElementTypes.Normales_2003); //$NON-NLS-1$
		case CriticosEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://POUEX/1.0?Criticos", POUEXElementTypes.Criticos_2004); //$NON-NLS-1$
		case AccionesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://POUEX/1.0?Acciones", POUEXElementTypes.Acciones_2005); //$NON-NLS-1$
		case CaracteristicasEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://POUEX/1.0?Caracteristicas", POUEXElementTypes.Caracteristicas_2006); //$NON-NLS-1$
		case EstadosEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://POUEX/1.0?Estados", POUEXElementTypes.Estados_2007); //$NON-NLS-1$
		case EfectosEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://POUEX/1.0?Efectos", POUEXElementTypes.Efectos_4001); //$NON-NLS-1$
		case TransicionesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://POUEX/1.0?Transiciones", POUEXElementTypes.Transiciones_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = POUEXDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& POUEXElementTypes.isKnownElementType(elementType)) {
			image = POUEXElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof POUEXNavigatorGroup) {
			POUEXNavigatorGroup group = (POUEXNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof POUEXNavigatorItem) {
			POUEXNavigatorItem navigatorItem = (POUEXNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (POUEXVisualIDRegistry.getVisualID(view)) {
		case MascotaEditPart.VISUAL_ID:
			return getMascota_1000Text(view);
		case FisicasEditPart.VISUAL_ID:
			return getFisicas_2001Text(view);
		case EmocionalesEditPart.VISUAL_ID:
			return getEmocionales_2002Text(view);
		case NormalesEditPart.VISUAL_ID:
			return getNormales_2003Text(view);
		case CriticosEditPart.VISUAL_ID:
			return getCriticos_2004Text(view);
		case AccionesEditPart.VISUAL_ID:
			return getAcciones_2005Text(view);
		case CaracteristicasEditPart.VISUAL_ID:
			return getCaracteristicas_2006Text(view);
		case EstadosEditPart.VISUAL_ID:
			return getEstados_2007Text(view);
		case EfectosEditPart.VISUAL_ID:
			return getEfectos_4001Text(view);
		case TransicionesEditPart.VISUAL_ID:
			return getTransiciones_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMascota_1000Text(View view) {
		Mascota domainModelElement = (Mascota) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFisicas_2001Text(View view) {
		IParser parser = POUEXParserProvider.getParser(
				POUEXElementTypes.Fisicas_2001,
				view.getElement() != null ? view.getElement() : view,
				POUEXVisualIDRegistry.getType(FisicasNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmocionales_2002Text(View view) {
		IParser parser = POUEXParserProvider.getParser(
				POUEXElementTypes.Emocionales_2002,
				view.getElement() != null ? view.getElement() : view,
				POUEXVisualIDRegistry
						.getType(EmocionalesNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNormales_2003Text(View view) {
		IParser parser = POUEXParserProvider
				.getParser(POUEXElementTypes.Normales_2003,
						view.getElement() != null ? view.getElement() : view,
						POUEXVisualIDRegistry
								.getType(NormalesNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCriticos_2004Text(View view) {
		IParser parser = POUEXParserProvider
				.getParser(POUEXElementTypes.Criticos_2004,
						view.getElement() != null ? view.getElement() : view,
						POUEXVisualIDRegistry
								.getType(CriticosNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAcciones_2005Text(View view) {
		IParser parser = POUEXParserProvider
				.getParser(POUEXElementTypes.Acciones_2005,
						view.getElement() != null ? view.getElement() : view,
						POUEXVisualIDRegistry
								.getType(AccionesNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicas_2006Text(View view) {
		IParser parser = POUEXParserProvider.getParser(
				POUEXElementTypes.Caracteristicas_2006,
				view.getElement() != null ? view.getElement() : view,
				POUEXVisualIDRegistry
						.getType(CaracteristicasNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEstados_2007Text(View view) {
		IParser parser = POUEXParserProvider.getParser(
				POUEXElementTypes.Estados_2007,
				view.getElement() != null ? view.getElement() : view,
				POUEXVisualIDRegistry.getType(EstadosNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEfectos_4001Text(View view) {
		IParser parser = POUEXParserProvider.getParser(
				POUEXElementTypes.Efectos_4001,
				view.getElement() != null ? view.getElement() : view,
				POUEXVisualIDRegistry
						.getType(EfectosValorModificaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransiciones_4002Text(View view) {
		IParser parser = POUEXParserProvider.getParser(
				POUEXElementTypes.Transiciones_4002,
				view.getElement() != null ? view.getElement() : view,
				POUEXVisualIDRegistry
						.getType(TransicionesValorCambioEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			POUEXDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MascotaEditPart.MODEL_ID.equals(POUEXVisualIDRegistry
				.getModelID(view));
	}

}
