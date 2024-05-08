
package Controller;


public class Empresa {


    public String ruc;
    public String name;
    public String phone;
    public String mail;
    public Persona personasArray[];
    public Terreno terrenos[];


    
    public Empresa(String ruc, String name, String phone, String mail, Persona[] personasArray, Terreno[] terrenos) {
        this.ruc = ruc;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.personasArray = personasArray;
        this.terrenos = terrenos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("ruc=").append(ruc);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", mail=").append(mail);
        sb.append(", personasArray=").append(personasArray);
        sb.append(", terrenos=").append(terrenos);
        sb.append('}');
        return sb.toString();
    }
 
}
