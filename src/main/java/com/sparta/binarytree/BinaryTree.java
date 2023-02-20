package com.sparta.binarytree;

import com.sparta.employee.Employee;

import java.util.ArrayList;
import java.util.Date;

public class BinaryTree implements IBinaryTree {

    Node root;
    Node currentNode;

    @Override
    public String getRootElement() {
        currentNode = root;
        return this.root.getValue();

    }

    private Node getRoot() {
        return this.root;
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
            root=new Node(element.getLastName());
            root.addEmployee(element);
            currentNode=root;
            return;
        }
        boolean elementSet = false;

        Node tempNode = currentNode;
        if (element.getLastName().compareTo(currentNode.getValue()) < 0){
            if(currentNode.isLeftChildEmpty()){
                currentNode.setLeftChild(new Node(element.getLastName()));
                currentNode.getLeftChild().addEmployee(element);
            } else {
                currentNode=currentNode.getLeftChild();
                addElement(element);
                elementSet = true;
            }
        }

        currentNode = tempNode;

        if(element.getLastName().compareTo(currentNode.getValue()) > 0 && !elementSet){
            if(currentNode.isRightChildEmpty()){
                currentNode.setRightChild(new Node(element.getLastName()));
                currentNode.addEmployee(element);
            } else {
                currentNode=currentNode.getRightChild();
                addElement(element);
                elementSet = true;
            }
        }
        currentNode = tempNode;

        if (element.getLastName().compareTo(currentNode.getValue()) == 0) {
            currentNode.addEmployee(element);
        }
    }

    @Override
    public void addElements(ArrayList<Employee> elements) {
        for (Employee element: elements) {
            this.addElement(element);
        }
    }

    @Override
    public boolean findElement(Employee value) {

        boolean element = value.getLastName() == currentNode.getValue();

        boolean elementFound = false;

        if (value.getLastName().compareTo(currentNode.getValue()) < 0){
            if(currentNode.isLeftChildEmpty()){
                element = false;
            } else {
                currentNode=currentNode.getLeftChild();
                element = findElement(value);
                elementFound = true;
            }
        }

        if(value.getLastName().compareTo(currentNode.getValue()) > 0 && !elementFound){
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
    public ArrayList<Employee> getElement(String lastName) {

        ArrayList<Employee> employees = new ArrayList<>();

        boolean elementFound = false;

        Node tempNode = currentNode;

        if (lastName.compareTo(currentNode.getValue()) < 0){
            if(!currentNode.isLeftChildEmpty()){
                currentNode=currentNode.getLeftChild();
                employees.addAll(getElement(lastName));
                elementFound = true;
            }
        }
        currentNode = tempNode;
        if(lastName.compareTo(currentNode.getValue()) > 0 && !elementFound){
            if(!currentNode.isRightChildEmpty()){
                currentNode=currentNode.getRightChild();
                employees.addAll(getElement(lastName));
            }
        }


        currentNode = tempNode;
        if (currentNode.getValue().compareTo(lastName) == 0) {
            employees.addAll(currentNode.getEmployees());
        }
        return employees;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("1234", new Date(), "John", "Smith",
                'm', new Date());
        Employee employee2 = new Employee("1234", new Date(), "Jane", "Smith",
                'm', new Date());
        Employee employee3 = new Employee("1234", new Date(), "Thomas", "Jones",
                'm', new Date());
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElement(employee1);
        binaryTree.addElement(employee2);
        binaryTree.addElement(employee3);

        System.out.println(binaryTree.getElement("Smith"));
        System.out.println("\n rubbish \n");
        System.out.println(binaryTree.getElement("Jones"));
    }
}
