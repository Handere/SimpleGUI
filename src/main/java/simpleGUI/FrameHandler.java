package simpleGUI;

/**
 * Handle the frames attached to a window.
 */
public class FrameHandler {
    /**
     * The Window to the attached frames to handle.
     */
    Window owner;

    /**
     * Constructor.
     * @param owner The Window to the attached frames to handle.
     */
    public FrameHandler(Window owner) {
        this.owner = owner;
    }

    /**
     * Return the first Frame, if already added.
     * @return Frame
     */
    public Frame frame0() {
        return owner.frames.get(0);
    }

    /**
     * Return the second Frame, if already added.
     * @return Frame
     */
    public Frame frame1() {
        return owner.frames.get(0);
    }

    /**
     * Return the third Frame, if already added.
     * @return Frame
     */
    public Frame frame2() {
        return owner.frames.get(0);
    }

    /**
     * Return the fourth Frame, if already added.
     * @return Frame
     */
    public Frame frame3() {
        return owner.frames.get(0);
    }
}
