//****************************************************************************
// Title: Illustrating the Interface Segregation Principle (ISP)
// Author: Sadia Afrin Tamanna
//         Undergraduate Student
//         Khulna University
//****************************************************************************

/**
 * Represents a device that can connect to a network.
 */
interface NetworkConnector {
    /**
     * Establishes a connection to a network.
     */
    void establishNetworkConnection();

    /**
     * Terminates the connection to the network.
     */
    void terminateNetworkConnection();
}

/**
 * Represents a device that can connect to a printer.
 */
interface PrinterConnector {
    /**
     * Establishes a connection to a printer.
     */
    void establishPrinterConnection();

    /**
     * Terminates the connection to the printer.
     */
    void terminatePrinterConnection();

    /**
     * Prints a document.
     *
     * @param document The document to be printed.
     */
    void printDocument(String document);
}

/**
 * Represents a computer that can connect to both a network and a printer.
 */
class ComputerDevice implements NetworkConnector, PrinterConnector {
    // NetworkConnector methods
    @Override
    public void establishNetworkConnection() {
        System.out.println("Connected to network");
    }

    @Override
    public void terminateNetworkConnection() {
        System.out.println("Disconnected from network");
    }

    // PrinterConnector methods
    @Override
    public void establishPrinterConnection() {
        System.out.println("Connected to printer");
    }

    @Override
    public void terminatePrinterConnection() {
        System.out.println("Disconnected from printer");
    }

    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}

/**
 * Demonstrates the usage of a computer that can connect to both a network and a printer.
 */
class ISPDemo {
    public static void main(String[] arguments) {
        // Create a computer and connect it to the network and printer
        ComputerDevice computer = new ComputerDevice();
        computer.establishNetworkConnection();
        computer.establishPrinterConnection();
        computer.printDocument("Test document");

        // Disconnect computer from the network and printer
        computer.terminateNetworkConnection();
        computer.terminatePrinterConnection();
    }
}

/*
In the above program, the NetworkConnector interface represents the responsibility of establishing
and terminating a connection to a network, while the PrinterConnector interface represents the responsibility
of establishing and terminating a connection to a printer, and printing a document. The ComputerDevice
class implements both interfaces, adhering to the Interface Segregation Principle (ISP) by
implementing only the methods relevant to its specific responsibilities.
*/
