package simpleGUI.components;

/**
 * A calendar event that can be attached to a calendar.
 */
public class CalendarEvent {
    /**
     * The dattime of the CalendarEvent, in the format: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
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
     * Constructor.
     * Create an empty CalendarEvent, without a title and details.
     * @param datetime The dattime of the CalendarEvent, in the format: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
     */
    public CalendarEvent(String datetime) {
        this.datetime = datetime;
    }

    /**
     * Constructor.
     * Create a CalendarEvent without details.
     * @param datetime The dattime of the CalendarEvent, in the format: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
     * @param title The title of the event.
     */
    public CalendarEvent(String datetime, String title) {
        this.datetime = datetime;
        this.title = title;
    }

    /**
     * Constructor.
     * @param datetime The dattime of the CalendarEvent, in the format: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
     * @param title The title of the event.
     * @param details The details of the event.
     */
    public CalendarEvent(String datetime, String title, String details) {
        this.datetime = datetime;
        this.title = title;
        this.details = details;
    }

    /**
     * @return The dattime of the CalendarEvent, in the format: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * @param datetime The dattime of the CalendarEvent, in the format: "yyyy’-‘MM’-‘dd’T’HH’:’mm’:’ss".
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * @return The title of the event.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title of the event.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The details of the event.
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details The details of the event.
     */
    public void setDetails(String details) {
        this.details = details;
    }
}
