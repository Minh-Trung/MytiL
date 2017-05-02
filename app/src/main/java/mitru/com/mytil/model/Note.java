package mitru.com.mytil.model;

/**
 * Created by ctruong on 21/04/2017.
 * @author ctruong
 * @version 1.0
 * @since 21/04/2017
 */
public class Note {
    private long id;

    private String name;

    private String content;

    private String date;

    private String author;

    private boolean isReminder;

    private String dateReminder;

    public Note() {
    }

    public Note(String name, String content, String date, String author, boolean isReminder, String dateReminder) {
        this.name = name;
        this.content = content;
        this.date = date;
        this.author = author;
        this.isReminder = isReminder;
        this.dateReminder = dateReminder;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isReminder() {
        return isReminder;
    }

    public void setReminder(boolean reminder) {
        isReminder = reminder;
    }

    public String getDateReminder() {
        return dateReminder;
    }

    public void setDateReminder(String dateReminder) {
        this.dateReminder = dateReminder;
    }
}
