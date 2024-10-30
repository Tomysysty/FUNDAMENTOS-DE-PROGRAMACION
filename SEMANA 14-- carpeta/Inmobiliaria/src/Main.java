import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Casa casa1 = new Casa("Calle 123", 120, 100000, 3, true);
        Casa casa2 = new Casa("Calle 456", 150, 120000, 4, false);
        Apartacho apto1 = new Apartacho("Conjunto Palmas", 80, 90000, 2, 5);
        Apartacho apto2 = new Apartacho("Conjunto Dios te pague", 100, 110000, 3, 10);
        Finca finca1 = new Finca("Vereda Amarilla", 500, 250000, 5, true);
        Finca finca2 = new Finca("Vereda LaLinda", 300, 180000, 4, false);


        ArrayList<Vivienda> viviendas = new ArrayList<>();
        viviendas.add(casa1);
        viviendas.add(casa2);
        viviendas.add(apto1);
        viviendas.add(apto2);
        viviendas.add(finca1);
        viviendas.add(finca2);


        System.out.println("Lista de todas las viviendas:");
        for (Vivienda asignaciondeElementosviviendas : viviendas) {
            System.out.println(asignaciondeElementosviviendas.getDescripcion());
        }

        Vivienda viviendaMasBarata = buscarViviendaMasBarata(viviendas);
        System.out.println("\nVivienda más barata:");
        System.out.println(viviendaMasBarata.getDescripcion());

        Vivienda viviendaMasCostosa = buscarViviendaMasCostosa(viviendas);
        System.out.println("\nVivienda más costosa:");
        System.out.println(viviendaMasCostosa.getDescripcion());
    }
    public static Vivienda buscarViviendaMasBarata(ArrayList<Vivienda> viviendas) {
        Vivienda masBarata = viviendas.get(0); //primera vivienda vale 100k
        for (Vivienda vivienda : viviendas) {
            if (vivienda.getPrecio() < masBarata.getPrecio()) {// vivienda 1 menor a 100k?
                masBarata = vivienda;
            }
        }
        return masBarata;
    }

    public static Vivienda buscarViviendaMasCostosa(ArrayList<Vivienda> viviendas) {
        Vivienda masCostosa = viviendas.get(0);
        for (Vivienda vivienda : viviendas) {
            if (vivienda.getPrecio() > masCostosa.getPrecio()) {
                masCostosa = vivienda;
            }
        }
        return masCostosa;
    }
}
