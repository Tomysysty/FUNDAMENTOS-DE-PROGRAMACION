public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
    public class PersonaFisica extends Persona {
        private int cedula;

        public PersonaFisica(String nombre, String apellido, int cedula) {
            super(nombre, apellido);
            this.cedula = cedula;
        }

        public void imprimir() {
            super.imprimir();
            System.out.println("Documento de Identidad: " + cedula);
        }

        // Getter y setter para documentoIdentidad
        public int getCedula() {
            return cedula;
        }

        public void setDocumentoIdentidad(int cedula) {
            this.cedula = cedula;
        }
    }

    public class PersonaJuridica extends Persona {
        private String nit;

        public PersonaJuridica(String nombre, String apellido, String nit) {
            super(nombre, apellido);
            this.nit = nit;
        }

        public String getNit() {
            return nit;
        }

        public void setNit(String nit) {
            this.nit = nit;
        }

        public void imprimir() {
            super.imprimir();
            System.out.println("NIT: " + nit);
        }
    }
}
