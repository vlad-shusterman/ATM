import java.sql.SQLException;

/**
 * Created by vlads on 02.10.2017.
 */
public class getcash{

    public int updatebalance(int id,int balance){
        String query = "select cash from card where id ="+ id;
        try {
            JDBC.connect(query);
            JDBC.stmt.executeUpdate("UPDATE card SET cash = "+balance+" WHERE id=" + id);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return balance;
    }

    public int getCash(int balance,int cash){
        balance=balance-cash;
        return balance;
    }
}
