package diaryApp;

import Ziggy.CustomerException;

import java.util.ArrayList;
import java.util.List;

public class diaries {
    private final List<Diary> diaries = new ArrayList<>();

    public void addUpNewUser() {
        Diary entry = new Diary("Igor", "Almighty");
        diaries.add(entry);
    }

    public Diary findUser(String userName) throws CustomerException {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(userName)) {
                return diary;
            }

        }throw new CustomerException("USER NOT FOUND");
    }

    public void deleteUser(String userName ) throws CustomerException {
        Diary user = findUser(userName);
        diaries.remove(user);

    }
}
