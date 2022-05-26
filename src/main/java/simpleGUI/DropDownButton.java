package simpleGUI;

import jdk.jshell.spi.ExecutionControl;

/**
 * A dropdown button that can be attached to a Form or Frame.
 */
public class DropDownButton implements Button{

    /**
     * {@link Frame}
     */
    private Frame owner;

    /**
     * Create a dropdown button.
     * @param owner {@link Frame}
     * @throws ExecutionControl.NotImplementedException Not implemented.
     */
    public DropDownButton(Frame owner) throws ExecutionControl.NotImplementedException {
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
