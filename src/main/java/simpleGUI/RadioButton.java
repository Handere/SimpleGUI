package simpleGUI;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;

/**
 * A radio button.
 */
public class RadioButton implements Button{

    /**
     * {@link Window}
     */
    private Frame owner;

    /**
     * The radio button.
     */
    private JRadioButton radioButton;

    /**
     * Create a radio button.
     * @param owner {@link Frame}
     * @param buttonName The button name.
     *
     */
    public RadioButton(Frame owner, String buttonName) {
        this.owner = owner;
        this.radioButton = new JRadioButton(buttonName);
        owner.getFrame().add(radioButton);
    }

    /**
     * Set the button name.
     * @param buttonName The button name.
     */
    @Override
    public void setButtonName(String buttonName) {

    }
}
