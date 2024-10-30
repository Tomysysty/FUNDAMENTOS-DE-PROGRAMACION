public class Apartacho extends Vivienda {
    private int piso;

    public Apartacho(String direccion, double area, double precio, int numHabitaciones, int piso) {
        super(direccion, area, precio, numHabitaciones);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    @Override
    public String getDescripcion() {
        return "Apartamento en " + getDireccion() + ", Piso: " + piso + ", Área: " + getArea() + " m^2, Habitaciones: " + getNumHabitaciones() + ", Precio: $" + getPrecio();
    }
}
