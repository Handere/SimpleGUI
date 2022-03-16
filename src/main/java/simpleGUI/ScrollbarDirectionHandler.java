package simpleGUI;

/**
 * Handle the scroll direction to a Scrollbar.
 */
public class ScrollbarDirectionHandler {
    /**
     * The Scrollbar to handle.
     */
    Scrollbar scrollbar;

    /**
     * Constructor.
     * @param scrollbar The Scrollbar to handle.
     */
 public ScrollbarDirectionHandler(Scrollbar scrollbar) {
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

}
