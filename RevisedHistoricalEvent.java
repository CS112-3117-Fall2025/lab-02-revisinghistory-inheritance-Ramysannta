/**
 * RevisedHistoricalEvent.java - Subclass of HistoricalEvent that includes revisions
 *
 * @author Ramysannta
 * @version 1.0
 */
public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisionNote;
    private String citation;

    // Default constructor
    public RevisedHistoricalEvent() {
        super();
        this.revisionNote = "No revision note provided.";
        this.citation = "No citation provided.";
    }

    // Full constructor
    public RevisedHistoricalEvent(String description, Date date, String revisionNote, String citation) {
        super(description, date);
        this.revisionNote = revisionNote;
        this.citation = citation;
    }

    // Copy constructor
    public RevisedHistoricalEvent(RevisedHistoricalEvent original) {
        super(original);
        this.revisionNote = original.revisionNote;
        this.citation = original.citation;
    }

    // Getters
    public String getRevisionNote() {
        return revisionNote;
    }

    public String getCitation() {
        return citation;
    }

    // Setters
    public void setRevisionNote(String revisionNote) {
        this.revisionNote = revisionNote;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    // teach() method
    public void teach() {
        System.out.println(super.toString());
        System.out.println("Revision Note: " + revisionNote);
        System.out.println("Citation: " + citation);
    }

    @Override
    public String toString() {
        return super.toString() + " | Revision: " + revisionNote + " (Source: " + citation + ")";
    }
}
