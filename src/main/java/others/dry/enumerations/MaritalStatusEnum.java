package others.dry.enumerations;

public enum  MaritalStatusEnum {

    SINGLE("single"),
    MARRIED("married"),
    DIVORCED("divorced"),
    WIDOWED("widowed"),
    COMPLICATED("complicated");

    private String maritalStatus;

    MaritalStatusEnum(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
