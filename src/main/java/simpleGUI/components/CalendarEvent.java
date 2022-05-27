package simpleGUI.components;

/**
 * A calendar event that can be attached to a calendar.
 */
public class CalendarEvent {

    /**
     * The datetime of the CalendarEvent, in the format: "yyyy'-'MM'-'dd'T'HH':'mm':'ss".
     */
    String datetime;

    /**
     * The title of the event.
     */
    String title;

    /**
     * The details of the event.
     */
    String details;

    /**
     * Create an empty calendar event with datetime.
     * @param datetime The datetime of the calendar event, in the format: "yyyy'-'MM'-'dd'T'HH':'mm':'ss".
     */
    CalendarEvent(String datetime) {
        this.datetime = datetime;
    }

    /**
     * Create a calendar with custom title and datetime.
     * @param datetime The datetime of the calendar event, in the format: "yyyy'-'MM'-'dd'T'HH':'mm':'ss".
     * @param title The title of the event.
     */
    public CalendarEvent(String datetime, String title) {
        this.datetime = datetime;
        this.title = title;
    }

    /**
     * Create a calendar with custom title, datetime and details.
     * @param datetime The datetime of the calendar event, in the format: "yyyy'-'MM'-'dd'T'HH':'mm':'ss".
     * @param title The title of the event.
     * @param details The details of the event.
     */
    public CalendarEvent(String datetime, String title, String details) {
        this.datetime = datetime;
        this.title = title;
        this.details = details;
    }

    /**
     * Gets the date and time
     * @return The datetime of the calendar event, in the format: "yyyy'-'MM'-'dd'T'HH':'mm':'ss".
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * Set the date and time
     * @param datetime The datetime of the calendar event, in the format: "yyyy'-'MM'-'dd'T'HH':'mm':'ss".
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * Get the title
     * @return The title of the event.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title.
     * @param title The title of the event.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the details.
     * @return The details of the event.
     */
    public String getDetails() {
        return details;
    }

    /**
     * Set the details.
     * @param details The details of the event.
     */
    public void setDetails(String details) {
        this.details = details;
    }

}
