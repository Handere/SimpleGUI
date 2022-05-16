package simpleGUI.utilities;

import simpleGUI.Frame;

/**
 * The music player
 */
public class MusicPlayer {

    /**
     * The owner frame og the music player.
     */
    Frame owner;

    /**
     * The filepath to the source file.
     */
    String source;

    /**
     * The default height, in pixels.
     */
    private final int HEIGHT_IN_PIXELS = 100;

    /**
     * The default width, in pixels.
     */
    private final int WIDTH_IN_PIXELS = 150;

    /**
     * Define if the music player is currently playing music.
     */
    boolean playing = false;

    /**
     * Create an empty music player that is not connected to an owner frame.
     * Default height and width.
     */
    public MusicPlayer() {
    }

    /**
     * Create an empty music player attached to a chosen frame.
     * @param owner The frame the music player is attached to.
     * @param source The filepath to the source file.
     */
    public MusicPlayer(Frame owner, String source) {
        this.owner = owner;
        this.source = source;
    }

    /**
     * @return The frame that hold the music player.
     */
    public Frame getOwner() {
        return owner;
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
     * @return Define if the music player is currently playing music.
     */
    public boolean isPlaying() {
        return playing;
    }

    /**
     * @param playing Define if the music player is currently playing music.
     */
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
