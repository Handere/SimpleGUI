package simpleGUI;

/**
 * A window builder.
 */
public class WindowBuilder {

    /**
     * {@link Window}
     */
    private Window window;

    /**
     * The default window title.
     */
    private final String DEFAULT_TITLE = "SimpleGUI";

    /**
     * The default window height.
     */
    private final int DEFAULT_HEIGHT = 500;

    /**
     * The default window width.
     */
    private int DEFAULT_WIDTH = 600;

    /**
     * Build a window.
     */
    public WindowBuilder() {
        start();
    }

    /**
     * Create the base window.
     * @return {@link WindowBuilder}
     */
    private WindowBuilder start() {
        this.window = new Window(DEFAULT_TITLE, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        return this;
    }

    /**
     * Add a custom title.
     * @param title The window title.
     * @return {@link WindowBuilder}
     */
    public WindowBuilder withCustomTitle(String title) {
        this.window.setTitle(title);
        return this;
    }

    /**
     * Add custom with and height.
     * @param heightInPixels The window height.
     * @param widthInPixels The window width.
     * @return {@link WindowBuilder}
     */
    public WindowBuilder withCustomSize(int heightInPixels, int widthInPixels) {
        this.window.setSize(widthInPixels, heightInPixels);
        return this;
    }

    /**
     * Add a menu.
     * @return {@link WindowBuilder}
     */
    public WindowBuilder withMenu() {
        this.window.addMenu();
        return this;
    }

    /**
     * Add a menu button to the menu.
     * @param name The button name.
     * @return {@link WindowBuilder}
     */
    public WindowBuilder withMenuButton(String name) {
        this.window.getMenu().addMenuButton(name);
        return this;
    }

    /**
     * Build the window with specified options.
     * @return {@link Window}
     */
    public  Window build() {
        return window;
    }
}
