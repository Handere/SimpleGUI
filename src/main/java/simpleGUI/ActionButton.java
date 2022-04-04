package simpleGUI;

import simpleGUI.scene.controls.Button;

import javax.swing.*;

/**
 * A button that can be added to a Frame, with the desired action.
 */
public class ActionButton implements Button {
    /**
     * The default name of the button.
     */
    String defaultButtonName = "Click me";
    /**
     * The Frame the button is attached to.
     */
    Frame owner;
    /**
     * The button.
     */
    JButton button;

    /**
     * The default width of the button.
     */
    int defaultWidthInPixels = 100;
    /**
     * The default height of the button.
     */
    int defaultHeightInPixels = 50;

    /**
     * Constructor.
     * Create an ActionButton with default name.
     * @param owner The Frame the button is attached to.
     */
    public ActionButton(Frame owner) {
        this.owner = owner;
        this.button = new JButton(defaultButtonName);
        button.setBounds(button.getX(), button.getY(), defaultWidthInPixels, defaultHeightInPixels);
        owner.frame.add(button);
    }

    /**
     * Constructor.
     * @param owner The Frame the button is attached to.
     * @param buttonName The name of the button. Will be displayed.
     */
    public ActionButton(Frame owner, String buttonName) {
        this.owner = owner;
        this.button = new JButton(buttonName);
        button.setBounds(button.getX(), button.getY(), defaultWidthInPixels, defaultHeightInPixels);
        owner.frame.add(button);
    }

    /**
     * Constructor.
     * @param owner The Frame the button is attached to.
     * @param buttonName The name of the button. Will be displayed.
     * @param width The button width.
     * @param height The button height.
     */
    public ActionButton(Frame owner, String buttonName, int width, int height) {
        this.owner = owner;
        this.button = new JButton(buttonName);
        button.setBounds(button.getX(), button.getY(), width, height);
        owner.frame.add(button);
    }

    /**
     * Set the name of the button.
     * @param buttonName The name of the button. Will be displayed.
     */
    public void setButtonName(String buttonName) {
        button.setName(buttonName);
    }

    /**
     * @param width The button width.
     */
    public void setWidthInPixels(int width) {
        button.setBounds(button.getX(), button.getY(), width, defaultHeightInPixels);
    }

    /**
     * @param height The button height.
     */
    public void setHeightInPixels(int height) {
        button.setBounds(button.getX(), button.getY(), defaultWidthInPixels, height);
    }

    /**
     * Set the size of the ActionButton.
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the button.
     * @param height The height of the button.
     */
    public void setSize(int x, int y, int width, int height) {
        button.setBounds(x, y, width, height);
    }
}
