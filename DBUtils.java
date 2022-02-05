import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {
    private static Connection connection;
    public static void initializeDBInstance() throws Exception {
        if (connection != null) return;
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:src/project.db";
            connection = DriverManager.getConnection(url);
            System.out.println("Connect database successfully");
        } catch (Exception e) {
            throw new Exception("Error when initialize database for EcoBike:"+e.getMessage());
        }
    }

    public static Ticket getTicketInformation(String type) throws Exception {
        if (connection == null) {
            initializeDBInstance();
        }
        PreparedStatement stm = connection.prepareStatement(
                "SELECT * FROM Ticket WHERE type=?");
        stm.setString(1, type);
        ResultSet result = stm.executeQuery();
        Ticket ticketRes = new Ticket(result.getString("type"),
                result.getString("name"),
                result.getFloat("price"));
        return ticketRes;
    }

    public static void saveBarCode(String barCode){

    }
}
