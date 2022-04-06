import java.sql.*;

import com.mysql.cj.jdbc.Driver;


public class codeRunner {
    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
       Statement stmt = connection.createStatement();
        String selectQuery = "SELECT * FROM albums";

        ResultSet rs = stmt.executeQuery(selectQuery);

        while (rs.next()) {
            System.out.println("Here's an album:");
            System.out.println("  id: " + rs.getLong("id"));
            System.out.println("  artist: " + rs.getString("artist"));
            System.out.println("  name: " + rs.getString("name"));
            System.out.println("  date: " + rs.getDate("release_date"));
        }


       /* String query = "INSERT INTO albums (artist, name, release_date, genre, sales) VALUES('Kelly', 'coomon', '2006-10-20', 'Pop, Urban, R&B', 2.5)";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
*/
    }


}
