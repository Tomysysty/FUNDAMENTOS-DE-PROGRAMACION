import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el string desde el teclado
        System.out.println("Ingresa un string:");
        String string1 = scanner.nextLine();

        // Procesar el string
        String resultado = procesarString(string1);

        // Imprimir el resultado
        System.out.println("El nuevo string es: " + resultado);
    }

    public static String procesarString(String string1) {
        int longitud = string1.length();
        String nuevoString;

        if (longitud % 2 == 0) {
            // Si la longitud es par, tomar el primer y último carácter
            nuevoString = "" + string1.charAt(0) + string1.charAt(longitud - 1);
        } else {
            // Si la longitud es impar, tomar el primer, medio y último carácter
            int mitad = longitud / 2;
            nuevoString = "" + string1.charAt(0) + string1.charAt(mitad) + string1.charAt(longitud - 1);
        }

        return nuevoString;
    }
}

