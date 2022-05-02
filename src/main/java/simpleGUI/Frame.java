package simpleGUI;

//TODO: Merge with Window
import javax.swing.*;
import java.awt.*;

/**
 * Hold the non-window-specific elements that can be displayed in the GUI.
 */
public class Frame {

    /**
     * The Window the Frame is attached to.
     */
    private Window owner;
    /**
     * The frame.
     */
    private Container frame;

    /**
     * Constructor.
     * Create a Frame with border layout as default.
     * @param owner The Window the Frame is attached to.
     */
    public Frame(Window owner) {
        this.owner = owner;
        frame = owner.getWindow().getContentPane();
        frame.setLayout(new BoxLayout(frame, BoxLayout.PAGE_AXIS));
    }

    /**
     * Add an EventButton to the Frame, with a default name.
     * @return new EventButton
     */
    public EventButton addEventButton(){
        return new EventButton(this);
    }

    /**
     * Add an EventButton to the Frame.
     * @param buttonName The name of the button. Will be displayed.
     * @return new ActionButton
     */
    public EventButton addEventButton(String buttonName){
        return new EventButton(this, buttonName);
    }

    /**
     * Add an EventButton to the Frame.
     * @param buttonName The name of the button. Will be displayed.
     * @param width The button width.
     * @param height The button height.
     * @return new EventButton
     */
    public EventButton addEventButton(String buttonName, int width, int height){
        return new EventButton(this, buttonName, width, height);
    }

    /**
     * Add a SingleLineTextLabel to the Frame, without a title.
     * @return new SingleLineTextLabel
     */
    public SingleLineTextLabel addSingleLineTextLabel(){
        return new SingleLineTextLabel(this);
    }

    /**
     * Add a SingleLineTextLabel to the Frame.
     * @param singleLineText The title of the Label. Will be displayed.
     * @return new SingleLineTextLabel
     */
    public SingleLineTextLabel addSingleLineTextLabel(String singleLineText){

        return new SingleLineTextLabel(this, singleLineText);
    }

    /**
     * Add a MultiLineTextBox to the Frame.
     * @param addScrollbar If true, adds a scrollbar.
     * @return new MultiLineTextBox
     */
    public MultiLineTextBox addMultiLineTextBox(boolean addScrollbar) {
        return new MultiLineTextBox(this, addScrollbar);
    }
    /**
     * Add a MultiLineTextBox to the Frame.
     * @param content the content
     * @return new MultiLineTextBox
     */
    public MultiLineTextBox addMultiLineTextBox(String content) {
        return new MultiLineTextBox(this, content);
    }

    /**
     * Add a MultiLineTextBox to the Frame.
     * @param content The content of the TextBox. Will be displayed.
     * @param addScrollbar If true, adds a scrollbar.
     * @return new MultiLineTextBox
     */
    public MultiLineTextBox addMultiLineTextBox(String content, boolean addScrollbar) {
        return new MultiLineTextBox(this, content, addScrollbar);
    }

    /**
     * Add a MultiLineTextBox to the Frame.
     * @param content The content of the TextBox. Will be displayed.
     * @param addScrollbar If true, adds a scrollbar.
     * @param borderTitle Set the title of the border.
     * @return new MultiLineTextBox
     */
    public MultiLineTextBox addMultiLineTextBox(String content, boolean addScrollbar, String borderTitle) {
        return new MultiLineTextBox(this, content, addScrollbar, borderTitle);
    }

    Window getOwner() {
        return owner;
    }

    Container getFrame() {
        return frame;
    }
}
