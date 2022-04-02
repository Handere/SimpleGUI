package simpleGUI;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * A text box module that can be attached to a Frame.
 */
public class MultiLineTextBox {

    /**
     * The text content of the MultiLineTextBox. Will be displayed.
     */
    String defaultText = "This is a text box.";

    String defaultBorderTitle = "Border title";

    /**
     * The default number of rows the MultiLineTextBox have.
     */
    int defaultNumberOfRows = 15;

    /**
     * The default number of columns the MultiLineTextBox should have.
     */
    int defaultNumberOfColumns = 60;

    /**
     * The Frame the MultiLineTextBox is attached to.
     */
    Frame owner;

    /**
     * The MultiLineTextBox.
     */
    JTextArea multiLineTextBox;

    JPanel multiLineTextBoxPanel = new JPanel();
    JScrollPane scrollbar;

    /**
     * Constructor.
     * @param owner The Frame the MultiLineTextBox is attached to
     */
    public MultiLineTextBox(Frame owner, boolean addScrollbar) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(defaultNumberOfRows,defaultNumberOfColumns);
        buildMultiLineTextBox(addScrollbar, defaultBorderTitle);
    }

    /**
     * The Constructor
     * @param owner The frame the MultiLineTextBox is attached to.
     * @param text The content in the MultiLineTextBox.
     */
    public MultiLineTextBox(Frame owner, String text, boolean addScrollbar) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(text, defaultNumberOfRows, defaultNumberOfColumns);
        buildMultiLineTextBox(addScrollbar, defaultBorderTitle);
    }

    /**
     * The Constructor
     * @param owner The frame the MultiLineTextBox is attached to.
     * @param text The content in the MultiLineTextBox.
     */
    public MultiLineTextBox(Frame owner, String text, boolean addScrollbar, String borderTitle) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(text, defaultNumberOfRows, defaultNumberOfColumns);
        buildMultiLineTextBox(addScrollbar, borderTitle);
    }

    /**
     * Set a new content to the MultiLineTextBox.
     * @param text The content of the MultiLineTextBox. Will be displayed.
     */
    public void setText(String text) {
        multiLineTextBox.setText(text);
    }

    /**
     * Setting the size of the MultiLineTextBox
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the MultiLineTextBox.
     * @param height The height of the MultiLineTextBox.
     */
    public void setSize(int x, int y, int width, int height) {
        multiLineTextBox.setBounds(x, y, width, height);
    }

    private void addScrollbar() {
        scrollbar = new JScrollPane(multiLineTextBox);
        scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

    private void buildMultiLineTextBox(boolean addScrollbar, String borderTitle) {
        multiLineTextBox.setText(defaultText);
        multiLineTextBoxPanel.setBorder(new TitledBorder(new EtchedBorder(), borderTitle));
        if(addScrollbar) {
            addScrollbar();
            multiLineTextBoxPanel.add(scrollbar);

        }else {

            multiLineTextBoxPanel.add(multiLineTextBox);
        }
        owner.frame.add(multiLineTextBoxPanel);
        owner.owner.window.pack();
    }
}
