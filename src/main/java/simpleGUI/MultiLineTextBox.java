package simpleGUI;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * A multi line text box.
 */
public class MultiLineTextBox implements TextDisplay{

    /**
     * The default text of the multi line text box.
     */
    private final String DEFAULT_TEXT = "This is a text box.";

    /**
     * The default border title of the multi line text box.
     */
    private final String DEFAULT_TEXT_BOX_BORDER_TITLE = "Text box border title";

    /**
     * The default number of rows of the multi line text box.
     */
    private final int DEFAULT_NUMBER_OF_ROWS = 15;

    /**
     * The default number of columns of the multi line text box.
     */
    private final int DEFAULT_NUMBER_OF_COLUMNS = 60;

    /**
     * The owner frame of the multi line text box.
     */
    private Frame owner;

    /**
     * The multi line text box.
     */
    private JTextArea multiLineTextBox;

    /**
     * The container holding the multi line text box.
     */
    private JPanel multiLineTextBoxPanel = new JPanel();

    /**
     * A vertical (always show) and horizontal (if needed) scrollbar, if added.
     */
    private JScrollPane scrollbar;

    /**
     * Create a multi line text box with a scrollbar (if true), attached to a chosen frame.
     * Default border title.
     * @param owner The frame.
     * @param addScrollbar If true add a vertical (always visible) and horizontal (if needed).
     */
    public MultiLineTextBox(Frame owner, boolean addScrollbar) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(DEFAULT_NUMBER_OF_ROWS, DEFAULT_NUMBER_OF_COLUMNS);
        buildMultiLineTextBox(addScrollbar, DEFAULT_TEXT_BOX_BORDER_TITLE, DEFAULT_TEXT);
    }

    /**
     * Create a multi line text box with a chosen text, attached to a chosen frame.
     * Default border title.
     * @param owner The frame.
     * @param text The text content.
     */
    public MultiLineTextBox(Frame owner, String text) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(text, DEFAULT_NUMBER_OF_ROWS, DEFAULT_NUMBER_OF_COLUMNS);
        boolean addScrollbar = false;
        buildMultiLineTextBox(addScrollbar, DEFAULT_TEXT_BOX_BORDER_TITLE, text);
    }

    /**
     * Create a multi line text box with a chosen text, a scrollbar (if true), attached to a chosen frame.
     * Default border title.
     * @param owner The frame.
     * @param text The text content.
     * @param addScrollbar If true add a vertical (always visible) and horizontal (if needed).
     */
    public MultiLineTextBox(Frame owner, String text, boolean addScrollbar) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(text, DEFAULT_NUMBER_OF_ROWS, DEFAULT_NUMBER_OF_COLUMNS);
        buildMultiLineTextBox(addScrollbar, DEFAULT_TEXT_BOX_BORDER_TITLE, text);
    }

    /**
     * Create a multi line text box with a chosen text, a scrollbar (if true), a border title, attached to a chosen frame.
     * @param owner The frame.
     * @param text The text content.
     * @param addScrollbar If true add a vertical (always visible) and horizontal (if needed).
     * @param textBoxBorderTitle The title of the border.
     */
    public MultiLineTextBox(Frame owner, String text, boolean addScrollbar, String textBoxBorderTitle) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(text, DEFAULT_NUMBER_OF_ROWS, DEFAULT_NUMBER_OF_COLUMNS);
        buildMultiLineTextBox(addScrollbar, textBoxBorderTitle, text);
    }

    /**
     * Set the text content of the multi line text box.
     * @param text The text content.
     */
    public void setText(String text) {
        multiLineTextBox.setText(text);
    }

    /**
     * Set the size of the multi line text box
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the multi line text box.
     * @param height The height of the multi line text box.
     */
    public void setSize(int x, int y, int width, int height) {
        multiLineTextBox.setBounds(x, y, width, height);
    }

    /**
     * Add a scrollbar to the multi line text box.
     */
    private void addScrollbar() {
        scrollbar = new JScrollPane(multiLineTextBox);
        scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

    /**
     * Build the multi line text box as specified.
     * @param addScrollbar If true add a vertical (always visible) and horizontal (if needed).
     * @param borderTitle The title of the border.
     */
    private void buildMultiLineTextBox(boolean addScrollbar, String borderTitle, String text) {
        multiLineTextBox.setText(text);
        multiLineTextBoxPanel.setBorder(new TitledBorder(new EtchedBorder(), borderTitle));
        if(addScrollbar) {
            addScrollbar();
            multiLineTextBoxPanel.add(scrollbar);

        }else {

            multiLineTextBoxPanel.add(multiLineTextBox);
        }
        owner.getFrame().add(multiLineTextBoxPanel);
        owner.getOwner().getWindow().pack();
    }

    /**
     * @return The multi line text box.
     */
    JTextArea getMultiLineTextBox() {
        return multiLineTextBox;
    }

    /**
     * @return The multi line text box.
     */
    JPanel getMultiLineTextBoxPanel() {
        return multiLineTextBoxPanel;
    }
}
