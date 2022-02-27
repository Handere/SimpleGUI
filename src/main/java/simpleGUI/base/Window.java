package simpleGUI.base;

public class Window {

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

    ScrollbarDirection scrollbarDirection = ScrollbarDirection.VERTICAL;
    ScrollbarLocation scrollbarLocation = ScrollbarLocation.RIGHT;

    public Window() {
        /*
        * Constructing an empty window without a Frame.
         */
    }

    public void setHeight(int height) {
        /*
        * Set the windows height in pixels.
         */
    }
    public void setWidth(int width){
        /*
         * Set the windows width in pixels.
         */
    }
    public void setSize(int width, int height){
        /*
         * Set the windows width and height in pixels.
         */
    }
    public Frame build() {
        /*
         * Add a Frame that fill the window, and set the width and height to a standard size of 500x500px.
         */
        return new Frame();
    }
    public Frame build(int width, int height) {
        /*
         * Add a Frame that fill the window, and set the width and height of the window in pixels.
         */
        return new Frame();
    }
    public Frame addFrame(String position){
        /*
         * Adds a new frame to the window with the specified position (left, right, over, under)
         * This frame shares the space with the existing frame by splitting it in two
         * (Floating)
         */
        return new Frame();
    }
    public Frame addFrame(double x, double y) {
        /*
         * Adds a new frame to the window, splitting the space between the new and the existing frame at the
         * x/y-coordinates. The coordinates are specified in percentage (0.0 - 1.0).
         *
         */
        return new Frame();
    }
    public void placeFrame(Frame frame, double x, double y) {
        /*
         * Specify the x- and y-coordinates to the Frame in the window.
         * The coordinates are specified in percentage (0.0 - 1.0).
         *
         */
    }
    public void addScrollbar(String direction) {
        /*
         * Add a scrollbar with the specified direction (horizontal or vertically).
         * As standard placing it on the right when vertically, and on the bottom when horizontal.
         */
    }
    public void addScrollbar(String direction, String place) {
        /*
         * Add a scrollbar with the specified direction (horizontal or vertically).
         * Set the place of the scrollbar on the window (left, right, top or bottom).
         */
    }
    public ScrollbarDirectionHandler setScrollbarDirection() {
        /*
         * Set the direction of an existing scrollbar by returning a ScrollbarDirectionHandler() that has the
         * methods horizontal() and vertical().
         *
         */
        return new ScrollbarDirectionHandler(this);
    }
    public ScrollbarLocationHandler placeScrollbar(){
        /*
         * Set the location of an existing scrollbar by returning a ScrollbarLocationHandler(), that has the
         * methods left(), right(), top() and bottom().
         */
        return new ScrollbarLocationHandler(this);
    }
    public void addBreadCrumbs() {
        /*
         * Add bread crumbs to the window.
         * By default, placing it at the top of the frame nearest the top left corner.
         */
    }
    public void addBreadCrumbs(Frame frame) {
        /*
         * Add bread crumbs to the window, and place it in the specified frame.
         *
         */
    }
    public void placeBreadCrumb(Frame frame){
        /*
         * Set the place of the Breadcrumb to the window in a specified frame.
         */
    }
}
