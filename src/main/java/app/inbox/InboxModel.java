package app.inbox;

import app.Application;
import app.db.DB;
import app.util.JsonUtil;
import app.util.Msg;
import app.util.ServerResponse;
import org.eclipse.jetty.server.Server;
import org.junit.Test;
import org.springframework.ui.Model;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by winnerawan
 * on 5/11/17.
 */
public class InboxModel {

    public Sql2o mysql = null;

    ServerResponse response = new ServerResponse();

    public InboxModel(Sql2o mysql) {
        this.mysql = mysql;
    }

    /**
     * Fetch All Inbox
     * @return response
     */
    public ServerResponse getAllInbox() {
        String sql = "SELECT * FROM inbox";
        try(Connection con = mysql.open()) {
            List<Inbox> inboxes = con.createQuery(sql).executeAndFetch(Inbox.class);
            if (inboxes!=null) {
                response.setStatus(200);
                response.setMessage(Msg.OK());
                response.setResult(inboxes);
            } else {
                response.setStatus(404);
                response.setMessage(Msg.NotFound());
                response.setResult(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    /**
     * Fetch Single Message by Number
     * @param SenderNumber of inbox
     * @return response
     */
    public ServerResponse getInbox(String SenderNumber) {
        String sql = "SELECT * FROM inbox WHERE SenderNumber= :SenderNumber LIMIT 1 ";
        try(Connection con = mysql.open()) {
            Inbox inbox = con.createQuery(sql).addParameter("SenderNumber", SenderNumber).executeAndFetchFirst(Inbox.class);
            if (inbox!=null) {
                response.setStatus(200);
                response.setMessage(Msg.OK());
                response.setResult(inbox);
            } else {
                response.setStatus(404);
                response.setMessage(Msg.NotFound());
                response.setResult(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    /**
     * Fetch All Inbox by Number
     * @param SenderNumber of inbox
     * @return response
     */
    public ServerResponse getInboxs(String SenderNumber) {
        String sql = "SELECT * FROM inbox WHERE SenderNumber= :SenderNumber ";
        try(Connection con = mysql.open()) {
            List<Inbox> inboxs = con.createQuery(sql).addParameter("SenderNumber", SenderNumber).executeAndFetch(Inbox.class);
            if (inboxs!=null) {
            response.setStatus(200);
            response.setMessage(Msg.OK());
            response.setResult(inboxs);
            } else {
            response.setStatus(404);
            response.setMessage(Msg.NotFound());
            response.setMessage(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
