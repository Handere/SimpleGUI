package simpleGUI.components;

import simpleGUI.Frame;

/**
 * A music player
 */
public class MusicPlayer {

    /**
     * The owner frame of the music player.
     * {@link Frame}
     */
    private Frame owner;

    /**
     * The filepath to the source file.
     */
    private String source;

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
    private boolean playing = false;

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
     * Get the owner frame.
     * @return {@link Frame}
     */
    public Frame getOwner() {
        return owner;
    }

    /**
     * Get the filepath to the source file.
     * @return The filepath to the source file, as a String.
     */
    public String getSource() {
        return source;
    }

    /**
     * Set the filepath to the source file.
     * @param source The filepath to the source file.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Get if the music player is currently playing.
     * @return Define if the music player is currently playing music.
     */
    public boolean isPlaying() {
        return playing;
    }

    /**
     * Set if the music player is currently playing.
     * @param playing Define if the music player is currently playing music.
     */
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
