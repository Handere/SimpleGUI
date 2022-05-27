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
        eventButton.showAndHideTextDisplayEvent(singleLineTextLabel);

        MultiLineTextBox multiLineTextBox = new MultiLineTextBox(frame, "hei hei");
        EventButton eventButton1 = new EventButton(frame, "hide even more");
        eventButton1.showAndHideTextDisplayEvent(multiLineTextBox);

        Menu menu = new Menu(window);
        MenuButton menuButton = menu.addMenuButton("window");



        Window window1 = new WindowBuilder()
                .isVisible(false)
                .build();

        Frame frame1 = new FrameBuilder(window1)
                .build();

        Menu menu1 = new Menu(window1);
        MenuButton menuButton1 = menu1.addMenuButton("window1");

        EventButton eventButton2 = new EventButton(frame1, "show it");

        DialogBox dialogBox = new DialogBox(window1, "Hallo!", DialogBox.DialogBoxType.OPTION);

        eventButton2.showDialogBox(dialogBox);

        menuButton1.navigateBetweenWindowsEvent(window1, window);

        menuButton.navigateBetweenWindowsEvent(window, window1);

    }
}
