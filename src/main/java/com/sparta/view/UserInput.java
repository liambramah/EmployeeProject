package com.sparta.view;

import java.util.Scanner;

public class UserInput {
    public static String getInput(){
        System.out.println("Welcome to this program");
        System.out.println("Please enter the last name of employee you want to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchedName = scanner.nextLine();
        return searchedName;
    }
}
