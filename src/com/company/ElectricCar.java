package com.company;

public class ElectricCar extends Car{

    String motorElectrico;

    public ElectricCar() {

    }

    public ElectricCar(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public ElectricCar(String color, String fabricante, String modelo, double peso, double largo, Integer velocidad, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo, velocidad);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
