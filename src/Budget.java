public class Budget {



    private final int IDENTIFIER;
    /**
     * The Name of the current Budget
     */
    private final String NAME;

    /**
     * The overall Budget of the
     */
    private final int OVERALLBUDGET;

    /**
     * This Constructot creates a new Object of Type  Budget.
     * @param name
     * @param overallbudget
     */

    public Budget(String name, int overallbudget, int identifier) {
        NAME = name;
        OVERALLBUDGET = overallbudget;
        IDENTIFIER = identifier;
    }

    public int getIDENTIFIER() {
        return IDENTIFIER;
    }

    public String getNAME() {
        return NAME;
    }

    public int getOVERALLBUDGET() {
        return OVERALLBUDGET;
    }
}
