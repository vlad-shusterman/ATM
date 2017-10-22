import java.sql.*;

abstract class JDBC {

    public static  final String url = "jdbc:mysql://localhost:3306/atm";
    public static String user = "root";
    public static String password = "Alex121269";
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
