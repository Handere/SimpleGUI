package simpleGUI;

import simpleGUI.scene.controls.Button;

/**
 * A button that can be added to a Frame, with the desired action.
 */
public class ActionButton implements Button {
    /**
     * The name of the button.
     */
    String buttonName;
    /**
     * The Frame the button is attached to.
     */
    Frame owner;

    /**
     * Constructor.
     * @param owner The Frame the button is attached to.
     * @param buttonName The name of the button. Will be displayed.
     */
    public ActionButton(Frame owner, String buttonName) {
        this.buttonName = buttonName;
        this.owner = owner;
    }

    /**
     * Set the name of the button.
     * @param buttonName The name of the button. Will be displayed.
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
