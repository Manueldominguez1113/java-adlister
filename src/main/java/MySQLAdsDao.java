import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;

public class MySQLAdsDao implements Ads{
private Connection connection;


    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();

        config config = new config();
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                "adlister",
                "codeup"
                //config.getUrl(),
                //config.getUser(),
                //config.getPassword()
        );

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

        config config = new config();
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
            "adlister",
            "codeup"
        );

        String query = "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setLong(1,1/*ad.getUserId()*/);
        statement.setString(2,ad.getTitle());
        statement.setString(3,ad.getDescription());
        statement.execute();
return null;
    }
}
