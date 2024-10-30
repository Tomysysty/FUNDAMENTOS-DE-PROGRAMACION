import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args)  {
        CuentaAhorros cuentaAhorros = new CuentaAhorros();


        Scanner sc = new Scanner(System.in);
        int opcion;
        do {System.out.println("");
        System.out.println(cuentaAhorros.getTitular()+ " usuario: "+ cuentaAhorros.getId());
        System.out.println("____________________");
        System.out.println("Que quieres hacer!: ");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Reiniciar");
        System.out.println("5. Salir");
        opcion = sc.nextInt();

        if(opcion == 1){
            System.out.println("Ingresa el dinero que vas a depositar: ");
            double dineroparadepositar = sc.nextDouble();
            double dineroactual = cuentaAhorros.getCA();
            cuentaAhorros.Depositar(dineroparadepositar);
        } else if (opcion == 2){
            System.out.println("Ingresa el dinero que vas a retirar: ");
            int dineropararetirar = sc.nextInt();
            cuentaAhorros.Retirar(dineropararetirar);
        } else if (opcion == 3){
            cuentaAhorros.Consultar();
        } else if (opcion == 4){
            cuentaAhorros.Reiniciar();
        }} while (opcion != 5);
        System.out.println("Gracias por usar nuestros servicios ;)");
        sc.close();


    }



}
