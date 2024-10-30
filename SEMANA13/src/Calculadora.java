import javax.swing.plaf.PanelUI;
//OBJETO DEL EJERCICIO 1
public class Calculadora {
    private double memoria;

    //CONSTRUCTOR
    public Calculadora() {
        memoria = 0;
    }

    public double obtenerMemoria() {
        return memoria;
    }

    //para reiniciar la memoria depues de la suma y la resta
    public double iniciarMemoria (){
        this.memoria = 0.0;
        return memoria;
    }

    public double sumar (double a, double b){
        double suma = a+b;
        this.memoria += suma;
        return suma;
    }

    public double resta (double a, double b){
        double resta = a-b;
        this.memoria += resta;
        return resta;
    }
    public double dividir (double a, double b){
        double division = a/b;
        this.memoria += division;
        return division;
    }
    public double multiplicar (double a, double b){
        double multiplicacion = a*b;
        this.memoria += multiplicacion;
        return multiplicacion;
    }
}
