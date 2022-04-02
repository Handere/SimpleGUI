package simpleGUI;

import javax.swing.*;


/**
 * Functions as a root when building the GUI.
 */
public class Window {

    /**
     * The GUI window.
     */
    JFrame window;

    /**
     * The default title of the Window.
     */
    private final String defaultTitle = "SimpleGUI";

    /**
     * The default height of the window, in pixels.
     */
    private final int defaultHeightInPixels = 500;
    /**
     * The default width of the window, in pixels.
     */
    private final int defaultWidthInPixels = 500;

    /**
     * The attached Menu, if added.
     */
    private Menu menu;
    /**
     * The attached Frames, if added.
     */
    protected Frame frame;

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * Width and height is by default 500x500px.
     */
    public Window() {
        this.window = new JFrame(defaultTitle);
        window.setSize(defaultWidthInPixels, defaultHeightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * Width and height is by default 500x500px.
     * @param title The window title.
     */
    public Window(String title) {
        this.window = new JFrame(title);
        window.setSize(defaultWidthInPixels, defaultHeightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * @param heightInPixels Set the height of the window in pixels.
     * @param widthInPixels Set the width of the window in pixels.
     *
     */
    public Window(int heightInPixels, int widthInPixels) {
        this.window = new JFrame(defaultTitle);
        window.setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * @param title Set the title of the window.
     * @param heightInPixels Set the height of the window in pixels.
     * @param widthInPixels Set the width of the window in pixels.
     *
     */
    public Window(String title, int heightInPixels, int widthInPixels) {
        this.window = new JFrame(title);
        window.setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Set the window height.
     * @param heightInPixels Set the height of the window in pixels.
     */
    public void setHeight(int heightInPixels) {
        window.setSize(window.getWidth(), heightInPixels);
    }

    /**
     * Set the window width.
     * @param widthInPixels Set the width of the window in pixels.
     */
    public void setWidth(int widthInPixels){
        window.setSize(widthInPixels, window.getHeight());
    }

    /**
     * Set the window width and height.
     * @param widthInPixels Set the width of the window in pixels.
     * @param heightInPixels Set the height of the window in pixels.
     */
    public void setSize(int widthInPixels, int heightInPixels){
        window.setSize(widthInPixels, heightInPixels);
    }

    /**
     * Build the components of the window, making it visible as an application.
     */
    public void build() {
        window.setVisible(true);
    }

    /**
     * Add a new frame to the window, to a maximum of four frames.
     * When a second frame is added it will split the available space vertical, and place itself to the right of the
     * first. Third is placed on the bottom, and fourth will split the bottom and place itself bottom right.
     * @return new Frame
     */
    public Frame addFrame(){
        return frame = new Frame(this);
    }

    /**
     * @return The Frame attached to the Window.
     */
    public Frame getFrame() {
        return frame;
    }

    /**
     * Add a Menu to the window that by default is placed horizontal at the top of the window.
     * @return new Menu
     */
    public Menu addMenu(){
        return menu = new Menu(this);
    }

    /**
     * Return the Menu attached to the window.
     * @return Menu
     */
    public Menu getMenu(){
        return menu;
    }
}
