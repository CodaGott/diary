public class Diary {

    private int counter = 0;

    private Entry[] entries;

    public Diary(int numberOfDiaryEntries) {
        entries = new Entry[numberOfDiaryEntries];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry newDiaryEntry) {
        if (counter < entries.length)
            entries[counter] = newDiaryEntry;
        counter++;
    }
}
