package sem2.module2gitdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author kasper
 */
public class DBConnector {

    private static String url = "jdbc:mysql://138.197.189.73:3306/classicmodels";
    private static String username = "Ramsbone";

    private static String password = "Akeelah1971";

    public static Connection connection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection( url, username, password );
            return connection;
    }

}
