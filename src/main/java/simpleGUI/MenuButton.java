package simpleGUI;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * An event button.
 */
public class MenuButton implements Button {

    /**
     * The owner menu of the menu button.
     */
    private Menu owner;

    /**
     * The menu button.
     */
    private JMenu menuButton;

    /**
     * The main window.
     * {@link Window}
     */
    private Window mainWindow;

    /**
     * The window the button will navigate to when clicked.
     * {@link Window}
     */
    private Window targetWindow;

    /**
     * The default name of the button.
     */
    private final String DEFAULT_BUTTON_NAME = "Example";

    /**
     * The event choice.
     */
    private int eventChoice = 0;

    /**
     * Create a menu button, attached to a chosen menu.
     * Default button name.
     * @param owner The menu.
     */
    public MenuButton(Menu owner) {
        this.owner = owner;
        menuButton = new JMenu(DEFAULT_BUTTON_NAME);
        menuButton.addMenuListener(new MenuButtonEventListener());
        owner.getMenu().add(menuButton);
    }

    /**
     * Create a menu button with a chosen button name, attached to a chosen menu.
     * @param owner The menu.
     * @param buttonName The name of the button.
     */
    public MenuButton(Menu owner, String buttonName) {
        this.owner = owner;
        menuButton = new JMenu(buttonName);
        menuButton.addMenuListener(new MenuButtonEventListener());
        owner.getMenu().add(menuButton);
    }

    /**
     * Set the target window of the button.
     * @param targetWindow The target window.
     */
    public void setTargetWindow(Window targetWindow) {
        this.targetWindow = targetWindow;
    }

    /**
     * Set navigation between two windows.
     * @param mainWindow Current window.
     * @param targetWindow Target window.
     */
    public void navigateBetweenWindowsEvent(Window mainWindow, Window targetWindow) {
        this.mainWindow = mainWindow;
        this.targetWindow = targetWindow;
        eventChoice = 1;
    }

    /**
     * Set the button name.
     * @param buttonName The button name.
     */
    @Override
    public void setButtonName(String buttonName) {
        menuButton.setName(buttonName);
    }

    /**
     * An event listener for the menu button.
     */
    class MenuButtonEventListener implements MenuListener {


        /**
         * Navigation between windows
         */
        void navigateWindows() {
            mainWindow.getWindow().setVisible(false);
            targetWindow.getWindow().setVisible(true);
        }

        /**
         * The event.
         * @param e Event.
         */
        @Override
        public void menuSelected(MenuEvent e) {
            switch (eventChoice) {
                case 1:
                    navigateWindows();
                    break;
                case 2:

                    break;
            }
        }

        /**
         * @param e Event
         */
        @Override
        public void menuDeselected(MenuEvent e) {

        }

        /**
         * @param e Event.
         */
        @Override
        public void menuCanceled(MenuEvent e) {

        }
    }
}
