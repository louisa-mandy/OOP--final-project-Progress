package Parking_Ticket;


public class User {
    // person, parkingcharge
/*
parkingChare(int chargePerHour, int totalhour, int totalcharge(chargeperhour * totalhour)) {
Persom.PlateNumber("a", "b", 'money')
total hour {
person(saldo) - totalcharge
}

}

person : string Name, string PlateNumber, int money; int sisaSaldo
*/
    private String email;
    private String password;
    private String username;
    private double balance;

    public User(String email, String password, String username, double balance) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
