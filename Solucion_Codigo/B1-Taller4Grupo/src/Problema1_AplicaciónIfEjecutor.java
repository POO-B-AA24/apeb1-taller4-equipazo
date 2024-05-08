
import java.util.Scanner;

public class Problema1_AplicaciónIfEjecutor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto");
        String name = in.nextLine();
        System.out.println("Ingrese precio del producto");
        double price = in.nextDouble();
        System.out.println("Ingrese cantidad del producto");
        int quant = in.nextInt();
        
        Problema1_AplicaciónIf productito = new Problema1_AplicaciónIf(name, price, quant);
        
        productito.calcularDescuento(price, quant);
        productito.calcularPrecioFinal( price, quant, productito.getDiscount());
        
        System.out.println(productito.toString()); // toString es implicito. SOlo para tener idea de su existencia lo declaro explicitamente. 
    }
}
