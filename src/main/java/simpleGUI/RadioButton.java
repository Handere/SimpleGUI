package simpleGUI;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;

/**
 * A radio button that can be attached to a Form or a Frame.
 */
public class RadioButton implements Button{

    /**
     * {@link Window}
     */
    private Window owner;

    /**
     * The radio button.
     */
    private JRadioButton radioButton;

    /**
     * Create a radio button.
     * @param owner {@link Frame}
     * @param buttonName The button name.
     * @throws ExecutionControl.NotImplementedException Not implemented.
     */
    public RadioButton(Frame owner, String buttonName) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("To be implemented...");
    }

    /**
     * Set the button name.
     * @param buttonName The button name.
     */
    @Override
    public void setButtonName(String buttonName) {

    }
}
