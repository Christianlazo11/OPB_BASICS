package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {


        Car coche01 = new ElectricCar();
        ElectricCar coche02 = new ElectricCar();
        HibricCar coche03 = new HibricCar();

        //Polimorfismo

        Car coche04 = new ElectricCar();
        Car coche05 = new HibricCar();

        //Forma de comprobar si ese objeto es una instancia de esa clase
        if(coche04 instanceof ElectricCar) {
            System.out.println("Coche Electrico :) ");
        }

        if(coche05 instanceof HibricCar) {
            System.out.println("Coche Hibrido :) ");
        }
    }
}
