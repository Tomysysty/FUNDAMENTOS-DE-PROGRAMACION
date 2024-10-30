public class EJERCICIO1 {
    public static void main(String[] args) {
        double a = 10.3;
        double b = 5.4;
        double c = 7;
        double d = 6.3;
        double e = 0;

        Calculadora calc = new Calculadora();
        e = calc.sumar(a,b);{
            System.out.println("Resultado de la suma: "+e);
            System.out.println("Memoria despues de la suma: "+calc.obtenerMemoria());
        }

        e = calc.resta(c,d);{
            e= calc.resta(a,b);
            System.out.println("Resultado de la resta: "+e);
            System.out.println("Memoria despues de la resta: "+calc.obtenerMemoria());

        }
        //Reiniciar memoria
        calc.iniciarMemoria();


        e = calc.multiplicar(c, d);
        System.out.println("Resultado de multiplicar: " + e);
        System.out.println("Memoria después de multiplicar: " + calc.obtenerMemoria());

        e = calc.dividir(a, b);
        System.out.println("Resultado de dividir: " + e);
        System.out.println("Memoria después de dividir: " + calc.obtenerMemoria());
    }
}