package AddressBook;

import java.util.Scanner;

public class Menu {
    String command;
    boolean quit = true;
    public void MainMenu(){

        while (quit) {
            System.out.println("\n\n");
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
                System.out.println("It Works");
            }
            else if (command.equals("b")){

            }
            else if (command.equals("c")){

            }
            else if (command.equals("d")){

            }
            else if (command.equals("e")){

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