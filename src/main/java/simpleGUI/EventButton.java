package simpleGUI;

import javax.swing.*;

/**
 * An event button.
 */
public class EventButton implements Button {

    /**
     * The default name of the event button.
     */
    private final String DEFAULT_BUTTON_NAME = "Click me";

    /**
     * The owner frame of the event button.
     */
    private Frame owner;

    /**
     * The event button.
     */
    private JButton button;

    //TODO: Legg til Action funksjonalitet

    /**
     * The default width of the event button.
     */
    private final int DEFAULT_WIDTH_IN_PIXELS = 100;

    /**
     * The default height of the event button.
     */
    private final int DEFAULT_HEIGHT_IN_PIXELS = 50;

    /**
     * Create an event button, attached to a chosen frame.
     * Default button name.
     * @param owner The frame.
     */
    public EventButton(Frame owner) {
        this.owner = owner;
        this.button = new JButton(DEFAULT_BUTTON_NAME);
        button.setBounds(button.getX(), button.getY(), DEFAULT_WIDTH_IN_PIXELS, DEFAULT_HEIGHT_IN_PIXELS);
        owner.getFrame().add(button);
    }

    /**
     * Create an event button with a chosen button name, attached to a chosen frame.
     * @param owner The frame.
     * @param buttonName The name of the button.
     */
    public EventButton(Frame owner, String buttonName) {
        this.owner = owner;
        this.button = new JButton(buttonName);
        button.setBounds(button.getX(), button.getY(), DEFAULT_WIDTH_IN_PIXELS, DEFAULT_HEIGHT_IN_PIXELS);
        owner.getFrame().add(button);
    }

    /**
     * Create an event button with a chosen button name, width and height, attached to a chosen frame.
     * @param owner The frame.
     * @param buttonName The name of the button.
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
     * Set the name of the event button.
     * @param buttonName The name of the event button.
     */
    public void setButtonName(String buttonName) {
        button.setName(buttonName);
    }

    /**
     * Set the width of the event button.
     * @param width The button width.
     */
    public void setWidthInPixels(int width) {
        button.setBounds(button.getX(), button.getY(), width, DEFAULT_HEIGHT_IN_PIXELS);
    }

    /**
     * Set the height of the event button.
     * @param height The button height.
     */
    public void setHeightInPixels(int height) {
        button.setBounds(button.getX(), button.getY(), DEFAULT_WIDTH_IN_PIXELS, height);
    }

    /**
     * Set the size of the event button.
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the event button.
     * @param height The height of the event button.
     */
    public void setSize(int x, int y, int width, int height) {
        button.setBounds(x, y, width, height);
    }
}
