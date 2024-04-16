import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        try (Connection c = MySQLConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                     "DELETE FROM tblusers WHERE id>=? AND id<=?"
             )){

            int startingID = 2;
            int endingID = 4;
            statement.setInt(1, startingID);
            statement.setInt(2, endingID);
            int rowsDeleted = statement.executeUpdate();
            System.out.println("Rows Deleted: " + rowsDeleted);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
