package Parking_Ticket;

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
        } else if (login == 2) {
            System.out.println(" Top Up Card Balance");

        } else if (login == 3) {
            System.out.println(" Pay Parking Fee ");

        } else {
            System.out.println("Please input a valid choice");
        }


    }
}
