package com.sparta.binarytree;

import com.sparta.employee.Employee;

public class Node {
    private final Employee value;
    private Node leftChild;
    private Node rightChild;

    public Node(Employee value) {
        this.value = value;
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

    public Employee getValue() {
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
