package simpleGUI;

import javax.swing.*;


/**
 * The root window when building the GUI.
 */
public class Window {

    /**
     * The internal window.
     */
    private JFrame window;

    /**
     * The attached menu, if added.
     */
    private Menu menu;

    /**
     * The attached frame, if added.
     */
    private Frame frame;

    /**
     * The window builder.
     */
    public static class WindowBuilder {
        private String title = "SimpleGUI";
        private int height = 500;
        private int width = 600;
        private Frame frame;

        /**
         * Build a window.
         */
        public WindowBuilder() {

        }

        /**
         * Add a custom title.
         * @param title The window title.
         * @return {@link WindowBuilder}
         */
        public WindowBuilder withCustomTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Add custom with and height.
         * @param heightInPixels The window height.
         * @param widthInPixels The window width.
         * @return {@link WindowBuilder}
         */
        public WindowBuilder withCustomSize(int heightInPixels, int widthInPixels) {
            this.height = heightInPixels;
            this.width = widthInPixels;
            return this;
        }

        /**
         * Build the window with specified options.
         * @return {@link WindowBuilder}
         */
        public  Window build() {
            return new Window(this);
        }
    }

    /**
     * Build a window with specified options.
     * @param windowBuilder {@link WindowBuilder}
     */
    public Window(WindowBuilder windowBuilder) {
        this.window = new JFrame(windowBuilder.title);
        setSize(windowBuilder.width, windowBuilder.height);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        setDefaultIcon();
        build();
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
     * @return {@link Frame}
     */
    public Frame addFrame(){
        return frame = new Frame(this);
    }

    /**
     * @return {@link Frame}
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
     * @return {@link Menu}
     */
    public Menu addMenu(){
        return menu = new Menu(this);
    }

    /**
     * @return {@link Menu}
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
     * @return The internal window.
     */
    JFrame getWindow() {
        return window;
    }
}
