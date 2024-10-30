public class MainFiguraGeometrica {
    public static void main(String[] args) {

        FiguraGeometrica.Circulo circulo = new FiguraGeometrica.Circulo("Rojo", 3.0);
        FiguraGeometrica.Circulo.Rectangulo rectangulo = new FiguraGeometrica.Circulo.Rectangulo("Azul", 3.0, 4.0);

        System.out.println("Círculo:");
        circulo.imprimir();

        System.out.println("\nRectángulo:");
        rectangulo.imprimir();
    }
}