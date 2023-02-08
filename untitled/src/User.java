import java.util.Scanner;

public class User {
    Managemant managemant = new Managemant();
    Scanner sc=new Scanner(System.in);
    String name;
    String address;

    String password;
    int phone;

    int balance=0;
   Car bookedCar;

    public User(String name,String address,int phone,Car booked) {
        this.name = name;
        this.address=address;
        this.bookedCar=booked;
        this.phone=phone;
    }
    public void deposit(){
        System.out.println("How much you want to deposit?");
        int deposit=sc.nextInt();
        balance+=deposit;
        System.out.println("Operation ended successfully");

    }

    public void withdraw(){
        System.out.println("How much you want to withdraw:");
        int withdrawal = sc.nextInt();
        if (withdrawal<=balance){
            balance-=withdrawal;
            System.out.println("Success!");
        }else {
            System.out.println("Error");
        }

    }

    public void transfer(int transfer){
        System.out.println("Enter a card number :");
        int cardNumber=sc.nextInt();
        if(cardNumber==managemant.getCardNumber()) {
            if(transfer<=balance){
                balance-=transfer;
      

            }else {
                System.out.println("Not enough balance to complete the operation");
            }

        }else {
            System.out.println("Wrong card number!");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Car getBookedCar() {
        return bookedCar;
    }

    public void setBookedCar(Car bookedCar) {
        this.bookedCar = bookedCar;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", booked=" + bookedCar +
                '}';
    }
}
