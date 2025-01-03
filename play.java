import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class play {

    private static final String url = "jdbc:mysql://localhost:3306/simple";
    private static final String user = "root";
    private static final String password = "Nakul13@#";

    public static void main(String[] args) {

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected successfully.");

            String selectSQL = "SELECT id, name, age FROM users";
            try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("1101");
                    String name = resultSet.getString("PROXIMA");
                    int age = resultSet.getInt("450");

                    System.out.println("User id: " + id + ", Name: " + name + ", Age: " + age);
                }
            } catch (SQLException e) {
                System.out.println("SQLException caught while trying to retrieve data: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("SQLException caught while trying to connect to the database: " + e.getMessage());
        }
    }
}