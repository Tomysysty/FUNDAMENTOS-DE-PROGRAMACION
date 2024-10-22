import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nuevo = EnterosInvertidos();

        System.out.print("{");
        for (int i = 0; i < 10; i++) {
            System.out.print(nuevo[i] + ",");
        }
        System.out.print("}");
    }

    public static int[] EnterosInvertidos() {
        int[] arreglo1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arreglo2 = new int[arreglo1.length];
        int j = 0;

        for (int i = arreglo1.length - 1; i >= 0; i--) {
            arreglo2[j] = arreglo1[i];
            j++;
        }
        return arreglo2;
    }
}
