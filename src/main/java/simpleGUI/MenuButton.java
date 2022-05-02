package simpleGUI;

import simpleGUI.scene.controls.Button;

import javax.swing.*;

/**
 * A button that is used to navigate between different windows.
 */
public class MenuButton implements Button {
    /**
     * The navigation bar the button is attached to.
     */
    private Menu owner;
    /**
     * The menu button.
     */
    private JMenu menuButton;
    /**
     * The window the button will navigate to when clicked.
     */
    private Window targetWindow;
    /**
     * The name of the button. Will be displayed.
     */
    private final String DEFAULT_BUTTON_NAME = "Example";

    /**
     * Constructor.
     * @param owner The menu the button is attached to.
     */
    public MenuButton(Menu owner) {
        this.owner = owner;
        menuButton = new JMenu(DEFAULT_BUTTON_NAME);
        owner.getMenu().add(menuButton);
    }

    /**
     * Constructor.
     * @param owner The window the button will navigate to when clicked.
     * @param buttonName The name of the button. Will be displayed.
     */
    public MenuButton(Menu owner, String buttonName) {
        this.owner = owner;
        menuButton = new JMenu(buttonName);
        owner.getMenu().add(menuButton);
    }

    /**
     * Set the target of the button, to a new window.
     * @param targetWindow The window the button will navigate to when clicked.
     */
    public void setTargetWindow(Window targetWindow) {
        this.targetWindow = targetWindow;
    }
}
