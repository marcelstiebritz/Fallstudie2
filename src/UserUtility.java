import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserUtility {


    /**
     * This Method Returns a User with a Certain name from the Database
     * @param userName The Username of the user that should be returned
     * @param connect The Connection on which the method should take place
     * @return Returns the User that has the given Name
     * @throws SQLException Throws an excpetion if there is an error with the SQL Part i.e,
     * there is no user with the given username
     */
    public static User getUser(String userName, Connection connect) throws SQLException {
        PreparedStatement prepaStmt;
        prepaStmt = connect.prepareStatement("SELECT Username FROM Userdatabase WHERE Username = ?");
        prepaStmt.setString(1,userName);
        ResultSet result = prepaStmt.executeQuery();
        User returnUser= null;
        //TODO Will nicht so wie ich das geerne hätte
        while (result.next()){
            returnUser = new User(result.getInt(1),result.getString(2),
                    result.getString(3),result.getString(4),result.getString(5),
                    result.getString(6));
        }
        return returnUser;
    }


    /**
     *
     * This Method,m  adds a new user to the Database. The Username needs to be unique
     * @param user The User that shoul be added
     * @param connect The connection on which the additng should take place
     * @throws SQLException An exception that gets thrown if there is an error with the SQL part.
     */
    public static void addUser(User user, Connection connect) throws SQLException {
        PreparedStatement prepStmt;

        prepStmt = connect.prepareStatement("INSERT INTO Userdatabase values(?,?,?,?,?,?)");
        prepStmt.setInt(1,user.getIDENTIFIER());
        prepStmt.setString(2,user.getNAME());
        prepStmt.setString(3,user.getPASSWORDHASH());
        prepStmt.setString(4,user.getROLE());
        prepStmt.setString(5,user.getCLIET());
        prepStmt.setString(6,user.getUSERNAME());
        prepStmt.executeUpdate();
    }


    /**
     * This Method removes an exisiting User from the Database by its username
     * @param userName The Username of the user that should be removed
     * @param connect The connection on which the removal should take place
     * @throws SQLException An exception that gets thrown if there is an error with the SQL part.
     */
    public static void removeUser(String userName, Connection connect) throws SQLException {
        PreparedStatement prepStmt;
        prepStmt = connect.prepareStatement("DELETE FROM Userdatabase WHERE Username = ?");
        prepStmt.setString(1,userName);
        prepStmt.executeUpdate();
    }

}
