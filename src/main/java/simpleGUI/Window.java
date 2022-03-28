package simpleGUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Functions as a root when building the GUI.
 */
public class Window {

    /**
     * The window.
     */
    JFrame window;

    /**
     * The window title.
     */
    String title = "SimpleGUI";

    /**
     * The default height of the window, in pixels.
     */
    private int heightInPixels = 500;
    /**
     * The default width of the window, in pixels.
     */
    private int widthInPixels = 500;

    /**
     * The attached Scrollbar, if added.
     */
    private Scrollbar scrollbar;
    /**
     * The attached NavigationBar, if added.
     */
    private NavigationBar navigationBar;
    /**
     * The attached Frames, if added.
     */
    protected Frame frame;

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * Width and height is by default 500x500px.
     */
    public Window() {
        this.window = new JFrame(title);
        window.setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * Width and height is by default 500x500px.
     */
    public Window(String title) {
        this.window = new JFrame(title);
        this.title = title;
        window.setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * @param title Set the title of the window.
     * @param heightInPixels Set the height of the window in pixels.
     * @param widthInPixels Set the width of the window in pixels.
     *
     */
    public Window(String title, int heightInPixels, int widthInPixels) {
        this.window = new JFrame(title);
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
        this.title = title;
        window.setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Constructor.
     * Create an empty window without a Frame.
     * @param heightInPixels Set the height of the window in pixels.
     * @param widthInPixels Set the width of the window in pixels.
     *
     */
    public Window(int heightInPixels, int widthInPixels) {
        this.window = new JFrame(title);
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
        window.setSize(widthInPixels, heightInPixels);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }

    /**
     * Set the window height.
     * @param heightInPixels Set the height of the window in pixels.
     */
    public void setHeight(int heightInPixels) {
        this.heightInPixels = heightInPixels;
        window.setSize(widthInPixels, heightInPixels);
    }

    /**
     * Set the window width.
     * @param widthInPixels Set the width of the window in pixels.
     */
    public void setWidth(int widthInPixels){
        this.widthInPixels = widthInPixels;
        window.setSize(widthInPixels, heightInPixels);
    }

    /**
     * Set the window width and height.
     * @param widthInPixels Set the width of the window in pixels.
     * @param heightInPixels Set the height of the window in pixels.
     */
    public void setSize(int widthInPixels, int heightInPixels){
        this.widthInPixels = widthInPixels;
        this.heightInPixels = heightInPixels;
        window.setSize(widthInPixels, heightInPixels);
    }

    /**
     * Build the components of the window, making it visible as an application.
     */
    public void build() {
        window.setVisible(true);
    }

    /**
     * Add a new frame to the window, to a maximum of four frames.
     * When a second frame is added it will split the available space vertical, and place itself to the right of the
     * first. Third is placed on the bottom, and fourth will split the bottom and place itself bottom right.
     * @return new Frame
     */
    public Frame addFrame(){
        return frame = new Frame(this);
    }

    /**
     * @return The Frame attached to the Window.
     */
    public Frame getFrame() {
        return frame;
    }

    /**
     * Add a scrollbar that by default is placed on the right of the window, with vertical scrolling.
     * @return new Scrollbar
     */
    public Scrollbar addScrollbar() {
        return scrollbar = new Scrollbar(this);
    }

    /**
     * Add a scrollbar that by default is placed on the right of the window, with vertical scrolling.
     * @param alwaysShowVertical Set the vertical scrollbar to always visible if true, and if needed when false.
     * @param alwaysShowHorizontal Set the horizontal scrollbar to always visible if true, and if needed when false.
     * @return new Scrollbar
     */
    public Scrollbar addScrollbar(boolean alwaysShowVertical, boolean alwaysShowHorizontal) {
        return scrollbar = new Scrollbar(this, alwaysShowVertical, alwaysShowHorizontal);
    }

    /**
     * Return the scrollbar attached to the window.
     * @return Scrollbar
     */
    public Scrollbar scrollbar() {
        return scrollbar;
    }

    /**
     * Add a NavigationBar to the window that by default is placed horizontal at the top of the window.
     * @return new NavigationBar
     */
    public NavigationBar addNavigationBar(){
        return navigationBar = new NavigationBar(this);
    }

    /**
     * Return the NavigationBar attached to the window.
     * @return NavigationBar
     */
    public NavigationBar navigationBar(){
        return navigationBar;
    }

    public void addScrollbar1() {
        window.getContentPane().setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        panel.setBounds(50,50,300,300);
        panel.setSize(150, 300);
        panel.setBackground(Color.red);
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        window.getContentPane().add(scrollPane);
    }
}
