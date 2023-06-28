import java.sql.*;
public class Dbconnect {
   public static Connection getConnection() throws ClassNotFoundException, SQLException 
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/park", "root", "");
      return con;
    }
}
