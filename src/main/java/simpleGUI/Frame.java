package simpleGUI;

/**
 * Hold the non-window-specific elements that can be displayed in the GUI.
 */
public class Frame {
    /**
     * Specify if the Frame shall be displayed.
     */
    boolean showFrame = false;
    /**
     * The Window the Frame is attached to.
     */
    Window owner;
    /**
     * The Frame ID.
     */
    int id;

    /**
     * Constructor.
     * @param owner The Window the Frame is attached to.
     */
    public Frame(Window owner) {
        this.owner = owner;
    }

    /**
     * Constructor.
     * @param owner The Window the Frame is attached to.
     * @param id The id of the Frame.
     */
    public Frame(Window owner, int id) {
        this.owner = owner;
        this.id = id;
    }

    /**
     * Return a FrameLocationHandler that can specify the location of the Frame on the window.
     * @return new FrameLocationHandler
     */
    public FrameLocationHandler placeFrame() {
        return new FrameLocationHandler(this);
    }

    /**
     * Add an ActionButton to the Frame.
     * @param buttonName The name of the button. Will be displayed.
     * @return new ActionButton
     */
    public ActionButton addActionButton(String buttonName){
        return new ActionButton(this, buttonName);
    }

    /**
     * Add a Label to the Frame, without a title.
     * @return new Label
     */
    public Label addLabel(){
        return new Label(this);
    }

    /**
     * Add a Label to the Frame.
     * @param title The title of the Label. Will be displayed.
     * @return new Label
     */
    public Label addLabel(String title){
        return new Label(this, title);
    }

    /**
     * Add a TextBox to the Frame.
     * @param title The title of the TextBox. Will be displayed.
     * @param content The content of the TextBox. Will be displayed.
     * @return new TextBox
     */
    public TextBox addTextBox(String title, String content) {
        return new TextBox(this, title, content);
    }

    /**
     * Add a TextBox to the Frame, without the content.
     * @param title The title of the TextBox. Will be displayed.
     * @return new TextBox
     */
    public TextBox addTextBox(String title) {
        return new TextBox(this, title);
    }
}
