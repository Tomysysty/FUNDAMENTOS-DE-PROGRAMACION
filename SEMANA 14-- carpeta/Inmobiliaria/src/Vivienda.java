public abstract class Vivienda {
    private String direccion;
    private double area;
    private double precio;
    private int numHabitaciones;

    public Vivienda(String direccion, double area, double precio, int numHabitaciones) {
        this.direccion = direccion;
        this.area = area;
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getArea() {
        return area;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public abstract String getDescripcion();
}
