public class Vehiculos {
    private String marca;
    private String modelo;
    private String color;
    private int kmRecorridos;
    private int velocidadMaxima;
    private int velocidadActual;

    public Vehiculos(String marca, String modelo, String color, int kmRecorridos, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kmRecorridos = kmRecorridos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int acelerar10km(){
        if (velocidadActual==velocidadMaxima){
            System.out.println("BRRR no puedo acelerar mas");
            return 0;
        } velocidadActual= velocidadActual+10;
        System.out.println("Velocidad actual es: "+velocidadActual);
        return velocidadActual;
    }
    public int acelerar20km(){
        if (velocidadActual==velocidadMaxima){
            System.out.println("BRRR no puedo acelerar mas");
            return 0;
        } velocidadActual= velocidadActual+20;
        System.out.println("Velocidad actual es: "+velocidadActual);
        return velocidadActual;
    }

    public int Desacelerar10(){
        if (velocidadActual==0){
            System.out.println("Mi aceleracion es nula");
            return 0;
        }
        velocidadActual= velocidadActual-10;
        System.out.println();
        return velocidadActual;
    }
    public int Desacelerar20(){
        if (velocidadActual==0){
            System.out.println("Mi aceleracion es nula");
            return 0;
        }
        velocidadActual= velocidadActual-20;
        System.out.println();
        return velocidadActual;
    }
    public int frenardetotazo(){
        if (velocidadActual==0){
            System.out.println("Ya estoy frenado");
            return 0;
        }
        velocidadActual=0;
        System.out.println("PIIII Frene de totazo: Velocidad Actual "+velocidadActual+"km/h" );
        return velocidadActual;
    }
    public int frenar10(){
        if (velocidadActual==0){
            System.out.println("Ya estoy frenado");
            return 0;
        }
        while (velocidadActual!=0) {
            velocidadActual = velocidadActual-10;
            System.out.println("Estoy frenando: Velocidad Actual "+velocidadActual+"km/h" );
        }
        return velocidadActual;
        }


        public int calcularTiempoLlegada(int distancia){
        if (velocidadActual==0){
            System.out.println("No puedo calcular el tiempo de llegada si estoy detenido");
            return 0;
        }
        int tiempollegada = distancia/velocidadActual;
            System.out.println("Para recorrer "+distancia+"km tardaremos "+tiempollegada+" horas");
            return tiempollegada;
        }






    //VEHICULOS CONVENCIONALES
    public class VehiculoConvencional extends Vehiculos {
        private String tipoCombustible; // gasolina o diesel
        private int cilindraje;
        private int autonomiaTanqueada;

        public VehiculoConvencional(String marca, String modelo, String color, int kmRecorridos, int velocidadMaxima, String tipoCombustible, int cilindraje, int autonomiaTanqueada) {
            super(marca, modelo, color, kmRecorridos, velocidadMaxima);
            this.tipoCombustible = tipoCombustible;
            this.cilindraje = cilindraje;
            this.autonomiaTanqueada = autonomiaTanqueada;
        }

        public String getTipoCombustible() {
            return tipoCombustible;
        }

        public void setTipoCombustible(String tipoCombustible) {
            this.tipoCombustible = tipoCombustible;
        }

        public int getCilindraje() {
            return cilindraje;
        }

        public void setCilindraje(int cilindraje) {
            this.cilindraje = cilindraje;
        }

        public int getAutonomiaTanqueada() {
            return autonomiaTanqueada;
        }

        public void setAutonomiaTanqueada(int autonomiaTanqueada) {
            this.autonomiaTanqueada = autonomiaTanqueada;
        }
    }

    public class VehiculoHibrido extends VehiculoConvencional {
        private int numeroBaterias;
        private int duracionBateria;
        private int tiempoCargaBateria;
        private int autonomiaBaterias;

        public VehiculoHibrido(String marca, String modelo, String color, int kmRecorridos, int velocidadMaxima, String tipoCombustible, int cilindraje, int numeroBaterias, int duracionBateria, int tiempoCargaBateria, int autonomiaTanqueada, int autonomiaBaterias) {
            super(marca, modelo, color, kmRecorridos, velocidadMaxima, tipoCombustible, cilindraje, autonomiaTanqueada);
            this.numeroBaterias = numeroBaterias;
            this.duracionBateria = duracionBateria;
            this.tiempoCargaBateria = tiempoCargaBateria;
            this.autonomiaBaterias = autonomiaBaterias;
        }

        public int getNumeroBaterias() {
            return numeroBaterias;
        }

        public int getDuracionBateria() {
            return duracionBateria;
        }

        public int getTiempoCargaBateria(){
            return tiempoCargaBateria;
        }

        public int getAutonomiaBateria(){
            return autonomiaBaterias;
        }

        public void setNumeroBaterias(int numeroBaterias){
            this.numeroBaterias =numeroBaterias;
        }

        public void setDuracionBateria (int duracionBateria){
            this.duracionBateria=duracionBateria;
        }
        public void setTiempoCargaBateria (int tiempoCargaBateria){
            this.tiempoCargaBateria =tiempoCargaBateria;
        }
        public void setAutonomiaBaterias(int autonomiaBaterias){
            this.autonomiaBaterias=autonomiaBaterias;
        }

    }
    public class VehiculoElectrico extends Vehiculos {
        private int numeroBateria;
        private int tiempoBateria;
        private int tiempoCarga;
        private int kmAutonomia;


        public VehiculoElectrico (String marca, String modelo, String color, int kmRecorridos, int velocidadMaxima,int numeroBateria,int tiempoBateria,int tiempoCarga,int kmAutonomia){
            super(marca,modelo,color,kmRecorridos,velocidadMaxima);
            this.numeroBateria =numeroBateria;
            this.tiempoBateria=tiempoBateria;
            this.tiempoCarga=tiempoCarga;
            this.kmAutonomia=kmAutonomia;
        }

        public int getNumeroBateria(){
            return numeroBateria;
        }
        public int getTiempoBateria(){
            return tiempoBateria;
        }
        public int getTiempoCarga(){
            return tiempoCarga;
        }
        public int getKmAutonomia(){
            return kmAutonomia;
        }
        public void setNumeroBateria(int numeroBateria){
            this.numeroBateria=numeroBateria;
        }
        public void setTiempoBateria(int tiempoBateria){
            this.tiempoBateria=tiempoBateria;
        }
        public void setTiempoCarga(int tiempoCarga){
            this.tiempoCarga=tiempoCarga;
        }
        public void setKmAutonomia(int kmAutonomia){
            this.kmAutonomia=kmAutonomia;
        }
    }


}


