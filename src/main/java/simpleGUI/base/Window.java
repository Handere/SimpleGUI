package simpleGUI.base;

import java.util.ArrayList;

/**
 * Functions as a root when building the GUI.
 */
public class Window {

    /**
     * The default height of the window, in pixels.
     */
    int heightInPixels = 500;
    /**
     * The default width of the window, in pixels.
     */
    int widthInPixels = 500;

    /**
     * The attached Scrollbar, if added.
     */
    Scrollbar scrollbar;
    /**
     * The attached NavigationBar, if added.
     */
    NavigationBar navigationBar;
    /**
     * The attached Frames, if added.
     */
    ArrayList<Frame> frames = new ArrayList<>();

    /**
     * Create an empty window without a Frame.
     * Width and height is by default 500x500px.
     */
    public Window() {

    }

    /**
     * Create an empty window without a Frame.
     * @param heightInPixels Set the height of the window in pixels.
     * @param widthInPixels Set the width of the window in pixels.
     *
     */
    public Window(int heightInPixels, int widthInPixels) {
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
    }

    /**
     * Set the window height.
     * @param heightInPixels Set the height of the window in pixels.
     */
    public void setHeight(int heightInPixels) {

    }

    /**
     * Set the window width.
     * @param widthInPixels Set the width of the window in pixels.
     */
    public void setWidth(int widthInPixels){

    }

    /**
     * Set the window width and height.
     * @param widthInPixels Set the width of the window in pixels.
     * @param heightInPixels Set the height of the window in pixels.
     */
    public void setSize(int widthInPixels, int heightInPixels){

    }

    /**
     * Build the components of the window, making it visible as an application.
     */
    public void build() {

    }

    /**
     * Add a new frame to the window, to a maximum of four frames.
     * When a second frame is added it will split the available space vertical, and place itself to the right of the
     * first. Third is placed on the bottom, and fourth will split the bottom and place itself bottom right.
     * @return new Frame
     */
    public Frame addFrame(){
        return new Frame(this);
    }

    /**
     * Return a FrameHandler that give access to the frames connected to the window.
     * @return FrameHandler
     */
    public FrameHandler frame() {
        return new FrameHandler(this);
    }

    /**
     * Add a scrollbar that by default is placed on the right of the window, with vertical scrolling.
     * @return new Scrollbar
     */
    public Scrollbar addScrollbar() {
        return scrollbar = new Scrollbar(this);
    }

    /**
     * Return the scrollbar attached to the window.
     * @return Scrollbar
     */
    public Scrollbar scrollbar() {
        return scrollbar;
    }

    /**
     * Add a NavigationBar to the window that by default is placed horizontal at the top of the window.
     * @return new NavigationBar
     */
    public NavigationBar addNavigationBar(){
        return navigationBar = new NavigationBar(this);
    }

    /**
     * Return the NavigationBar attached to the window.
     * @return NavigationBar
     */
    public NavigationBar navigationBar(){
        return navigationBar;
    }
}
