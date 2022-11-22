import java.util.Arrays;

public class Factura {
    private Cliente cliente;
    private Item[] carrito;
    private float total;
    private float iva;
    private float totalFacturación;
    private String fecha;
    private String númeroFactura;

    public Factura (Cliente cliente, Item[] carrito){
        this.cliente=cliente;
        this.carrito=carrito;
        this.total=this.sumaLíneas();
        this.iva=this.calculaIva(21);
        this.totalFacturación=this.calculaTotalFactura();
        this.fecha=this.ponFecha();
        this.númeroFactura=ponNúmeroFactura();
        System.out.println(this.toString());
    }

    public String ponFecha(){
        return "08/11/2022";
    }
    public String ponNúmeroFactura(){
        return "0025/2022";
    }
    public float sumaLíneas(){
        float suma=0;
        for(Item línea: this.carrito){
            if(línea != null) {
                suma += línea.getTotalItem();
            }
        }
        return suma;
    }
    public float calculaIva(float tipoIva){
        return tipoIva * this.total /100;
    }
    public float calculaTotalFactura(){
        return this.total + this.iva;
    }

    @Override
    public String toString() {
        return "Factura{ " +
                cliente.datosCliente() +
                ", total=" + total + '\n' +
                ", iva=" + iva + '\n' +
                ", totalFacturación=" + totalFacturación + '\n' +
                ", fecha='" + fecha + '\n' +
                ", númeroFactura='" + númeroFactura + '\n' +
                '}';
    }
    public void imprimeFactura(){
        System.out.println(cliente.datosCliente());
        System.out.println("\n\n");
        System.out.println("Factura num: " + númeroFactura + "\t\t Fecha: " + fecha);
        System.out.println("\n\n");
        System.out.println("uds\t\tmarca\t\tmodelo\t\tprecio\t\ttotal");
        for (int i=0; i<carrito.length; i++){
            if(carrito[i] == null) {
                break;
            } else{
                System.out.println(carrito[i].formateaItem());
            }
        }
        System.out.println("Base imponible: " + total + "\t\tIVA: " + iva + " \t\tTotal: " + totalFacturación);
    }
}


