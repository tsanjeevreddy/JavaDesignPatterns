package com.dts.core.designPatterns.creational.singleton.practice.logger;

public interface Logger {

    void log(java.util.logging.Logger level, String message);

    void setLogFile(String filePath);

    String getLogFile();

    // Flush the log entries to the file
    void flush();

    // Close the logger and release any resources
    void close();
}
