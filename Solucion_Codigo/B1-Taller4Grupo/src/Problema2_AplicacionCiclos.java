
public class Problema2_AplicacionCiclos { // Lo mismo que un empleado

    String name;
    int age;
    double salary;
    double raise;
    double averageSalary;
    
    Problema2_AplicacionCiclos(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setPayRaise(double raise) {
        this.raise=raise;
    }
    public double getPayRaise() {
        return raise;
    }
    
    public void setSalary(double salary){
        this.salary=salary;
    }
    
        public double sumEmpleado(double salary) {
            double sum = salary++;
            return  sum ;
    }
        
        public void calcPromedio(double sum, int cont){
            this.averageSalary = sum/cont;
            
        }
        
        public double compararSueldo(double salary, double raise){
        return this.salary += (salary < averageSalary) ?  salary*getPayRaise(): 0; 
        }

    public String mostrarInformacion() { // String Builderaso
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", aumento= ").append(getPayRaise()).append("%");
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }



}
