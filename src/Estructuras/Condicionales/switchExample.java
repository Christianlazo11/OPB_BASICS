package Estructuras.Condicionales;

public class switchExample {

    public static void main(String[] args) {

        String day = "fasasfa";

        switch (day) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El día ingresado es día laboral!!!");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El día ingresado no es día Laboral!!!");
                break;
            default:
                System.out.println("El día ingresado no existe!!!");
                break;
        }
    }
}
