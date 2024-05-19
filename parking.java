package Parking_Ticket;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class parking {
    public static void handleParking() {

        System.out.println(" ");

        System.out.println(" Enter a choice : ");
        System.out.println("1. Check Card Balance \n2. Top Up Card Balance \n3. Pay Parking Fee ");
        System.out.println(" ");

        Scanner mandy = new Scanner(System.in);  // Create a Scanner object
        Integer login = mandy.nextInt(); // user input

        if (login == 1) { // display the card balance depending the users account
            System.out.println(" Check Card Balance "); // we'll provide a default card balance, for ex Rp 50.000

            System.out.println("Please Enter Your Username: ");
            System.out.println(" ");
            String usernameToCheck = mandy.next();
            Double balance = SignIn.getUserBalanceByUsername(usernameToCheck);

            if ( balance != null ) { // if balanca is true, print out user's balance
                System.out.println(usernameToCheck+ "'s Balance: " + balance);
            } else {
                System.out.println("User not found, please try again");
            }


        } else if (login == 2) {
            System.out.println(" Top Up Card Balance");
            System.out.println(" ");
            System.out.println("Please Enter Your Username: ");

            String usernameToUpdate = mandy.next();

            System.out.println("Enter your wanted balance: ");
            double newBalance = mandy.nextDouble();

            SignIn.updateUserBalance(usernameToUpdate, newBalance);



        } else if (login == 3) {
            System.out.println(" Pay Parking Fee ");


        } else {
            System.out.println("Please input a valid choice");
        }


    }


}
