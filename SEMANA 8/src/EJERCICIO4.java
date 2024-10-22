import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        //SCANNER USUARIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz Verticalmente");
        int y = sc.nextInt();
        System.out.println("Ingrese el tamaño de la matriz Horizontalmente");
        int x = sc.nextInt();
        //Matriz cuadrada
        while (y != x) {
            System.out.println("La matriz debe ser cuadrada");
            System.out.println("Ingrese el tamaño de la matriz Verticalmente");
            y = sc.nextInt(); //importante para que no cause bucle infinito

        }


        //Creacion de las variables
        int Matriz[][] = new int[y][x];
        int matriz2[][] = new int[y][x];

        //Asignacion de valores random
        valoresrandom(Matriz);

        //imprecion de matri 1
        System.out.println("Matriz 1");
        imprimirMatriz(Matriz);
        System.out.println();

        //Transposicion
        Transposicion(Matriz, matriz2);

        //Imprimir Matriz 2
        System.out.println("Matriz 2");
        imprimirMatriz(matriz2);
        System.out.println();

        //Impresion de diagonal de la matriz 2
        System.out.println("Diagonal de matriz 2");
        ImpresionDiagonal(matriz2);



    }


    //FUNCIONES

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Transposicion(int[][] Matriz, int[][] matriz2) { //NO OLVIDAR QUE SE PUEDEN AGREGAR 2
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                matriz2[j][i] = Matriz[i][j];
            }
        }

    }

    public static void valoresrandom (int [] [] matriz) {
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

               matriz [i] [j] = (int) (Math.random() * 99);

            }

        }
    }

    public static void ImpresionDiagonal (int[][] matriz2) {

        for (int i = 0; i < matriz2.length ; i++) {
            if (i == matriz2.length-1){
                System.out.println(matriz2 [i] [i]);
            } else {
            System.out.print(matriz2 [i] [i]+ ", ");
            }
        }
    }
}