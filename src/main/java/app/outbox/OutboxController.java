package app.outbox;

import app.util.JsonUtil;
import app.util.ServerResponse;

import static app.util.JsonUtil.json;
import static spark.Spark.*;
/**
 * Created by winnerawan
 * on 5/15/17.
 */
public class OutboxController {

    public OutboxController(final OutboxModel outboxModel) {

        get("/outboxes", (request, response) -> outboxModel.getAllOutBox(), json());

        get("/outbox/:SenderNumber", (request, response) -> {
            String number = request.params(":SenderNumber");
            ServerResponse result = outboxModel.getOutbox(number);
            return JsonUtil.toJson(result);
        });

        get("/outboxs/:DestinationNumber", (request, response) -> {
            String number = request.params(":DestinationNumber");
            ServerResponse result = outboxModel.getOutboxs(number);
            return JsonUtil.toJson(result);
        });

        after(((request, response) -> response.type(JsonUtil.JSON())));

    }
}
