package com.sparta.binarytree;

import com.sparta.binarytree.extensions.ChildNotFoundException;
import com.sparta.employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BinaryTree implements IBinaryTree {

    Node root;
    Node currentNode;

    @Override
    public Employee getRootElement() {
        currentNode = root;
        return this.root.getValue();

    }

    @Override
    public int getNumberOfElements() {
        if (root == null) {
            return 0;
        }
        int total = 1;
        Node tempNode = currentNode;
        if (!currentNode.isLeftChildEmpty()) {
            currentNode = currentNode.getLeftChild();
            total += getNumberOfElements();
        }
        currentNode = tempNode;
        if (!currentNode.isRightChildEmpty()) {
            currentNode = currentNode.getRightChild();
            total += getNumberOfElements();
        }

        currentNode = tempNode;

        return total;
    }

    @Override
    public void addElement(Employee element) {
//if root node does not exist then create it, if it does exist then insert node
        if(root == null){
            root=new Node(element);
            currentNode=root;
        }
        boolean elementSet = false;
        if (element<currentNode.getValue()){
            if(currentNode.isLeftChildEmpty()){
                currentNode.setLeftChild(new Node(element));
            } else {
                currentNode=currentNode.getLeftChild();
                addElement(element);
                elementSet = true;
            }
        }

        if(element>currentNode.getValue() && !elementSet){
            if(currentNode.isRightChildEmpty()){
                currentNode.setRightChild(new Node(element));
            } else {
                currentNode=currentNode.getRightChild();
                addElement(element);
            }
        }

        currentNode = root;
    }

    @Override
    public void addElements(ArrayList<Employee> elements) {
        for (Employee element: elements) {
            this.addElement(element);
        }
    }

    @Override
    public boolean findElement(Employee value) {

        boolean element = value == currentNode.getValue();

        boolean elementFound = false;

        if (value < currentNode.getValue()){
            if(currentNode.isLeftChildEmpty()){
                element = false;
            } else {
                currentNode=currentNode.getLeftChild();
                element = findElement(value);
                elementFound = true;
            }
        }

        if(value>currentNode.getValue() && !elementFound){
            if(currentNode.isRightChildEmpty()){
                element = false;
            } else {
                currentNode=currentNode.getRightChild();
                element = findElement(value);
            }
        }

        currentNode = root;
        return element;
    }

    @Override
    public Employee getElement(String lastName) {
        return null;
    }

    @Override
    public ArrayList<Employee> getAllElementsOf(String lastName) {
        return null;
    }
}
