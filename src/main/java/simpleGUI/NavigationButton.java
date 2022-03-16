package simpleGUI;

import simpleGUI.scene.controls.Button;

/**
 * A button that is used to navigate between different windows.
 */
public class NavigationButton implements Button {
    /**
     * The window the button will navigate to when clicked.
     */
    Window targetWindow;
    /**
     * The name of the button. Will be displayed.
     */
    String buttonName;

    /**
     * Constructor.
     */
    public NavigationButton() {
    }

    /**
     * Constructor.
     * @param targetWindow The window the button will navigate to when clicked.
     * @param buttonName The name of the button. Will be displayed.
     */
    public NavigationButton(Window targetWindow, String buttonName) {
        this.targetWindow = targetWindow;
        this.buttonName = buttonName;
    }

    /**
     * Set the target of the button, to a new window.
     * @param targetWindow The window the button will navigate to when clicked.
     */
    public void setTargetWindow(Window targetWindow) {
        this.targetWindow = targetWindow;
    }

    /**
     * Set the name of the button.
     * @param buttonName The name of the button. Will be displayed.
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
