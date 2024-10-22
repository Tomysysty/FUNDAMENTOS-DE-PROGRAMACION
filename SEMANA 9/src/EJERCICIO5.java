import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el string desde el teclado
        System.out.println("Ingresa un string:");
        String alderecho = scanner.nextLine();

        // Crear el string al revés
        String alrevez = new StringBuilder(alderecho).reverse().toString(); //utilizacion de StringBuilder para invertir el string  m

        // Imprimir el string al revés
        System.out.println("El string al revés es: " + alrevez);
    }
}
