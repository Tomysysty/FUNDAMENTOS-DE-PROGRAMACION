import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el tamaño de la matriz Verticalmente");
        int y = sc.nextInt();

        System.out.println("Ingrese el tamaño de la matriz Horizontalmente");
        int x = sc.nextInt();

        //Cre acion de la matrizx
        int Matriz[][] = new int[y][x];

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                //llenar con random numeros del 0 al 10
                Matriz[i][j] = (int) (Math.random() * 10); //MATH.RANDOM () se usa

            }
        }

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

