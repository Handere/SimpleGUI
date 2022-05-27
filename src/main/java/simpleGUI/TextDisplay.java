package simpleGUI;

/**
 * A text display.
 */
public interface TextDisplay {

    /**
     * Set the coordinates, width and height.
     * @param x X-coordinate for top left corner.
     * @param y Y-coordinate for top left corner.
     * @param width The width of the multi line text box.
     * @param height The height of the multi line text box.
     */
    void setSize(int x, int y, int width, int height);
}
