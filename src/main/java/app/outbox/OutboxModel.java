package app.outbox;

import app.util.Msg;
import app.util.ServerResponse;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

/**
 * Created by winnerawan
 * on 5/15/17.
 */
public class OutboxModel {

    public Sql2o mysql = null;

    ServerResponse response = new ServerResponse();

    public OutboxModel(Sql2o mysql) {
        this.mysql = mysql;
    }

    public ServerResponse getAllOutBox() {
        String sql = "SELECT * FROM outbox";
        try(Connection con = mysql.open()) {
            List<Outbox> outboxes = con.createQuery(sql).executeAndFetch(Outbox.class);
            if (outboxes!=null) {
                response.setStatus(200);
                response.setMessage(Msg.OK());
                response.setResult(outboxes);
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
     * Fetch Single Message by DestinationNumber
     * @param DestinationNumber of outbox
     * @return response
     */
    public ServerResponse getOutbox(String DestinationNumber) {
        String sql = "SELECT * FROM outbox WHERE DestinationNumber= :DestinationNumber LIMIT 1 ";
        try(Connection con = mysql.open()) {
            Outbox outbox = con.createQuery(sql).addParameter("DestinationNumber", DestinationNumber).executeAndFetchFirst(Outbox.class);
            if (outbox!=null) {
                response.setStatus(200);
                response.setMessage(Msg.OK());
                response.setResult(outbox);
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
     * Fetch All Inbox by DestinationNumber
     * @param DestinationNumber of outbox
     * @return response
     */
    public ServerResponse getOutboxs(String DestinationNumber) {
        String sql = "SELECT * FROM outbox WHERE DestinationNumber= :DestinationNumber ";
        try(Connection con = mysql.open()) {
            List<Outbox> outboxs = con.createQuery(sql).addParameter("DestinationNumber", DestinationNumber).executeAndFetch(Outbox.class);
            if (outboxs!=null) {
                response.setStatus(200);
                response.setMessage(Msg.OK());
                response.setResult(outboxs);
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
