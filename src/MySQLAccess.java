import java.sql.*;


public class MySQLAccess {
    private java.sql.Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void startConnection () throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Fallstudie", "root", "Bond.007!");
    }

    public void closeConnection(){

    }

    /**
     * This Met
     * @param user
     * @throws SQLException
     */
    public void addUser(User user) throws SQLException {
        this.preparedStatement=connect.prepareStatement("insert into User Values (?,?)");
        preparedStatement.setString(1,user.getNAME());
        preparedStatement.setInt(2, user.getUSERNAME());
    }

    

    public User getUser() throws SQLException {
        connect.prepareStatement("SELECT * from User ");
        ResultSet result = preparedStatement.executeQuery();

        User returnUser = null;
        return returnUser;
    }

    /**
     * This Method returns a Budget with a Certain Name
     * @return
     */
    public Budget findBudget(String budgetname ){

        return null;
    }

    /**This Method adds a new Budget to the Database
     * @param budget The budget that shpuld be added
     */
    public void wirteBudget(Budget budget){
        // Budget in der Tabelle Hinzufügen
    }

    /**
     * Todo Was macht diese Methode ?? Ist es notwendig
     * @param budget
     */
    public void changeBudget(Budget budget){

    }

    /**
     * This method removes the given Budget
     * @param budget
     */
    public void deletBudget(Budget budget){
        // Prüfen ob Budget in der Tabelle Existiert
        // Wenn ja Löschen, Wenn nicht Fehlermeldung

    }

    public void printBudget(){
        //Ausgabe von einem Budget

    }

    /**
     *This Methods adds a new Busgetpoint to the given Budget.
     * It also proofs if there is a Budget with the given Name.
     * If there is no Budget with the name of the given Budget it throws an Exception
     * @param budget The Budget tho which a Point should be added
     */
    public void addBudgetPoint(Budget budget){
        //
    }

    /**
     * This Method checks for uniqueness of a user
     * @param user The user that should be proofed for uniqueness
     * @return returns true if the user already exists
     */
    private boolean checkUserName(User user){
        return true;

    }



}


