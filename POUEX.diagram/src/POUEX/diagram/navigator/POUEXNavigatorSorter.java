/*
 * 
 */
package POUEX.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import POUEX.diagram.part.POUEXVisualIDRegistry;

/**
 * @generated
 */
public class POUEXNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof POUEXNavigatorItem) {
			POUEXNavigatorItem item = (POUEXNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return POUEXVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
