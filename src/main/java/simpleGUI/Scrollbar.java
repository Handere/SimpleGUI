package simpleGUI;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import simpleGUI.handlers.ScrollbarHandler;
import javax.swing.*;

/**
 * Scrollbar that can be attached to a window.
 */
public class Scrollbar {

    /**
     * The scrollbar.
     */
    JScrollPane scrollbar;
    /**
     * The window the Scrollbar is attached to.
     */
    Window owner;

    /**
     * The default scrollbar direction.
     */
    public ScrollbarDirection scrollbarDirection = ScrollbarDirection.VERTICAL;
    /**
     * The default scrollbar location.
     */
    public ScrollbarLocation scrollbarLocation = ScrollbarLocation.RIGHT;

    /**
     * The possible scroll directions of the Scrollbar.
     */
    public enum ScrollbarDirection {
        /**
         * Specify the scrollbar direction to be vertical.
         */
        VERTICAL,
        /**
         * Specify the scrollbar direction to be horizontal.
         */
        HORIZONTAL
    }

    /**
     * The possible locations of the Scrollbar on a window.
     */
    public enum ScrollbarLocation {
        /**
         * Specify the scrollbar location to the left.
         */
        LEFT,
        /**
         * Specify the scrollbar location to the right.
         */
        RIGHT,
        /**
         * Specify the scrollbar location to the top.
         */
        TOP,
        /**
         * Specify the scrollbar location to the bottom.
         */
        BOTTOM
    }

    /**
     * Constructor.
     * @param owner The window the Scrollbar is attached to.
     */
    public Scrollbar(Window owner) {
        this.owner = owner;


        JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL, 30, 20, 0, 500);
        JScrollBar horizontalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 40, 0, 500);

        owner.window.setLayout(new BorderLayout());
        owner.window.getContentPane().add(verticalScrollBar, BorderLayout.EAST);
        owner.window.getContentPane().add(horizontalScrollBar, BorderLayout.SOUTH);

        owner.window.setContentPane(scrollbar);
        /*scrollbar = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        owner.window.getContentPane().add(scrollbar, BorderLayout.WEST);*/

    }


    /**
     * Constructor.
     * @param owner The window the Scrollbar is attached to.
     * @param alwaysShowVertical Set the vertical scrollbar to always visible if true, and if needed when false.
     * @param alwaysShowHorizontal Set the horizontal scrollbar to always visible if true, and if needed when false.
     */
    public Scrollbar(Window owner, boolean alwaysShowVertical, boolean alwaysShowHorizontal) {
        this.owner = owner;

        if (alwaysShowVertical && alwaysShowHorizontal) {
            scrollbar = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        }
        else if (alwaysShowVertical && !alwaysShowHorizontal) {
            scrollbar = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        }
        else if (!alwaysShowVertical && alwaysShowHorizontal) {
            scrollbar = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        }
        else if (!alwaysShowVertical && !alwaysShowHorizontal) {
            scrollbar = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        }

        owner.window.setContentPane(scrollbar);
    }

    /**
     * Return a ScrollbarHandler that can specify the scrolling direction to the Scrollbar.
     * @return new ScrollbarHandler
     */
    public ScrollbarHandler setScrollbarDirection() {
        return new ScrollbarHandler(this);
    }

    /**
     * Return a ScrollbarHandler that can specify the location of the Scrollbar on the window.
     * @return new ScrollbarHandler
     */
    public ScrollbarHandler placeScrollbar(){
        return new ScrollbarHandler(this);
    }

}
