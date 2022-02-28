package simpleGUI.base;

import simpleGUI.scene.controls.Button;

public class NavigationButton implements Button {
    Window targetWindow;
    String buttonName;

    public NavigationButton() {
    }

    public NavigationButton(Window targetWindow, String buttonName) {
        this.targetWindow = targetWindow;
        this.buttonName = buttonName;
    }

    public void setTargetWindow(Window targetWindow) {
        this.targetWindow = targetWindow;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
