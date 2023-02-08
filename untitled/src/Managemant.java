import java.util.Arrays;

public class Managemant  {

    long cardNumber=8456783;
    int balance;
    Car[] cars;
    Car[] bookedCars;
    Driver [] drivers;
    User[] bookedUsers;

    Car car;



    public void transaction(int transfer) {
        for (int i = 0; i <cars.length; i++) {

        if(transfer<=cars[i].getPrice()) {
            balance += transfer;
            System.out.println("YOU SUCCESSFULLY BOOKED THE CAR!!!");
        }else {
            int t= (int) (cars[i].getPrice()-transfer);
            System.out.println("Car price is"+cars[i].getPrice());
            System.out.println(t + " Left to pay/try again");
        }

    }}
    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User[] getBookedUsers() {
        return bookedUsers;
    }

    public void setBookedUsers(User[] bookedUsers) {
        this.bookedUsers = bookedUsers;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    public Car[] getBookedCars() {
        return bookedCars;
    }

    public void setBookedCars(Car[] bookedCars) {
        this.bookedCars = bookedCars;
    }

    @Override
    public String toString() {
        return "Managemant{" +
                "cars=" + Arrays.toString(cars) +
                ", drivers=" + Arrays.toString(drivers) +
                ", bookedUsers=" + Arrays.toString(bookedUsers) +
                '}';
    }


}
