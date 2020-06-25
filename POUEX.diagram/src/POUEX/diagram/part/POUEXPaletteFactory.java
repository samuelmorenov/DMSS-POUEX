/*
 * 
 */
package POUEX.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import POUEX.diagram.providers.POUEXElementTypes;

/**
 * @generated
 */
public class POUEXPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAcciones1CreationTool());
		paletteContainer.add(createCaracteristicas2CreationTool());
		paletteContainer.add(createCriticos3CreationTool());
		paletteContainer.add(createEmocionales4CreationTool());
		paletteContainer.add(createEstados5CreationTool());
		paletteContainer.add(createFisicas6CreationTool());
		paletteContainer.add(createNormales7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createEfectos1CreationTool());
		paletteContainer.add(createTransiciones2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcciones1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Acciones1CreationTool_title,
				Messages.Acciones1CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Acciones_2005));
		entry.setId("createAcciones1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Acciones_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicas2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Caracteristicas2CreationTool_title,
				Messages.Caracteristicas2CreationTool_desc,
				Collections
						.singletonList(POUEXElementTypes.Caracteristicas_2006));
		entry.setId("createCaracteristicas2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Caracteristicas_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCriticos3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Criticos3CreationTool_title,
				Messages.Criticos3CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Criticos_2004));
		entry.setId("createCriticos3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Criticos_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmocionales4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Emocionales4CreationTool_title,
				Messages.Emocionales4CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Emocionales_2002));
		entry.setId("createEmocionales4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Emocionales_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEstados5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Estados5CreationTool_title,
				Messages.Estados5CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Estados_2007));
		entry.setId("createEstados5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Estados_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFisicas6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Fisicas6CreationTool_title,
				Messages.Fisicas6CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Fisicas_2001));
		entry.setId("createFisicas6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Fisicas_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNormales7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Normales7CreationTool_title,
				Messages.Normales7CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Normales_2003));
		entry.setId("createNormales7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Normales_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEfectos1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Efectos1CreationTool_title,
				Messages.Efectos1CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Efectos_4001));
		entry.setId("createEfectos1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Efectos_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransiciones2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Transiciones2CreationTool_title,
				Messages.Transiciones2CreationTool_desc,
				Collections.singletonList(POUEXElementTypes.Transiciones_4002));
		entry.setId("createTransiciones2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(POUEXElementTypes
				.getImageDescriptor(POUEXElementTypes.Transiciones_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
