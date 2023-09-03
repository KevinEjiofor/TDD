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
    public void setId(int id){
        this.id = id;
    }


    public int getId(){
        return id;
    }



    public  void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;

    }



    public void setBody(String body) {
        this.body = body;

    }

    public String getBody(){
        return body;
    }

    public String getDiaryDetails(){
        return getTitle() + " " + getBody();
    }



}
