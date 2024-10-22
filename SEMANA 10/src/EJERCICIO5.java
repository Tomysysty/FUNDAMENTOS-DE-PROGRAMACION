import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int num;
        do {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();

            if (num != 0) {
                numeros.add(num);
            }

        } while (num != 0);


        System.out.println("Números ingresados: " + numeros);
        int suma = devolversuma(numeros);
        double promedio = promedio(numeros, suma);

        System.out.println("\n" + "NUMEROS MAYORES MENORES O IGUALES FRENTE AL PROMEDIO: ");
        for (int i = 0; i < numeros.size(); i++) {
            menoresdelpromedio(numeros, promedio, i);
            igualesalpromedio(numeros, promedio, i);
            mayoresdelpromedio(numeros, promedio, i);
        }
    }


    public static int devolversuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        } System.out.println("La suma de los números ingresados es: " + suma);
        return suma;
    }

    public static double promedio (ArrayList <Integer> numeros, int suma){
        double promedio = suma / numeros.size();
        System.out.println("El promedio de los números ingresados es: " + promedio);
        return promedio;
    }


    public static ArrayList menoresdelpromedio(ArrayList<Integer> numeros, double promedio, int i) {
        if (numeros.get(i) < promedio) {
            System.out.println("El numero" + numeros.get(i) + " es menor al promedio");
        }
        return numeros;
    }

    public static ArrayList igualesalpromedio(ArrayList<Integer> numeros, double promedio, int i) {
        if (numeros.get(i) == promedio) {
            System.out.println("El numero" + numeros.get(i) + " es igual al promedio");
        }
        return  numeros;
    }

    public static ArrayList mayoresdelpromedio(ArrayList<Integer> numeros, double promedio, int i) {
        if (numeros.get(i) > promedio) {
            System.out.println("El numero" + numeros.get(i) + " es mayor al promedio");
        }
        return numeros;
    }
} // :) bien
