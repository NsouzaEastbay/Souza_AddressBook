package AddressBook;

import AddressBook.data.AddressEntry;
import java.util.*;
import java.io.*;

/**
 * The class responsible for reading and writing the data for each entry.
 */
public class AddressBook {
    List<AddressEntry> addressEntryList;
    public void addressEntryList(){
        this.addressEntryList = new ArrayList<>();
    }
    public void add(AddressEntry addressEntry){
        this.addressEntryList.add(addressEntry);
    }
    public AddressEntry[] list(){
        AddressEntry[] completeList = new AddressEntry[this.addressEntryList.size()];
        this.addressEntryList.toArray(completeList);
        return completeList;
    }
    public void readFromFile(String filename){
        try {
            File File = new File(filename);
            Scanner readFile = new Scanner(File);
            while (readFile.hasNextLine()){
                AddressEntry Entry = new AddressEntry();
                Entry.setFirstName(readFile.nextLine());
                Entry.setLastName(readFile.nextLine());
                Entry.setStreet(readFile.nextLine());
                Entry.setCity(readFile.nextLine());
                Entry.setState(readFile.nextLine());
                Entry.setPhone(readFile.nextLine());
                Entry.setEmail(readFile.nextLine());
                Entry.setZip(Integer.parseInt(readFile.nextLine()));
                add(Entry);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}