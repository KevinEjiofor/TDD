package diaryApp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Entry {
    int id;
    String title;
    String body;
    private LocalDateTime date = LocalDate.now().atStartOfDay();


    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.date = LocalDate.now().atStartOfDay();
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


    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return id == entry.id && Objects.equals(title, entry.title) && Objects.equals(body, entry.body) && Objects.equals(date, entry.date);
    }

}
