
public class Problema2_AplicacionCiclos { // Lo mismo que un empleado

    String name;
    int age;
    double salary;
    double discount;

    Problema2_AplicacionCiclos(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setDiscount(double disc) {
        this.discount=disc;
    }
    public double getDiscount() {
        return discount;
    }
    
        public void sumEmpleado(double salary, double disc) {
            double sum= salary++;
    }

    public String mostrarInformacion() { // String Builderaso
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }



}
