/**
 * HistoricalEvent.java - Represents a historical event
 *
 * @author Ramysannta
 * @version 1.0
 */
public class HistoricalEvent {
    private String description;
    private Date date;

    // Default constructor
    public HistoricalEvent() {
        this.description = "No description provided.";
        this.date = new Date();
    }

    // Full constructor
    public HistoricalEvent(String description, Date date) {
        if (description == null || date == null) {
            System.out.println("ERROR: Invalid arguments for HistoricalEvent.");
            System.exit(0);
        }
        this.description = description;
        this.date = new Date(date); // deep copy
    }

    // Copy constructor
    public HistoricalEvent(HistoricalEvent original) {
        if (original == null) {
            System.out.println("ERROR: Trying to copy NULL HistoricalEvent.");
            System.exit(0);
        }
        this.description = original.description;
        this.date = new Date(original.date);
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return new Date(date); // deep copy
    }

    // Setters
    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public void setDate(Date date) {
        if (date != null) {
            this.date = new Date(date); // deep copy
        }
    }

    @Override
    public String toString() {
        return description + " (Date: " + date + ")";
    }
}
