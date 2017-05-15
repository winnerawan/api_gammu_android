package app;

/**
 * Created by winnerawan
 * on 5/11/17.
 */
import com.beust.jcommander.Parameter;

class CommandLineOptions {

    @Parameter(names = "--debug")
    boolean debug = false;

    @Parameter(names = {"--database"})
    String database = "smsd";

    @Parameter(names = {"--db-host"})
    String dbHost = "localhost";

    @Parameter(names = {"--db-username"})
    String dbUsername = "winnerawan";

    @Parameter(names = {"--db-password"})
    String dbPassword = "";

    @Parameter(names = {"--db-port"})
    Integer dbPort = 5432;
}
