
public class Problema2_AplicacionCiclos { // Lo mismo que un empleado

    private String name;
    private int age;
    private double salary;
    private double raise;
    private double sum = 0;
    private double averageSalary;

    Problema2_AplicacionCiclos(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setPayRaise(double raise) {
        if (raise != 0) {
            this.raise = raise;
        }
    }

    public double getPayRaise() {
        return raise;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void sumEmpleado(double salary) {
        this.sum += salary;

    }

    public void calcPromedio(double sum, int cont) {
        this.averageSalary = sum / cont;

    }

    public void compararSueldo(double averageSalary, double raise) {
        this.salary += (this.salary < averageSalary) ? this.salary * raise / 100 : 0;
    }

    public String mostrarInformacion() { // String Builderaso
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", aumento= ").append(raise).append("%");
        sb.append(", salary=").append(salary);
        sb.append(", promedio de salarios =").append(averageSalary);
        sb.append('}');
        return sb.toString();
    }

}
