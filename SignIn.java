package Parking_Ticket;

import java.util.LinkedList;
import java.util.Scanner;

public class SignIn {

    static LinkedList<String> Email = new LinkedList<String>(); // making these linkedlist static so it can be accessed in the main class
    static LinkedList<String> Password = new LinkedList<String>(); // declare the number to string, so it could fit more characters
    static LinkedList<String> Username = new LinkedList<String>();

    static LinkedList<User> users = new LinkedList<>(); // Store user objects

    public static void handleSignIn() {

        Scanner mandy = new Scanner(System.in);  // Create a Scanner object



        // create a different user input? store the data to a linked list?
        System.out.println(" ");

        System.out.println("Sign In");

        System.out.println("Enter Your Email :"); // data type string
        String email = mandy.next();

        System.out.println("Enter Your Password : "); // string
        String password = mandy.next();

        System.out.println("Enter Your Username : "); // string
        String username = mandy.next();

        //default balance
        double initialBalance = 50;

        //create a new user and ass to the users list
        User newUser = new User (email, password, username,initialBalance);


        Email.add(email);
        Password.add(password);
        Username.add(username); // adding the acc info inside each linked list
        users.add(newUser);

        System.out.println("You have successfully created an account!");
        System.out.println(" ");
        System.out.println("Email : " + email); // displaying the acc info from the user input
        System.out.println("Password : " + password);
        System.out.println("Username : " + username);
        System.out.println("Balance : $" + initialBalance);
        System.out.println(" ");
        System.out.println("Please proceed to the login option ");


    }

    // this verify credentials is used to connect the data inside this signin class towards the main class. in order to check the inputted acc info from the user.
    // this verify credentials is used to connect the data inside this signin class towards the main class. in order to check the inputted acc info from the user.
    public static boolean verifyCredentials(String email, String password) {
        // Check if the entered email and password match the stored data
        for (int i = 0; i < Email.size(); i++) {
            if (email.equals(Email.get(i)) && password.equals(Password.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static Double getUserBalanceByUsername(String username) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return user.getBalance();
            }
        }
        return null; // Return null if user not found
    }

    public static void updateUserBalance(String username, double newBalance) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.setBalance(newBalance);
                System.out.println("Updated balance for " + username + ": $" + newBalance);
                return;
            }
        }
        System.out.println("User not found.");
    }

}


