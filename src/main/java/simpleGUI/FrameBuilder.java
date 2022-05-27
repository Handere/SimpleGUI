package simpleGUI;

import java.awt.*;

/**
 * A frame builder.
 */
public class FrameBuilder {

    /**
     * {@link Frame}
     */
    private Frame frame;

    /**
     * Build a frame.
     * @param window {@link Window}
     */
    public FrameBuilder(Window window) {
        start(window);
    }

    /**
     * Creates The base frame.
     * @param window The window.
     * @return {@link FrameBuilder}
     */
    private FrameBuilder start(Window window) {
        this.frame = new Frame(window);
        return this;
    }

    /**
     * A button with custom name.
     * @param buttonName Name to the button.
     * @return {@link FrameBuilder}
     */
    public FrameBuilder withEventButton (String buttonName) {
        frame.addEventButton(buttonName);
        return this;
    }

    /**
     * A button with custom name and sets width and height.
     * @param buttonName Name to the button.
     * @param buttonWidth Width to the button.
     * @param buttonHeight Height to the button.
     * @return {@link FrameBuilder}
     */
    public FrameBuilder withEventButtonCustomSize (String buttonName, int buttonWidth, int buttonHeight) {
        frame.addEventButton(buttonName, buttonWidth, buttonHeight);
        return this;
    }

    /**
     * A single line with text.
     * @param singleLineText A text in a single line.
     * @return {@link FrameBuilder}
     */
    public FrameBuilder withSingleLineTextLabel (String singleLineText) {
        frame.addSingleLineTextLabel(singleLineText);
        return this;
    }

    /**
     * A textbox with multiple lines.
     * @param multiLineText A textbox with multiple lines.
     * @return {@link FrameBuilder}
     */
    public FrameBuilder withMultiLineTextBox (String multiLineText) {
        frame.addMultiLineTextBox(multiLineText);
        return this;
    }

    /**
     * A textbox with multiple lines and adds a scrollbar.
     * @param multiLineText A textbox with multiple lines.
     * @param addScrollbar If true, adds a scrollbar
     * @return {@link FrameBuilder}
     */
    public FrameBuilder withMultiLineTextBoxWithScrollbar (String multiLineText, boolean addScrollbar) {
        frame.addMultiLineTextBox(multiLineText, addScrollbar);
        return this;
    }

    /**
     * A textbox with multiple lines and adds a scrollbar and title in the border.
     * @param multiLineText A textbox with multiple lines.
     * @param addScrollbar If true, adds a scrollbar.
     * @param borderTitle Adds a title in the border.
     * @return {@link FrameBuilder}
     */
    public FrameBuilder withMultiLineTextBoxWithScrollbarAndCustomBorderTitle (String multiLineText, boolean addScrollbar, String borderTitle) {
        frame.addMultiLineTextBox(multiLineText, addScrollbar, borderTitle);
        return this;
    }

    /**
     * Build the frame with specified options.
     * @return {@link Frame}
     */
    public Frame build() {
        return frame;
    }
}
