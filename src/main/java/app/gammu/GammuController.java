package app.gammu;

import app.gammu.GammuModel;
import app.util.JsonUtil;

import static app.util.JsonUtil.json;
import static spark.Spark.*;


/**
 * Created by winnerawan
 * on 5/15/17.
 */
public class GammuController {

    public GammuController(final GammuModel gammuModel) {

        get("/", (request, response) -> gammuModel.getVersion(), json());

        after(((request, response) -> response.type(JsonUtil.JSON())));
    }
}
