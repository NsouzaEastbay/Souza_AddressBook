package AddressBook;

import AddressBook.data.AddressEntry;

/**
 * Main File for the Address Book Application
 */

public class AddressBookApplication {
    public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
            int i = 1;
            while (i <= 2) {
                    AddressEntry Entry = new AddressEntry();
                    if (i == 1) {
                            addressBook.addressEntryList();
                            Entry.setFirstName("Test");
                            Entry.setLastName("test");
                            Entry.setCity("test");
                            Entry.setEmail("Test@gmail.com");
                            Entry.setState("Test");
                            Entry.setPhone("111-111-1111");
                            Entry.setZip(12345);
                            Entry.setStreet("Test");
                            addressBook.add(Entry);
                            i++;
                    }
                    else {
                            Entry.setFirstName("Not a Test");
                            addressBook.add(Entry);
                            i++;
                    }
            }


            AddressEntry[] addressEntries = addressBook.list();
            for (int k = 0; k < addressEntries.length; k++){
                System.out.println(addressEntries[k].toString());
            }
    }
}