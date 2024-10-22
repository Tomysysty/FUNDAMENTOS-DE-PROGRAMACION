import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el tamaño que deseas tener en el arreglo: ");
        int tamaño = scanner.nextInt();
        int[] arr_int = new int[tamaño];

        // Rellenar el arreglo con los números introducidos por el usuario
        for (int i = 0; i < tamaño; i++) {
            if (i == 0) {
                System.out.println("Escribe un número para agregar al arreglo: ");
            } else {
                System.out.println("Escribe otro número: ");
            }
            arr_int[i] = scanner.nextInt();
        }

        // Imprimir el arreglo original
        System.out.print("Arreglo {");
        Imprimir(arr_int);  // Llamada para imprimir el arreglo original
        System.out.println("}");

        // Invertir el arreglo
        int[] arregloInvertido = InvertirArreglo(arr_int); // Llamamos a la función para invertir y guardamos el resultado

        // Imprimir el arreglo invertido
        System.out.print("Arreglo Invertido {");
        Imprimir(arregloInvertido);  // Llamada para imprimir el arreglo invertido
        System.out.println("}");
    }

    // Función para imprimir un arreglo
    public static void Imprimir(int[] arr_int) {
        for (int i = 0; i < arr_int.length; i++) {
            if (i == arr_int.length - 1) {
                System.out.print(arr_int[i]);  // Sin coma al final
            } else {
                System.out.print(arr_int[i] + ", ");
            }
        }
    }

    // Función para invertir un arreglo y devolver el arreglo invertido
    public static int[] InvertirArreglo(int[] arr_int) {
        int[] arregloInvertido = new int[arr_int.length];
        int j = 0; // Índice para el arreglo invertido

        // Recorremos el arreglo original de atrás hacia adelante
        for (int i = arr_int.length - 1; i >= 0; i--) {
            arregloInvertido[j] = arr_int[i];  // Asignamos el valor invertido
            j++;  // Incrementamos el índice del arreglo invertido
        }

        return arregloInvertido;  // Devolvemos el arreglo ya invertido
    }
}
