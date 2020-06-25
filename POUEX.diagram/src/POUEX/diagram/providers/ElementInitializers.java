/*
 * 
 */
package POUEX.diagram.providers;

import POUEX.diagram.part.POUEXDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = POUEXDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			POUEXDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
