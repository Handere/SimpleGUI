package simpleGUI.base;

public class ScrollbarDirectionHandler {
    Scrollbar scrollbar;

 public ScrollbarDirectionHandler(Scrollbar scrollbar) {
  this.scrollbar = scrollbar;
 }

 public void horizontal() {
  /**
   * Set the direction of the scrollbar to horizontal.
   */
   scrollbar.scrollbarDirection = Scrollbar.ScrollbarDirection.HORIZONTAL;
 }

 public void vertical() {
  /**
   * Set the direction of the scrollbar to vertical.
   */
   scrollbar.scrollbarDirection = Scrollbar.ScrollbarDirection.VERTICAL;
 }

}
