package com.sparta.model;

import com.sparta.employee.Employee;
import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;

public class Model {
    BinaryTree collectionOfEmployees=new BinaryTree();
    public  void addEmployees(ArrayList<Employee> employees){
            this.collectionOfEmployees.addElements(e);
    }
    public ArrayList<Employee> retriveEmployees(String lastName){
//        ArrayList<Employee> listOfEmployees= addEmployees();
//        ArrayList<Employee> selectedEmploees=ArrayList<Employee>();
//        selectedEmploees=collectionOfEmployees.findEmployee(lastName);
//        for(Employee e:listOfEmployees){
//            if(e.getLastName.equals(lastName)){
//                selectedEmploees.add(e)
//            }
//        }
        
        ArrayList<Employee> arrayOfEmployees = this.collectionOfEmployees.getAllElements(lastName);
        return arrayOfEmployees;

    }
}
