import simpleGUI.NavigationButton;
import simpleGUI.TextBox;
import simpleGUI.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

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
        NavigationButton navigationButton1 = window.navigationBar().addNavigationButton("hello");
        NavigationButton navigationButton2 = window.navigationBar().addNavigationButton("what?");
        NavigationButton navigationButton3 = window.navigationBar().addNavigationButton("wtf?");
        window.getFrame().addLabel().setSize(4,4,60,50);
        TextBox textBox = window.getFrame().addTextBox();
        textBox.setSize(40, 40, 20, 20);

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
