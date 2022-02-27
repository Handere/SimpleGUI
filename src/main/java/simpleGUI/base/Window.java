package simpleGUI.base;

import java.util.ArrayList;

public class Window {

    Scrollbar scrollbar;
    NavigationBar navigationBar;
    ArrayList<Frame> frames = new ArrayList<>();

    public Window() {
        /**
        * Constructing an empty window without a Frame.
         */
    }

    public void setHeight(int height) {
        /**
        * Set the windows height in pixels.
         */
    }
    public void setWidth(int width){
        /**
         * Set the windows width in pixels.
         */
    }
    public void setSize(int width, int height){
        /**
         * Set the windows width and height in pixels.
         */
    }
    public void build() {
        /**
         * Add a Frame that fill the window.
         */
        if (!frames.isEmpty()) {
            frames.add(new Frame(this, 0));
            frames.add(new Frame(this, 1));
            frames.add(new Frame(this, 2));
            frames.add(new Frame(this, 3));
        }
        frames.get(0).showFrame = true;
    }
    public void addFrame(){
        /**
         * Adds a new frame to the window with the specified position (left, right, over, under)
         * This frame shares the space with the existing frame by splitting it in two
         * (Floating)
         */
    }
    public FrameHandler frame() {
        /**
         * Return a FrameHandler that give access to the desired frame, through its methods.
         *
         */
        return new FrameHandler(this);
    }
    public Scrollbar addScrollbar() {
        /**
         * Add a scrollbar with the specified direction (horizontal or vertically).
         * As standard placing it on the right when vertically, and on the bottom when horizontal.
         */
        return scrollbar = new Scrollbar(this);
    }
    public Scrollbar scrollbar() {
        /**
         * Return the windows scrollbar, with its methods.
         */
        return scrollbar;
    }
    public NavigationBar addNavigationBar(){
        /**
         * Add a Navigationbar with the specified direction (vertically or horizontal).
         * By default it gets placed on the top left, horizontal.
         */
        return navigationBar = new NavigationBar(this);
    }
    public NavigationBar navigationBar(){
        /**
         * Return the windows navigation bar, with its methods.
         */
        return navigationBar;
    }
}
