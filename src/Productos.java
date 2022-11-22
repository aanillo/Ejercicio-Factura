public enum Productos {
    PORTATIL("HP","14khv2345",399.99f),
    MONITOR("Acer","24jkaks",125.65f),
    HDD("Seagate","23451T",89.00f),
    RATON("Nisu","Oot34",8.10f),
    TECLADO("HP","2134jj",23.12f);

    private String marca;
    private String modelo;
    private float precio;

    Productos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }
}
