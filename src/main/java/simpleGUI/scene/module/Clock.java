package simpleGUI.scene.module;

import simpleGUI.Frame;

/**
 * A clock that can be attached to a Frame.
 */
public class Clock {

    /**
     * The Frame that hold the Clock.
     */
    Frame owner;
    /**
     * Define if the clock should be displayed as digital (true) or analog (false).
     */
    boolean digitalView = true;
    /**
     * The height of the Clock in pixels.
     */
    int heightInPixels;
    /**
     * The width of the Clock in pixels.
     */
    int widthInPixels;

    /**
     * Constructor.
     * Create an empty PictureViewer that is not connected to an owner frame, and do not have a size.
     */
    public Clock() {
    }

    /**
     * Constructor.
     * Setting the height to 150px and width to 150px by default, and the view as digital.
     * @param owner The Frame that hold the Clock.
     */
    public Clock(Frame owner) {
        this.owner = owner;
        heightInPixels = 150;
        widthInPixels = 150;
    }

    /**
     * Constructor.
     * Setting the height to 150px and width to 150px by default.
     * @param owner The Frame that hold the Clock.
     * @param digitalView Define if the clock should be displayed as digital (true) or analog (false).
     */
    public Clock(Frame owner, boolean digitalView) {
        this.owner = owner;
        this.digitalView = digitalView;
        heightInPixels = 150;
        widthInPixels = 150;
    }

    /**
     * Constructor.
     * @param owner The Frame that hold the Clock.
     * @param digitalView Define if the clock should be displayed as digital (true) or analog (false).
     * @param heightInPixels The height of the Clock in pixels.
     * @param widthInPixels The width of the Clock in pixels.
     */
    public Clock(Frame owner, boolean digitalView, int heightInPixels, int widthInPixels) {
        this.owner = owner;
        this.digitalView = digitalView;
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
    }

    /**
     * @return The Frame that hold the Clock.
     */
    public Frame getOwner() {
        return owner;
    }

    /**
     * @param owner The Frame that hold the Clock.
     */
    public void setOwner(Frame owner) {
        this.owner = owner;
    }

    /**
     * @return Define if the clock should be displayed as digital (true) or analog (false).
     */
    public boolean isDigitalView() {
        return digitalView;
    }

    /**
     * @param digitalView Define if the clock should be displayed as digital (true) or analog (false).
     */
    public void setDigitalView(boolean digitalView) {
        this.digitalView = digitalView;
    }

    /**
     * @return The height of the Clock in pixels.
     */
    public int getHeightInPixels() {
        return heightInPixels;
    }

    /**
     * @param heightInPixels The height of the Clock in pixels.
     */
    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    /**
     * @return The width of the Clock in pixels.
     */
    public int getWidthInPixels() {
        return widthInPixels;
    }

    /**
     * @param widthInPixels The width of the Clock in pixels.
     */
    public void setWidthInPixels(int widthInPixels) {
        this.widthInPixels = widthInPixels;
    }
}
