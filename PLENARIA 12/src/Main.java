import java.lang.Math;
public class Main {
    private int a;
    private int b;
    private int c;

    public  Main (int coefieiente1, int coeficiente2, int coeficiente3) {
        a = coefieiente1;
        b = coeficiente2;
        c = coeficiente3;

    }


    public void resolver (){
        double x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("x1 = " + x1);
    }


    public void main (String[] args) {
        Main ecuacion = new Main(1, 2, 1);
        ecuacion.resolver();
    }

}