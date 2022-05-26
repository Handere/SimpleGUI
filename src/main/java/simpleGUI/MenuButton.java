package simpleGUI;

import javax.swing.*;

//Todo legge inn navigasjon mellom vinduer

/**
 * An event button.
 */
public class MenuButton implements Button {

    /**
     * The owner menu of the menu button.
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
     * The default name of the button.
     */
    private final String DEFAULT_BUTTON_NAME = "Example";

    /**
     * Create a menu button, attached to a chosen menu.
     * Default button name.
     * @param owner The menu.
     */
    public MenuButton(Menu owner) {
        this.owner = owner;
        menuButton = new JMenu(DEFAULT_BUTTON_NAME);
        owner.getMenu().add(menuButton);
    }

    /**
     * Create a menu button with a chosen button name, attached to a chosen menu.
     * @param owner The menu.
     * @param buttonName The name of the button.
     */
    public MenuButton(Menu owner, String buttonName) {
        this.owner = owner;
        menuButton = new JMenu(buttonName);
        owner.getMenu().add(menuButton);
    }

    /**
     * Set the target window of the button.
     * @param targetWindow The target window.
     */
    public void setTargetWindow(Window targetWindow) {
        this.targetWindow = targetWindow;
    }

    /**
     * Set the button name.
     * @param buttonName The button name.
     */
    @Override
    public void setButtonName(String buttonName) {
        menuButton.setName(buttonName);
    }
}
