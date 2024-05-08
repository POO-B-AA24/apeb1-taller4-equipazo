
import java.util.Scanner;

public class Problema2_AplicacionCiclosEjecutor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String continuar;
        String name;
        int age;
        double salary;
        int cont = 0;
        boolean sigue=true;
        do {
            System.out.println("Ingrese el siguiente empleado: ");
            System.out.println("Nombre: ");
            name = in.nextLine();
            System.out.println("Edad: ");
            age = in.nextInt();
            System.out.println("Salario: ");
            salary = in.nextDouble();

            Problema2_AplicacionCiclos emp = new Problema2_AplicacionCiclos(name, age, salary);
            System.out.println(emp);
            
            System.out.println("Desea Ingresar mas empleados? S/N");
            in.nextLine();
            continuar = in.nextLine();
            if (!continuar.equalsIgnoreCase("S")){
                sigue =false;
            }
            cont++;
        } while (sigue);

    }
}
