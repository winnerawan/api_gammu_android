package app.user;

import app.util.Msg;
import app.util.ServerResponse;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

/**
 * Created by winnerawan
 * on 5/16/17.
 */
public class UserModel {

    public Sql2o mysql = null;

    ServerResponse response = new ServerResponse();

    public UserModel(Sql2o mysql) {
        this.mysql = mysql;
    }

    public ServerResponse registerUser(String username, String email, String password) {
        String sql = "INSERT INTO user(username, email, password) VALUES (:username,:email,:password)";
        try(Connection con = mysql.open()) {
            con.createQuery(sql)
                    //.addParameter("user_id", user_id)
                    .addParameter("username", username)
                    .addParameter("email", email)
                    .addParameter("password", password)
                    .executeUpdate();
            //if (u!=null) {
                User user = new User(username, email);
                response.setStatus(200);
                response.setMessage(Msg.OK());
                response.setResult(user);
            //} else {
                //response.setStatus(404);
                //response.setMessage(Msg.NotFound());
                //response.setResult(null);
            //}
        }catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
