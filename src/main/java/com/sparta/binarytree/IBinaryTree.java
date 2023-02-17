package com.sparta.binarytree;

import com.sparta.employee.Employee;

import java.util.ArrayList;

public interface IBinaryTree {
    String getRootElement();

    int getNumberOfElements();

    void addElement(Employee element);

    void addElements(ArrayList<Employee> elements);

    boolean findElement(Employee value);

    ArrayList<Employee> getElement(String lastName);
}
