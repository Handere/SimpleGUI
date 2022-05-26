package simpleGUI.components;

import simpleGUI.Frame;

/**
 * A digital or analog clock.
 */
public class Clock {

    /**
     * {@link Frame}
     */
    private Frame owner;

    /**
     * Define if the clock should be displayed as digital (true) or analog (false).
     */
    private boolean digitalView = true;

    /**
     * The default height in pixels.
     */
    private final int DEFAULT_HEIGHT_IN_PIXELS = 50;

    /**
     * The default width in pixels.
     */
    private final int DEFAULT_WIDTH_IN_PIXELS = 100;

    /**
     * Create a clock.
     */
    Clock() {

    }

    /**
     * Create a clock.
     * @param owner {@link Frame}
     */
    public Clock(Frame owner) {
        this.owner = owner;
    }

    /**
     * Create a clock with digital/analog view.
     * @param owner {@link Frame}
     * @param digitalView Define if the clock is displayed as digital (true) or analog (false).
     */
    public Clock(Frame owner, boolean digitalView) {
        this.owner = owner;
        this.digitalView = digitalView;
    }

    /**
     * Create a clock with custom size and digital/analog view.
     * @param owner The Frame that hold the Clock.
     * @param digitalView Define if the clock should be displayed as digital (true) or analog (false).
     * @param heightInPixels The height of the Clock in pixels.
     * @param widthInPixels The width of the Clock in pixels.
     */
    public Clock(Frame owner, boolean digitalView, int heightInPixels, int widthInPixels) {
        this.owner = owner;
        this.digitalView = digitalView;
    }

    /**
     * Set the owner frame.
     * @param owner {@link Frame}
     */
    public void setOwner(Frame owner) {
        this.owner = owner;
    }

    /**
     * @return Define if the clock is displayed as digital (true) or analog (false).
     */
    public boolean isDigitalView() {
        return digitalView;
    }

    /**
     * @param digitalView Define if the clock is displayed as digital (true) or analog (false).
     */
    public void setDigitalView(boolean digitalView) {
        this.digitalView = digitalView;
    }

    /**
     * @param heightInPixels The height of the clock in pixels.
     */
    public void setHeightInPixels(int heightInPixels) { }

    /**
     * @param widthInPixels The width of the clock in pixels.
     */
    public void setWidthInPixels(int widthInPixels) { }
}
