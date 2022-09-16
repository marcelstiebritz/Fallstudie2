import java.sql.*;


public class MySQLAccess {
    private java.sql.Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void startConnection () throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Test123", "root", "Bond.007!");

    }

    public void closeConnection(){

    }

    public void addUser(User user) throws SQLException {
        this.preparedStatement=connect.prepareStatement("insert into User(UserName,Tel) Values (/* TODO Hier kommt noch was rein */)))");
        preparedStatement.setString(0,user.getNAME());
        preparedStatement.setInt(1, user.getTEL());
    }

    public User getUser() throws SQLException {
        connect.prepareStatement("SELECT * from User ");
        ResultSet result = preparedStatement.executeQuery();

        User returnUser = null;
        return returnUser;
    }
    public Budget findBudget(){

        return null;
    }

    public void wirteBudget(Budget budget){

    }

    public void changeBudget(Budget budget){

    }

    public void deletBudget(Budget budget){

    }

    public void printBudget(){

    }

    public void addBudgetPoint(){

    }


}


