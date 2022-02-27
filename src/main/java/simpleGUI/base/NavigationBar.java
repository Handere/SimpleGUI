package simpleGUI.base;

import java.util.ArrayList;

public class NavigationBar {
    Window owner;
    BreadCrumbs breadCrumbs;
    ArrayList<NavigationButton> navigationButtons;

    public NavigationBar(Window owner) {
        this.owner = owner;
    }

    public NavigationBarLocationHandler placeNavigationBar() {
        /**
         * Return a NavigationBarLocationHandler with methods that specify the possible positions;
         * .left(), .right(), .top() or .bottom().
         */
        return new NavigationBarLocationHandler(this);
    }

    public BreadCrumbs addBreadCrumbs() {
        /**
         * Add bread crumbs to the navigation bar.
         *
         */
        return breadCrumbs = new BreadCrumbs();
    }
    public void placeBreadCrumb(Frame frame){
        /**
         * Set the place of the Breadcrumb to the window in a specified frame.
         */
    }
    public NavigationButton addNavigationButton(Window targetWindow, String buttonName) {
        /**
         * Add a navigation button to the navigation bar, with a specified target window.
         */
        return new NavigationButton(targetWindow, buttonName);
    }
    public void setNavigationButtonName(String oldButtonName, String newButtonName) {
        /**
         * Change the navigation button name.
         */
    }
    public void setNavigationButtonDestination(String buttonName, Window newTargetWindow) {
        /**
         * Change the target window of the specified button.
         */
    }
    public void removeNavigationButton(String buttonName) {
        /**
         * Remove/delete the specified navigation button from the navigation bar.
         */
    }
}
