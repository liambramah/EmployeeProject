package com.sparta.view;

import com.sparta.model.Employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;

public class Output {
    public static void displayEmployeeInfo(Employee[] employees){
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        logger.log(Level.ALL,dateTime);
        logger.log(Level.ALL, UserInput.getInput());
        logger.log(Level.ALL, "Results found: " + employees.length);
        logger.log(Level.ALL, " ");
        for (Employee emp: employees){
            logger.log(Level.ALL,emp.getID());
            logger.log(Level.ALL,emp.getfirstName());
            logger.log(Level.ALL,emp.getlastName());
            logger.log(Level.ALL,emp.getHireDate());
            logger.log(Level.ALL,emp.getBirthdate());
            logger.log(Level.ALL,emp.getGender());
            logger.log(Level.ALL, "");
        }

    }

    public static void main(String[] args) {
        displayEmployeeInfo();
    }
}
