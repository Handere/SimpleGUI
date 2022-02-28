package simpleGUI.base;

/**
 * A text box module that can be attached to a Frame.
 */
public class TextBox {
    /**
     * The title of the TextBox. Will be displayed.
     */
    String title;
    /**
     * The content of the TextBox. Will be displayed.
     */
    String content;
    /**
     * The Frame the TextBox is attached to.
     */
    Frame owner;

    /**
     * Constructor.
     * @param owner The Frame the TextBox is attached to.
     * @param title The title of the TextBox. Will be displayed.
     */
    public TextBox(Frame owner, String title) {
        this.title = title;
        this.owner = owner;
    }

    /**
     * Constructor.
     * @param owner The Frame the TextBox is attached to.
     * @param title The title of the TextBox. Will be displayed.
     * @param content The content of the TextBox. Will be displayed.
     */
    public TextBox(Frame owner, String title, String content){
        this.title = title;
        this.content = content;
    }

    /**
     * Set a new title to the TextBox.
     * @param title The title of the TextBox. Will be displayed.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set a new content to the TextBox.
     * @param content The content of the TextBox. Will be displayed.
     */
    public void setContent(String content) {
        this.content = content;
    }
}
