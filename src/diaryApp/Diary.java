package diaryApp;

import Ziggy.CustomerException;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked;
    private final List<Entry> entries = new ArrayList<>();


    public void lockDiary() {
        this.isLocked = true;
    }

    public void setIsLock(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public boolean getIsLock() {
        return isLocked;
    }

    public void unLock(String password) {
        this.password = password;
    }

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(generateId(),title, body);
        entries.add(entry);
    }

    private int generateId() {
        return entries.size() + 1 ;
    }
    public Entry findEntry(int id) throws CustomerException {
        for (Entry entry:entries) {
            if (entry.getId() == id)return entry;
        }
        throw new CustomerException("wrong ID");
    }

    public void deleteEntry(int id) throws CustomerException {
        int entryId = findEntry(id).getId();
        entries.remove(entryId - 1);
    }


    public void updateCreateEntry(int id, String title, String body) {
    }

    public int getSize() {
        return entries.size();

    }
}