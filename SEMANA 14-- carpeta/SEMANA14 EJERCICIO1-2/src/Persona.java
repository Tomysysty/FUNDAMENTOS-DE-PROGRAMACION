public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private int añoNacimiento;

    public Persona(String nombre, String apellido, int edad, int cedula, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.añoNacimiento = añoNacimiento;
    }


    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
     this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido (String apellido){
     this.apellido = apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad (int edad){
     this.edad = edad;
    }
    public int getCedula(){
        return cedula;
    }
    public void setCedula (int cedula){
     this.cedula = cedula;
    }
    public int getAñoNacimiento(){
        return añoNacimiento;
    }
    public void setAñoNacimiento (int añoNacimiento){
     this.añoNacimiento = añoNacimiento;
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Cedula: "+cedula);
        System.out.println("Año de Nacimiento: "+añoNacimiento);
    }




}