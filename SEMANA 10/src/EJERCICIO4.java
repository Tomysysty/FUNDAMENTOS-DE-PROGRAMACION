import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");

        ArrayList <Integer> numeros = creararreglo(sc.nextInt());

        imprimir(numeros, convertirestatico(numeros));


    }


    public static ArrayList<Integer> creararreglo (Integer tamaño) {
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i <tamaño ; i++) {
            numeros.add(random.nextInt(100));

        }
        return numeros;
    }

    public static int [] convertirestatico(ArrayList <Integer> numeros){
        int [] arreglo = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            arreglo[i] = numeros.get(i);
        }
        return arreglo;
    }

    public static void imprimir (ArrayList <Integer> numeros, int [] convertirestatico) {
        System.out.println("Arreglo Dinamico: ");
        System.out.println(numeros);
        System.out.println("Arreglo Estatico: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(convertirestatico[i]+ "| ");

        }

    }


}

