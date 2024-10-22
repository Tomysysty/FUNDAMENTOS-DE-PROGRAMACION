import java.util.ArrayList;
import java.util.Random;
public class EJERCICIO3 {
    public static void main(String[] args) {
        int tamaño = 10;
        int[][] Arregloestatico = creararreglo(tamaño);
        ArrayList <Integer> Arreglodinamico = convertirarraylist(Arregloestatico);
        imprimir(Arreglodinamico);

    }


    public static int[][] creararreglo(int tamaño){
        int[][] Arregloestatico = new int[tamaño][tamaño];
        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {

            Arregloestatico[i][j] = random.nextInt(100);// metodo para generar aleatorio
        }
        }
        return Arregloestatico;
    }

    public static ArrayList <Integer> convertirarraylist (int [] [] tamaño){
        ArrayList <Integer> Arreglodinamico = new ArrayList<Integer>();
        for (int i = 0; i < tamaño.length; i++) {
            for (int j = 0; j < tamaño.length; j++) {

            Arreglodinamico.add(tamaño[i] [j]);
            }
        }
        return Arreglodinamico;
    }
    public static void imprimir (ArrayList <Integer> arreglo) {
        int contador = 0;
        for (int valor : arreglo) { //metodo for each
            System.out.print(valor + " |");

            contador++;// contador es 1
            if (contador %10 == 0){ //hace que se repita 10 veces y cuando sea cont 10 se salte de linea
                System.out.println();
            }



        }
    }


}
