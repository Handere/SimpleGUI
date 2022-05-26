import simpleGUI.*;
import simpleGUI.utilities.Validation;

public class Main {
    public static void main(String[] args) {
//        Window window = new WindowBuilder()
//                .withCustomTitle("Gruppe")
//                .withMenu()
//                .withMenuButton("Fil")
//                .withCustomSize(800, 600)
//                .withMenuButton("hei")
//                .build();
//
//        Frame frame = new FrameBuilder(window)
//                .withEventButton("test")
//                .build();
//
//        SingleLineTextLabel singleLineTextLabel = new SingleLineTextLabel(frame, "Hello");
//        EventButton eventButton = new EventButton(frame, "hide the shit");
//        eventButton.showAndHideTextEvent(singleLineTextLabel);
//
//        MultiLineTextBox multiLineTextBox = new MultiLineTextBox(frame, "hei hei");
//        EventButton eventButton1 = new EventButton(frame, "hide even more");
//        eventButton1.showAndHideTextEvent(multiLineTextBox);
//
//        Menu menu = new Menu(window);
//        MenuButton menuButton = menu.addMenuButton("window");
//
//
//
//        Window window1 = new WindowBuilder()
//                .isVisible(false)
//                .build();
//
//        Menu menu1 = new Menu(window1);
//        MenuButton menuButton1 = menu1.addMenuButton("window1");
//
//        menuButton1.navigateBetweenWindowsEvent(window1, window);
//
//        menuButton.navigateBetweenWindowsEvent(window, window1);

        String check = "1236547";



        System.out.println( Validation.checkIfPhoneNumber(check));

        String temp = "213&23";

        System.out.println(Validation.checkIfDigitsAndWhitespaceOnly(temp));
    }
}
