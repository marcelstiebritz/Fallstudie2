import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public  class BudgetUtility {

    public static void addBudget(Budget budget, Connection connect) throws SQLException {
        PreparedStatement prepStmt;
        prepStmt = connect.prepareStatement("INSERT INTO Budgetdatabase values(?,?,?)");
        prepStmt.setInt(1,budget.getIDENTIFIER());
        prepStmt.setString(2,budget.getNAME());
        prepStmt.setInt(3,budget.getOVERALLBUDGET());
        prepStmt.executeUpdate();
    }
    public static void getBdudget(String userName, Connection connect){
        PreparedStatement prepStmt;
    }
    public static void removeBudget(String budget, Connection connect) throws SQLException {
        PreparedStatement prepStmt;
        prepStmt = connect.prepareStatement("DELETE FROM Budgetdatabase WHERE Name = ?");
        prepStmt.setString(1,budget);
        prepStmt.executeUpdate();
    }

}
