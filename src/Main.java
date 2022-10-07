import java.sql.SQLException;


public class Main {

    public static User testuser = new User(3,"Lina","Password","USER","TestClient","Lina123");
    public static void main(String[] args) {
        /**
         * Creates a new Object of the type Busgetmanager thats used as main Manager
         */
        Budgetmanager budgety = new Budgetmanager();

        MySQLAccess acces = new MySQLAccess();


        try {
            acces.startConnection();
            //acces.addUser(testuser);
            //acces.removeUser("Lina123");
            System.out.println(acces.getUser("Lina123"));



            acces.closeConnection();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

    }


}
