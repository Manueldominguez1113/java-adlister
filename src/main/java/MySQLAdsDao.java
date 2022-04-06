import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
private Connection connection;
private config config;

    public MySQLAdsDao() throws SQLException {
        config config = new config();
connection = DriverManager.getConnection(
        config.getUrl(),
        config.getUser(),
        config.getPassword()
        );
}

    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();

        String query = "SELECT * FROM ads";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            int id = rs.getInt("id");
            int user_id= rs.getInt("user_id");
            String title= rs.getString("title");
            String description =rs.getString("description");

            System.out.println("id# "+ id);
            System.out.println("User "+ user_id);
            System.out.println("Title: "+ title);
            System.out.println("Description: "+ description);
            ads.add(new Ad(id, user_id,title,description));
        }

        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads ( ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setLong(1,ad.getUserId());
        statement.setString(2,ad.getTitle());
        statement.setString(3,ad.getDescription());
        statement.execute();
return null;
    }
}
