
import java.util.ArrayList;
import java.util.Scanner;

public class Problema1_SistemaDeVentas {

    public static void main(String[] args) {
        ArrayList<Producto> tienda = new ArrayList<>();
        tienda.add(new Producto("PONYSTATION5", 800, 10));
        tienda.add(new Producto("XBOXSWITCH", 300, 5));
        tienda.add(new Producto("WII", 500, 8));

        CarritoDeCompras carrito = new CarritoDeCompras(tienda);
        Scanner tcl = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar producto al carrito");
            System.out.println("2. Mostrar detalle de compra");
            System.out.println("3. Realizar pago");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = tcl.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = tcl.next();
                    System.out.print("Cantidad: ");
                    int cantidad = tcl.nextInt();
                    carrito.agregarProducto(nombre, cantidad);
                    break;
                case 2:
                    carrito.mostrarDetalleCompra();
                    break;
                case 3:
                    System.out.print("Monto a pagar: ");
                    double monto = tcl.nextDouble();
                    System.out.print("Descuento promocional (%): ");
                    double descuento = tcl.nextDouble();
                    carrito.realizarPago(monto, descuento);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema de ventas.");
                    break;
                default:
                    System.out.println("Opción invlida.");
            }
        } while (opcion != 4);
    }
}
