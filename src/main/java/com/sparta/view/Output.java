package com.sparta.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.logging.Level;

public class Output {
//    public static void displayEmployeeInfo(ArrayList<Employee> employees){
//        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        logger.log(Level.ALL,dateTime);
//        logger.log(Level.ALL, UserInput.getInput());
//        logger.log(Level.ALL, "Results found: " + employees.length);
//        logger.log(Level.ALL, " ");
//        for (Employee emp: employees){
//            logger.log(Level.ALL,emp.toString());;
//        }
//
//    }
//
//    //Code before is for Sina/Liam - to format the date into correct format
//    public static String correctDateFormat(String date){
//        Deque<String> resultStack = new ArrayDeque();
//        //        mm/dd/yyyy; format given
//        //        yyyy-mm-dd; format wanted
//        String result = "";
//        StringBuilder monthGiven = new StringBuilder();
//
//        date = date.replace("/", "-");
//        System.out.println(date);
//        int i = date.length() -1 ;
//        while (i >= date.length() -4){
//            resultStack.addFirst(String.valueOf((date.charAt(i))));
//            System.out.println(date.charAt(i));
//            i--;
//        }
//
//        monthGiven.append(date.charAt(0));
//        monthGiven.append(date.charAt(1));
//        System.out.println(monthGiven);
//
//        if (monthGiven.toString().contains("-")){
//            monthGiven = new StringBuilder("0" + date.charAt(0));
//        }
//        System.out.println(monthGiven.toString());
//        resultStack.addLast("-");
//        resultStack.addLast(monthGiven.toString());
//
//        resultStack.addLast("-");
//        resultStack.addLast(String.valueOf(date.charAt(date.length()-7)));
//        resultStack.addLast(String.valueOf(date.charAt(date.length()-6)));
//
//        String resultDate = String.join("", resultStack);
//        return resultDate;
//    }

}
