package com.sparta.view;

import com.sparta.model.Employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;

public class Output {
    public static void displayEmployeeInfo(ArrayList<Employee> employees){
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        logger.log(Level.ALL,dateTime);
        logger.log(Level.ALL, UserInput.getInput());
        logger.log(Level.ALL, "Results found: " + employees.length);
        logger.log(Level.ALL, " ");
        for (Employee emp: employees){
            logger.log(Level.ALL,emp.toString());;
        }

    }

}
