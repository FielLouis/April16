import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        try (Connection c = MySQLConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                     "INSERT INTO tblusers (name, email) VALUES (?, ?)"
             )) {

            String name = "Karylle de los Reyes";
            String email = "karylle@gmail.com";

            statement.setString(1, name);
            statement.setString(2, email);

            int rowsInserted = statement.executeUpdate();
            System.out.println("Rows Inserted " + rowsInserted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
