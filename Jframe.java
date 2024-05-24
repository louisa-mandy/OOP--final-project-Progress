package Parking_Ticket;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class Jframe {

    public static void handleJframe() {
        //label

        ImageIcon ParkingTicket = new ImageIcon("Logo.png");



        JLabel label = new JLabel(); // create the label
        label.setText(" ");
        label.setText("Welcome to our our Parking Ticket program");
        label.setIcon(ParkingTicket);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text to center
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text to the bottom of logo
        label.setForeground(Color.BLACK); // text color
        label.setFont(new Font("Monospaced", Font.BOLD, 20));

        //window
        JFrame frame = new JFrame();
        frame.setTitle("Parking Ticket Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000, 1000); // window size
        frame.setVisible(true);

        frame.add(label);

        ImageIcon image = new ImageIcon("kirby2.jpg"); // create an image icon
        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(new Color(255, 218, 218)); // Bg color
        frame.getContentPane().setBackground(Color.WHITE); // Bg color


    }
}
