
public class Problema2_AplicacionCiclos { // Lo mismo que un empleado
    
    String name;
    int age;
    double salary;

    Problema2_AplicacionCiclos(String name, int age, double salary) {
        this.name =name;
        this.age =age;
        this.salary =salary;
    }
    
        public String toString() { // String Builderaso
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

}


