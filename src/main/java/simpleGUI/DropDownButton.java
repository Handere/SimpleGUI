package simpleGUI;

/**
 * A dropdown button.
 */
public class DropDownButton implements Button{

    /**
     * The owner frame.
     * {@link Frame}
     */
    private Frame owner;

    /**
     * Create a dropdown button.
     * @param owner {@link Frame}
     */
    public DropDownButton(Frame owner)  {
        this.owner = owner;
    }

    /**
     * Set the button name.
     * @param buttonName The button name.
     */
    @Override
    public void setButtonName(String buttonName) {

    }
}
