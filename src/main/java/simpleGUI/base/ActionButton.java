package simpleGUI.base;

import simpleGUI.scene.controls.Button;

public class ActionButton implements Button {
    String buttonName;
    Frame owner;

    public ActionButton(Frame owner, String buttonName) {
        this.buttonName = buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
