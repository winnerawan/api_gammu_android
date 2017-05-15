package app;

import app.gammu.GammuController;
import app.db.MySQLAdapter;
import app.inbox.InboxController;
import app.inbox.InboxModel;
import app.gammu.GammuModel;
import app.outbox.OutboxController;
import app.outbox.OutboxModel;
import org.sql2o.Sql2o;

import java.util.logging.Logger;
import static spark.Spark.get;

/**
 * Created by winnerawan
 * on 5/11/17.
 */
public class Application {

    private static final Logger logger = Logger.getLogger(Application.class.getCanonicalName());

    public static void init(MySQLAdapter mySQLAdapter) {

        Sql2o mysql = mySQLAdapter.getMysql();

        InboxModel inboxModel = new InboxModel(mysql);
        GammuModel gammuModel = new GammuModel(mysql);
        OutboxModel outboxModel = new OutboxModel(mysql);

        new InboxController(inboxModel);
        new GammuController(gammuModel);
        new OutboxController(outboxModel);

    }

    public static void main(MySQLAdapter _mySQLAdapter) {
        init(_mySQLAdapter);
    }

    public static void main(String[] args) {
        init(new MySQLAdapter());
    }

//    public static void main(String[] args) {
//        CommandLineOptions options = new CommandLineOptions();
//        new JCommander(options, args);
//
//        logger.finest("Options.debug = " + options.debug);
//        logger.finest("Options.database = " + options.database);
//        logger.finest("Options.dbHost = " + options.dbHost);
//        logger.finest("Options.dbUsername = " + options.dbUsername);
//        logger.finest("Options.dbPort = " + options.dbPort);


//        Sql2o sql2o = new Sql2o("jdbc:mysql://" + options.dbHost + ":" + options.dbPort + "/" + options.database,
//                options.dbUsername, options.dbPassword) {
//
//        };
//
//        //InboxModel inbox = new InboxModel(sql2o);
//        get("/inbox", (request, response) -> InboxModel.getAllInbox());
}