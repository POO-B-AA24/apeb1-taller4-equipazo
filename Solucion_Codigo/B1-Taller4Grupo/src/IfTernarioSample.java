import java.util.Scanner;
public class IfTernarioSample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean opc = true;
        String str = null;
        while (opc){
            System.out.println("Dame alto, ancho y vmc:");
        Terreno tl = new Terreno(in.nextDouble(), in.nextDouble(), in.nextDouble());
        tl.calcularArea();
        tl.cacularCostoFinal();
        System.out.println(tl);
            System.out.println("Desea vender mas (S/N)");
            str = in.next();
            if (str.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}

class Terreno {

    public double alto, ancho, vmc, area,desc, costoFinal;
    public String mensajeEspecial="Nada especial al momento.";
    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
    }

    public void calcularArea() {
        this.area = this.alto * this.ancho;
    }

    public void cacularCostoFinal() {
        this.costoFinal = this.area * this.vmc;
        this.costoFinal -= (this.area > 300) ?  descuento20(): checkDiscount(); // Improved the logic
    }
    public double checkDiscount(){
        return ( this.area >=200) ? descuento10():(this.desc=0);
    }
    
    public double descuento20(){
        this.mensajeEspecial="Feliciades, 20% descuento";
        return this.desc=(costoFinal*0.2); 
    }
    public double descuento10(){
        this.mensajeEspecial="Muy bien, 10% descuento";
        return this.desc=(costoFinal*0.1); 
    }
    
    @Override
    public String toString() {
        return "\nTerreno (" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + " descuento, "+desc+", costofinal=" + costoFinal + ")"+" mensaje de compra: "+ mensajeEspecial;
        
    }
}

// Pal examen parcial: teoria
/*
Cuando analizamos un programa, va primero el objeto. Luego la clase (First egg, then chicken)
Al modelar un programa (UML) primero va la clase, luego el objeto. (First chicken, then egg)


MVC
Modelo: La base de datos 
Vista: 
Controlador: Logica del negocio
*/