package simpleGUI.components;

import simpleGUI.Frame;

/**
 * A picture viewer.
 */
public class PictureViewer {

    /**
     * The owner frame.
     * {@link Frame}
     */
    private Frame owner;

    /**
     * The filepath to the source file.
     */
    private String source;

    /**
     * The default height in pixels.
     */
    private final int DEFAULT_HEIGHT_IN_PIXELS = 300;

    /**
     * The default width in pixels.
     */
    private final int DEFAULT_WIDTH_IN_PIXELS = 400;

    /**
     * Create a picture viewer with custom source.
     * @param owner {@link Frame}
     * @param source The filepath to the source file.
     */
    public PictureViewer(Frame owner, String source) {
        this.owner = owner;
        this.source = source;
    }

    /**
     * Create a picture viewer with custom source, height and width.
     * @param owner {@link Frame}
     * @param source The filepath to the source file.
     * @param heightInPixels The height in pixels.
     * @param widthInPixels The width in pixels.
     */
    public PictureViewer(Frame owner, String source, int heightInPixels, int widthInPixels) {
        this.owner = owner;
        this.source = source;
    }

    /**
     * Get the owner frame.
     * @return {@link Frame}
     */
    public Frame getOwner() {
        return owner;
    }

    /**
     * Set the owner frame.
     * @param owner {@link Frame}
     */
    public void setOwner(Frame owner) {
        this.owner = owner;
    }

    /**
     * Get the source filepath.
     * @return The filepath to the source file.
     */
    public String getSource() {
        return source;
    }

    /**
     * Set the source filepath.
     * @param source The filepath to the source file.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Set the height in pixels.
     * @param heightInPixels The height in pixels.
     */
    public void setHeightInPixels(int heightInPixels) { }

    /**
     * Set the width in pixels.
     * @param widthInPixels The width in pixels.
     */
    public void setWidthInPixels(int widthInPixels) { }
}
