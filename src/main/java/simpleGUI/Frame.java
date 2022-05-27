package simpleGUI;


import javax.swing.*;
import java.awt.*;

/**
 * A frame.
 */
public class Frame {

    /**
     * The owner window of the frame.
     */
    private Window owner;

    /**
     * The frame.
     */
    private Container frame;


    /**
     * Create a frame with border layout.
     * @param owner {@link Window}
     */
    Frame(Window owner) {
        this.owner = owner;
        frame = owner.getWindow().getContentPane();
        frame.setLayout(new BoxLayout(frame, BoxLayout.PAGE_AXIS));
    }

    /**
     * Add an event button to the frame, with a default name.
     * @return {@link EventButton}
     */
    public EventButton addEventButton(){
        return new EventButton(this);
    }

    /**
     * Add an event button to the frame, with a chosen name.
     * @param buttonName The name of the button.
     * @return {@link EventButton}
     */
    public EventButton addEventButton(String buttonName){
        return new EventButton(this, buttonName);
    }

    /**
     * Add an event button to the frame, with a chosen name, width and height.
     * @param buttonName The name of the button.
     * @param width The button width.
     * @param height The button height.
     * @return {@link EventButton}
     */
    public EventButton addEventButton(String buttonName, int width, int height){
        return new EventButton(this, buttonName, width, height);
    }

    /**
     * Add a single line text label to the frame, without a title.
     * @return {@link SingleLineTextLabel}
     */
    public SingleLineTextLabel addSingleLineTextLabel(){
        return new SingleLineTextLabel(this);
    }

    /**
     * Add a single line text label to the frame, with default title and chosen text content.
     * @param singleLineText The text content.
     * @return {@link SingleLineTextLabel}
     */
    public SingleLineTextLabel addSingleLineTextLabel(String singleLineText){

        return new SingleLineTextLabel(this, singleLineText);
    }

    /**
     * Add a multi line text box with a scrollbar (if true).
     * Default text box border title.
     * @param addScrollbar If true, adds a scrollbar.
     * @return {@link MultiLineTextBox}
     */
    public MultiLineTextBox addMultiLineTextBox(boolean addScrollbar) {
        return new MultiLineTextBox(this, addScrollbar);
    }
    /**
     * Add a multi line text box with a chosen text content.
     * Default border title.
     * @param content The text content.
     * @return {@link MultiLineTextBox}
     */
    public MultiLineTextBox addMultiLineTextBox(String content) {
        return new MultiLineTextBox(this, content);
    }

    /**
     * Add a multi line text box with a chosen text content, with a scrollbar (if true).
     * Default border title.
     * @param content The text content.
     * @param addScrollbar If true, adds a scrollbar.
     * @return {@link MultiLineTextBox}
     */
    public MultiLineTextBox addMultiLineTextBox(String content, boolean addScrollbar) {
        return new MultiLineTextBox(this, content, addScrollbar);
    }

    /**
     * Add a multi line text box with a chosen text content, border title, with a scrollbar (if true).
     * @param content The text content.
     * @param addScrollbar If true, adds a scrollbar.
     * @param borderTitle The text box border title.
     * @return {@link MultiLineTextBox}
     */
    public MultiLineTextBox addMultiLineTextBox(String content, boolean addScrollbar, String borderTitle) {
        return new MultiLineTextBox(this, content, addScrollbar, borderTitle);
    }

    /**
     * @return {@link Window}
     */
    Window getOwner() {
        return owner;
    }

    /**
     * @return The frame.
     */
    Container getFrame() {
        return frame;
    }

    /**
     * Set the owner.
     * @param owner {@link Window}
     */
    void setOwner(Window owner) {
        this.owner = owner;
        frame = owner.getWindow().getContentPane();
        frame.setLayout(new BoxLayout(frame, BoxLayout.PAGE_AXIS));
    }
}
