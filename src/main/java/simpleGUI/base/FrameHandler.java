package simpleGUI.base;

public class FrameHandler {
    Window owner;

    public FrameHandler(Window owner) {
        this.owner = owner;
    }

    public Frame frame0() {
        /**
         * Return the first frame in the specified window.
         */
        return owner.frames.get(0);
    }
    public Frame frame1() {
        /**
         * Return the second frame in the specified window.
         */
        return owner.frames.get(0);
    }
    public Frame frame2() {
        /**
         * Return the third frame in the specified window.
         */
        return owner.frames.get(0);
    }
    public Frame frame3() {
        /**
         * Return the fourth frame in the specified window.
         */
        return owner.frames.get(0);
    }
}
