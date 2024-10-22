public class EJERCICIO1 {
    public static void main(String[] args) {
        String[][] matrix = {
                {"H", "O", "S"},
                {"G", "O", "H"},
                {"L", "P", "F"},
                {"K", "E", "W"}
        };
        String[] palabra = {"SOL"};
        int contador = palabra[0].length();
        String Pi = "";
        String Pf = "";

        for (int i = 0; i < contador; i++) {
            String letra = palabra[0].charAt(i) + ""; //palabra, caracter
            for (int j = 0; j <= 3; j++) {
                for (int k = 0; k<=2; k++) {
                    if (matrix[j][k].equals(letra) && i==0) { //Se encuentra la primera letra

                       int z = k+2;
                       if (z >=0 && z<=2) {
                           if (matrix[j] [k+1].equals(palabra[0].charAt(i+1) + "")) {//Buscar hacia la derecha
                               if (matrix[j] [k+2].equals(palabra[0].charAt(i+2) + "")) {
                                   Pi = j + ", " + k;
                                   Pf = (j) + ", " + (k+2);
                               }
                           }
                       }

                        z= k-2;
                        if (z >=0 && z<=2) {
                            if (matrix[j][k-1].equals(palabra[0].charAt(i + 1) + "")) { //Buscar hacia la izquierda
                                if (matrix[j][k-2].equals(palabra[0].charAt(i + 2) + "")) {
                                    Pi = j + ", " + k;
                                    Pf = (j) + ", " + (k-2);

                                }
                            }
                        }



                        z= j-2;
                        if (z >=0 && z<=2) {
                            if (matrix[j - 1][k].equals(palabra[0].charAt(i + 1) + "")) { //Buscar hacia arriba
                                if (matrix[j - 2][k].equals(palabra[0].charAt(i + 2) + "")) {
                                    Pi = j + ", " + k;
                                    Pf = (j-2) + ", " + (k);
                                }
                            }
                        }
                        z= j+2;
                        if (z >=0 && z<=2) {
                            if (matrix[j + 1][k].equals(palabra[0].charAt(i + 1) + "")) { //Buscar hacia abajo
                                if (matrix[j + 2][k].equals(palabra[0].charAt(i + 2) + "")) {
                                    Pi = j + ", " + k;
                                    Pf = (j+2) + ", " + (k);
                                }
                            }
                        }
                        int w = j-2;
                        z= k+2;

                        if (z >=0 && z<=2 && w >=0 && w<=3) {
                            if (matrix[j -1][k+1].equals(palabra[0].charAt(i + 1) + "")) { //Buscar hacia arriba y derecha
                                if (matrix[j-2][k+2].equals(palabra[0].charAt(i + 2) + "")) {
                                    Pi = j + ", " + k;
                                    Pf = (j-2) + ", " + (k+2);

                                }
                            }
                        }

                        w = j-2;
                        z= k-2;

                        if (z >=0 && z<=2 && w >=0 && w<=3) {
                            if (matrix[j-1][k-1].equals(palabra[0].charAt(i + 1) + "")) { //Buscar hacia arriba y izquierda
                                if (matrix[j-2][k-2].equals(palabra[0].charAt(i + 2) + "")) {
                                    Pi = j + ", " + k;
                                    Pf = (j-2) + ", " + (k-2);
                                }
                            }
                        }

                        w = j+2;
                        z= k+2;

                        if (z >=0 && z<=2 && w >=0 && w<=3) {
                            if (matrix[j+1][k+1].equals(palabra[0].charAt(i + 1) + "")) { //Buscar hacia abajo y derecha
                                if (matrix[j+2][k+2].equals(palabra[0].charAt(i + 2) + "")) {
                                    Pi = j + ", " + k;
                                    Pf = (j+2) + ", " + (k+2);
                                }
                            }
                        }

                        w = j+3;
                        z= k-1;

                        if (z >=0 && z<=2 && w >=0 && w<=3) {
                            if (matrix[j+1][k-1].equals(palabra[0].charAt(i + 1) + "")) { //Buscar hacia abajo y izquierda
                                if (matrix[j+2][k-2].equals(palabra[0].charAt(i + 2) + "")) {
                                    Pi = j + ", " + k;
                                    Pf = (j+2) + ", " + (k-2);
                                }
                            }
                        }



                    }
                }
            }

        }

        System.out.println("Inicio: " + Pi + " fin: " + Pf);



    }
}