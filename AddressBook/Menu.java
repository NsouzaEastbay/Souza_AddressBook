package AddressBook;

import java.util.Objects;
import java.util.Scanner;

/**
 * Menu Class for the Address Book Application which
 * handles the prompts that ask the user to input
 * information they want into their address book.
 */
public class Menu {
    /*Though this can be done easier this asks the user for each prompt individually
      then writes each of them to the file followed by a common for all put the last
       which is replaced by a new line to divide entries in the book*/
    public static void prompt_FirstName(){
        System.out.println("First Name:");
        Scanner firstName = new Scanner(System.in);
        String FirstName = firstName.nextLine();
        FileIO.WriteFile(FirstName);
        FileIO.WriteFile(",");
    }
    public static void prompt_LastName(){
        System.out.println("Last Name:");
        Scanner lastName = new Scanner(System.in);
        String LastName = lastName.nextLine();
        FileIO.WriteFile(LastName);
        FileIO.WriteFile(",");
    }
    public static void prompt_Street(){
        System.out.println("Street Name:");
        Scanner streetName = new Scanner(System.in);
        String StreetName = streetName.nextLine();
        FileIO.WriteFile(StreetName);
        FileIO.WriteFile(",");
    }
    public static void prompt_City(){
        System.out.println("City Name:");
        Scanner cityName = new Scanner(System.in);
        String CityName = cityName.nextLine();
        FileIO.WriteFile(CityName);
        FileIO.WriteFile(",");
    }
    public static void prompt_State(){
        System.out.println("State Name:");
        Scanner stateName = new Scanner(System.in);
        String StateName = stateName.nextLine();
        FileIO.WriteFile(StateName);
        FileIO.WriteFile(",");
    }
    public static void prompt_Zip(){
        System.out.println("Zip Code:");
        Scanner zipCode = new Scanner(System.in);
        String ZipCode = zipCode.nextLine();
        FileIO.WriteFile(ZipCode);
        FileIO.WriteFile(",");
    }
    public static void prompt_Telephone(){
        System.out.println("Telephone Number:");
        Scanner telephoneNumber = new Scanner(System.in);
        String TelephoneNumber = telephoneNumber.nextLine();
        FileIO.WriteFile(TelephoneNumber);
        FileIO.WriteFile(",");
    }
    public static void prompt_Email(){
        System.out.println("Email Address:");
        Scanner emailAddress = new Scanner(System.in);
        String EmailAddress = emailAddress.nextLine();
        FileIO.WriteFile(EmailAddress);
        FileIO.WriteFile("\n");
    }
    public static boolean menu_Prompt(){
        System.out.println("Main Menu");
        Scanner command = new Scanner(System.in);
        return Objects.equals(command.nextLine(), "R");
    }
}