
import java.util.ArrayList;


public class CarritoDeCompras {
    ArrayList<Producto> carrito = new ArrayList<>();
    ArrayList<Producto> tienda = new ArrayList<>();

    public CarritoDeCompras(ArrayList<Producto> tienda) {
        this.tienda = tienda;
    }
    
    public void agregarProducto(String nombre, int cantidad) {
        for (Producto producto : tienda) {
            if (producto.nombre.equalsIgnoreCase(nombre)) {
                if (producto.cantidad >= cantidad) {
                    carrito.add(new Producto(producto.nombre, producto.precio, cantidad));
                    System.out.println("Producto agregado al carrito.");
                } else {
                    System.out.println("No hay suficiente cantidad disponible.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado en la tienda.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : carrito) {
            total += p.precio * p.cantidad;
        }
        return total;
    }

    public void realizarPago(double monto, double descuentoPromocional) {
        double total = calcularTotal();
        if (monto > 1000) {
            double descuento = total * (descuentoPromocional / 100);
            total -= descuento;
            System.out.println("Descuento aplicado! Nuevo total: $" + total);
        }

        if (monto >= total) {
            System.out.println("Pago realizado con exito. Gracias por su compra!");
            actualizarInventario();
        } else {
            System.out.println("Fondos insuficientes. Faltan: $" + (total - monto));
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("--- Detalle de la compra ---");
        for (Producto p : carrito) {
            System.out.println(p.nombre + " x " + p.cantidad + " = $" + (p.precio * p.cantidad));
        }
        System.out.println("Total: $" + calcularTotal());
    }

    private void actualizarInventario() {
        for (Producto comprado : carrito) {
            for (Producto producto : tienda) {
                if (producto.nombre.equalsIgnoreCase(comprado.nombre)) {
                    producto.cantidad -= comprado.cantidad;
                }
            }
        }
    }
}
    
    
    
    

    

