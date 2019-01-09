package com.talkingdata.sdmk.design.pattern.chainOfResponsibilitypattern;

/**
 * User：    ysl
 * Date:   2018/1/14
 * Time:   22:22
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected  int level;
    protected AbstractLogger netLogger;

    public AbstractLogger getNetLogger() {
        return netLogger;
    }

    public void setNetLogger(AbstractLogger netLogger) {
        this.netLogger = netLogger;
    }

    public void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(null != netLogger){
            netLogger.logMessage(level,message);
        }
    }

    protected  abstract void write(String message);
}
