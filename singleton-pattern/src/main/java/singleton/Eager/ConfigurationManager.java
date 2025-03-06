package singleton.Eager;

//Challenge 1: Eager Singleton for a Configuration Manager
//Scenario: You’re building a system for a small business that uses a single configuration file (e.g., settings like tax rates or store hours). The configuration should be loaded once when the app starts and shared across all parts of the system.
//Goal:
// Implement an eager Singleton to manage this configuration.
//Steps:
//Define the Class: Create a class called ConfigManager to hold configuration data (e.g., a simple key-value map or a few fields like taxRate).
//Set Up the Instance: Declare a private, static, final instance of ConfigManager and initialize it immediately (eagerly) with some default values or by reading a file.
//Restrict Creation: Make the constructor private so no one can create another instance.
//Provide Access: Add a public static method (e.g., getInstance()) that returns the pre-created instance.
//Test It: In a main method or test class, access the instance from two different “parts” of the app (e.g., a billing module and a reporting module) and verify it’s the same object (e.g., check object references or modify a value and see it reflected).
//Learning Focus: Understand how eager initialization guarantees one instance without thread concerns, and see its simplicity in action.

public class ConfigurationManager {
    private int taxRate;
    private static final ConfigurationManager instance = new ConfigurationManager();

    private ConfigurationManager() {
        this.taxRate = 10;
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "ConfigurationManager{" +
                "taxRate=" + taxRate +
                '}';
    }
}

