package simpleGUI;

import simpleGUI.scene.controls.Button;

import javax.swing.*;

/**
 * A button that can be added to a Frame, with the desired action.
 */
public class ActionButton implements Button {
    /**
     * The name of the button. By default, set to "Click me"
     */
    String buttonName = "Click me";
    /**
     * The Frame the button is attached to.
     */
    Frame owner;
    /**
     * The button.
     */
    JButton button;

    /**
     * The width of the button.
     */
    int width = 100;
    /**
     * The height of the button.
     */
    int height = 50;
    /**
     * X-coordinate for top left corner.
     */
    int x;
    /**
     * Y-coordinate for top left corner.
     */
    int y;

    /**
     * Constructor.
     * Create an ActionButton with default name.
     * @param owner The Frame the button is attached to.
     */
    public ActionButton(Frame owner) {
        this.owner = owner;
        this.button = new JButton(buttonName);
        this.x = button.getX();
        this.y = button.getY();
        button.setBounds(x, y, width, height);
        owner.frame.add(button);
    }

    /**
     * Constructor.
     * @param owner The Frame the button is attached to.
     * @param buttonName The name of the button. Will be displayed.
     */
    public ActionButton(Frame owner, String buttonName) {
        this.buttonName = buttonName;
        this.owner = owner;
        this.button = new JButton(buttonName);
        this.x = button.getX();
        this.y = button.getY();
        button.setBounds(x, y, width, height);
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
        this.buttonName = buttonName;
        this.owner = owner;
        this.width = width;
        this.height = height;
        this.button = new JButton(buttonName);
        this.x = button.getX();
        this.y = button.getY();
        button.setBounds(x, y, width, height);
        owner.frame.add(button);
    }

    /**
     * Set the name of the button.
     * @param buttonName The name of the button. Will be displayed.
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
        button.setName(buttonName);
    }

    /**
     * @param width The button width.
     */
    public void setWidth(int width) {
        this.width = width;
        button.setBounds(x, y, width, height);
    }

    /**
     * @param height The button height.
     */
    public void setHeight(int height) {
        this.height = height;
        button.setBounds(x, y, width, height);
    }

    /**
     * Set the size of the ActionButton.
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the button.
     * @param height The height of the button.
     */
    public void setSize(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        button.setBounds(x, y, width, height);
    }
}
