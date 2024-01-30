package AddressBook;

import java.io.*;

/**
 * Class that handles reading and writing the user inputted information to a file.
 */
public class FileIO {
    static void WriteFile(String x){
        //This takes the inputted information and appends it to the end of address.data.
        try {
            String filename = "address.data";
            FileWriter fw = new FileWriter(filename, true); //the true will append the new data
            fw.write(x);//appends the string to the file
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
