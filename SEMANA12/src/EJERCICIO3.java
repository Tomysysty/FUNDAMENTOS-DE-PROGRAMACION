 import java.util.Scanner;
//NUEVO VARIABLES GLOBAL STATIC
    public class EJERCICIO3 {
        static int num = 0;  // cuantos elementos hay
        static int n = 1000;
        static int[] arreglo = new int[n];  // Arreglo de tamaño fijo

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {
                opcion = leermenu(sc);
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el elemento a adicionar: ");
                        int elementadicionar = sc.nextInt();
                        int pasospaadicionar = adicionarelemento(arreglo, elementadicionar);
                        System.out.println("Número de pasos para adicionar: " + pasospaadicionar);
                        break;
                    case 2:
                        System.out.print("Ingrese el elemento a borrar: ");
                        int elementoseleccionadoparaborrar = sc.nextInt();
                        int pasosborrar = borrarelemento(arreglo, elementoseleccionadoparaborrar);
                        System.out.println("Número de pasos para borrar: " + pasosborrar);
                        break;
                    case 3:
                        imprimirarreglo(arreglo, num);
                        break;
                    case 4:
                        System.out.println("Tamaño actual del arreglo: " + num);
                        break;
                    case 5:
                        System.out.print("Ingrese el elemento a buscar: ");
                        int elementoSearch = sc.nextInt();
                        int pos = buscararreglo(arreglo, elementoSearch);
                        if (pos != -1) {
                            System.out.println("La posición del elemento es: " + pos);
                        } else {
                            System.out.println("Elemento no encontrado.");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            } while (opcion != 0);
        }

        public static int leermenu(Scanner sc) {
            System.out.println("Menú:");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Imprimir arreglo");
            System.out.println("4. Mostrar tamaño del arreglo");
            System.out.println("5. Buscar elemento");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            return sc.nextInt();
        }

        // adicionar un elemento y ordenar
        public static int adicionarelemento(int[] arreglo, int elemento) {
            int pasos = 0;
            int i = num - 1;
            while (i >= 0 && arreglo[i] > elemento) {
                arreglo[i + 1] = arreglo[i]; //se evalua desde el ultimo pasando por todos los numero
                i--; //se decrementa para ir de uno en uno
                pasos++;
            }
            arreglo[i + 1] = elemento;
            num++; //para que no falle al mostrar el tamaño del arreglo
            pasos++;  // para que cuente el primer paso y no falle al saltar en mas de 1 numero y no cuente el primero
            return pasos;
        }

        // borrar y no desordenar
        public static int borrarelemento(int[] arreglo, int elemento) {
            int pasos = 0;
            int posicion = buscararreglo(arreglo, elemento);
            if (posicion == -1) {
                System.out.println("no exisste ese elemento");
                return pasos;
            }
            for (int i = posicion; i < num - 1; i++) {
                arreglo[i] = arreglo[i + 1];  //elemento que se selecciono empieza a ser asignado por el siguiente y asi va hasta que al final se elimina
                pasos++;
            }
            num--;  // reducir el tamano
            pasos++;
            return pasos;
        }

        // Buscar un elemento en el arreglo
        public static int buscararreglo(int[] arreglo, int elemento) {
            for (int i = 0; i < num; i++) {
                if (arreglo[i] == elemento) {
                    return i;  //si
                }
            }
            return -1; // no lo encuentra
        }

        // Imprimir el arreglo
        public static void imprimirarreglo(int[] arreglo, int tamano) {
            System.out.println("Elementos del arreglo:");
            for (int i = 0; i < tamano; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }
