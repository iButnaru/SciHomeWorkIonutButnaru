package sci.sql.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            DriverManager.setLoginTimeout(60);
            String url = new StringBuilder()
                    .append("jdbc:")
                    .append("postgresql")       // “mysql” / “db2” / “mssql” / “oracle” / ...
                    .append("://")
                    .append("localhost")
                    .append(":")
                    .append(5432)
                    .append("/")
                    .append("postgres")
//                    .append("?currentSchema=")
                    .append("?sciHomeWork=")
                    .append("sci")
                    .append("&user=")
                    .append("postgres")
                    .append("&password=")
                    .append("Parolasql").toString();

            System.out.println("url: " + url);

            connection = DriverManager.getConnection(url);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }
        return connection;
    }
}
