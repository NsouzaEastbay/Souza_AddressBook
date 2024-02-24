package AddressBook;

import java.util.Scanner;
import AddressBook.data.AddressEntry;

/**
 * The Menu class is for all the prompts that the users will need to navigate the program.
 * It includes the ability for the user to Load from File, Add a new entry, delete an existing
 * entry, find a previously entered entry, and list all the current entries.
 */
public class Menu {
    String command;
    boolean quit = true;

    /**
     * Function responsible for creating the menu for user inputs as well
     * as calling the function related to their choice. The function first
     * prints out a menu of choices for the user that will then accept the
     * letter associated with each of the functions displayed. If any of the
     * letters from the list are chosen, it will ask the user for the appropriate
     * input before calling the function.
     */
    public void MainMenu(){
        AddressBook addressBook = new AddressBook();
        addressBook.addressEntryList();
        while (quit) {
            System.out.println("---------------------");
            System.out.println("Main Menu");
            System.out.println("a) Load From File");
            System.out.println("b) Add New Entry");
            System.out.println("c) Remove Entry");
            System.out.println("d) Find Entry");
            System.out.println("e) List of Entries");
            System.out.println("f) Quit");
            System.out.println("---------------------");

            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "a" -> {
                    System.out.println("Enter Name of File You Wish to Import:");
                    String filename = scanner.nextLine();
                    addressBook.readFromFile(filename);
                }
                case "b" -> {
                    AddressEntry Entry = new AddressEntry();
                    System.out.println("First Name: ");
                    Entry.setFirstName(scanner.nextLine());
                    System.out.println("Last Name: ");
                    Entry.setLastName(scanner.nextLine());
                    System.out.println("Street Name: ");
                    Entry.setStreet(scanner.nextLine());
                    System.out.println("City Name: ");
                    Entry.setCity(scanner.nextLine());
                    System.out.println("State: ");
                    Entry.setState(scanner.nextLine());
                    System.out.println("Phone Number: ");
                    Entry.setPhone(scanner.nextLine());
                    System.out.println("Email: ");
                    Entry.setEmail(scanner.nextLine());
                    System.out.println("Zip Code: ");
                    Entry.setZip(scanner.nextInt());
                    addressBook.add(Entry);
                }
                case "c" -> {
                    System.out.println("Enter the Last Name of the contact you wish to remove:");
                    String lastName = scanner.nextLine();
                    if (addressBook.find(lastName)){
                        addressBook.remove();
                    }
                    else{
                        System.out.println("No Entry Found will last name: "+ lastName);
                        return;
                    }
                }
                case "d" -> {
                    System.out.println("Enter Part of all of the Last Name of the entry you wish to find:");
                    String startOf_lastName = scanner.nextLine();
                    addressBook.find(startOf_lastName);
                }
                case "e" -> {
                    AddressEntry[] addressEntries = addressBook.list();
                    int i = 1;
                    for (AddressEntry addressEntry : addressEntries) {
                        System.out.print(i + ": ");
                        System.out.println(addressEntry.toString());
                        i++;
                    }
                }
                case "f" -> {
                    System.out.println("Closing Program");
                    quit = false;
                }
                default -> {
                    System.out.println("Invalid Command");
                    System.out.println("\n\n");
                }
            }
        }
    }
}