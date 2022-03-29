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

    /**
     * How many rows the textbox should have.
     */
    int rows;

    /**
     * How many columns the textbox should have.
     */
    int columns;
    /**
     * The Frame the TextBox is attached to.
     */
    Frame owner;

    /**
     * The Textbox.
     */
    JTextArea textBox;


    /**
     * Variables that holds the TextBox location and size
     */
    int x, y, width, height;

    /**
     * Constructor.
     * @param owner The Frame the TextBox is attached to
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
     * The Constructor
     * @param owner The frame the textbox is attached to.
     * @param content The content in the Textbox.
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

    /**
     * Setting the size of the Textbox
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the TextBox.
     * @param height The height of the TextBox.
     */
    public void setSize(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        textBox.setBounds(x, y, width, height);
    }
}
