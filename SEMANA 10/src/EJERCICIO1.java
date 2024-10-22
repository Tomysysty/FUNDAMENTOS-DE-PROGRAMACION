import java.util.ArrayList;
import java.util.Iterator;

public class EJERCICIO1 {
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<String>();

        nombres.add("Narva");
        nombres.add("Tomas");
        nombres.add("Pablo alonso");
        nombres.add ("Juano");
        nombres.add("Emiliana");


        Iterator <String > EscribirNombres = nombres.iterator();

        while (EscribirNombres.hasNext()){  //asegura que el Iterator no se salga de los límites
            System.out.println(EscribirNombres.next());
        }



    }
}