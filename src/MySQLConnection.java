import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/dbcsit228omasas";
    static Connection getConnection() {
        Connection c = null;
        c = DriverManager.getConnection();
        return c;
    }
}
