package com.sparta.view;

import com.sparta.employee.Employee;
import com.sparta.logger.LoggerWrapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeView {

   public void displayPrompt() {
       System.out.println("Welcome to this program");
       System.out.println("Please enter the last name of employee you want to search: ");

   }

   public String getInput() {
       Scanner scanner = new Scanner(System.in);
       String searchedName = scanner.nextLine();
       return searchedName;
   }

   public void displayOutput(String searchedName, ArrayList<Employee> employees) {
       Logger logger = LoggerWrapper.setUpPersonalLogger(Logger.getLogger(this.getClass().getName()));
        logger.log(Level.INFO, "Current Date: " + LocalDate.now().toString());
       logger.log(Level.INFO, "\nSearched name: " + searchedName + "\n\n");
       if (employees.size() == 0) {
           logger.log(Level.INFO, "Last name does not exist in binary tree");
       } else {
           for (Employee emp : employees) {
               logger.log(Level.INFO, emp.toString());
           }
       }
   }
}
