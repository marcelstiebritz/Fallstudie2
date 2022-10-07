import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        /**
         * Creates a new Object of the type Busgetmanager thats used as main Manager
         */
        Budgetmanager budgety = new Budgetmanager();

        MySQLAccess acces = new MySQLAccess();


        try {
            acces.startConnection();
            acces.addUser(new User( "Daniel", 123));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
