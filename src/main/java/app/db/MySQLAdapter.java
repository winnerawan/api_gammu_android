package app.db;

import org.sql2o.Sql2o;

/*
A simple adapter to manage database connection
 */
public class MySQLAdapter {
    public static String USERNAME = "root";
    public static String PASSWORD = "toor";
    public static String PORT_NUMBER = "3306";
    public static String HOST_NAME = "localhost";
    public static String DATABASE_NAME = "gammu?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Sql2o mysql = null;

    public MySQLAdapter() {
        mysql = new Sql2o("jdbc:mysql://" + HOST_NAME + ":" + PORT_NUMBER + "/" + DATABASE_NAME, USERNAME, PASSWORD);
    }

    public MySQLAdapter(String dbName) {
        mysql = new Sql2o("jdbc:mysql://" + HOST_NAME + ":" + PORT_NUMBER + "/" + dbName, USERNAME, PASSWORD);
    }

    public Sql2o getMysql() {
        return mysql;
    }
}
