import java.util.ArrayList;
//EJERCICIO 2 = Crear un arreglo de las personas del ejercicio 1
public class ArregloPersonas {
    private ArrayList<Persona> personas;
    private int maximaspersonas = 10;

    public ArregloPersonas() {
        personas = new ArrayList<>();

    }
    public boolean adicionar(Persona persona) {
        if (personas.size() > maximaspersonas) {
            System.out.println("Numero maximo de personas alcanzado.");
            return false;
        }
        personas.add(persona);
        return true;
    }
    public Persona buscarPorIdentificacion(int numDocumento) {
        for (Persona persona : personas) {
            if (persona.getCedula() == numDocumento) {
                return persona; // Retorna la persona encontrada
            }
        }
        return null; // Retorna null si no se encontró
    }

    public ArrayList personasMismoaño(int añoNacimiento) {
        ArrayList <Persona> Personasenconrtadas = new ArrayList<>();
        for (Persona persona : personas){
            if (persona.getAñoNacimiento() == añoNacimiento){
                Personasenconrtadas.add(persona);
                System.out.println( persona.getNombre() + " " + persona.getApellido());
            }

        }
        return Personasenconrtadas;
    }
    public void imprimir() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas en el arreglo.");
        } else {
            for (Persona persona : personas) {
                persona.imprimir();
                System.out.println(); // Salto de línea entre personas
            }
        }
    }

}

