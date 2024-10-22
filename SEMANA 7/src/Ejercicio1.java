import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Escribe el tamaño del arreglo: ");
        int n = kb.nextInt();

        int[] arr_int = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escribe un numero: ");
            int numeros = kb.nextInt();
            arr_int[i] = numeros*2;
        }

        System.out.println("El arreglo es: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr_int[i]*3);
        }
    }
}

