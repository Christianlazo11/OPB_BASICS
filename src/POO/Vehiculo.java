package POO;

public class Vehiculo {

    //Atributos
    private String fabricante;
    private String modelo;
    private double cc;
    private int year;
    private boolean sport;

    private int speed = 0;

    //Constructores

    public Vehiculo(){}

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Métodos

    public void acelerar(int cantidad) {
        this.speed += cantidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                ", speed=" + speed +
                '}';
    }
}
