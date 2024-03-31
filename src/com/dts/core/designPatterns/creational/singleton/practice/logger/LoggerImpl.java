package com.dts.core.designPatterns.creational.singleton.practice.logger;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

// java package for logger: java.util.logging.Logger level
// spring package for logger:  org.springframework.boot.logging.LogLevel;
// same one can be done with spring logger as well
public class LoggerImpl implements Logger {

    private static Logger logger = null;
    private String logFilePath;
    private PrintWriter printWriter;
    private boolean isInitialized = false;

    private LoggerImpl() {
        // default constructor
    }

    public static Logger getInstance(){
        if(logger == null) {
            synchronized(LoggerImpl.class) {
                if(logger == null) {
                    logger = new LoggerImpl();
                }
            }
        }
        return logger;
    }

    public static void resetInstance(){
        if(logger != null) {
            logger = null;
        }
    }

    @Override
    public void log(java.util.logging.Logger level, String message) {
        if(!isInitialized) {
            throw new IllegalStateException("logger is not initialised.. please use setLogFile() meths to initialise..");
        }

        if(this.printWriter != null) {
            this.printWriter.println("[" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) +  "] " + level + ": " + message);
        }

    }

    @Override
    public void setLogFile(String filePath) {
        this.logFilePath = filePath;
        try {
            FileWriter fw = new FileWriter(filePath, true);
            this.printWriter = new PrintWriter(fw);
            isInitialized = true;
        } catch(IOException e) {
            throw new RuntimeException("Error sending log file..", e);
        }
    }

    @Override
    public String getLogFile() {
        return logFilePath;
    }

    @Override
    public void flush() {
        if(this.printWriter != null) {
            printWriter.flush();
            isInitialized = false;
        }
    }

    @Override
    public void close() {
        if(this.printWriter != null) {
            printWriter.close();
            isInitialized = false;
        }
    }
}
