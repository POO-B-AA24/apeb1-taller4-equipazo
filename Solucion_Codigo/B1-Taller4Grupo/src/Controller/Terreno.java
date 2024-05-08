package Controller;

public class Terreno {

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