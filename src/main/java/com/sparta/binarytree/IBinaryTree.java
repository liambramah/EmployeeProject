package com.sparta.binarytree;

import com.sparta.binarytree.extensions.ChildNotFoundException;
import com.sparta.employee.Employee;

import java.util.ArrayList;

public interface IBinaryTree {
    Employee getRootElement();

    int getNumberOfElements();

    void addElement(Employee element);

    void addElements(ArrayList<Employee> elements);

    boolean findElement(Employee value);

    Employee getElement(String lastName);

    ArrayList<Employee> getAllElementsOf(String lastName);
}
