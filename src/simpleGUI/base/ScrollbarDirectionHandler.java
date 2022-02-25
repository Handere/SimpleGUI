package simpleGUI.base;

class ScrollbarDirectionHandler {
 private Window owner;

 public ScrollbarDirectionHandler(Window owner) {
  this.owner = owner;
 }

 public void horizontal() {
  /*
   * Set the direction of the scrollbar to horizontal.
   */
   owner.scrollbarDirection = Window.ScrollbarDirection.HORIZONTAL;
 }

 public void vertical() {
  /*
   * Set the direction of the scrollbar to vertical.
   */
   owner.scrollbarDirection = Window.ScrollbarDirection.VERTICAL;
 }

}
