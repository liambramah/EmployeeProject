package com.sparta.employeefactory;

import com.sparta.employee.Employee;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class ConvertedEmployeeFactory {

    // convert an array of Strings into an ArrayList of employees

    // I have made a public array of employees that can be accessed anywhere
    public static ArrayList<Employee> getEmployees (int numberOfEmployees) {
        // return array list of employees
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            String[] arrayOfStrings = EmployeeFactory.getEmployees(numberOfEmployees);
            for (String s: arrayOfStrings) {
                employees.add(stringToEmployee(s));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return employees;

    }

    public static Employee stringToEmployee(String employee) throws ParseException {
        String [] employeeInfo = employee.split(",");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        Employee newEmployee = new Employee(employeeInfo[0], formatter.parse(employeeInfo[7]), employeeInfo[2], employeeInfo[4], employeeInfo[5].toCharArray()[0],
                formatter.parse(employeeInfo[8]));
        return newEmployee;

//        String empnum = "";
//        Date birthDate = new Date();
//        String firstName = "";
//        String lastName = "";
//        char gender = 'U';
//        Date hireDate = new Date();
//
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//
//        System.out.println(employeeInfo.length);
//        for (int i = 0; i <= employeeInfo.length; i++) {
//            if (i == 0) {
//                    empnum = employeeInfo[0];
//                } else if (i == 2) {
//                    firstName = employeeInfo[2];
//                } else if (i == 4) {
//                    lastName = employeeInfo[4];
//                } else if (i == 5) {
//                    gender = employeeInfo[5].charAt(0);
//                } else if (i == 7) {
//                    String tempDateStr = employeeInfo[7];
//                    birthDate = formatter.parse(tempDateStr);
//                } else if (i == 8) {
//                    String tempDateStr = employeeInfo[8];
//                    hireDate = formatter.parse(tempDateStr);
//                }
//            }
//
//        Employee emp = new Employee(empnum,birthDate, firstName, lastName, gender, hireDate);
//        emp.setLastName(lastName);
//        System.out.println(emp);
//        employees.add(emp);
//        return emp;
    }

    public static void main(String[] args) {
//        try {
//            String[] arrayOfStrings = EmployeeFactory.getEmployees(100);
//            System.out.println(arrayOfStrings[0]);
//            String[] employeeInfo = arrayOfStrings[0].split(",");
//            for (int i = 0; i < employeeInfo.length; i++) {
//                System.out.println(i + " " + employeeInfo[i]);
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println(getEmployees(5));
    }



}
