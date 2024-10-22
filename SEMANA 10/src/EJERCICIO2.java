import java.util.ArrayList;

public class EJERCICIO2 {
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<String>();

        nombres.add("Narva");
        nombres.add("Tomas");
        nombres.add("Pablo alonso");
        nombres.add ("Juano");
        nombres.add("Emiliana");

        //se usa ciclo for each // ejemplo para que variable temporal sea "en" esto que es nombre tiene que ocurrir el for
        for ( String variabletemporal : nombres){
            System.out.println(variabletemporal);

            /* se imprime asi porque variable temporal cada vez asigna
            un valor de nombre y no todos pq si se ejecuta nombres se imprime muchas veces todos los nombres*/
        }


    }


}
