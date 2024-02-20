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
        addressEntryList.sort(Comparator.comparing(AddressEntry::getLastName));
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
    public void remove(String lastName){

    }

    public void find(String startOf_lastName){
        List<AddressEntry> foundEntryList;
        foundEntryList = new ArrayList<>();
        AddressEntry[] addressEntries = list();
        for (AddressEntry addressEntry : addressEntries) {
            String currentLastName = addressEntry.getLastName();
            if (currentLastName.toLowerCase().contains(startOf_lastName.toLowerCase())){
                foundEntryList.add(addressEntry);
            }
        }
        if (!foundEntryList.isEmpty()){
            System.out.println("These Entries have been found:\n");
            int i = 0;
            int size = foundEntryList.size();
            for(int k = 1; i < size; k++){
                System.out.println(k +":" + foundEntryList.get(i));
                i++;
            }
            return;
        }
        System.out.println("No Entries Found with part of Last Name: " + startOf_lastName);
    }
}