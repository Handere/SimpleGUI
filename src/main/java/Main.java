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
        window.setSize(300, 600);
        //window.addScrollbar(false, true);
        window.addFrame();
        window.build();
    }
}
