public class Budget {

    /**
     * This inner Class represents a new Position inside a new Budget
     * This is a new Inner class because it is just neccasery inside a budget. 
     */
    public class Position {
        private final String NAME;
        private final float VALUE;

        public Position(String name, float value) {
            this.NAME = name;
            this.VALUE = value;
        }
    }

    /**
     * The Name of the current Budget
     */
    private final String NAME;

    /**
     * The overall Budget of the
     */
    private final String OVERALLBUDGET;

    /**
     * This Constructot creates a new Object of Type  Budget.
     * @param name
     * @param overallbudget
     */

    public Budget(String name, String overallbudget) {
        NAME = name;
        OVERALLBUDGET = overallbudget;
    }
}
