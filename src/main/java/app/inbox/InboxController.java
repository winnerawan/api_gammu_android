package app.inbox;

import app.util.JsonUtil;
import app.util.ServerResponse;

import static app.util.JsonUtil.JSON;
import static app.util.JsonUtil.json;
import static spark.Spark.*;

/**
 * Created by winnerawan
 * on 5/15/17.
 */
public class InboxController {

    public InboxController(final InboxModel inboxModel) {

        get("/inboxes", (request, response) -> inboxModel.getAllInbox(), json());

        get("/inbox/:SenderNumber", (request, response) -> {
            String number = request.params(":SenderNumber");
            ServerResponse result = inboxModel.getInbox(number);
            return JsonUtil.toJson(result);
        });

        get("/inboxs/:SenderNumber", (request, response) -> {
            String number = request.params(":SenderNumber");
            ServerResponse result = inboxModel.getInboxs(number);
            return JsonUtil.toJson(result);
        });

        after(((request, response) -> response.type(JsonUtil.JSON())));

    }
}
