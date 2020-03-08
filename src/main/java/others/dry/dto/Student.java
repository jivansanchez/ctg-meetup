package others.dry.dto;

import others.dry.enumerations.MaritalStatusEnum;

public class Student {

    private String id;
    private String name;
    private String midName;
    private String lastName;
    private int age;
    private MaritalStatusEnum maritalStatus;

    public Student(String id, String name, String midName, String lastName, int age, MaritalStatusEnum maritalStatus) {
        this.id = id;
        this.name = name;
        this.midName = midName;
        this.lastName = lastName;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MaritalStatusEnum getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
