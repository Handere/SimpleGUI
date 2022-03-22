package simpleGUI.scene.module.calender;

import simpleGUI.Frame;

import java.util.HashMap;

/**
 * A calendar that can be attached to a Frame.
 */
public class Calendar {

    /**
     * The Frame that hold the Calendar.
     */
    Frame owner;
    /**
     * The height of the Calendar in pixels.
     */
    int heightInPixels;
    /**
     * The width of the Calendar in pixels.
     */
    int widthInPixels;
    /**
     * HashMap that hold all calendar events, where the key is datetime: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
     */
    HashMap<String, CalendarEvent> calenderEvents;

    /**
     * Constructor.
     * Create an empty Calendar that is not connected to an owner frame, and do not have a size.
     */
    public Calendar() {
    }

    /**
     * Constructor.
     * Setting the height to 500px and width to 500px by default.
     * @param owner The Frame that hold the Calendar.
     */
    public Calendar(Frame owner) {
        this.owner = owner;
        heightInPixels = 500;
        widthInPixels = 500;
    }

    /**
     * Constructor.
     * @param owner The Frame that hold the Calendar.
     * @param heightInPixels The height of the Calendar in pixels.
     * @param widthInPixels The width of the Calendar in pixels.
     */
    public Calendar(Frame owner, int heightInPixels, int widthInPixels) {
        this.owner = owner;
        this.heightInPixels = heightInPixels;
        this.widthInPixels = widthInPixels;
    }

    /**
     * Add a CalenderEvent to the calendar, on a given datetime in the format: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
     * @param calendarEvent The CalendarEvent to be added.
     */
    public void addCalendarEvent(CalendarEvent calendarEvent) {
    }

    /**
     * Remove a CalendarEvent from the calendar.
     * @param calendarEvent The CalendarEvent to be removed.
     */
    public void removeCalendarEvent(CalendarEvent calendarEvent) {
    }

    /**
     * @return The Frame that hold the Calendar.
     */
    public Frame getOwner() {
        return owner;
    }

    /**
     * @param owner The Frame that hold the Calendar.
     */
    public void setOwner(Frame owner) {
        this.owner = owner;
    }

    /**
     * @return The height of the Calendar in pixels.
     */
    public int getHeightInPixels() {
        return heightInPixels;
    }

    /**
     * @param heightInPixels The height of the Calendar in pixels.
     */
    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    /**
     * @return The width of the Calendar in pixels.
     */
    public int getWidthInPixels() {
        return widthInPixels;
    }

    /**
     * @param widthInPixels The width of the Calendar in pixels.
     */
    public void setWidthInPixels(int widthInPixels) {
        this.widthInPixels = widthInPixels;
    }
}
