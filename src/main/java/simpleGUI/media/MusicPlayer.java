package simpleGUI.media;

import simpleGUI.Frame;

/**
 * A music player that can be attached to a Frame.
 */
public class MusicPlayer {

    /**
     * The Frame that hold the MusicPlayer.
     */
    Frame owner;
    /**
     * The filepath to the source file.
     */
    String source;
    /**
     * The height of the MusicPlayer in pixels.
     */
    int heightInPixels;
    /**
     * The width of the MusicPlayer in pixels.
     */
    int widthInPixels;

    /**
     * Define if the MusicPlayer is currently playing music.
     */
    boolean playing = false;

    /**
     * Constructor.
     * Create an empty MusicPlayer that is not connected to an owner frame, and do not have a size.
     */
    public MusicPlayer() {
    }

    /**
     * Constructor.
     * Setting the height to 100px and width to 150px by default.
     * @param owner The Frame that hold the MusicPlayer.
     * @param source The filepath to the source file.
     */
    public MusicPlayer(Frame owner, String source) {
        this.owner = owner;
        this.source = source;
        heightInPixels = 100;
        widthInPixels = 150;
    }

    /**
     * Constructor.
     * @param owner The Frame that hold the MusicPlayer.
     * @param source The filepath to the source file.
     * @param heightInPixels The height of the MusicPlayer in pixels.
     * @param widthInPixels The width of the MusicPlayer in pixels.
     */
    public MusicPlayer(Frame owner, String source, int heightInPixels, int widthInPixels) {
        this.owner = owner;
        this.source = source;
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
    }

    /**
     * Connect the MusicPlayer to a Frame owner, making it display in the Frame.
     * @param owner The Frame that hold the MusicPlayer.
     */
    public void setOwner(Frame owner) {
        this.owner = owner;
    }

    /**
     * @return The filepath to the source file, as a String.
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source The filepath to the source file.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The height of the MusicPlayer in pixels.
     */
    public int getHeightInPixels() {
        return heightInPixels;
    }

    /**
     * @param heightInPixels The height of the MusicPlayer in pixels.
     */
    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    /**
     * @return The width of the MusicPlayer in pixels.
     */
    public int getWidthInPixels() {
        return widthInPixels;
    }

    /**
     * @param widthInPixels The width of the MusicPlayer in pixels.
     */
    public void setWidthInPixels(int widthInPixels) {
        this.widthInPixels = widthInPixels;
    }

    /**
     * @return Define if the MusicPlayer is currently playing music.
     */
    public boolean isPlaying() {
        return playing;
    }

    /**
     * @param playing Define if the MusicPlayer is currently playing music.
     */
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
