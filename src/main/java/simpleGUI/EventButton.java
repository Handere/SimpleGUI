package simpleGUI;

import simpleGUI.scene.controls.Button;

import javax.swing.*;

/**
 * A button that can be added to a Frame, with the desired action.
 */
public class EventButton implements Button {
    /**
     * The default name of the button.
     */
    private final String DEFAULT_BUTTON_NAME = "Click me";
    /**
     * The Frame the button is attached to.
     */
    private Frame owner;
    /**
     * The button.
     */
    private JButton button;
//TODO: Legg til funksjonalitet
    /**
     * The default width of the button.
     */
    private final int DEFAULT_WIDTH_IN_PIXELS = 100;
    /**
     * The default height of the button.
     */
    private final int DEFAULT_HEIGHT_IN_PIXELS = 50;

    /**
     * Constructor.
     * Create an ActionButton with default name.
     * @param owner The Frame the button is attached to.
     */
    public EventButton(Frame owner) {
        this.owner = owner;
        this.button = new JButton(DEFAULT_BUTTON_NAME);
        button.setBounds(button.getX(), button.getY(), DEFAULT_WIDTH_IN_PIXELS, DEFAULT_HEIGHT_IN_PIXELS);
        owner.getFrame().add(button);
    }

    /**
     * Constructor.
     * @param owner The Frame the button is attached to.
     * @param buttonName The name of the button. Will be displayed.
     */
    public EventButton(Frame owner, String buttonName) {
        this.owner = owner;
        this.button = new JButton(buttonName);
        button.setBounds(button.getX(), button.getY(), DEFAULT_WIDTH_IN_PIXELS, DEFAULT_HEIGHT_IN_PIXELS);
        owner.getFrame().add(button);
    }

    /**
     * Constructor.
     * @param owner The Frame the button is attached to.
     * @param buttonName The name of the button. Will be displayed.
     * @param width The button width.
     * @param height The button height.
     */
    public EventButton(Frame owner, String buttonName, int width, int height) {
        this.owner = owner;
        this.button = new JButton(buttonName);
        button.setBounds(button.getX(), button.getY(), width, height);
        owner.getFrame().add(button);
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
        button.setBounds(button.getX(), button.getY(), width, DEFAULT_HEIGHT_IN_PIXELS);
    }

    /**
     * @param height The button height.
     */
    public void setHeightInPixels(int height) {
        button.setBounds(button.getX(), button.getY(), DEFAULT_WIDTH_IN_PIXELS, height);
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
