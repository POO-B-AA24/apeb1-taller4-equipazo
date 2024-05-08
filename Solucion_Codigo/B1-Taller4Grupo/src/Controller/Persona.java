package Controller;

public class Persona {



    String rol;
    String name;
    String id;

    public Persona(String rol, String name, String id) {
        this.rol = rol;
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("rol=").append(rol);
        sb.append(", name=").append(name);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
    
 
}
