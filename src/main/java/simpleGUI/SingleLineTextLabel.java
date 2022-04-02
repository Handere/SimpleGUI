package simpleGUI;

import javax.swing.*;


/**
 * Label that can be attached and displayed on a Frame.
 */
public class SingleLineTextLabel {

    /**
     * The default text when the user don't enter it when the SingleLineTextLabel is created
     */
    String defaultText = "Remember to add text";

    /**
     * The Frame the Label is attached to.
     */
    Frame owner;

    /**
     * The SingleLineTextLabel
     */
    JLabel singleLineTextLabel;

    /**
     * Constructor.
     * @param owner The Frame the Label is attached to.
     */
    public SingleLineTextLabel(Frame owner) {
        this.singleLineTextLabel = new JLabel(defaultText);
        this.owner = owner;
        owner.frame.add(singleLineTextLabel);
    }

    /**
     * Constructor.
     * @param owner The Frame the Label is attached to.
     * @param singleLineText The text inside the Label. Will be displayed.
     */
    public SingleLineTextLabel(Frame owner, String singleLineText) {
        this.singleLineTextLabel = new JLabel(singleLineText);
        this.owner = owner;
        owner.frame.add(singleLineTextLabel);
    }

    /**
     * Set the title of the Label.
     * @param singleLineText The singleLineText of the Label. Will be displayed.
     */
    public void setTitle(String singleLineText) {
        singleLineTextLabel.setText(singleLineText);
    }


    /**
     * Set the size of the label and location
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the label.
     * @param height The height of the label.
     */
    public void setSize(int x, int y, int width, int height) {
        singleLineTextLabel.setBounds(x, y, width, height);
    }
}
