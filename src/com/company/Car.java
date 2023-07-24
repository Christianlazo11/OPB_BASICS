package com.company;

public abstract class Car {

    //Atributos
    String color;
    String fabricante;
    String modelo;
    double peso;
    double largo;
    Integer velocidad = 0;

    //Constructores

    public Car() {

    }
    public Car(String color, String fabricante, String modelo, double peso, double largo, Integer velocidad) {
           this.color = color;
           this.fabricante = fabricante;
           this.modelo = modelo;
           this.peso = peso;
           this.largo = largo;
           this.velocidad = velocidad;
    }

    //Comportamiento

    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }

    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
