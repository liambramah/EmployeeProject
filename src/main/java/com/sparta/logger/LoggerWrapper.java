package com.sparta.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerWrapper {
    public static Logger setUpPersonalLogger(Logger logger) {

        FileHandlerConfig.getFileHandler(logger);
        ConsoleHandlerConfig.getConsoleHandler(logger);


        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        return logger;
    }
}
