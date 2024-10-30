import java.util.ArrayList;

public class Clase {
    private String codigoMateria;
    private String nombreMateria;
    private String fechaInicio;
    private String fechaTerminacion;
    private String horario;
    private int totalHorasCurso;
    private int horasSemanales;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Clase(String codigoMateria, String nombreMateria, String fechaInicio, String fechaTerminacion, String horario, int totalHorasCurso, int horasSemanales, Profesor profesor) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.fechaInicio = fechaInicio;
        this.fechaTerminacion = fechaTerminacion;
        this.horario = horario;
        this.totalHorasCurso = totalHorasCurso;
        this.horasSemanales = horasSemanales;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < 30) {
            estudiantes.add(estudiante);
            estudiante.agregarClase(this);
        } else {
            System.out.println("La clase no puede tener más de 30 estudiantes.");
        }
    }

    public void listarAlumnos() {
        System.out.println("\nLista de alumnos en la clase " + nombreMateria + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos());
        }
    }
    public void mostrarInfoProfesor() {
        System.out.println("Profesor de la clase " + nombreMateria + ": " + profesor.getNombre() + " " + profesor.getApellidos());
    }
    public String getCodigoMateria() {
        return codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public String getFechaTerminacion() {
        return fechaTerminacion;
    }
    public String getHorario() {
        return horario;
    }
    public int getTotalHorasCurso() {
        return totalHorasCurso;
    }
    public int getHorasSemanales() {
        return horasSemanales;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaTerminacion(String fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void setTotalHorasCurso(int totalHorasCurso) {
        this.totalHorasCurso = totalHorasCurso;
    }
    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

}

