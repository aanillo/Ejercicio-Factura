import java.util.Scanner;

public class Main {
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
        int producto = 0;
        int cantidad = 0;
        int contador = 0;
        boolean salir = false;
        do{
            System.out.println("Cantidad: ");
            try {
                cantidad = entrada.nextInt();
                if (cantidad == 0){
                    salir = true;
                }
            } catch (Exception e){
                System.out.println("No es un número.");
            }
            System.out.println("1 - Portátil, 2 - Monitor, 3 - Ratón, 4 - Teclado");
            System.out.println("Producto: ");
            if (cantidad !=0){
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
                        default:
                            System.out.println("El producto no está en la lista.");
                            contador--;
                    }
                    contador++;
                } catch (Exception e) {
                    System.out.println("No es un número.");
                }
            }
        }while (salir == false);

        Factura miFactura = new Factura(comprador,carrito);
        miFactura.imprimeFactura();
    }
}

