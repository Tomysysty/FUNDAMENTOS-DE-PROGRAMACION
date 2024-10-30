import java.util.ArrayList;
public class Estudiante {
        private String nombre;
        private String apellidos;
        private String documentoIdentificacion;
        private String idUnicoUniversidad;
        private String email;
        private String carrera;
        private ArrayList<Clase> clases;

        public Estudiante(String nombre, String apellidos, String documentoIdentificacion, String idUnicoUniversidad, String email, String carrera) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.documentoIdentificacion = documentoIdentificacion;
            this.idUnicoUniversidad = idUnicoUniversidad;
            this.email = email;
            this.carrera = carrera;
            this.clases = new ArrayList<>();
        }

        public void agregarClase(Clase clase) {
            if (clases.size() < 7) {
                clases.add(clase);
            } else {
                System.out.println("El estudiante no puede recibir más de 7 clases.");
            }
        }

        public void listarClases() {
            System.out.println("\nClases del estudiante " + nombre + " " + apellidos + ":");
            for (Clase clase : clases) {
                System.out.println("Código: " + clase.getCodigoMateria() + ", Nombre: " + clase.getNombreMateria());
            }
        }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }
    public String getIdUnicoUniversidad() {
        return idUnicoUniversidad;}

    public String getEmail() {
        return email;
    }

    public String getCarrera() {
        return carrera;}

    public ArrayList<Clase> getClases() {
        return clases;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;}
    public void setDocumentoIdentificacion(String documentoIdentificacion) {
            this.documentoIdentificacion = documentoIdentificacion;}

    public void setIdUnicoUniversidad(String idUnicoUniversidad) {
        this.idUnicoUniversidad = idUnicoUniversidad;}

    public void setEmail(String email) {
        this.email = email;}

    public void setCarrera(String carrera) {
        this.carrera = carrera;}

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;

    }
}


