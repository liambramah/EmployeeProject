package com.sparta.logger;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getMessage().contains("This");
    }

}
