import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String idUnicoUniversidad;
    private String gmail;
    private ArrayList<Clase> clases;

    public Profesor(String nombre, String apellidos, String cedula, String idUnicoUniversidad, String gmail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.idUnicoUniversidad = idUnicoUniversidad;
        this.gmail = gmail;
        this.clases = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getIdUnicoUniversidad() {
        return idUnicoUniversidad;
    }

    public String getGmail() {
        return gmail;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setIdUnicoUniversidad(String idUnicoUniversidad) {
        this.idUnicoUniversidad = idUnicoUniversidad;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setClases(ArrayList<Clase> clases) {
        if (clases.size() <= 5) {
            this.clases = clases;
        } else {
            System.out.println("El profesor no puede dictar más de 5 clases.");
        }
    }
}
