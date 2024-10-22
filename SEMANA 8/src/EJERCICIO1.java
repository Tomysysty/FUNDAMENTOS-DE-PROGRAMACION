public class EJERCICIO1 {

    public static void main(String[] args) {

        int Matrix [] [] = new int [3] [3];

        int contador = 1;//se coloca para que en general vaya aumentando de 1 a 9
       //Dos for para llenar la matriz y,x
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                Matrix [i] [j] = contador;
                contador++;
            }
        }

        //imprimir basico pero con dos for para poder imprimir y,x
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                System.out.print(Matrix [i] [j] + " ");
            }
            System.out.println();
        }






    }




}