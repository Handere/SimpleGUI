package simpleGUI.base;

public class ScrollbarLocationHandler {
    Scrollbar scrollbar;

    public ScrollbarLocationHandler(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
    }

    public void left() {
        /**
         * Set the location of the scrollbar to the left.
         */
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.LEFT;
    }
    public void right() {
        /**
         * Set the location of the scrollbar to the right.
         */
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.RIGHT;
    }
    public void top() {
        /**
         * Set the location of the scrollbar to the top.
         */
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.TOP;
    }
    public void bottom() {
        /**
         * Set the location of the scrollbar to the bottom.
         */
        scrollbar.scrollbarLocation = Scrollbar.ScrollbarLocation.BOTTOM;
    }
}
