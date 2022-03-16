package simpleGUI;

import simpleGUI.handlers.NavigationBarHandler;

import java.util.ArrayList;

/**
 * Hold navigation elements that will be placed on its attached window.
 */
public class NavigationBar {
    /**
     * The window the NavigationBar is attached to.
     */
    Window owner;
    /**
     * The attached BreadCrumbs.
     */
    BreadCrumbs breadCrumbs;
    /**
     * The attached NavigationButtons.
     */
    ArrayList<NavigationButton> navigationButtons;

    /**
     * Constructor.
     * @param owner The window the NavigationBar is attached to.
     */
    public NavigationBar(Window owner) {
        this.owner = owner;
    }

    /**
     * Return a NavigationBarHandler with methods that specify the possible positions.
     * @return new NavigationBarHandler
     */
    public NavigationBarHandler placeNavigationBar() {
        return new NavigationBarHandler(this);
    }

    /**
     * Add BreadCrumbs to the NavigationBar.
     * @return new BreadCrumbs.
     */
    public BreadCrumbs addBreadCrumbs() {
        return breadCrumbs = new BreadCrumbs();
    }

    /**
     * Add a NavigationButton to the NavigationBar, without any name or target window.
     * @return new NavigationButton
     */
    public NavigationButton addNavigationButton() {
        return new NavigationButton();
    }

    /**
     * Add a NavigationButton to the NavigationBar.
     * @param targetWindow The window the button will navigate to when clicked.
     * @param buttonName The name of the button. Will be displayed.
     * @return new NavigationButton
     */
    public NavigationButton addNavigationButton(Window targetWindow, String buttonName) {
        return new NavigationButton(targetWindow, buttonName);
    }

    /**
     * Set the name of the NavigationButton.
     * @param oldButtonName The old name of the NavigationButton.
     * @param newButtonName The new name of the NavigationButton.
     */
    public void setNavigationButtonName(String oldButtonName, String newButtonName) {

    }

    /**
     * Set the target window of the button, to a new window.
     * @param buttonName The name of the button.
     * @param newTargetWindow The new target window of the button.
     */
    public void setNavigationButtonTarget(String buttonName, Window newTargetWindow) {

    }
}
