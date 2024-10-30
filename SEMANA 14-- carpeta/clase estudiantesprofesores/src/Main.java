public class Main {
    public static void main(String[] args) {
        // Creación de profesores
        Profesor profesor1 = new Profesor("Juan", "Perez", "123456", "P001", "juan.perez@eafit.edu.co");
        Profesor profesor2 = new Profesor("Maria", "Lopez", "789012", "P002", "maria.lopez@eafit.edu.co");

        // Creación de estudiantes
        Estudiante estudiante1 = new Estudiante("Carlos", "Garcia", "345678", "E001", "carlos.garcia@eafit.edu.co", "Fundamentos de Programacion");
        Estudiante estudiante2 = new Estudiante("Ana", "Martinez", "901234", "E002", "ana.martinez@eafit.edu.co", "Calculo");
        Estudiante estudiante3 = new Estudiante("Luis", "Torres", "567890", "E003", "luis.torres@eafit.edu.co", "Logica");

        // Creación de clases
        Clase clase1 = new Clase("101", "Calculo", "2024-02-01", "2024-06-30", "Lunes y Miercoles 10-12", 80, 6, profesor1);
        Clase clase2 = new Clase("102", "Fundamentos de programacion", "2024-02-01", "2024-06-30", "Martes y Jueves 8-10", 80, 6, profesor2);
        Clase clase3 = new Clase("103", "Logica", "2024-02-01", "2024-06-30", "Viernes 8-12", 60, 4, profesor1);

        // Asignación de estudiantes a clases
        clase1.agregarEstudiante(estudiante1);
        clase1.agregarEstudiante(estudiante2);
        clase1.agregarEstudiante(estudiante3);

        clase2.agregarEstudiante(estudiante1);
        clase2.agregarEstudiante(estudiante2);
        clase2.agregarEstudiante(estudiante3);

        clase3.agregarEstudiante(estudiante1);
        clase3.agregarEstudiante(estudiante2);

        // Listar clases de dos estudiantes
        estudiante1.listarClases();
        estudiante2.listarClases();
        estudiante3.listarClases();

        // Listar información de una clase
        clase1.listarAlumnos();
        clase2.listarAlumnos();
        clase3.listarAlumnos();
        System.out.println("");
        clase1.mostrarInfoProfesor();;
        clase2.mostrarInfoProfesor();
        clase3.mostrarInfoProfesor();
    }
}
