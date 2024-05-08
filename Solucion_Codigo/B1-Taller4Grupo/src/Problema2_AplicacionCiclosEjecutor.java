
import java.util.Scanner;

public class Problema2_AplicacionCiclosEjecutor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String continuar;
        String name;
        int age;
        double salary;
        int cont = 0;
        boolean sigue = true;
        double raise=0;
        Problema2_AplicacionCiclos[] arrayEmpleados;// Esto nos sirve para comparar cada empleado con el promedio... Aqui nos estancamos en primer  cilo por no saber arreglos jeje :(

        do {
            System.out.println("Ingrese el siguiente empleado: ");
            System.out.println("Nombre: ");
            name = in.nextLine();
            System.out.println("Edad: ");
            age = in.nextInt();
            System.out.println("Salario: ");
            salary = in.nextDouble();

            Problema2_AplicacionCiclos emp = new Problema2_AplicacionCiclos(name, age, salary);
            System.out.println(emp.mostrarInformacion());
            if (cont == 0) {
                System.out.println("Cuanto aumento % le gustaria otorgar a empleados con sueldo bajo?");
                raise = in.nextDouble();
                in.nextLine(); // Limpiar bufersito.
            }
            emp.setPayRaise(raise);

            double sum = emp.sumEmpleado(salary);
            System.out.println("Desea Ingresar mas empleados? S/N");
            if (cont>1){
            in.nextLine();
            }
            continuar = in.nextLine();
            // Esto se ejecuta si el usuario ya decide terminar el ciclo (Equivalente al ultimo elemento de un arreglo)
            if (!continuar.equalsIgnoreCase("S")) {
                sigue = false;
                cont++;
                emp.calcPromedio(sum, cont);
                //cont--;
                double newSalary= emp.compararSueldo(salary, emp.getPayRaise());
                emp.setSalary(newSalary);
                System.out.println("Actualizada la info");
                System.out.println(emp.mostrarInformacion());
            }
            cont++;
        } while (sigue);
        /*
        // Ahora vamos con for:
        arrayEmpleados= new Problema2_AplicacionCiclos[cont];
        for (Problema2_AplicacionCiclos arrayEmpleado : arrayEmpleados) {
            arrayEmpleado(name, age, salary);
            arrayEmpleado.compararSueldo(salary);
            
            System.out.println(arrayEmpleado.mostrarInformacion());
        }*/

    }

}
