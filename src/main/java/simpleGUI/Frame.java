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
    JPanel frame;
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
        frame = new JPanel(new BorderLayout());

        //frame.setBounds(40, 80, 10, 50);
        frame.setBackground(Color.MAGENTA);
        owner.window.add(frame);
    }

    /**
     * Return a FrameHandler that can specify the location of the Frame on the window.
     * @return new FrameHandler
     */
    public FrameHandler placeFrame() {
        return new FrameHandler(this);
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
     * Add a Label to the Frame, without a title.
     * @return new Label
     */
    public Label addLabel(){
        return new Label(this);
    }

    /**
     * Add a Label to the Frame.
     * @param title The title of the Label. Will be displayed.
     * @return new Label
     */
    public Label addLabel(String title){
        return new Label(this, title);
    }

    /**
     * Add a TextBox to the Frame.
     * @param title The title of the TextBox. Will be displayed.
     * @param content The content of the TextBox. Will be displayed.
     * @return new TextBox
     */
    public TextBox addTextBox(String title, String content) {
        return new TextBox(this, title, content);
    }

    /**
     * Add a TextBox to the Frame, without the content.
     * @param title The title of the TextBox. Will be displayed.
     * @return new TextBox
     */
    public TextBox addTextBox(String title) {
        return new TextBox(this, title);
    }
}
