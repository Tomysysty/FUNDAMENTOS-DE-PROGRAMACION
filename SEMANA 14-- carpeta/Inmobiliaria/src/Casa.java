public class Casa extends Vivienda {
    private boolean tieneJardin;

    public Casa(String direccion, double area, double precio, int numHabitaciones, boolean tieneJardin) {
        super(direccion, area, precio, numHabitaciones);
        this.tieneJardin = tieneJardin;
    }

    public boolean setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
        return tieneJardin;
    }

    public String getDescripcion() {
        return getDireccion() + ", Área: " + getArea() + " m^2, Habitaciones: " + getNumHabitaciones() + ", Precio: $" + getPrecio() + ", Jardín: " + tieneJardin;
    }
}

