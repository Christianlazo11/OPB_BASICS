package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainStream {
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("/hola.txt");

            /*byte []datos = fichero.readAllBytes();

            for(byte dato : datos) {
                System.out.print((char)dato);
            }*/

            int datos = fichero.read();

            while(datos != -1) {
                System.out.println((char)datos);
                datos = fichero.read();
            }

        } catch (IOException e) {
            System.out.println("No existe el programa: " + e.getMessage());
        }

    }
}
