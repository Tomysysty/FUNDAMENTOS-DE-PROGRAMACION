import java.util.Scanner;
import java.util.Random;

public class EJERCICIO6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño de la matriz n x n
        System.out.println("Ingresa el tamaño de la matriz (n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n]; // Crear una matriz vacía de n x n

        // Menú interactivo
        int opcion;

        System.out.println("MENU DE OPCIONES: ");



            System.out.println("1. Llenar la matriz con números del usuario");
            System.out.println("2. Llenar la matriz con números aleatorios");
            System.out.println("3. Imprimir la matriz");
            System.out.println("4. Sumar una fila");
            System.out.println("5. Sumar una columna");
            System.out.println("6. Imprimir la diagonal principal");
            System.out.println("7. Sumar la diagonal principal");
            System.out.println("8. Sumar todos los valores de la matriz");
            System.out.println("9. Promedio de todos los valores de la matriz");
            System.out.println("10. Encontrar el valor máximo");
            System.out.println("11. Encontrar el valor mínimo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                matrizusuario(matriz, n, scanner);
            } else if (opcion == 2) {
                matrizrandom(matriz, n, new Random());
            } else if (opcion == 3) {
                imprimirMatriz(matriz, n);
            } else if (opcion == 4) {
                sumafila(matriz, n, scanner);
            } else if (opcion == 5) {
                sumar(matriz, n, scanner);
            } else if (opcion == 6) {
                diagonal(matriz, n);
            } else if (opcion == 7) {
                sumadiagonal(matriz, n);
            } else if (opcion == 8) {
                sumartotal(matriz, n);
            } else if (opcion == 9) {
                promedio(matriz, n);
            } else if (opcion == 10) {
                valormaximo(matriz, n);
            } else if (opcion == 11) {
                minimo(matriz, n);
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }

    }

    //FUNCIONES llenar matriz por el usuario
    public static void matrizusuario(int[][] matriz, int n, Scanner scanner) {
        System.out.println("Ingresa los números para la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // llenar random
    public static void matrizrandom(int[][] matriz, int n, Random random) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random()*99 );   // Números aleatorios entre 0 y 99
            }
        }
    }

    // imprimir
    public static void imprimirMatriz(int[][] matriz, int n) {
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println();
        }
    }

    // suma de la fila
    public static void sumar(int[][] matriz, int n, Scanner scanner) {
        System.out.println("Ingresa el número de la fila a sumar (0 a " + (n - 1) + "):");
        int fila = scanner.nextInt();
        int suma = 0;
        for (int j = 0; j < n; j++) {
            suma += matriz[fila][j];
        }
        System.out.println("La suma de la fila " + fila + " es: " + suma);
    }

    // suma de colmuna
    public static void sumafila(int[][] matriz, int n, Scanner scanner) {
        System.out.println("Ingresa el número de la columna a sumar (0 a " + (n - 1) + "):");
        int columna = scanner.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][columna];
        }
        System.out.println("La suma de la columna " + columna + " es: " + suma);
    }

    // Imrpesion de la diagonal
    public static void diagonal(int[][] matriz, int n) {
        System.out.println("Diagonal principal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    // sumar la diagonal principal
    public static void sumadiagonal(int[][] matriz, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
    }

    // sumar todos los valores de la matriz
    public static void sumartotal(int[][] matriz, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los valores es: " + suma);
    }

    // promedio
    public static void promedio(int[][] matriz, int n) {
        int suma = 0;
        int totalElementos = n * n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
        }
        double promedio = (double) suma / totalElementos;
        System.out.println("El promedio de todos los valores es: " + promedio);
    }

    // Función 10: Encontrar el valor máximo de la matriz
    public static void valormaximo(int[][] matriz, int n) {
        int max = matriz[0][0];
        int fila = 0, columna = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El valor máximo es: " + max + " en la posición (" + fila + ", " + columna + ")");
    }

    // busqueda del valor minimo
    public static void minimo(int[][] matriz, int n) {
        int min = matriz[0][0];
        int fila = 0, columna = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El valor mínimo es: " + min + " en la posición (" + fila + ", " + columna + ")");
    }
}
