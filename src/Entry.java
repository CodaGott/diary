import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {

    private  String entryTitle;
    private LocalDateTime entryDateAndTime;
    private String entryBody;

    public Entry(String entryTitle){
        this.entryTitle = entryTitle;
        entryDateAndTime = LocalDateTime.now();
    }

    public void setEntryTitle(String new_entry_title) {
        entryTitle = new_entry_title;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryDateAndTime;
    }

    public void setEntryBody(String this_is_the_entry_body) {
        entryBody = this_is_the_entry_body;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public String viewEntry() {
        return ("Title: " +getEntryTitle()+"\n"
            + "Entry Date: " + getEntryDateAndTime()
            .toLocalDate()+ "\n"
            +"Entry Body: "+ getEntryBody());
    }
    @Override
    public String toString(){
        return viewEntry();
    }
}
