package com.sparta.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConsoleHandlerConfig {
    public static void getConsoleHandler(Logger logger) {
        var consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());
        consoleHandler.setFilter(new CustomFilter());
        logger.addHandler(consoleHandler);
    }
}
