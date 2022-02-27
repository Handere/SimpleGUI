package simpleGUI.base;

public class Scrollbar {
    Window owner;

    ScrollbarDirection scrollbarDirection = ScrollbarDirection.VERTICAL;
    ScrollbarLocation scrollbarLocation = ScrollbarLocation.RIGHT;

    enum ScrollbarDirection {
        VERTICAL,
        HORIZONTAL
    }
    enum ScrollbarLocation {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    public Scrollbar(Window owner) {
        this.owner = owner;
    }

    public ScrollbarDirectionHandler setScrollbarDirection() {
        /**
         * Set the direction of an existing scrollbar by returning a ScrollbarDirectionHandler() that has the
         * methods horizontal() and vertical().
         *
         */
        return new ScrollbarDirectionHandler(this);
    }
    public ScrollbarLocationHandler placeScrollbar(){
        /**
         * Set the location of an existing scrollbar by returning a ScrollbarLocationHandler(), that has the
         * methods left(), right(), top() and bottom().
         */
        return new ScrollbarLocationHandler(this);
    }

}
