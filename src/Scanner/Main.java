package Scanner;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {



        boolean isNum = false;
        int num01 = 0;
        int num02 = 0;

        do {
            Scanner s = new Scanner(System.in);
            try {
                System.out.println("Ingrese los números: ");
                num01 = s.nextInt();
                num02 = s.nextInt();
                isNum = true;
            } catch (Exception e) {
                System.out.println("Número invalido: " + e.getMessage());
            }

        }while(!isNum);

        PrintStream info = new PrintStream("copia.txt");
        info.println("Hola");
    }
}
