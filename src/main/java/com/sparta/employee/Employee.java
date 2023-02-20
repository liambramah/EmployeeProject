package com.sparta.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private String employeeNumber;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private char gender;
    private Date hireDate;

    public Employee(String employeeNumber, Date birthDate, String firstName, String lastName, char gender, Date hireDate){
        this.employeeNumber = employeeNumber;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    @Override
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String newBirthDate = formatter.format(this.getBirthDate());
        String newHireDate = formatter.format(this.getHireDate());

        String employeeAsString = "EmployeeID: " + this.getEmployeeNumber() + "\nFirst Name: " + this.getFirstName() + "\nLast Name: " + this.lastName + "\nHire Date: " + newHireDate +
                "\nBirth Date: " + newBirthDate + "\nGender: " + this.getGender() + "\n" + "\n";
        return employeeAsString;
    }
}