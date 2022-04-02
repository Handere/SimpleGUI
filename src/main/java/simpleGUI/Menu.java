package simpleGUI;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Hold menu elements that will be placed on its attached window.
 */
public class Menu {
    /**
     * The Window the Menu is attached to.
     */
    Window owner;
    /**
     * The menu.
     */
    JMenuBar menu;
    /**
     * The attached BreadCrumbs.
     */
    BreadCrumbs breadCrumbs;

    /**
     * Constructor.
     * @param owner The Frame the Menu is attached to.
     */
    public Menu(Window owner) {
        this.owner = owner;
        menu = new JMenuBar();
        owner.window.setJMenuBar(menu);
    }

    /**
     * Add BreadCrumbs to the NavigationBar.
     * @return new BreadCrumbs.
     */
    public BreadCrumbs addBreadCrumbs() {
        return breadCrumbs = new BreadCrumbs();
    }

    /**
     * Add a MenuButton to the Menu, with default name and no target window.
     * @return new MenuButton
     */
    public MenuButton addMenuButton() {
        return new MenuButton(this);
    }

    /**
     * Add a MenuButton to the Menu.
     * @param buttonName The name of the button. Will be displayed.
     * @return new MenuButton
     */
    public MenuButton addMenuButton(String buttonName) {
        return new MenuButton(this, buttonName);
    }

}
