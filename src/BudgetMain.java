import java.sql.SQLException;

public class BudgetMain {
    public static void main(String[] args) {

        MySQLAccess acces = new MySQLAccess();
        Budget testbudget = new Budget("Test123", 12000, 1);

        try {
            acces.startConnection();
            acces.addBudget(testbudget);
            acces.removeBudget(testbudget.getNAME());
            acces.closeConnection();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
}
