package diaryApp;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
    int id;
    String title;
    String body;
    private final LocalDateTime date = LocalDate.now().atStartOfDay();


    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getId(){
        return id;
    }




    public  String getTitle(){
        return title;
    }




    public String getBody(){
        return body;
    }


}
