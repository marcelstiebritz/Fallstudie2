import java.sql.Connection;

public abstract class BudgetpointUtility {

    /**
     * This Method adds a new Budgetpoint to a certain Budget
     */
    public abstract void addBudgetpoint(String userName, Connection connect);
    public abstract void removeBudgetPoint(String userName, Connection connect);
    public abstract void getBudget(String userName, Connection connect);
}
