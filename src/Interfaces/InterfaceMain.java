package Interfaces;

import com.company.Car;

public class InterfaceMain {

    public static void main(String[] args) {

        CarService service1 = new CarServiceSportImpl();
        CarService service2 = new CarServiceClassicImpl();

        Car car01 = service1.createCarDemo();
        Car car02 = service2.createCarDemo();
    }
}
