package simpleGUI.base;

import simpleGUI.scene.controls.Button;

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
    public ActionButton addActionButton(String buttonName){
        /**
         * Add an action button to the frame, with the specified button name.
         * Return the created button.
         */
        return new ActionButton(this, buttonName);
    }
    public Label addLabel(){
        /**
         * Add a label to the frame, without a title.
         * Return the created label.
         */
        return new Label(this);
    }
    public Label addLabel(String title){
        /**
         * Add a label to the frame, with the specified title.
         * Return the created label.
         */
        return new Label(this, title);
    }
    public TextBox addTextBox(String title, String content) {
        /**
         * Add a Textbox to the frame, with a title and content in the textBox.
         */
        return new TextBox(this, title, content);
    }
    public TextBox addTextBox(String title) {
        /**
         * Add a Textbox to the frame, with a title and no content in the textBox.
         */
        return new TextBox(this, title);
    }
}
