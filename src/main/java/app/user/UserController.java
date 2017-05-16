package app.user;

import app.util.JsonUtil;
import org.springframework.security.crypto.bcrypt.BCrypt;

import static app.util.JsonUtil.JSON;
import static app.util.JsonUtil.json;
import static spark.Spark.*;
/**
 * Created by winnerawan
 * on 5/16/17.
 */
public class UserController {

    public UserController(final UserModel userModel) {

        post("/register", (request, response) -> {
            //String user_id = request.queryParams(":user_id");
            String username = request.queryParams("username");
            String email    = request.queryParams("email");
            String password = request.queryParams("password");
            String encodePassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
            return JsonUtil.toJson(userModel.registerUser(username, email, encodePassword));
        });
    }
}
