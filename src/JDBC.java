import java.sql.*;

abstract class JDBC {

    public static String url ;
    public static String user ;
    public static String password;
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    public static void connect(String query){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch (Exception ex) {
        }
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);


        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

}
