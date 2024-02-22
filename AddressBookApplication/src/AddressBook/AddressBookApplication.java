package AddressBook;


/**
 * Main File for the Address Book Application responsible for starting the program by calling a new instance of Menu.
 */

public class AddressBookApplication {
    public static void main(String[] args) {
        Menu Menu = new Menu();
        Menu.MainMenu();
    }
}