package singleton.Lazy;

//Challenge 2: Lazy Singleton with Thread Safety for a Logger
//Scenario: You’re designing a logging system for a web server. Multiple threads (e.g., handling user requests) need to write to a single log file.
// The logger should only be created when the first log message is written, but it must be thread-safe.
//Goal:
// Implement a lazy Singleton with synchronization for the logger.
//Steps:
//Define the Class: Create a Logger class with a method like log(String message) that writes to a file or console.
//Set Up the Instance: Declare a private, static instance variable (initially null).
//Restrict Creation: Use a private constructor to prevent external instantiation.
//Control Access: Write a public static method (e.g., getLogger()) that:
//Marks the method as synchronized.
//Checks if the instance is null, and if so, creates it.
//Returns the instance.


public class Logger {

    private static Logger logger=null;
    private Logger() {}

    public static synchronized Logger getLogger(String message){
        if(logger==null){
            logger=new Logger();
        }
        System.out.println(message );
        return logger;
    }
}


