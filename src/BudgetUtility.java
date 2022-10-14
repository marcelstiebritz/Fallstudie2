import java.sql.*;

public  class BudgetUtility {

    public static void addBudget(Budget budget, Connection connect) throws SQLException {
        PreparedStatement prepStmt;
        prepStmt = connect.prepareStatement("INSERT INTO Budgetdatabase values(?,?,?)");
        prepStmt.setInt(1,budget.getIDENTIFIER());
        prepStmt.setString(2,budget.getNAME());
        prepStmt.setInt(3,budget.getOVERALLBUDGETValue());
        prepStmt.executeUpdate();
    }


    public static String getBdudget(Connection connect, User user) throws SQLException {
        ResultSet rs = null;

        PreparedStatement prepStmt;

        prepStmt = connect.prepareStatement("SELECT * From TABLE (  Budgetdatabase) where Username = ?");
         prepStmt.setString(1, user.getUSERNAME());
         rs = prepStmt.executeQuery();
         String returnstring = "";
        while (rs.next()) {

            int id = rs.getInt("Identifier");
            String name = rs.getString("Name");
            int amount = rs.getInt("Overall");
            String username = rs.getString("Username");
            returnstring = (id + "\t\t" + name
                    + "\t\t" + amount +username);
        }
        //TODO Entfernen
        System.out.println(returnstring);
        return returnstring;
    }
    public static void removeBudget(String budget, Connection connect) throws SQLException {
        PreparedStatement prepStmt;
        prepStmt = connect.prepareStatement("DELETE FROM Budgetdatabase WHERE Name = ?");
        prepStmt.setString(1,budget);
        prepStmt.executeUpdate();
    }

}
