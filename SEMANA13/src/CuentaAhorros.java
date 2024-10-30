public class CuentaAhorros {
    private String titular;
    private Integer Id;
    private double ca;

    public CuentaAhorros(){
        this.titular = "Ernesto";
        this.Id = 001;
        this.ca = 0.0;
    }
    public String getTitular(){
        return titular;
    }
    public Integer getId(){
        return Id;
    }
    public double getCA(){
        return ca;
    }

        public Double Depositar ( double DEPOSITO){
        if (DEPOSITO < 10000) {
            System.out.println("Cantidad invalida: Deposito minimo = 10.000");
            return -1.0;
        }
        System.out.println("Deposito realizado: ");
        Double Depositorealizado = DEPOSITO + ca;
        System.out.println("Cuenta de ahorros actualizada: " + Depositorealizado);
        ca= Depositorealizado;
        return Depositorealizado;
    }

        public double Retirar ( double Retiro){
        if (Retiro > ca) {
            System.out.println("No hay dinero suficiente en tu cuenta de ahorros. :( ");
            return -1;
        } else if (Retiro < 10000) {
            System.out.println("Cantidad invalida: El retiro minimo es de 10.000");
            return -1;
        }
        Double RetiroRealizado = ca - Retiro;
        System.out.println("Retiro exitoso");
        System.out.println("Dinero en tu cuenta actualizado: " + RetiroRealizado);
        System.out.println("bshhh bshhh retirando dinero");
        ca= RetiroRealizado;
        return RetiroRealizado ;
    }
        public double Consultar () {
        System.out.println("Dinero actual en la cuenta: " + ca);
        return ca;
    }

        public double Reiniciar () {
        ca = 0.0;
        return ca;

    }







}
