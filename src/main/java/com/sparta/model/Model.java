package com.sparta.model;

import com.sparta.employee.Employee;
import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;

public class Model {
    BinaryTree collectionOfEmployees;
    public ArrayList<Employee> addEmployees(){

    }
    public ArrayList<Employee> retriveEmployees(String lastName){
        ArrayList<Employee> listOfEmployees= addEmployees();
        ArrayList<Employee> selectedEmploees=ArrayList<Employee>();
        for(Employee e:listOfEmployees){
            if(e.getLastName.equals(lastName)){
                selectedEmploees.add(e)
            }
        }
        return selectedEmploees;

    }
}
