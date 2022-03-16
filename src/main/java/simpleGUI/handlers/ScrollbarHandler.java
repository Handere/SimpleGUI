package simpleGUI.handlers;

import simpleGUI.Scrollbar;

/**
 * Scrollbar handler.
 */
public class ScrollbarHandler {
    /**
     * The Scrollbar to handle.
     */
    Scrollbar scrollbar;

    /**
     * Constructor.
     * @param scrollbar The Scrollbar to handle.
     */
    public ScrollbarHandler(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
    }
    /**
     * Set the scrollbar direction to horizontal.
     */
    public void horizontal() {
        scrollbar.scrollbarDirection = Scrollbar.ScrollbarDirection.HORIZONTAL;
    }

    /**
     * Set the scrollbar direction to vertical.
     */
    public void vertical() {
        scrollbar.scrollbarDirection = Scrollbar.ScrollbarDirection.VERTICAL;
    }
    /**
     * Set the location of the scrollbar to the left on its window.
     */
    public void left() {
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.LEFT;
    }

    /**
     * Set the location of the scrollbar to the right on its window.
     */
    public void right() {
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.RIGHT;
    }

    /**
     * Set the location of the scrollbar to the top on its window.
     */
    public void top() {
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.TOP;
    }

    /**
     * Set the location of the scrollbar to the bottom on its window.
     */
    public void bottom() {
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.BOTTOM;
    }
}
