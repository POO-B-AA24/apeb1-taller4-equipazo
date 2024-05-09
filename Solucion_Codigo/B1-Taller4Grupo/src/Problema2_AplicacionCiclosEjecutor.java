
import java.util.Scanner;

public class Problema2_AplicacionCiclosEjecutor {
// NOTA: POR FAVOR NO ELIMINAR LOS COMENTARIOS. PUESTO QUE VAN A SERVIR PARA EL SIGUIENTE TALLER DONDE TRABAJEMOS CON ARREGLOS.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String continuar;// Estas son algunas variables locales para cumplir el objetivo de este programa.
        String name;
        int age;
        double salary;
        
        boolean sigue = true;
        
        //Problema2_AplicacionCiclos[] arrayEmpleados;// Esto nos sirve para comparar cada empleado con el promedio... Aqui nos estancamos en primer  cilo por no saber arreglos jeje :(

        // NOTA IMPORTANTISIMSIMASIMSMA:
        // Las variables suma , contador y payRaise son locales y enviadas como parametros. Puesto que en cada iteracion si estas fueran atributos, serian sobreescritas al crearse un nuevo objeto con el mismo nombre que el anterior. Por ello mejor las hacemos locales, y asi su valor permanece intacto. Solo los valores de los atributos del objeto son afectados cada iteracion.
        // El averageSalary no lo vuelvo variable local. Es innecesario, ya que con tener sum y cont , como locales, ya obtendre el verdadero valor de el promedio en la ultima iteracion (este valor es por conveniencia el atributo del objeto creado en la ultima iteracion).
        double sum=0; // Desde aqui las variables locales
        int cont = 0;
        double raise = 0;
        do {
            System.out.println("Ingrese el siguiente empleado: ");
            System.out.println("Nombre: ");
            name = in.nextLine();
            System.out.println("Edad: ");
            age = in.nextInt();
            System.out.println("Salario: ");
            salary = in.nextDouble();
            
            Problema2_AplicacionCiclos emp = new Problema2_AplicacionCiclos(name, age, salary);
            //emp.sumEmpleado(salary);
            sum+= emp.getSalary();
            System.out.println(emp.mostrarInformacion());
            if (cont == 0) {
                System.out.println("Cuanto aumento % le gustaria otorgar a empleados con sueldo bajo?");
                raise = in.nextDouble();

            }
            in.nextLine(); // Limpiar bufersito.
            emp.setPayRaise(raise);

            System.out.println("Desea Ingresar mas empleados? S/N");
            continuar = in.nextLine();

            // Esto se ejecuta si el usuario ya decide terminar el ciclo (Equivalente al ultimo elemento de un arreglo)
            if (!continuar.equalsIgnoreCase("S")) {
                sigue = false;
                cont++;
                emp.calcPromedio(sum, cont);
            
                //cont--;
                emp.compararSueldo(emp.getAverageSalary(), raise);
                //emp.setSalary(newSalary);
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
