package simpleGUI;

import javax.swing.*;

/**
 * A dialog box.
 */
public class DialogBox {

    /**
     * {@link Window}
     */
    private Window owner;

    /**
     * The dialog box message.
     */
    String message;

    /**
     * The dialog box type.
     */
    DialogBoxType dialogBoxType;


    /**
     * Create a dialog box.
     * @param owner {@link Window}
     * @param message The message dialog box message.
     * @param dialogBoxType The dialog box type.
     */
    public DialogBox(Window owner, String message, DialogBoxType dialogBoxType) {
        this.owner = owner;
        this.message = message;
        this.dialogBoxType = dialogBoxType;
    }

    /**
     * Check what the dialogBoxType is and chose the corresponding case.
     */
    public void showDialogBox() {
        switch (dialogBoxType) {
            case INFO -> JOptionPane.showMessageDialog(owner.getWindow(), message);
            case WARNING -> JOptionPane.showMessageDialog(owner.getWindow(), message, "Warning", JOptionPane.WARNING_MESSAGE);
            case INPUT -> JOptionPane.showInputDialog(owner.getWindow(), message);
            case OPTION -> JOptionPane.showConfirmDialog(owner.getWindow(), message);
        }
    }

    /**
     * Options you can choose from to make a dialog box.
     */
    public enum DialogBoxType {

        /**
         * Show a dialog box with information.
         */
        INFO,

        /**
         * Show a dialog box warning information.
         */
        WARNING,

        /**
         * Show a dialog box with input.
         */
        INPUT,

        /**
         * show a dialog box with options "yes", "no" and "cancel".
         */
        OPTION
    }
}
