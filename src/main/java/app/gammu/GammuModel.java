package app.gammu;

import app.inbox.InboxModel;
import app.util.JsonUtil;
import app.util.Msg;
import app.util.ServerResponse;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.logging.Logger;

/**
 * Created by winnerawan
 * on 5/15/17.
 */
public class GammuModel {

    private static final Logger logger = Logger.getLogger(InboxModel.class.getCanonicalName());

    public Sql2o mysql = null;

    ServerResponse response = new ServerResponse();

    public GammuModel(Sql2o mysql) {
        this.mysql = mysql;
    }

    public ServerResponse getVersion() {
        String sql = "SELECT * FROM gammu";
        try(Connection con = mysql.open()) {
            Gammu version = con.createQuery(sql).executeAndFetchFirst(Gammu.class);
            response.setStatus(200);
            response.setMessage(Msg.Congratulations());
            response.setResult(version);
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }


}
