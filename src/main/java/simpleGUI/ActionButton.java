package simpleGUI;

import simpleGUI.scene.controls.Button;

import javax.swing.*;

/**
 * A button that can be added to a Frame, with the desired action.
 */
public class ActionButton implements Button {
    /**
     * The name of the button. By default, set to "Click me"
     */
    String buttonName = "Click me";
    /**
     * The Frame the button is attached to.
     */
    Frame owner;
    /**
     * The button.
     */
    JButton button;

    /**
     * Constructor.
     * Create an ActionButton with default name.
     * @param owner The Frame the button is attached to.
     */
    public ActionButton(Frame owner) {
        this.owner = owner;
        this.button = new JButton(buttonName);
        owner.frame.add(button);
    }

    /**
     * Constructor.
     * @param owner The Frame the button is attached to.
     * @param buttonName The name of the button. Will be displayed.
     */
    public ActionButton(Frame owner, String buttonName) {
        this.buttonName = buttonName;
        this.owner = owner;
        this.button = new JButton(buttonName);
        owner.frame.add(button);
    }

    /**
     * Set the name of the button.
     * @param buttonName The name of the button. Will be displayed.
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
        button.setName(buttonName);
    }
}
