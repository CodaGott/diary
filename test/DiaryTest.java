import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testDiaryEntryIsSet(){
        //given
        Diary myBreakUpDiary = new Diary(100);
        //when
        int numberOfDiaryEntries = myBreakUpDiary.getNumberOfDiaryEntries();
        //assert
        assertEquals(100, numberOfDiaryEntries);
    }

    @Test
    void testDiaryEntryIsNotNull(){
        //given
        Diary myBreakUpDiary;
        //when
        myBreakUpDiary = new Diary(10);
        //assert
        Entry[] entries = myBreakUpDiary.getEntries();
        assertNotNull(entries);
    }

    @Test
    void testDiaryEntryCanBeEntered(){
        //given
        Diary myBreakUpDairy = new Diary(5);
        Entry entry = new Entry("My Break Up Story");
        entry.setEntryBody("It just happened");
        //when
        myBreakUpDairy.addNewEntry(entry);
        //assert
        //assertEquals(entry, myBreakUpDairy.getEntries()[0]);
        Entry[]  assertionEntry = new Entry[5];
        assertionEntry[0] = entry;
        assertArrayEquals(assertionEntry, myBreakUpDairy.getEntries());

        Entry newEntry = new Entry("break up");

        myBreakUpDairy.addNewEntry(newEntry);

        assertEquals(newEntry, myBreakUpDairy.getEntries()[1]);
        ;
    }
}