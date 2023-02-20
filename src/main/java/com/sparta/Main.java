package com.sparta;

import com.sparta.controller.EmployeeController;
import com.sparta.logger.ConsoleHandlerConfig;
import com.sparta.model.Model;
import com.sparta.view.EmployeeView;

import javax.swing.text.View;

public class Main {
    public static void main(String[] args) {
        EmployeeView view = new EmployeeView();
        Model model = new Model();
        EmployeeController controller = new EmployeeController(model, view);
        controller.run();
    }
}