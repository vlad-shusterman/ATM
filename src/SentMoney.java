import java.sql.SQLException;

/**
 * Created by vlads on 02.10.2017.
 */
public class SentMoney extends getcash {

    public void othercard(int id, int sum){
        String query = "select cash from card where id ="+ id;
        JDBC.connect(query);
        try {
            JDBC.stmt.executeUpdate("UPDATE card SET cash = cash + "+sum+" WHERE id=" + id);
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public void sentmoney(int sum,int id,int id1){
        user user1 = new user();
        updatebalance(id,getCash(user1.getfromdatabasecash(id),sum));
        othercard(id1,sum);
    }
}
