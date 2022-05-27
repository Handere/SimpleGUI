package simpleGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An event button.
 */
public class EventButton implements Button {

    /**
     * The default width of the event button.
     */
    private final int DEFAULT_WIDTH_IN_PIXELS = 100;

    /**
     * The default height of the event button.
     */
    private final int DEFAULT_HEIGHT_IN_PIXELS = 50;

    /**
     * The default name of the event button.
     */
    private final String DEFAULT_BUTTON_NAME = "Click me";

    /**
     * The event choice.
     */
    private int eventChoice = 0;

    /**
     * Indicate a click.
     */
    private int click = 0;

    /**
     * The event object to handle.
     */
    private Component eventObject;

    /**
     * A secondary event object to handle.
     */
    private Component secondEventObject;

    /**
     * The event dialog box.
     */
    private DialogBox eventDialogBox;

    /**
     * The owner frame of the event button.
     */
    private Frame owner;

    /**
     * The event button.
     */
    private JButton button;

    /**
     * Create an event button, attached to a chosen frame.
     * Default button name.
     * @param owner The frame.
     */
    public EventButton(Frame owner) {
        this.owner = owner;
        this.button = new JButton(DEFAULT_BUTTON_NAME);
        button.setBounds(button.getX(), button.getY(), DEFAULT_WIDTH_IN_PIXELS, DEFAULT_HEIGHT_IN_PIXELS);
        button.addActionListener(new EventButtonListener());
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
        button.addActionListener(new EventButtonListener());
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
        button.addActionListener(new EventButtonListener());
        owner.getFrame().add(button);
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

    /**
     * Make the button hide and show a text display on button click.
     * @param textDisplay Text display to be shown or hidden.
     */
    public void showAndHideTextDisplayEvent(TextDisplay textDisplay) {
        if (textDisplay.getClass() == SingleLineTextLabel.class) {
            this.eventObject = ((SingleLineTextLabel) textDisplay).getSingleLineTextLabel();
        }
        else if (textDisplay.getClass() == MultiLineTextBox.class) {
            this.eventObject = ((MultiLineTextBox) textDisplay).getMultiLineTextBox();
            this.secondEventObject = ((MultiLineTextBox) textDisplay).getMultiLineTextBoxPanel();
        }
        eventChoice = 1;
    }

    /**
     * Show the dialog box when button click.
     * @param dialogBox {@link DialogBox}
     */
    public void showDialogBox(DialogBox dialogBox) {
        eventDialogBox = dialogBox;
        eventChoice = 2;
    }

    /**
     * Set the button name.
     * @param buttonName The button name.
     */
    @Override
    public void setButtonName(String buttonName) {
        this.button.setName(buttonName);
    }

    /**
     * An event listener for the event button.
     */
    class EventButtonListener implements ActionListener {

        /**
         * The action.
         * @param e Action.
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            switch (eventChoice) {
                case 1 -> showAndHideTexEvent();
                case 2 -> showDialogBoxEvent();
            }
        }

        /**
         * Event that show and hide a text display.
         */
        void showAndHideTexEvent() {

            if(click == 0){
                eventObject.setVisible(false);
                if (secondEventObject != null) {
                    secondEventObject.setVisible(false);
                }
                click = 1;
            }
            else{
                eventObject.setVisible(true);
                if (secondEventObject != null) {
                    secondEventObject.setVisible(true);
                }
                click = 0;
            }
        }

        /**
         * Event that show the dialog box.
         */
        void showDialogBoxEvent() {
            eventDialogBox.showDialogBox();
        }
    }
}
