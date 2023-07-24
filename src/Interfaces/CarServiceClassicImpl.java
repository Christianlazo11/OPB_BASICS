package Interfaces;

import Interfaces.CarService;
import com.company.Car;
import com.company.ElectricCar;

public class CarServiceClassicImpl implements CarService {
    @Override
    public Car createCarDemo() {
        return new ElectricCar();
    }
}
