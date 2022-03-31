package simpleGUI;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Hold navigation elements that will be placed on its attached window.
 */
public class Menu {
    /**
     * The Window the NavigationBar is attached to.
     */
    Window owner;
    /**
     * The navigation bar.
     */
    JMenuBar navigationBar;
    /**
     * The attached BreadCrumbs.
     */
    BreadCrumbs breadCrumbs;
    /**
     * The attached NavigationButtons.
     */
    ArrayList<MenuButton> menuButtons;

    /**
     * Constructor.
     * @param owner The Frame the NavigationBar is attached to.
     */
    public Menu(Window owner) {
        this.owner = owner;
        navigationBar = new JMenuBar();
        owner.window.setJMenuBar(navigationBar);
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
    public MenuButton addNavigationButton() {
        return new MenuButton(this);
    }

    /**
     * Add a NavigationButton to the NavigationBar.
     * @param buttonName The name of the button. Will be displayed.
     * @return new NavigationButton
     */
    public MenuButton addNavigationButton(String buttonName) {
        return new MenuButton(this, buttonName);
    }

}
