package DBContext;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    private final String url = "jdbc:sqlserver://DESKTOP-A67PPOE\\TRAM7:1433;databaseName=QLBH";
    private final String username = "sa";
    private final String password = "12345";
    public Connection getConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Connected to Database");
        return DriverManager.getConnection(url, username, password);
    }
}
