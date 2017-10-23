import java.sql.*;

/**
 * Created by vlads on 18.09.2017.
 */
public class user {

    private  int cash;
    private int pin;




    public int getfromdatabasepin(int id){
        String query = "select pin from card where id ="+id;
        JDBC.connect(query);
        try {
            while (JDBC.rs.next()) {
                pin= JDBC.rs.getInt(1);
            }
        } catch (SQLException sqlEx){sqlEx.printStackTrace();}
        return pin;
    }

    public int getfromdatabasecash(int id){
        String query = "select cash from card where id ="+id;
        JDBC.connect(query);
        try {
            while (JDBC.rs.next()) {
                cash= JDBC.rs.getInt(1);
            }
        } catch (SQLException sqlEx){sqlEx.printStackTrace();}
        return cash;
    }


    public boolean checkpass(int pin1,int id1){
        boolean t=false;
        String query = "select pin from card where id="+id1;
        JDBC.connect(query);
        try {
            while (JDBC.rs.next()) {
                if (pin1==JDBC.rs.getInt(1)) {
                pin = pin1;
                t=true;
                }
                else t=false;
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return t;
    }
}
