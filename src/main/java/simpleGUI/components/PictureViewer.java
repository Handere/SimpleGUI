package simpleGUI.components;

import simpleGUI.Frame;

/**
 * A picture viewer that can be attached to a Frame.
 */
public class PictureViewer {

    /**
     * The Frame that hold the PictureViewer.
     */
    Frame owner;
    /**
     * The filepath to the source file.
     */
    String source;
    /**
     * The height of the PictureViewer in pixels.
     */
    int heightInPixels;
    /**
     * The width of the PictureViewer in pixels.
     */
    int widthInPixels;

    /**
     * Constructor.
     * Create an empty PictureViewer that is not connected to an owner frame, and do not have a size.
     */
    public PictureViewer() {
    }

    /**
     * Constructor.
     * Setting the height to 300px and width to 500px by default.
     * @param owner The Frame that hold the PictureViewer.
     * @param source The filepath to the source file.
     */
    public PictureViewer(Frame owner, String source) {
        this.owner = owner;
        this.source = source;
        heightInPixels = 300;
        widthInPixels = 500;
    }

    /**
     * Constructor.
     * @param owner The Frame that hold the PictureViewer.
     * @param source The filepath to the source file.
     * @param heightInPixels The height of the PictureViewer in pixels.
     * @param widthInPixels The width of the PictureViewer in pixels.
     */
    public PictureViewer(Frame owner, String source, int heightInPixels, int widthInPixels) {
        this.owner = owner;
        this.source = source;
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
    }

    /**
     * @return The Frame that hold the PictureViewer.
     */
    public Frame getOwner() {
        return owner;
    }

    /**
     * @param owner The Frame that hold the PictureViewer.
     */
    public void setOwner(Frame owner) {
        this.owner = owner;
    }

    /**
     * @return The filepath to the source file.
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source The filepath to the source file.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The height of the PictureViewer in pixels.
     */
    public int getHeightInPixels() {
        return heightInPixels;
    }

    /**
     * @param heightInPixels The height of the PictureViewer in pixels.
     */
    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    /**
     * @return The width of the PictureViewer in pixels.
     */
    public int getWidthInPixels() {
        return widthInPixels;
    }

    /**
     * @param widthInPixels The width of the PictureViewer in pixels.
     */
    public void setWidthInPixels(int widthInPixels) {
        this.widthInPixels = widthInPixels;
    }
}
