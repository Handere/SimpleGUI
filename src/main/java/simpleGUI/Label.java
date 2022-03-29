package simpleGUI;

import javax.swing.*;


/**
 * Label that can be attached and displayed on a Frame.
 */
public class Label {

    /**
     * The default text when the user don't enter it when the label is created
     */
    String labelTxt = "Remember to add text";

    /**
     * The Frame the Label is attached to.
     */
    Frame owner;


    /**
     *
     */
    JLabel label = new JLabel(labelTxt);

    /**
     * Variables that holds the label location and size
     */
    int x, y, width, height;

    /**
     * Constructor.
     * @param owner The Frame the Label is attached to.
     */
    public Label(Frame owner) {
        this.owner = owner;
        owner.frame.add(label);
    }

    /**
     * Constructor.
     * @param owner The Frame the Label is attached to.
     * @param singleLineText The text inside the Label. Will be displayed.
     */
    public Label(Frame owner, String singleLineText) {

        this.owner = owner;
        labelTxt = singleLineText;
        label.setText(labelTxt);
        owner.frame.add(label);
    }

    /**
     * Set the title of the Label.
     * @param singleLineText The singleLineText of the Label. Will be displayed.
     */
    public void setTitle(String singleLineText) {
        labelTxt = singleLineText;
        label.setText(labelTxt);
    }


    /**
     * Set the size of the label and location
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the label.
     * @param height The height of the label.
     */
    public void setSize(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        label.setBounds(x, y, width, height);
    }
}
