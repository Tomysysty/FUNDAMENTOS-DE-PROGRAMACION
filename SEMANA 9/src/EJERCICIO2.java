import java.util.Scanner;

public class EJERCICIO2 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Leer el string
            System.out.println("Ingresa un string:");
            String string1 = sc.nextLine();


            ImpresionAlrevez(string1);
    }

    public static void ImpresionAlrevez (String string){
        for (int i = string.length()-1; i> 0; i--){ //i vale la longitud y se evalua con el cero para que el contadora vaya de forma descendente
            System.out.println(string.charAt(i)); //Asi la i vale {4,3,2,1} y asi se imprime al contrario
        }
    }

}
