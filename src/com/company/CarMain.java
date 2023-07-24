package com.company;

public class CarMain {

    public static void main(String[] args) {

        Car carObj = new ElectricCar("rojo", "Mazda", "ness", 22.5, 33.5, 5, "Bmw");
        carObj.acelerar(10);

        System.out.println(carObj);

        ElectricCar cocheElectrico = new ElectricCar();

        cocheElectrico.motorElectrico = "xt1203";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Ferrari";
        cocheElectrico.modelo = "La nueva tierra jaja";
        cocheElectrico.peso = 22.6;
        cocheElectrico.velocidad = 55;
        cocheElectrico.largo = 15;

        System.out.println(cocheElectrico);

        ElectricCar cocheElectrico02 = new ElectricCar("Rojo", "Ferrari", "Miroku", 55.3, 55.5, 120, "Tesla");
        System.out.println(cocheElectrico02);

        cocheElectrico02.acelerar(50);
        System.out.println(cocheElectrico02);

    }
}
