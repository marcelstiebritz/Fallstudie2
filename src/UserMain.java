import java.sql.SQLException;
import java.util.Arrays;


public class UserMain {

    public static User testuser = new User(3,"Lina","Password","USER","TestClient","Lina123");
    public static void main(String[] args) {

        MySQLAccess acces = new MySQLAccess();

        try {
            acces.startConnection();
            acces.addUser(testuser);
            acces.removeUser(testuser.getUSERNAME());
            acces.closeConnection();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

    }


}
