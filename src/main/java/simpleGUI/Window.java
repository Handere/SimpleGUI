package simpleGUI;

import javax.swing.*;


/**
 * The root window when building the GUI.
 */
public class Window {

    /**
     * The window.
     */
    private JFrame window;

    /**
     * The default title of the window.
     */
    private final String DEFAULT_TITLE = "SimpleGUI";

    /**
     * The default height of the window, in pixels.
     */
    private final int DEFAULT_HEIGHT_IN_PIXELS = 500;

    /**
     * The default width of the window, in pixels.
     */
    private final int DEFAULT_WIDTH_IN_PIXELS = 500;

    /**
     * The attached menu, if added.
     */
    private Menu menu;

    /**
     * The attached frame, if added.
     */
    private Frame frame;

    /**
     * Create an empty window.
     * Width and height is by default 500x500px, and default title.
     */
    public Window() {
        this.window = new JFrame(DEFAULT_TITLE);
        setSize(DEFAULT_WIDTH_IN_PIXELS, DEFAULT_HEIGHT_IN_PIXELS);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        setDefaultIcon();
    }

    /**
     * Create an empty window with a chosen title.
     * Width and height is by default 500x500px.
     * @param title The title of the window.
     */
    public Window(String title) {
        this.window = new JFrame(title);
        setSize(DEFAULT_WIDTH_IN_PIXELS, DEFAULT_HEIGHT_IN_PIXELS);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        setDefaultIcon();
    }

    /**
     * Create an empty window with chosen height and width.
     * Default title.
     * @param heightInPixels The height of the window in pixels.
     * @param widthInPixels The width of the window in pixels.
     */
    public Window(int heightInPixels, int widthInPixels) {
        this.window = new JFrame(DEFAULT_TITLE);
        setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        setDefaultIcon();
    }

    /**
     * Create an empty window with a chosen title, height and width.
     * @param title The title of the window.
     * @param heightInPixels The height of the window in pixels.
     * @param widthInPixels The width of the window in pixels.
     */
    public Window(String title, int heightInPixels, int widthInPixels) {
        this.window = new JFrame(title);
        setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        setDefaultIcon();
    }

    /**
     * Set the window height.
     * @param heightInPixels The height of the window in pixels.
     */
    public void setHeight(int heightInPixels) {
        window.setSize(window.getWidth(), heightInPixels);
    }

    /**
     * Set the window width.
     * @param widthInPixels The width of the window in pixels.
     */
    public void setWidth(int widthInPixels){
        window.setSize(widthInPixels, window.getHeight());
    }

    /**
     * Set the window width and height.
     * @param widthInPixels The width of the window in pixels.
     * @param heightInPixels The height of the window in pixels.
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
     * Add a frame to the window.
     * @return The frame
     */
    public Frame addFrame(){
        return frame = new Frame(this);
    }

    /**
     * @return The frame.
     * @throws NullPointerException If no frame is added
     */
    public Frame getFrame() throws NullPointerException {
        if (frame == null) {
            throw new NullPointerException("No Frame added.");
        }
        else {
            return frame;
        }
    }

    /**
     * Add a menu to the window that is placed horizontal at the top of the window.
     * @return The menu
     */
    public Menu addMenu(){
        return menu = new Menu(this);
    }

    /**
     * @return The menu
     * @throws NullPointerException If no menu is added
     */
    public Menu getMenu() throws NullPointerException{
        if (menu == null) {
            throw new NullPointerException("No Menu added.");
        }
        else {
            return menu;
        }
    }

    /**
     * Set default window icon.
     */
    private void setDefaultIcon() {
        ImageIcon icon = new ImageIcon("SG.png");
        window.setIconImage(icon.getImage());
    }

    /**
     * @return The window.
     */
    JFrame getWindow() {
        return window;
    }
}
