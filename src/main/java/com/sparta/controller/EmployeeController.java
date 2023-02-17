package com.sparta.controller;

import com.sparta.employee.Employee;
import com.sparta.employeefactory.ConvertedEmployeeFactory;
import com.sparta.model.Model;
import com.sparta.view.EmployeeView;

import java.util.ArrayList;

public class EmployeeController{

//    RetrieveEmployeesFromLastName retrieveLastName = new RetrieveEmployeesFromLastName();

//    RetrieveEmployeesFromLastName retrieveLastName = new RetrieveEmployeesFromLastName();;

    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setUpEmployees(){

        ArrayList<Employee> listOfEmployees = ConvertedEmployeeFactory.getEmployees(2);
        model.addEmployees(listOfEmployees);
    }

    public ArrayList<Employee> searchLastName(String retrieveEmployee){
        return model.retrieveEmployeesFromLastName(retrieveEmployee);
    }

    public void run(){
        this.setUpEmployees(); // We want to set this up before the user can do anything
        view.displayPrompt();
        String inputLastName = view.getInput();
        ArrayList<Employee> chosenName = searchLastName(inputLastName);
        view.displayOutput(chosenName);
    }


}
