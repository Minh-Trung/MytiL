package mitru.com.mytil.model;

/**
 * Created by ctruong on 04/05/2017.
 *
 * @author ctruong
 * @version 1.0
 * @since 04/05/2017
 */

public class User {
    private long id;

    private String name;

    private String pseudo;

    private String password;

    private int age;

    private String country;

    private String fbToken;

    private String fbAccount;

    private boolean isFBConnected;

    private String ggToken;

    private String ggAccount;

    private boolean isGGConnected;


    public User() {
    }

    public User(String name, String pseudo, String password, int age, String country, String fbToken, String fbAccount, boolean isFBConnected, String ggToken, String ggAccount, boolean isGGConnected) {
        this.name = name;
        this.pseudo = pseudo;
        this.password = password;
        this.age = age;
        this.country = country;
        this.fbToken = fbToken;
        this.fbAccount = fbAccount;
        this.isFBConnected = isFBConnected;
        this.ggToken = ggToken;
        this.ggAccount = ggAccount;
        this.isGGConnected = isGGConnected;
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

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFbToken() {
        return fbToken;
    }

    public void setFbToken(String fbToken) {
        this.fbToken = fbToken;
    }

    public String getFbAccount() {
        return fbAccount;
    }

    public void setFbAccount(String fbAccount) {
        this.fbAccount = fbAccount;
    }

    public String getGgToken() {
        return ggToken;
    }

    public void setGgToken(String ggToken) {
        this.ggToken = ggToken;
    }

    public String getGgAccount() {
        return ggAccount;
    }

    public void setGgAccount(String ggAccount) {
        this.ggAccount = ggAccount;
    }

    public boolean isFBConnected() {
        return isFBConnected;
    }

    public void setFBConnected(boolean FBConnected) {
        isFBConnected = FBConnected;
    }

    public boolean isGGConnected() {
        return isGGConnected;
    }

    public void setGGConnected(boolean GGConnected) {
        isGGConnected = GGConnected;
    }
}
