package Estructuras;

public class ExceptionExample {

    public static void main(String[] args) {


        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos:");
        }

        System.out.println("Hola");
    }
}
