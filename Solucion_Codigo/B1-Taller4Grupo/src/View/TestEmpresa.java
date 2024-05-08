package View;

import java.util.Scanner;
import Controller.Terreno;
import Controller.Empresa;
import Controller.Persona;

public class TestEmpresa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean opc = true;
        String str = null;

        //Personas
        //Persona p1 = new Persona("Gerente", "Juan Diego"); → Procedimiento mas demoroso, pero comprensible 😉
        
        Persona personasArray[] = {new Persona("Gerente", "Juan Diego", "01"),new Persona("Cliente", "Suanny", "02")};
        
        Terreno terrenos[]= {new Terreno(10,5,2),(new Terreno(20,30,2))};
        
        Empresa emp1 = new Empresa("ruc","nombre","telefono","Mi lote bonito",personasArray,terrenos);
        
        // Presentar solo personas
        for (Persona people : personasArray) {
            System.out.println(people);
        }
        // Presentar terrenos
        for (Terreno terrenito : terrenos) {
            terrenito.calcularArea();
            terrenito.cacularCostoFinal();
            System.out.println(terrenito);
        }
        //System.out.println(emp1.personasArray[0]);
        
        while (opc) {

            // Terrenos
            System.out.println("Dame alto, ancho y vmc:");

            Terreno tl = new Terreno(in.nextDouble(), in.nextDouble(), in.nextDouble());
            tl.calcularArea();
            tl.cacularCostoFinal();
            System.out.println(tl);
            System.out.println("Desea vender mas (S/N)");
            str = in.next();
            if (str.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
