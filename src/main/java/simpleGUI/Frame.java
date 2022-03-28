package simpleGUI;

import simpleGUI.handlers.FrameHandler;

import javax.swing.*;
import java.awt.*;

/**
 * Hold the non-window-specific elements that can be displayed in the GUI.
 */
public class Frame {

    /**
     * The Window the Frame is attached to.
     */
    Window owner;
    /**
     * The frame.
     */
    Container frame;
    /**
     * Specify if the Frame shall be displayed.
     */
    boolean showFrame = false;

    /**
     * Constructor.
     * Create a Frame with border layout as default.
     * @param owner The Window the Frame is attached to.
     */
    public Frame(Window owner) {
        this.owner = owner;
        frame = owner.window.getContentPane();
    }

    /**
     * Add an ActionButton to the Frame, with a default name.
     * @return new ActionButton
     */
    public ActionButton addActionButton(){
        return new ActionButton(this);
    }

    /**
     * Add an ActionButton to the Frame.
     * @param buttonName The name of the button. Will be displayed.
     * @return new ActionButton
     */
    public ActionButton addActionButton(String buttonName){
        return new ActionButton(this, buttonName);
    }

    /**
     * Add an ActionButton to the Frame.
     * @param buttonName The name of the button. Will be displayed.
     * @param width The button width.
     * @param height The button height.
     * @return new ActionButton
     */
    public ActionButton addActionButton(String buttonName, int width, int height){
        return new ActionButton(this, buttonName, width, height);
    }

    /**
     * Add a Label to the Frame, without a title.
     * @return new Label
     */
    public Label addLabel(){
        return new Label(this);
    }

    /**
     * Add a Label to the Frame.
     * @param singleLineText The title of the Label. Will be displayed.
     * @return new Label
     */
    public Label addLabel(String singleLineText){

        return new Label(this, singleLineText);
    }

    /**
     * Add a TextBox to the Frame.
     * @return new TextBox
     */
    public TextBox addTextBox() {
        return new TextBox(this);
    }

    /**
     * Add a TextBox to the Frame.
     * @param content The content of the TextBox. Will be displayed.
     * @return new TextBox
     */
    public TextBox addTextBox(String content) {
        return new TextBox(this, content);
    }

}
