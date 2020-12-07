import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        entry = new Entry("Default Entry");
    }

    @Test
    void testEntryCanChangeTitle(){
        entry = new Entry("My Title");

        entry.setEntryTitle("New Entry Title");

        String entryTitle = entry.getEntryTitle();
        assertEquals("New Entry Title", entryTitle);
    }
    @Test
    void testDateOfEntryIsCreatedAfterConstruction(){
        //given that entry is new Entry
        Entry newEntry;
        //When
        newEntry = new Entry("New Entry Title");
        //assert
        LocalDateTime entryDateAndTime = newEntry.getEntryDateAndTime();
        assertNotNull(entryDateAndTime);
        //assert
        LocalDate entryDate = entryDateAndTime.toLocalDate();
        assertEquals(LocalDate.now(), entryDate);
        System.out.println(entryDateAndTime.toString());
    }

    @Test
    void testEntryBodyCanBeEdited(){
        //given
        Entry newEntry = new Entry("New Enter");
        //when
        newEntry.setEntryBody("This is the entry body");
        //assert
        String entryBody = newEntry.getEntryBody();
        assertEquals("This is the entry body", entryBody);
    }

    @Test
    void testViewEntry(){
        //given
        Entry entry = new Entry ("My Break up Story");
        entry.setEntryBody("It just happened");
        String actual = entry.viewEntry();
        String expected =
                ("Title: My Break up Story" + "\n" + "Entry Date: " +
                        LocalDate.now() + "\n"
                        +"Entry Body: It just happened"
                );
        assertEquals(expected, actual);

        actual = entry.toString();
        assertEquals(expected, actual);
    }
}