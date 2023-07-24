package POO;

public class pooMain {

    public static void main(String[] args) {

        Vehiculo vehiculo01 = new Vehiculo();

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondwo", 2.1, 2010, false);

        System.out.println(fordMondeo);
        fordMondeo.acelerar(150);
        System.out.println(fordMondeo);
    }
}
