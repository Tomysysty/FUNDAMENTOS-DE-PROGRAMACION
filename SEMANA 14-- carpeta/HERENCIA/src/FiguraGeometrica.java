public abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void imprimir() {
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }


    public class Circulo extends FiguraGeometrica {
        private double radio;

        public Circulo(String color, double radio) {
            super(color);
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }


        public class Rectangulo extends FiguraGeometrica {
            private double ancho;
            private double alto;

            public Rectangulo(String color, double ancho, double alto) {
                super(color);
                this.ancho = ancho;
                this.alto = alto;
            }

            public double calcularArea() {
                return ancho * alto;
            }

            public double calcularPerimetro() {
                return 2 * (ancho + alto);
            }
        }
    }
}
