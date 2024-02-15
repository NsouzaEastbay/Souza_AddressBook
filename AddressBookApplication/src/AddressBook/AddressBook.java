package AddressBook;

import AddressBook.data.AddressEntry;
import java.util.*;

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
        //Arrays.sort(completeList);
        return completeList;
    }
}