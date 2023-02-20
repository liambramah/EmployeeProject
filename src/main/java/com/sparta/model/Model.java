package com.sparta.model;

import com.sparta.employee.Employee;
import com.sparta.binarytree.BinaryTree;

import java.util.ArrayList;

public class Model {
    BinaryTree collectionOfEmployees = new BinaryTree();
    public  void addEmployees(ArrayList<Employee> employees){
            System.out.println("Last name is " + employees.get(0).getLastName());
            this.collectionOfEmployees.addElements(employees);
    }
    public ArrayList<Employee> retrieveEmployeesFromLastName(String lastName){
        
        ArrayList<Employee> arrayOfEmployees = this.collectionOfEmployees.getElement(lastName);
        return arrayOfEmployees;

    }
}
