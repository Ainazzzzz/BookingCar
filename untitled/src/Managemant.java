import java.util.Arrays;

public class Managemant  {

    long cardNumber=8456783;
    int balance;
    Car[] cars;
    Car[] bookedCars;
    Driver [] drivers;
    User[] bookedUsers;

    Car car;



  
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
