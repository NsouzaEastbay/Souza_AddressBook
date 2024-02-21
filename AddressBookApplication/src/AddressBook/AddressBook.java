package AddressBook;

import AddressBook.data.AddressEntry;
import java.util.*;
import java.io.*;

/**
 * The class responsible for reading and writing the data for each entry.
 */
public class AddressBook {
    List<AddressEntry> addressEntryList;
    List<AddressEntry> foundEntryList;
    int[] indexofEntries;
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
    public void remove(){
        int size = foundEntryList.size();
        if (size == 1){
            System.out.println("Enter 'y' to confirm or 'n' to return to the main menu");
            Scanner scanner = new Scanner(System.in);
            String selection = scanner.nextLine();
            if (selection.equalsIgnoreCase("y")){
                addressEntryList.remove(indexofEntries[0]);
            }
            else{
                System.out.println("Returning to Main Menu");
            }
        }
        else{
            System.out.println("Enter the Number of the Entry you wish to remove:");
            Scanner scanner = new Scanner(System.in);
            int entryNumber = scanner.nextInt();
            if (entryNumber <= size && entryNumber > 0){
                System.out.println("Enter 'y' to confirm or 'n' to return to the main menu");
                String selection = scanner.next();
                if (selection.equalsIgnoreCase("y")){
                    addressEntryList.remove(indexofEntries[entryNumber - 1]);
                }
                else{
                    System.out.println("Returning to Main Menu");
                }
            }
            else if(entryNumber > size || entryNumber < 0){
                System.out.println("Invalid Entry Number");
            }
            else {
                System.out.println("Invalid String returning to Main Menu");
            }
        }
    }
    public boolean find(String startOf_lastName){
        foundEntryList = new ArrayList<>();
        AddressEntry[] addressEntries = list();
        indexofEntries = new int[addressEntryList.size()];
        int e = 0;
        for (AddressEntry addressEntry : addressEntries) {
            String currentLastName = addressEntry.getLastName();
            if (currentLastName.toLowerCase().contains(startOf_lastName.toLowerCase())){
                indexofEntries[e] = addressEntryList.indexOf(addressEntry);
                foundEntryList.add(addressEntry);
                e++;
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
            return true;
        }
        System.out.println("No Entries Found with part of Last Name: " + startOf_lastName);
        return false;
    }
}