public class User {

    private final int IDENTIFIER;
    private final String NAME;
    private final String PASSWORDHASH;
    private final String ROLE;
    private final String ClCLIET;
    private final String USERNAME;


    public User(int identifier, String NAME, String PASSWORDHASH, String ROLE, String CLIET, String USERNAME) {
        this.IDENTIFIER = identifier;
        this.NAME = NAME;
        this.PASSWORDHASH = PASSWORDHASH;
        this.ROLE = ROLE;
        ClCLIET = CLIET;
        this.USERNAME = USERNAME;
    }

    public String getNAME() {
        return NAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORDHASH() {
        return PASSWORDHASH;
    }

    public String getROLE() {
        return ROLE;
    }

    public String getCLIET() {
        return ClCLIET;
    }

    public int getIDENTIFIER() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        return "User{" +
                "IDENTIFIER=" + IDENTIFIER +
                ", NAME='" + NAME + '\'' +
                ", PASSWORDHASH='" + PASSWORDHASH + '\'' +
                ", ROLE='" + ROLE + '\'' +
                ", ClCLIET='" + ClCLIET + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                '}';
    }
}
