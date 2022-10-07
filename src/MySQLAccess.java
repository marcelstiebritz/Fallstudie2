import java.sql.*;


public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;


    // Filtern der Daten
    //ENtscheidungen in Java treffen

    /**
     * This Method starts a new Connection with a given SQL Server
     * @throws ClassNotFoundException whewn there is now class with the name "com.mysql.jdbc.Driver"
     * @throws SQLException if there occures any error while connecting to the SQL Server
     */
    public void startConnection () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Fallstudie", "root", "Bond.007!");
    }

    /**
     * This Method closes the connection to a certain SQL Server
     * @throws SQLException
     */
    public void closeConnection() throws SQLException {
            connect.close();
    }

    //--------- everything for the user ----------

    /**
     * This Methods adds a new user to the Database. The Username needs to be unique
     * @param user The User that should be added
     * @throws SQLException An exception that gets thrown if there is an error with the SQL part.
     */
    public void addUser (User user ) throws SQLException {
        UserUtility.addUser(user,connect);
    }

    /**
     * This Method removes an exisiting User from the Database by its username
     * @param userName The Username of the userName that should be removed
     * @throws SQLException An exception that gets thrown if there is an error with the SQL part.
     */
    public void removeUser(String userName) throws SQLException {
        UserUtility.removeUser(userName,connect);
    }

    public User getUser(String userName) throws SQLException {
         return UserUtility.getUser(userName,connect);
    }


}


