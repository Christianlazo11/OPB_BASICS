package Estructuras.Condicionales;

public class IfElseIfExample {

    public static void main(String[] args) {

        String day = "sfaafafs";


        if(day.equals("lunes") || day.equals("martes") || day.equals("miercoles") || day.equals("jueves") || day.equals("viernes")) {
            System.out.println("Es día laboral!!!");
        } else if(day.equals("sabado") || day.equals("domingo")) {
            System.out.println("No es día laboral!!!");
        } else {
            System.out.println("El día ingresado no existe!!!");
        }
    }
}
