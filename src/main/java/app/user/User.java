package app.user;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by winnerawan
 * on 5/16/17.
 */
public class User {


    private String user_id;
    private String username;
    private String email;
    private String password;
    private String gcm_id;

    public User() {
    }


    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User(String user_id, String username, String email, String password) {
        this.user_id = UUID.randomUUID().toString();
        this.username = username;
        this.email = email;
        this.password = password;
    }
    

    public User(String gcm_id) {
        this.gcm_id = gcm_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGcm_id() {
        return gcm_id;
    }

    public void setGcm_id(String gcm_id) {
        this.gcm_id = gcm_id;
    }
}
