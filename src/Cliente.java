public class Cliente {
    private String nombre;
    private String apellidos;
    private String dirección;
    private String población;
    private String CP;
    private String DNI;
    private String email;
    private String idCliente;

    public Cliente(String nombre, String apellidos, String dirección, String población, String CP, String DNI, String email, String idCliente) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dirección=dirección;
        this.población=población;
        this.CP=CP;
        this.DNI=DNI;
        this.email=email;
        this.idCliente=idCliente;
    }


    public String datosCliente(){
        String datos = "Cliente: " + '\n' + nombre + " " + apellidos + '\n' + dirección + '\n' + CP + " " + población + '\n' + "DNI" + '\n' + email;
        return datos;
    }
}
