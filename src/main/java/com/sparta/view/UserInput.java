package com.sparta.view;

import java.util.Scanner;

public class UserInput {
    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        String searchedName = scanner.nextLine();
        return searchedName;
    }

}
