package be.continuum;

import be.continuum.data.Address;
import be.continuum.data.Car;
import be.continuum.data.User;

public class Main {

    public static void main(final String[] args) {

        User user = new User("Jan", "Dockx");
        Address address = new Address();
        address.setNumber(100);
        user.setAddress(address);
        Car car = new Car();
        car.setBrand("VW");
        car.setModel("Golf");
        car.setPrice(25000);
        car.setPollutionCo2(89);
        user.setCar(car);

        if (args.length == 0) {
            System.out.println("Please provide a name as a command-line argument");
            return;
        }
        System.out.println(String.format("Hello, %s!", args[0]));
    }

}
