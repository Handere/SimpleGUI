package simpleGUI;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * A text box module that can be attached to a Frame.
 */
public class MultiLineTextBox {

    /**
     * The content of the MultiLineTextBox. Will be displayed.
     */
    String content = "This is a text box";

    String borderTitle = "Border title";

    /**
     * How many rows the MultiLineTextBox should have.
     */
    int rows;

    /**
     * How many columns the MultiLineTextBox should have.
     */
    int columns;
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
     * Variables that holds the MultiLineTextBox location and size
     */
    int x, y, width, height;

    /**
     * Constructor.
     * @param owner The Frame the MultiLineTextBox is attached to
     */
    public MultiLineTextBox(Frame owner, boolean addScrollbar) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(16,58);
        buildMultiLineTextBox(addScrollbar);
    }

    /**
     * The Constructor
     * @param owner The frame the MultiLineTextBox is attached to.
     * @param content The content in the MultiLineTextBox.
     */
    public MultiLineTextBox(Frame owner, String content, boolean addScrollbar) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(16, 58);
        buildMultiLineTextBox(addScrollbar);
    }

    /**
     * The Constructor
     * @param owner The frame the MultiLineTextBox is attached to.
     * @param content The content in the MultiLineTextBox.
     */
    public MultiLineTextBox(Frame owner, String content, boolean addScrollbar, String borderTitle) {
        this.owner = owner;
        this.multiLineTextBox = new JTextArea(16, 58);
        this.borderTitle = borderTitle;
        buildMultiLineTextBox(addScrollbar);
    }

    /**
     * Set a new content to the MultiLineTextBox.
     * @param content The content of the MultiLineTextBox. Will be displayed.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Setting the size of the MultiLineTextBox
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the MultiLineTextBox.
     * @param height The height of the MultiLineTextBox.
     */
    public void setSize(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        multiLineTextBox.setBounds(x, y, width, height);
    }

    private void addScrollbar() {
        scrollbar = new JScrollPane(multiLineTextBox);
        scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

    private void buildMultiLineTextBox(boolean addScrollbar) {
        multiLineTextBox.setText(content);
        rows = multiLineTextBox.getRows();
        columns = multiLineTextBox.getColumns();
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
