package AddressBook;

import java.util.Scanner;

public class Menu {
    String command;
    boolean quit = true;
    public void MainMenu(){

        while (quit) {
            System.out.println("Main Menu");
            System.out.println("a) Load From File");
            System.out.println("b) Add New Entry");
            System.out.println("c) Remove Entry");
            System.out.println("d) Find Entry");
            System.out.println("e) List of Entries");
            System.out.println("f) Quit");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            if (command.equals("Test")){
                System.out.println("It Works");
            }
            else{
                quit = false;
            }
        }
    }
}