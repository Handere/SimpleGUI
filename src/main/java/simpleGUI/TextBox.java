package simpleGUI;

import javax.swing.*;

/**
 * A text box module that can be attached to a Frame.
 */
public class TextBox {

    /**
     * The content of the TextBox. Will be displayed.
     */
    String content = "This is a text box";

    int rows;

    int columns;
    /**
     * The Frame the TextBox is attached to.
     */
    Frame owner;

    JTextArea textBox;

    /**
     * Constructor.
     * @param owner The Frame the TextBox is attached to.
     */
    public TextBox(Frame owner) {
        this.owner = owner;
        this.textBox = new JTextArea();
        textBox.setText(content);
        rows = textBox.getRows();
        columns = textBox.getColumns();
        owner.frame.add(textBox);
    }

    /**
     * Constructor.
     * @param owner The Frame the TextBox is attached to.
     */
    public TextBox(Frame owner, String content) {
        this.owner = owner;
        this.textBox = new JTextArea();
        textBox.setText(content);
        rows = textBox.getRows();
        columns = textBox.getColumns();
        owner.frame.add(textBox);
    }


    /**
     * Set a new content to the TextBox.
     * @param content The content of the TextBox. Will be displayed.
     */
    public void setContent(String content) {
        this.content = content;
    }
}
