public class EJERCICIO1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("daniel","Rodriguezzz",18,1,2006);
        Persona persona2 = new Persona("Tomyy","Rincon Jaimes:)",17,2,2007);

        System.out.println("Datos Persona 1: ");
        persona1.imprimir();
        System.out.println("\nDatos Persona 2: ");
        persona2.imprimir();
        //Fin de ejercicio 1
        //Inicio de Ejercicio 2

        Persona persona3 = new Persona("Juan","Perez",17,3,2007);
        Persona persona4 = new Persona("Maria","Gomez",18,4,2006);
        Persona persona5 = new Persona("Pedro","Rodriguez",30,5,1991);
        Persona persona6 = new Persona("Luis","Gonzalez",35,6,1986);
        Persona persona7 = new Persona("Ana","Martinez",40,7,1981);
        Persona persona8 = new Persona("Carlos","Hernandez",45,8,1976);

        ArregloPersonas arregloPersonas = new ArregloPersonas();

        arregloPersonas.adicionar(persona1);
        arregloPersonas.adicionar(persona2);
        arregloPersonas.adicionar(persona3);
        arregloPersonas.adicionar(persona4);
        arregloPersonas.adicionar(persona5);
        arregloPersonas.adicionar(persona6);
        arregloPersonas.adicionar(persona7);
        arregloPersonas.adicionar(persona8);


        System.out.println("Las personas en el arreglo son: ");
        arregloPersonas.imprimir();


        System.out.println("\nBuscando por identificaciónes por numero par: ");
        int i = 2;
        while (arregloPersonas.buscarPorIdentificacion(i) != null){
        arregloPersonas.buscarPorIdentificacion(i).imprimir();
        i = i+2;

        }

        System.out.println("\nPersonas nacidas en 2007" );
        arregloPersonas.personasMismoaño(2007);



    }




    }
