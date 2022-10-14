import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class MainTest {


    @Test
    public void TestAddUser(){
        MySQLAccess acces = new MySQLAccess();
        User testuser = new User(3,"User1","Password","USER1","TestClient","User1");
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