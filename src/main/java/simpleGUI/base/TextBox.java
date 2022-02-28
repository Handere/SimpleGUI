package simpleGUI.base;

public class TextBox {
    String title;
    String content;
    Frame owner;

    public TextBox(Frame owner, String title) {
        this.title = title;
        this.owner = owner;
    }

    public TextBox(Frame owner, String title, String content){
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
