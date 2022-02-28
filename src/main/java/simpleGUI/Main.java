package simpleGUI;

import simpleGUI.base.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        Frame frame0 = window.addFrame();
        Frame frame1 = window.addFrame();
        Frame frame2 = window.addFrame();

        frame0.placeFrame().topLeft();
        frame1.placeFrame().topRight();
        frame2.placeFrame().bottom();

        Label label0 = frame0.addLabel();
        Label label1 = frame1.addLabel();
        Label label2 = frame2.addLabel();

        label0.setTitle("Frame0");
        label1.setTitle("Frame1");
        label2.setTitle("Frame2");

        window.build();



        window.addFrame();
        window.frame().frame0().placeFrame().topLeft();
        window.addFrame();
        window.frame().frame1().placeFrame().topRight();
        window.addFrame();
        window.frame().frame2().placeFrame().bottom();

        window.frame().frame0().addLabel("Frame 0");
        window.frame().frame1().addLabel("Frame 1");
        window.frame().frame2().addLabel("Frame 2");

        window.build();

    }
}
