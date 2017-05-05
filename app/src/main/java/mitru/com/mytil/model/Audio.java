package mitru.com.mytil.model;

/**
 * Created by ctruong on 04/05/2017.
 * @author ctruong
 * @version 1.0
 * @since 04/05/2017
 */

public class Audio {

    private long id;

    private String name;

    private String date;

    private int time;

    private String fileSrc;

    public Audio() {
    }

    public Audio(String name, String date, int time, String fileSrc) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.fileSrc = fileSrc;
    }

    public String getFileSrc() {
        return fileSrc;
    }

    public void setFileSrc(String fileSrc) {
        this.fileSrc = fileSrc;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
