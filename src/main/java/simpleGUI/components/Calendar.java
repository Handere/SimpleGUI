package simpleGUI.components;

import simpleGUI.Frame;

import java.util.HashMap;

/**
 * A calendar that hold calendar events.
 */
public class Calendar {

    /**
     * The owner frame of the calendar.
     * {@link Frame}
     */
    private Frame owner;

    /**
     * The default height in pixels.
     */
    private final int DEFAULT_HEIGHT_IN_PIXELS = 500;

    /**
     * The default width in pixels.
     */
    private final int DEFAULT_WIDTH_IN_PIXELS = 500;

    /**
     * HashMap that hold all calendar events, where the key is datetime: "yyyy'-'MM'-'dd'T'HH':'mm':'ss".
     */
    HashMap<String, CalendarEvent> calenderEvents = new HashMap<>();

    /**
     * Create an empty calendar.
     * @param owner {@link Frame}.
     */
    public Calendar(Frame owner) {
        this.owner = owner;
    }

    /**
     * Create a calendar with custom size.
     * @param owner {@link Frame}
     * @param heightInPixels The height in pixels.
     * @param widthInPixels The width in pixels.
     */
    public Calendar(Frame owner, int heightInPixels, int widthInPixels) {
        this.owner = owner;
    }

    /**
     * Add a calendar event to the calendar.
     * @param calendarEvent {@link CalendarEvent}
     */
    public void addCalendarEvent(CalendarEvent calendarEvent) {
        calenderEvents.put(calendarEvent.datetime, calendarEvent);
    }

    /**
     * Remove a calendar event from the calendar.
     * @param calendarEvent {@link CalendarEvent}
     */
    public void removeCalendarEvent(CalendarEvent calendarEvent) {
        calenderEvents.remove(calendarEvent.datetime, calendarEvent);
    }

    /**
     * Get the owner frame.
     * @return {@link Frame}
     */
    public Frame getOwner() {
        return owner;
    }

    /**
     * Set the height in pixels
     * @param heightInPixels The height in pixels.
     */
    public void setHeightInPixels(int heightInPixels) { }

    /**
     * Set the with in pixels.
     * @param widthInPixels The width in pixels.
     */
    public void setWidthInPixels(int widthInPixels) { }
}
