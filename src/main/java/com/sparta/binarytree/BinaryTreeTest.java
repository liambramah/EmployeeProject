package com.sparta.binarytree;

import com.sparta.employee.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    @DisplayName("Testing add employees")
    public void testingAddEmployees() {
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

        Assertions.assertEquals("Smith", binaryTree.getRootElement());
        Assertions.assertEquals("Jones", binaryTree.root.getLeftChild().getValue());
        Assertions.assertEquals("John", binaryTree.root.getEmployees().get(0).getFirstName());
        Assertions.assertEquals( "Jane", binaryTree.root.getEmployees().get(1).getFirstName());

    }

    @Test
    @DisplayName("Testing get employees")
    public void testingGetEmployees() {
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

        Assertions.assertEquals("John", binaryTree.getElement("Smith").get(0).getFirstName());
        Assertions.assertEquals("Jane", binaryTree.getElement("Smith").get(1).getFirstName());
        Assertions.assertEquals("Thomas", binaryTree.getElement("Jones").get(0).getFirstName());
    }

}