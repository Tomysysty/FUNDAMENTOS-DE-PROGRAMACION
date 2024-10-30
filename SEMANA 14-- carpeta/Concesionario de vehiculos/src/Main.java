public class Main {
    public static void main(String[] args) {

        Vehiculos vehiculos = new Vehiculos("Toyota", "Corolla", "Rojo", 0, 200);
        vehiculos.acelerar10km();
        vehiculos.acelerar10km();
        vehiculos.acelerar10km();
        vehiculos.acelerar10km();
        vehiculos.frenar10();
        vehiculos.acelerar10km();
        vehiculos.calcularTiempoLlegada(100);
        System.out.println("");
        vehiculos.acelerar10km();
        vehiculos.acelerar20km();
        vehiculos.frenardetotazo();
        vehiculos.frenar10();

    }
}
