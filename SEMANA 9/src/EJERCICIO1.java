import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer el string
        System.out.println("Ingresa un string:");
        String string1 = sc.nextLine();

        // Leer el caracter
        System.out.println("Ingresa un carácter para contar:");
        char letra = sc.next().charAt(0); // Aca no va nextLine sino next y se agrega variable tipo char

        // Contar cuántas veces aparece el carater
        int contador = 0; // el contador se usa para determinar cuando se activa el if que significa que si coinciden la letra con el char
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == letra) { //charAt (i) se utiliza para saber el char especifico en una posicion
                contador++;
            }
        }

        System.out.println("El carácter '" + letra + "' aparece " + contador + " veces en el string.");
    }
}