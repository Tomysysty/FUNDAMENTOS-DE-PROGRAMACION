import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número de estudiantes:");
        int n = scanner.nextInt();
        int[][] matriz = new int[4][n];

        //nNUEVO  MODO MENU
        while (true) { //bucle para crear menu hasta que ponga cero
            System.out.println("Elige una opción:");
            System.out.println("1. Ingresar datos de un estudiante");
            System.out.println("2. Buscar estudiante por ID");
            System.out.println("3. Imprimir todos los estudiantes");
            System.out.println("4. Contar estudiantes en un rango de edad");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo del programa...");
            }

            if (opcion == 1) {
                ingresar(matriz, n, scanner);
            } else if (opcion == 2) {
                buscar(matriz, n, scanner);
            } else if (opcion == 3) {
                imprimir(matriz, n);
            } else if (opcion == 4) {
                contarestudiantesporedad(matriz, n, scanner);
            } else if (opcion == 0) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }


    //FUNCIONES

    public static void ingresar(int[][] matriz, int n, Scanner scanner) {//scanner tambien se puede usar como parametro
        System.out.println("Ingresa la posición del estudiante (de 0 a " + (n - 1) + "):");
        int i = scanner.nextInt();


        System.out.println("ID del estudiante:");
        matriz[0][i] = scanner.nextInt();
        System.out.println("Edad del estudiante:");
        matriz[1][i] = scanner.nextInt();
        System.out.println("Año de nacimiento:");
        matriz[2][i] = scanner.nextInt();
        System.out.println("Número de materias:");
        matriz[3][i] = scanner.nextInt();
    }

    // buscar estudiante por id
    public static void buscar(int[][] matriz, int n, Scanner scanner) {
        System.out.println("Ingresa el ID del estudiante:");
        int id = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            if (matriz[0][i] == id) {
                System.out.println("Estudiante " + (i + 1) + " - ID: " + matriz[0][i] + ", Edad: " + matriz[1][i] + //i +1 para que se vea bien
                        ", Año de nacimiento: " + matriz[2][i] + ", Número de materias: " + matriz[3][i]);
                return;
            }
        }
    }

    // impresion
    public static void imprimir(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + " - ID: " + matriz[0][i] + ", Edad: " + matriz[1][i] +
                    ", Año de nacimiento: " + matriz[2][i] + ", Número de materias: " + matriz[3][i]);
        }
    }

    // busqueda por edad
    public static void contarestudiantesporedad(int[][] matriz, int n, Scanner scanner) {

        System.out.println("Ingresa la edad minima:");
        int edadminima = scanner.nextInt();

        System.out.println("Ingresa la edad maxima:");
        int edadmaxima = scanner.nextInt();



        for (int i = 0; i < n; i++)
            if (matriz[1][i] >= edadminima && matriz[1][i] <= edadmaxima) {
                ;
            }

        System.out.println("Ningun estudiante tiene esa edad ");
    }


}


