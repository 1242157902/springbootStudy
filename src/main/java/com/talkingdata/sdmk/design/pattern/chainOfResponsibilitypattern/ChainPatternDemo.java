package com.talkingdata.sdmk.design.pattern.chainOfResponsibilitypattern;

/**
 * User：    ysl
 * Date:   2018/1/14
 * Time:   22:26
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNetLogger(fileLogger);
        fileLogger.setNetLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"this is an Information");
        loggerChain.logMessage(AbstractLogger.DEBUG,"this is an Debug level Information");
        loggerChain.logMessage(AbstractLogger.ERROR,"this is error  Information");

    }
}
