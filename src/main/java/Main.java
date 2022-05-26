import simpleGUI.*;

public class Main {
    public static void main(String[] args) {
        Window window = new WindowBuilder()
                .withCustomTitle("Gruppe")
                .withMenu()
                .withMenuButton("Fil")
                .withCustomSize(800, 600)
                .withMenuButton("hei")
                .build();

        Frame frame = new FrameBuilder(window)
                .withEventButton("test")
                .build();

        SingleLineTextLabel singleLineTextLabel = new SingleLineTextLabel(frame, "Hello");
        EventButton eventButton = new EventButton(frame, "hide the shit");
        eventButton.showAndHideTextEvent(singleLineTextLabel);

        MultiLineTextBox multiLineTextBox = new MultiLineTextBox(frame, "hei hei");
        EventButton eventButton1 = new EventButton(frame, "hide even more");
        eventButton1.showAndHideTextEvent(multiLineTextBox);


        Window window1 = new WindowBuilder()
                .build();





    }
}
