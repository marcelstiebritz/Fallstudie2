

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static User testuser = new User(3,"User1","Password","USER","TestClient","User1");
    public static Budget testbudget = new Budget("Budget 1", 200,1);
    public static void main(String[] args) throws IOException {
        MySQLAccess acces = new MySQLAccess();
        boolean isRunning = true;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            try {
                acces.startConnection();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }

            switch (command) {
                case ("addUser"):
                    try {
                        acces.addUser(testuser);
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case ("addBudget"):
                    try {
                        acces.addBudget(testbudget);
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case ("getBudget"):
                    try {

                        System.out.println(acces.getAllBudgetsByUser(testuser));
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("No such command");
            }
        }
    }
}
