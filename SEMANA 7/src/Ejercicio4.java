import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir al usuario un número par para el tamaño del arreglo
        System.out.println("Ingresa un número par para el tamaño del arreglo:");
        int n = scanner.nextInt();

        //Significa que mientras que el residuo de la division por 2 de cero va a decir el mensaje

        while (n % 2 != 0) {
            System.out.println("El número ingresado no es par. Por favor, ingresa un número par.");
            n = scanner.nextInt();


        }


        int[] arreglo1 = new int[n];
        System.out.println("Llenando el arreglo1 con números consecutivos...");
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i + 1; // Llenar con números del 1 a n
        }

        float[] arreglo2 = new float[n / 2];

        // Llenar el arreglo2 con el promedio de dos consecutivos de arreglo1
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = (arreglo1[2 * i] + arreglo1[2 * i + 1]) / 2.0f; //f de float
        }

        //impresion
        System.out.println("Arreglo 1:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println();

        System.out.println("Arreglo 2 (Promedios):");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println();
    }
}
