package simpleGUI.base;

public class Frame {
    boolean showFrame = false;
    Window owner;
    int id;

    public Frame(Window owner) {
        this.owner = owner;
    }

    public Frame(Window owner, int id) {
        this.owner = owner;
        this.id = id;
    }

    public FrameLocationHandler placeFrame() {
        /**
         * Return a FrameLocationHandler with methods that specify the possible positions;
         * .left(), .right(), .top() or .bottom().
         */
        return new FrameLocationHandler(this);
    }


}
