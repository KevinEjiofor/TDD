package diaryApp;

import Ziggy.CustomerException;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();

    public void addNewUser(String userName, String password) {
        Diary entry = new Diary( userName, password);
        diaries.add(entry);
    }

    public Diary findUser(String userName) throws CustomerException {
        for (Diary diary : diaries) {
            if (diary.getUsername().equalsIgnoreCase(userName)) {
                return diary;
            }

        }throw new CustomerException("USER NOT FOUND");
    }

    public void deleteUser(String userName ) throws CustomerException {
        Diary user = findUser(userName);
        diaries.remove(user);

    }
    public int getAllUsers() {
        return diaries.size();
    }

    public boolean userExist(String userName) throws CustomerException {
        if (diaries.stream().anyMatch(diary -> diary.getUsername().equalsIgnoreCase(userName))){
            return true;
        }
        throw new CustomerException("USER NOT FOUND");
    }


}
