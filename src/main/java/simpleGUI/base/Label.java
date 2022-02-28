package simpleGUI.base;

public class Label {
    String title;
    Frame owner;

    public Label(Frame owner) {
        this.owner = owner;
    }

    public Label(Frame owner, String title) {
        this.title = title;
        this.owner = owner;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
