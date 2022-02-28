package simpleGUI.base;

/**
 * Handle the location of the scrollbar on its window.
 */
public class ScrollbarLocationHandler {
    /**
     * The Scrollbar to handle.
     */
    Scrollbar scrollbar;

    /**
     * Constructor.
     * @param scrollbar The Scrollbar to handle.
     */
    public ScrollbarLocationHandler(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
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
