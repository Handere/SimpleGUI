package simpleGUI.base;

import java.util.ArrayList;

public class Window {

    int heightInPixels = 500;
    int widthInPixels = 500;

    Scrollbar scrollbar;
    NavigationBar navigationBar;
    ArrayList<Frame> frames = new ArrayList<>();

    public Window() {
        /**
        * Create an empty window without a Frame.
         * Width and height is by default 500x500px.
         */
    }

    public Window(int heightInPixels, int widthInPixels) {
        /**
         * Create an empty window without a Frame.
         * Set the specified width and height of the window.
         */
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
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
         * Build the components of the window, to make it visible as an application.
         */
    }
    public Frame addFrame(){
        /**
         * Adds a new frame to the window with the specified position (left, right, over, under)
         * This frame shares the space with the existing frame by splitting it in two
         * (Floating)
         */
        return new Frame(this);
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
