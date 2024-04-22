//****************************************************************************
// Title: Demonstrating the Dependency Inversion Principle (DIP)
// Author: Sadia Afrin Tamanna
//         Undergraduate Student
//         Khulna University.
//****************************************************************************

/**
 * Represents the abstraction of a data repository.
 * This interface defines the contract for classes that provide data retrieval functionality.
 */
interface DataProvider {
    /**
     * Fetches data from the repository.
     *
     * @return The fetched data.
     */
    String fetchData();
}

/**
 * Represents a concrete implementation of a data repository that fetches data from a database.
 * This class implements the DataProvider interface and retrieves data from a database source.
 */
class DatabaseProvider implements DataProvider {
    /**
     * Fetches data from the database.
     *
     * @return The fetched data.
     */
    @Override
    public String fetchData() {
        return "Data from database";
    }
}

/**
 * Represents the business logic module that depends on a data repository.
 * This class encapsulates the logic for retrieving data using a provided data repository.
 */
class BusinessLogic {
    private DataProvider dataProvider;

    /**
     * Constructs a BusinessLogic object with a data repository dependency.
     *
     * @param provider The data repository dependency.
     */
    public BusinessLogic(DataProvider provider) {
        this.dataProvider = provider;
    }

    /**
     * Retrieves data using the injected data repository.
     *
     * @return The retrieved data.
     */
    public String retrieveData() {
        return dataProvider.fetchData();
    }
}

/**
 * Demonstrates the usage of the Dependency Inversion Principle (DIP).
 * This class contains the main method to demonstrate the DIP by creating instances of BusinessLogic and DataProvider.
 */
public class DIPDemo {
    /**
     * Main method to demonstrate the Dependency Inversion Principle.
     *
     * @param arguments Command-line arguments (not used).
     */
    public static void main(String[] arguments) {
        // Create a database repository and use it with BusinessLogic
        DataProvider provider = new DatabaseProvider();
        BusinessLogic logic = new BusinessLogic(provider);
        System.out.println("Data retrieved: " + logic.retrieveData());
    }
}
