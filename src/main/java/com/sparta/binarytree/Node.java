package com.sparta.binarytree;

import com.sparta.employee.Employee;

import java.util.ArrayList;

public class Node {
    private final String value;

    private ArrayList<Employee> lastNameEmployees = new ArrayList<>();
    private Node leftChild;
    private Node rightChild;

    public Node(String value) {
        this.value = value;
    }

    public void addEmployee(Employee employee) {
        lastNameEmployees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return lastNameEmployees;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public String getValue() {
        return value;
    }

    public boolean isLeftChildEmpty() {
        if (leftChild == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRightChildEmpty() {
        if (rightChild == null) {
            return true;
        } else {
            return false;
        }
    }
}
