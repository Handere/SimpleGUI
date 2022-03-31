import simpleGUI.MenuButton;
import simpleGUI.MultiLineTextBox;
import simpleGUI.Window;

/**
 * Test main
 */
public class Main {
    /**
     * @param args test
     */
    public static void main(String[] args) {
        Window window = new Window();
        window.addFrame();
        window.getFrame().addActionButton("hello");
        window.addNavigationBar();
        MenuButton menuButton1 = window.navigationBar().addNavigationButton("hello");
        MenuButton menuButton2 = window.navigationBar().addNavigationButton("what?");
        MenuButton menuButton3 = window.navigationBar().addNavigationButton("wtf?");
        window.getFrame().addLabel().setSize(4,4,60,50);
        MultiLineTextBox multiLineTextBox = window.getFrame().addTextBox();
        multiLineTextBox.setSize(40, 40, 20, 20);

        //window.addScrollbar1();
        //window.addScrollbar(true, true);
        window.build();
       /* Window window = new Window();
        window.setSize(300, 600);
        //window.addScrollbar(true, true);
        //window.addFrame();
        window.addScrollbar1();
        window.build();*/


    }
}
