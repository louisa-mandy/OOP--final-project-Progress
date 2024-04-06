package Parking_Ticket;
//idea

/* make a Parking_Ticket.parking ticket program */

//start program


// user would input their vehicle type ( car, motorcycle, truck )
// user would input the amount of time they have spent Parking_Ticket.parking in the area
// user would choose between two options, whether they are a regular member / gold member / platinum member
// regular member = 5% discount, gold member = 10% discount, platinum member = 20% discount
// the output would show the total amount they have to pay for the Parking_Ticket.parking fee

// user could make a member depending on the amount of balance they have in their card
// for example, to upgrade member, the user would have to have at least 500$ ??

/* output :
*  1. check your card balance
*  2. top up your card
*  3. register a membership - input account and password??
*  3. pay Parking_Ticket.parking fee */

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] HAHA) {


        Scanner mandy = new Scanner(System.in); // create the scanner

        while (true) {
            System.out.println(" ");
            System.out.println("Welcome to our our Parking Ticket program ");
            System.out.println(" ");
            System.out.println("Enter a choice :  ");
            System.out.println("1. Don't have an account yet? Sign In \n2. Log In Account");


            String user_input = mandy.nextLine(); // user input


            switch (user_input) {
                case "1": // sign in
                    SignIn.handleSignIn();
                    break;

                case "2": ///login
                    //after user would log in
                    //make another switch statement and provide the rest of the options

                    // make another user input / scanner???
                    System.out.println(" ");
                    System.out.println("Login");

                    System.out.println("Enter your email : ");
                    String enteredEMAIL = mandy.next();
                    System.out.println(" ");

                    System.out.println("Enter your password : ");
                    String enteredPASSWORD = mandy.next();


                    boolean found = SignIn.verifyCredentials(enteredEMAIL, enteredPASSWORD);

                        if (found) {
                            System.out.println(" ");
                            System.out.println("Login Successful!");

                            parking.handleParking();
                        } else {
                            System.out.println("Invalid email or password. Please try again.");
                        }
                        break;



            }
        }
    }
}