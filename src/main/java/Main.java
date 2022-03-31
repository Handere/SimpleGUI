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

        MultiLineTextBox multiLineTextBox = window.getFrame().addMultiLineTextBox("vhsdfhjgsdfjhgsdf", true, "Hei");
        window.getFrame().addActionButton();


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
