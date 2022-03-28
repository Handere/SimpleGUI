package simpleGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Label that can be attached and displayed on a Frame.
 */
public class Label {
    /**
     * The title of the Label. Will be displayed.
     */
    String singleLineText;

    /**
     * The default text when the user don't enter it when the label is created
     */
    String labelDefaultText = "Remember to add text";

    /**
     * The Frame the Label is attached to.
     */
    Frame owner;

    JLabel label = new JLabel(labelDefaultText);

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
        label.setText(singleLineText);
        owner.frame.add(label);
    }

    /**
     * Set the title of the Label.
     * @param singleLineText The singleLineText of the Label. Will be displayed.
     */
    public void setTitle(String singleLineText) {
        this.singleLineText = singleLineText;
    }

    /**
     * Set the size of the label and location
     * @param
     */
    public void setSize(int x, int y, int width, int height) {
        label.setBounds(x, y, width, height);
    }
}
