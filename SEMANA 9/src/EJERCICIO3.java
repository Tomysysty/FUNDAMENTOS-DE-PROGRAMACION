import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los strings1 Y 2
        System.out.println("Ingresa el string1:");
        String string1 = scanner.nextLine();

        System.out.println("Ingresa el string2 (posible substring):");
        String string2 = scanner.nextLine();

        // Verificar si string2 es substring de string1
        if (string1.contains(string2)) { //
            System.out.println("string2 es un substring de string1.");
        } else {
            System.out.println("string2 NO es un substring de string1.");
        }
    }
}
