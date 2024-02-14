package AddressBook;

import java.util.Scanner;
import AddressBook.data.AddressEntry;

public class Menu {
    String command;
    boolean quit = true;
    public void MainMenu(){
        AddressBook addressBook = new AddressBook();
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
            if (command.equals("a")){

            }
            else if (command.equals("b")){
                addressBook.addressEntryList();
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
            else if (command.equals("c")){

            }
            else if (command.equals("d")){

            }
            else if (command.equals("e")){
                AddressEntry[] addressEntries = addressBook.list();
                for (AddressEntry addressEntry : addressEntries) {
                    System.out.println(addressEntry.toString());
                }
            }
            else if (command.equals("f")){
                quit = false;
            }
            else{
                System.out.println("Invalid Command");
                System.out.println("\n\n");
            }
        }
    }
}