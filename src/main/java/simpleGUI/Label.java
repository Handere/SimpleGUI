package simpleGUI;

/**
 * Label that can be attached and displayed on a Frame.
 */
public class Label {
    /**
     * The title of the Label. Will be displayed.
     */
    String title;
    /**
     * The Frame the Label is attached to.
     */
    Frame owner;

    /**
     * Constructor.
     * @param owner The Frame the Label is attached to.
     */
    public Label(Frame owner) {
        this.owner = owner;
    }

    /**
     * Constructor.
     * @param owner The Frame the Label is attached to.
     * @param title The title of the Label. Will be displayed.
     */
    public Label(Frame owner, String title) {
        this.title = title;
        this.owner = owner;
    }

    /**
     * Set the title of the Label.
     * @param title The title of the Label. Will be displayed.
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
