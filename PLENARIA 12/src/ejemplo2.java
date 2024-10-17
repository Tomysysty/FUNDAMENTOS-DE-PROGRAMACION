public class ejemplo2 {

    public void Triangulo(double base, double altura){




        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public double getArea(double base, double altura){
        return (base * altura) / 2;
    }

    public double getBase(double area, double altura){
        return (2 * area) / altura;
    }

    public double calcularBase (double area, double altura){
        return (2 * area) / altura;
    }

    public double calcularAltura (double area, double base){
        return (2 * area) / base;
    }






}
