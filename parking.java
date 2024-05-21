package Parking_Ticket;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class parking {
    public static void handleParking() {

        while (true){

        System.out.println(" ");

        System.out.println(" Enter a choice : ");
        System.out.println("1. Check Card Balance \n2. Top Up Card Balance \n3. Pay Parking Fee \n4. Go to previous page ");
        System.out.println(" ");

        Scanner mandy = new Scanner(System.in);  // Create a Scanner object
        Integer login = mandy.nextInt(); // user input


            if (login == 1) { // display the card balance depending the users account
                System.out.println(" Check Card Balance "); // we'll provide a default card balance, for ex Rp 50.000

                System.out.println("Please Enter Your Username: ");
                System.out.println(" ");
                String usernameToCheck = mandy.next();
                Double balance = SignIn.getUserBalanceByUsername(usernameToCheck);

                if ( balance != null ) { // if balance is true, print out user's balance
                    System.out.println(usernameToCheck+ "'s Balance: $" + balance);
                } else {
                    System.out.println("User not found, please try again");
                }


            } else if (login == 2) {
                System.out.println(" Top Up Card Balance");
                System.out.println(" ");
                System.out.println("Please Enter Your Username: ");

                String usernameToUpdate = mandy.next();
                System.out.println("Enter the amount to add to your balance: ");
                double amountToAdd = mandy.nextDouble();

                Double currentBalance = SignIn.getUserBalanceByUsername(usernameToUpdate);

                if (currentBalance != null) {
                    double newBalance = currentBalance + amountToAdd;
                    SignIn.updateUserBalance(usernameToUpdate, newBalance);
                } else {
                    System.out.println("User not found, please try again");
                }



            } else if (login == 3) {
                System.out.println(" Pay Parking Fee ");

                Scanner Pay = new Scanner(System.in);

                System.out.println("1. What type of vehicle are you driving? (Car / Truck/ Motorcycle)");
                String Vehicle = Pay.next();

                System.out.println("2. Enter the amount of time of your parked vehicle.. ( hours )");
                double Time = Pay.nextDouble();

                System.out.println("3. Which type of payment would you like to use ? (Card or Cash)");
                String Transaction = Pay.next();

                // for vehicle type
                // car = $3 per hour, truck = $4 per hour, Motorcycle = $2 per hour

                double rate = 0;
                switch (Vehicle.toLowerCase()) {
                    case "car":
                        rate = 3.0;
                        break;
                    case "truck":
                        rate = 4.0;
                        break;
                    case "motorcycle":
                        rate = 2.0;
                        break;
                    default:
                        System.out.println("Invalid input");
                        continue; // restarting the switch case
                }

                // for the hours
                // multiply each selected vehicle by the amount of hour the user input
                double parkingFee = rate * Time;
                System.out.println("Your Total Parking Fee: $" + parkingFee);

                // transaction
                // if user chooses card, automatically charge the total amount from their card balance ( for users who has account only )
                // else ( cash payment )

                if (Transaction.equalsIgnoreCase("Card")) {
                    System.out.println("Please enter your username: ");
                    String username = Pay.next();
                    Double currentBalance = SignIn.getUserBalanceByUsername(username);

                    if (currentBalance != null) {
                        if (currentBalance >= parkingFee) {
                            double newBalance = currentBalance - parkingFee;

                            System.out.println("Payment was a success!");
                            System.out.println("Current Balance: $" + newBalance);
                        } else {
                            System.out.println("Insufficient balance. Please top up your card.");
                        }
                    } else {
                        System.out.println("User not found, please try again.");
                    }

                } else if (Transaction.equalsIgnoreCase("Cash")) {
                    System.out.println("Total amount : $" + parkingFee + "in cash at the parking exit");

                } else {
                    System.out.println("Invalid input, please choose a valid payment option");
                }


            } else if (login == 4){ // FIX THIS
                Main.main(new String[]{});
                break;

            } else {
                System.out.println("Please input a valid choice");
            }

        }



    }


}
