import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.println("Dirección: ");
        String dirección = entrada.nextLine();
        System.out.println("Población: ");
        String población = entrada.nextLine();
        System.out.println("CP: ");
        String CP = entrada.nextLine();
        System.out.println("DNI: ");
        String DNI = entrada.nextLine();
        System.out.println("Email: ");
        String email = entrada.nextLine();
        System.out.println("IDCliente: ");
        String tuID = entrada.nextLine();

        Cliente comprador = new Cliente(nombre,apellidos,dirección,población,CP,DNI,email,tuID);
        System.out.println(comprador.datosCliente());

        Item[] carrito = new Item[10];
        int cantidad = 0;
        int producto = 0;
        int contador = 0;
        do{
            System.out.println("Cantidad: ");
            try {
                cantidad = entrada.nextInt();
            } catch (Exception e){
                System.out.println("No es un número.");
            }
            System.out.println("1 - Portátil, 2 - Monitor, 3 - Ratón, 4 - Teclado");
            System.out.println("Producto: ");
                try {
                    producto = entrada.nextInt();
                    switch (producto) {
                        case 1:
                            carrito[contador] = new Item(Productos.PORTATIL, cantidad);
                            break;
                        case 2:
                           carrito[contador] = new Item(Productos.MONITOR, cantidad);
                            break;
                        case 3:
                            carrito[contador] = new Item(Productos.RATON, cantidad);
                            break;
                        case 4:
                            carrito[contador] = new Item(Productos.TECLADO, cantidad);
                            break;
                    }
                    contador++;
                } catch (Exception e) {
                }
        }while (cantidad!=0);
        for (int i=0; i<carrito.length; i++){
            if(carrito[i] == null) {
                break;
            } else{
                System.out.println(carrito[i].formateaItem());
            }
        }
    }
}
