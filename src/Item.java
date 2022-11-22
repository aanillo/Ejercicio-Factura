public class Item {
    private Productos producto;
    private int cantidad;
    private float totalItem;

    public Item(Productos producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.totalItem = calculaTotalItem();
    }

    public float getTotalItem() {
        return totalItem;
    }

    public float calculaTotalItem(){
        return cantidad * producto.getPrecio();
    }
    public String formateaItem(){
        return cantidad + "\t\t" + producto.getMarca() + "\t\t" + producto.getModelo() + "\t\t" + producto.getPrecio() + "\t\t" + totalItem;
    }
}
