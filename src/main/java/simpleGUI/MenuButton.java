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
    Menu owner;
    /**
     * The menu button.
     */
    JMenu menuButton;
    /**
     * The window the button will navigate to when clicked.
     */
    Window targetWindow;
    /**
     * The name of the button. Will be displayed.
     */
    String defaultButtonName = "Example";

    /**
     * Constructor.
     * @param owner The menu the button is attached to.
     */
    public MenuButton(Menu owner) {
        this.owner = owner;
        menuButton = new JMenu(defaultButtonName);
        owner.menu.add(menuButton);
    }

    /**
     * Constructor.
     * @param owner The window the button will navigate to when clicked.
     * @param buttonName The name of the button. Will be displayed.
     */
    public MenuButton(Menu owner, String buttonName) {
        this.owner = owner;
        menuButton = new JMenu(buttonName);
        owner.menu.add(menuButton);
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
    public void setDefaultButtonName(String buttonName) {
        menuButton.setText(buttonName);
    }
}
