package Estructuras;

import java.util.Arrays;

public class ArraysData {

    public static void main(String[] args) {


        int[] notas = {8,10,5,9,8,7,5,6};

        int data = Arrays.binarySearch(notas, 5);
        System.out.println(data);
        Arrays.sort(notas);
        for(int j:notas) {
            System.out.print(j + " | ");
        }
    }
}
