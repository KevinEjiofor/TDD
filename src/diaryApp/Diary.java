package diaryApp;

import Ziggy.CustomerException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary {

    private final String userName;
    private final String Password;
    private boolean isLocked;
    private final List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password) {
        this.userName = userName;
        this.Password = password;
    }


    public void lockDiary() {
        this.isLocked = true;
    }



    public boolean getIsLock() {
        return isLocked;
    }

    public void unLock(String password) throws CustomerException {
        validatePassword(password);
        isLocked = false;

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
        throw new CustomerException("ID NOT FOUND");

    }

    public void deleteEntry(int id) throws CustomerException {
        if (!isLocked) {
            int entryId = findEntry(id).getId();
            entries.remove(entryId - 1);
        }else {
            throw new CustomerException("DIARY IS LOCKED");
        }


    }


    public void updateEntry(int id, String title, String body) throws CustomerException {
        if (!isLocked) {
            Entry entry = findEntry(id);
            entry.setTitle(title);
            entry.setBody(body);
        }

    }


    public int getSize() {
        return entries.size();
    }

    private void validatePassword(String password) throws CustomerException {
        if (!Objects.equals(Password, password)) {
            throw new CustomerException("PASSWORD INCORRECT");
        }
    }

    public String getUsername() {
        return userName;
    }
}