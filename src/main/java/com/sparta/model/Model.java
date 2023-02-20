package com.sparta.model;

import com.sparta.employee.Employee;
import com.sparta.binarytree.BinaryTree;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Model {
    BinaryTree collectionOfEmployees = new BinaryTree();
    public  void addEmployees(ArrayList<Employee> employees){
        final Set<String> set1 = new HashSet<>();

        for (int i = 0; i < employees.size(); i++) {
            if (!set1.add(employees.get(i).getLastName())) {
                System.out.println("the duplicates are: " + employees.get(i).getLastName());
            }
        }
        //System.out.println("last name that exists is " + employees.get(0).getLastName());
        this.collectionOfEmployees.addElements(employees);
    }
    public ArrayList<Employee> retrieveEmployeesFromLastName(String lastName){
        
        ArrayList<Employee> arrayOfEmployees = this.collectionOfEmployees.getElement(lastName);
        return arrayOfEmployees;

    }
}
