package simpleGUI;

import javax.swing.*;


/**
 * A single line text label.
 */
public class SingleLineTextLabel implements TextDisplay{

    /**
     * The default text of the single line text label.
     */
    private final String DEFAULT_TEXT = "Remember to add text";

    /**
     * The owner frame of the single line text label.
     * {@link Frame}
     */
    private Frame owner;

    /**
     * The single line text label.
     */
    private JLabel singleLineTextLabel;

    /**
     * Create a single line text label.
     * Default text.
     * @param owner {@link Frame}
     */
    public SingleLineTextLabel(Frame owner) {
        this.singleLineTextLabel = new JLabel(DEFAULT_TEXT);
        this.owner = owner;
        owner.getFrame().add(singleLineTextLabel);
    }

    /**
     * Create a single line text label with a chosen text.
     * @param owner {@link Frame}
     * @param singleLineText The single line text label.
     */
    public SingleLineTextLabel(Frame owner, String singleLineText) {
        this.singleLineTextLabel = new JLabel(singleLineText);
        this.owner = owner;
        owner.getFrame().add(singleLineTextLabel);
    }

    /**
     * Set the title of the single line text label.
     * @param singleLineText The single line text label.
     */
    public void setTitle(String singleLineText) {
        singleLineTextLabel.setText(singleLineText);
    }


    /**
     * Set the size and location of the single line text label.
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the single line text label.
     * @param height The height of the single line text label.
     */
    public void setSize(int x, int y, int width, int height) {
        singleLineTextLabel.setBounds(x, y, width, height);
    }

    /**
     * @return The single line text label.
     */
    public JLabel getSingleLineTextLabel() {
        return singleLineTextLabel;
    }
}
