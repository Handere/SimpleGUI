package simpleGUI;

import simpleGUI.base.Window;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        Window window1 = new Window();
        window.addNavigationBar().addNavigationButton(window1, "Kul knapp");
        window.navigationBar().addBreadCrumbs();
        window.navigationBar().placeNavigationBar().top();
        window.setHeight(500);
        window.setWidth(500);
        window.addScrollbar().placeScrollbar().left();
        window.scrollbar().setScrollbarDirection().vertical();
    }
}
