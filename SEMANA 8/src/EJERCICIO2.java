import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz Verticalmente");
        int y = sc.nextInt();
        System.out.println("Ingrese el tamaño de la matriz Horizontalmente");
        int x = sc.nextInt();
        int m = x * y;
        int Matrix [] [] = new int[m][m];

        int contador = 1;//se coloca para que en general vaya aumentando de 1 a la n
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {  //se especifica en la matriz que recorra las columnas
                Matrix [i] [j] = contador;
                contador++;

            }

        }
        //imprimir basico de matricessss
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix [i] [j] + " ");
            }
            System.out.println();
        }
    }
}
