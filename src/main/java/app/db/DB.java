package app.db;

import org.sql2o.Sql2o;

/**
 * Created by winnerawan
 * on 5/13/17.
 */

// USE IT IF USING POSTGRESQL
public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/smsd", "winnerawan", null);
}