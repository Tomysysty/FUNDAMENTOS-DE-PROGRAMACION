import java.util.Locale;

public class EJERCICIO4 {
    public static void main(String[] args) {
        // Definir los strings
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        String str2 = "esta";
        String str3 = "string";

        // Convertir todos los strings a minúsculas para ignorar mayúsculas y minúsculas
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();

        // Encontrar e imprimir la posición de str2
        int posicionStr2 = str1.indexOf(str2);
        while (posicionStr2 != -1) {
            System.out.println("Substring '" + str2 + "' encontrado en la posición: " + posicionStr2);
            posicionStr2 = str1.indexOf(str2, posicionStr2 + 1); // Buscar las siguientes apariciones
        }

        // Encontrar e imprimir la posición de str3
        int posicionStr3 = str1.indexOf(str3);
        while (posicionStr3 != -1) {
            System.out.println("Substring '" + str3 + "' encontrado en la posición: " + posicionStr3);
            posicionStr3 = str1.indexOf(str3, posicionStr3 + 1); // Buscar las siguientes apariciones
        }
    }
}
