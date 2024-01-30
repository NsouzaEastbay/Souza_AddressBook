package AddressBook;
/**
 * Main File for the Address Book Application
 */

public class AddressBookApplication {
    public static void main(String[] args) {
        while(Menu.menu_Prompt()){
            Menu.prompt_FirstName();
            Menu.prompt_LastName();
            Menu.prompt_Street();
            Menu.prompt_City();
            Menu.prompt_State();
            Menu.prompt_Zip();
            Menu.prompt_Telephone();
            Menu.prompt_Email();
        }
        System.exit(0);
    }
}