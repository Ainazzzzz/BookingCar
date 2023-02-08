import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] bookedCars =new String[10];
        User[] users = new User[10];
        Scanner sc = new Scanner(System.in);
        Bank bank=new Bank();
        User [] bankAcc=new User[10];


        Engine engine = new Engine();
        engine.setMade("Japan");
        engine.setPower(5);

        Driver driver = new Driver();
        driver.setExperience(2);
        driver.setName("Asan");

        Car car1 = new Car();
        car1.setCarsName("Ferrari");
        car1.setBody("V3");
        car1.setGroup(driver);
        car1.setMotor(engine);
        car1.setPrice(12000);

        Engine engine1 = new Engine();
        engine1.setMade("America");
        engine1.setPower(3);

        Driver driver1 = new Driver();
        driver1.setName("Ainazik");
        driver1.setExperience(4);

        Car car = new Car();
        car.setMotor(engine1);
        car.setBody("Fit");
        car.setCarsName("Honda");
        car.setGroup(driver1);
        car.setPrice(600);

        Driver[] drivers = {driver, driver1};

        Car car2=new Car();
        car2.setMotor(engine1);
        car2.setBody("Mers");
        car2.setCarsName("Mers v3");
        car2.setGroup(driver1);
        car2.setPrice(700);

        Car car3=new Car();
        car3.setMotor(engine1);
        car3.setBody("Bmw");
        car3.setCarsName("Bmw m8");
        car3.setGroup(driver1);
        car3.setPrice(800);


        Car car4=new Car();
        car4.setMotor(engine1);
        car4.setBody("Kia");
        car4.setCarsName("Kia Optima");
        car4.setGroup(driver1);
        car4.setPrice(340);

        Car[] cars = {car, car1,car2,car3,car4};
        Managemant managemant = new Managemant();
        managemant.setCars(cars);
        managemant.setDrivers(drivers);


       while (true) {
           System.out.println("------------MENU-----------");
           System.out.println("---------ALL CARS----------");
           System.out.println("CHOOSE WHICH ONE YOU WANT TO BOOK:");
           System.out.println("0." + cars[0].getCarsName());
           System.out.println("1." + cars[1].getCarsName());
           System.out.println("2." + cars[2].getCarsName());
           System.out.println("3." + cars[3].getCarsName());
           System.out.println("4." + cars[4].getCarsName());
           System.out.println("5. EXIT");


           int choice = sc.nextInt();
           for (int i = 0; i < cars.length; i++) {
               if (choice == i) {
                   if (!cars[i].isBooked()) {
                       System.out.println("Enter your name:");
                       String name = sc.next();
                       System.out.println("Enter your address:");
                       String address = sc.next();
                       System.out.println("Enter your phone number:");
                       int phone = sc.nextInt();

                       User user = new User(name, address, phone, cars[i]);
                       cars[i].setBooked(true);
                       bookedCars[i] = cars[i].getCarsName();
                       users[i] = user;
                       System.out.println("The price of choosen car is " + cars[i].getPrice());
                       System.out.println("To pay, you have to log in into your bank account");
                       System.out.println("Do you want to go on? (y/n)");
                       char answer=sc.next().charAt(0);
                       if(answer=='y') {
                           System.out.println("Register/Log in (1/2)");
                           int sign=sc.nextInt();
                           if(sign==1) {
                               System.out.println("You dont have an account");
                               System.out.println("Sign up");
                               System.out.println("Enter your name");
                               String name2 = sc.next();
                               if (user.getName().equalsIgnoreCase(name2)) {
                                   System.out.println("Enter your password");
                                   String password2 = sc.next();
                                   user.setPassword(password2);
                                   bankAcc[i] = user;

                               }else{
                                   System.out.println("It is not your name");
                                   System.out.println("Virus Virus Virus");
                                   break;
                               }
                           }
                           System.out.println("Login");
                           System.out.println("Enter your name");
                           String name1 = sc.next();
                           System.out.println("Enter your password");
                           String password = sc.next();
                           for (int j = 0; j < bankAcc.length; j++) {
                               if(bankAcc[i].getName().equalsIgnoreCase(name1) && bankAcc[i].getPassword().equals(password)){
                                   System.out.println("\n-------------------");
                                   System.out.println("W  E  L  C  O  M  E");
                                   System.out.println("-------------------\n");
                                   System.out.println("1. Deposit.");
                                   System.out.println("2. Transfer.");
                                   System.out.println("3. Check balance.");
                                   System.out.println("4. Withdraw");
                                   System.out.println("5. Log out.");
                                   System.out.print("\nEnter your choice : ");
                                   int choice1 = sc.nextInt();
                                   if(choice1==1) {
                                       bankAcc[i].deposit();
                                   } else if(choice1==2) {
                                        System.out.println("How much you want to transfer:");
                                       int transfer = sc.nextInt();
                                       bankAcc[i].transfer( transfer);
                                       if(transfer<= cars[i].getPrice()) {
                                          int b= bankAcc[i].getBalance();
                                          b+= transfer;
                                          bankAcc[i].setBalance(b);
                                           System.out.println("YOU SUCCESSFULLY BOOKED THE CAR!!!");
                                       }else {
                                           int t= (int) (cars[i].getPrice()-transfer);
                                           System.out.println("Car price is"+cars[i].getPrice());
                                           System.out.println(t + " Left to pay/try again");
                                   } else if (choice1==3) {
                                       System.out.println("Your balance is " + bankAcc[i].getBalance());
                                   } else if (choice1==4) {
                                       bankAcc[i].withdraw();
                                   } else if(choice1==5){
                                       j= bankAcc.length-1;
                                   }
                               }
                           }
                       }else{
                           System.out.println("You stopped the operation");
                           break;
                       }

                   } else if (bookedCars[i].matches(cars[i].getCarsName())) {
                       System.out.println("Already booked!");
                   }
               }

           }


       }

    }}
