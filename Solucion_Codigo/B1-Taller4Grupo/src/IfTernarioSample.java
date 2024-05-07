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
        this.costoFinal -= (this.area >= 200 && this.area<300) ? this.desc=(costoFinal * 0.1) : checkMoreDiscount();
    }
    public double checkMoreDiscount(){
        return (this.area >= 300 ) ? this.desc=(costoFinal*0.2):(this.desc=0);
    }
    @Override
    public String toString() {
        return "\nTerreno (" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + " descuento, "+desc+", costofinal=" + costoFinal + ")";
        
    }
}
