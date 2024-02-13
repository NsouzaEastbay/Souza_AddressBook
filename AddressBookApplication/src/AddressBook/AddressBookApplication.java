package AddressBook;

import AddressBook.data.AddressEntry;
/**
 * Main File for the Address Book Application responsible for taking the inputs
 */

public class AddressBookApplication {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        AddressEntry Entry = new AddressEntry();
        Menu Menu = new Menu();
        Menu.MainMenu();
    }
}