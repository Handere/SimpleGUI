package simpleGUI;

import javax.swing.*;

/**
 * A toggle button.
 */
public class ToggleButton implements Button{

    /**
     * {@link Frame}
     */
    private Frame owner;

    /**
     * The toggle button.
     */
    private JToggleButton toggleButton;

    /**
     * Create a toggle button.
     * @param owner {@link Frame}
     * @param buttonName The button name.
     */
    public ToggleButton(Frame owner, String buttonName) {
        this.owner = owner;
    }

    /**
     * Set the button name.
     * @param buttonName The button name.
     */
    @Override
    public void setButtonName(String buttonName) {
        toggleButton.setName(buttonName);
    }
}
