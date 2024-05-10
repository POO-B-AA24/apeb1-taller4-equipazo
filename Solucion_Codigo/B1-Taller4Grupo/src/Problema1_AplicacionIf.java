
public class Problema1_AplicacionIf {

    private String name;
    private double price;
    private int quant;
    private double desc;
    private double descPercent;
    private double finalPrice;

    public Problema1_AplicacionIf(String name, double price, int quant) {
        this.name = name;
        this.price = price;
        this.quant = quant;
        this.descPercent=0;
    }

    public void calcularDescuento(double price, int quant) {

        if (price >= 1000 && quant >= 10) {
            this.descPercent = 10;
            this.desc = price * (0.1);

        } else if (price < 1000) {
            this.descPercent = 5;
            this.desc = price * (0.05);
        } else {
            this.desc = 0;
        }

    }

    public double getDiscount() {
        return this.desc;
    }

    public void calcularPrecioFinal(double price, int quant, double desc) {
        this.finalPrice = (price * quant) - desc;

    }

    public double getPrecioFinal() {
        return this.finalPrice;
    }

    @Override
    public String toString() { // String BUilderaso
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("Nombre=").append(name);
        sb.append(", precio=").append(price);
        sb.append(", cantidad=").append(quant);
        sb.append(", descuento(dolares)=").append(getDiscount()).append("$");
        sb.append(", descuento(%)=").append(descPercent).append("$");
        sb.append(", Precio Final=").append(getPrecioFinal());
        sb.append('}');
        return sb.toString();
    }
}
