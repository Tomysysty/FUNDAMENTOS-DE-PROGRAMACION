public class Finca extends Vivienda {
    private boolean tienePiscina;

    public Finca(String direccion, double area, double precio, int numHabitaciones, boolean tienePiscina) {
        super(direccion, area, precio, numHabitaciones);
        this.tienePiscina = tienePiscina;
    }

    public boolean isTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
        return tienePiscina;
    }

    @Override
    public String getDescripcion() {
        return "Finca en " + getDireccion() + ", Área: " + getArea() + " m^2, Habitaciones: " + getNumHabitaciones() + ", Precio: $" + getPrecio() + ", Piscina: " + (tienePiscina ? "Sí" : "No");
    }
}

