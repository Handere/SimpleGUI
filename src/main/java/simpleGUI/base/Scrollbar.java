package simpleGUI.base;

/**
 * Scrollbar that can be attached to a window.
 */
public class Scrollbar {
    /**
     * The window the Scrollbar is attached to.
     */
    Window owner;

    /**
     * The default scrollbar direction.
     */
    ScrollbarDirection scrollbarDirection = ScrollbarDirection.VERTICAL;
    /**
     * The default scrollbar location.
     */
    ScrollbarLocation scrollbarLocation = ScrollbarLocation.RIGHT;

    /**
     * The possible scroll directions of the Scrollbar.
     */
    enum ScrollbarDirection {
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
    enum ScrollbarLocation {
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
    }

    /**
     * Return a ScrollbarDirectionHandler that can specify the scrolling direction to the Scrollbar.
     * @return new ScrollbarDirectionHandler
     */
    public ScrollbarDirectionHandler setScrollbarDirection() {
        return new ScrollbarDirectionHandler(this);
    }

    /**
     * Return a ScrollbarLocationHandler that can specify the location of the Scrollbar on the window.
     * @return new ScrollbarLocationHandler
     */
    public ScrollbarLocationHandler placeScrollbar(){
        return new ScrollbarLocationHandler(this);
    }

}
