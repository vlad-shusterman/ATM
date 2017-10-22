import java.sql.SQLException;

/**
 * Created by vlads on 02.10.2017.
 */
public class ChangePass {

    public int updatepin(int id,int pass){
        String query = "select pin from card where id ="+ id;

        try {
            JDBC.connect(query);
            JDBC.stmt.executeUpdate("UPDATE card SET pin = "+pass+" WHERE id=" + id);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return pass;
    }
}
