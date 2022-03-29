package simpleGUI;

import simpleGUI.scene.controls.Button;

import javax.swing.*;

/**
 * A button that is used to navigate between different windows.
 */
public class NavigationButton implements Button {
    /**
     * The navigation bar the button is attached to.
     */
    NavigationBar owner;
    /**
     * The navigation button.
     */
    JMenu navigationButton;
    /**
     * The window the button will navigate to when clicked.
     */
    Window targetWindow;
    /**
     * The name of the button. Will be displayed.
     */
    String buttonName = "Example";

    /**
     * Constructor.
     * @param owner The navigation bar the button is attached to.
     */
    public NavigationButton(NavigationBar owner) {
        this.owner = owner;
        navigationButton = new JMenu(buttonName);
        owner.navigationBar.add(navigationButton);
    }

    /**
     * Constructor.
     * @param owner The window the button will navigate to when clicked.
     * @param buttonName The name of the button. Will be displayed.
     */
    public NavigationButton(NavigationBar owner, String buttonName) {
        this.owner = owner;
        this.buttonName = buttonName;
        navigationButton = new JMenu(buttonName);
        owner.navigationBar.add(navigationButton);
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
