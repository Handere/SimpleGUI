package simpleGUI;

import com.sun.jdi.request.DuplicateRequestException;

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
     * Create the window.
     * @param title The window title.
     * @param width The window width.
     * @param height The window height.
     */
    Window(String title, int width, int height) {
        this.window = new JFrame(title);
        setSize(width, height);
        this.window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);

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
     * @throws DuplicateRequestException If frame is already added.
     */
    public Frame addFrame() throws DuplicateRequestException {
        if (frame != null) {
            throw new DuplicateRequestException("A Frame already exist.");
        }
        else {
            return frame = new Frame(this);
        }
    }

    /**
     * Get the frame attached to the window.
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
     * Set the window title.
     * @param title The window title.
     */
    void setTitle(String title) {
        window.setTitle(title);
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
