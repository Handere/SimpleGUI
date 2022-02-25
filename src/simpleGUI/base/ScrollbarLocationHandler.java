package simpleGUI.base;

public class ScrollbarLocationHandler {
    Window owner;

    public ScrollbarLocationHandler(Window owner) {
        this.owner = owner;
    }

    public void left() {
        /*
         * Set the location of the scrollbar to the left.
         */
        owner.scrollbarLocation = Window.ScrollbarLocation.LEFT;
    }
    public void right() {
        /*
         * Set the location of the scrollbar to the right.
         */
        owner.scrollbarLocation = Window.ScrollbarLocation.RIGHT;
    }
    public void top() {
        /*
         * Set the location of the scrollbar to the top.
         */
        owner.scrollbarLocation = Window.ScrollbarLocation.TOP;
    }
    public void bottom() {
        /*
         * Set the location of the scrollbar to the bottom.
         */
        owner.scrollbarLocation = Window.ScrollbarLocation.BOTTOM;
    }
}
