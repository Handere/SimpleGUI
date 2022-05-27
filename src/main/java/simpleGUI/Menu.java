package simpleGUI;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;
import java.util.ArrayList;

/**
 * A menu.
 */
public class Menu {

    /**
     * {@link Window}
     */
    private Window owner;

    /**
     * The menu.
     */
    private JMenuBar menu;

    /**
     * {@link BreadCrumbs}
     */
    private BreadCrumbs breadCrumbs;


    /**
     * Create a menu, attached to a chosen window.
     * @param owner The window.
     */
    public Menu(Window owner) {
        this.owner = owner;
        menu = new JMenuBar();
        owner.getWindow().setJMenuBar(menu);
    }

    /**
     * Add bread crumbs to the menu.
     * @return Bread crumbs.
     */
    public BreadCrumbs addBreadCrumbs() {
        return breadCrumbs = new BreadCrumbs(this);
    }

    /**
     * Add a menu button to the menu, with default name and no target window.
     * @return Menu button.
     */
    public MenuButton addMenuButton() {
        return new MenuButton(this);
    }

    /**
     * Add a menu button to the menu, with no target window.
     * @param buttonName The name of the button.
     * @return Menu button.
     */
    public MenuButton addMenuButton(String buttonName) {
        return new MenuButton(this, buttonName);
    }

    /**
     * @return The menu.
     */
    public JMenuBar getMenu() {
        return menu;
    }

    /**
     * Set the owner.
     * @param owner {@link Window}
     */
    void setOwner(Window owner) {
        this.owner = owner;
        menu = new JMenuBar();
        owner.getWindow().setJMenuBar(menu);
    }
}
