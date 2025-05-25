import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Facturador facturador = new Facturador();

        // Crear productos
        Producto p1 = new Producto(10, 100, "Leche", "Lacteos", "bajo", 0, 2);
        Producto p2 = new Producto(5, 200, "Queso", "Lacteos", "alto", 0, 1);
        Producto p3 = new Producto(20, 50, "Pan", "Panaderia", "", 0, 5);

        // Reabastecer productos
        ArrayList<Producto> nuevos = new ArrayList<>();
        nuevos.add(p1);
        nuevos.add(p2);
        nuevos.add(p3);
        System.out.println(facturador.Reabastecer(nuevos));

        // Consultar stock
        System.out.println("Stock actual:");
        System.out.println(facturador.consultarStock());

        // Simular una compra
        Map<Integer, Integer> compra1 = new HashMap<>();
        compra1.put(p1.getCodProducto(), 2); // 2 Leche
        compra1.put(p2.getCodProducto(), 1); // 1 Queso
        Ticket ticket1 = facturador.comprar(compra1, "efectivo");
        System.out.println("\nTicket 1:");
        System.out.println(ticket1);

        // Simular otra compra
        Map<Integer, Integer> compra2 = new HashMap<>();
        compra2.put(p3.getCodProducto(), 5); // 5 Pan
        Ticket ticket2 = facturador.comprar(compra2, "Promo50OFF");
        System.out.println("\nTicket 2:");
        System.out.println(ticket2);

        // Consultar stock después de compras
        System.out.println("\nStock después de compras:");
        System.out.println(facturador.consultarStock());

        // Consultar productos en mínimo
        System.out.println("\nProductos en mínimo:");
        System.out.println(facturador.escaseoStock());

        // Consultar recaudación por fecha (hoy)
        LocalDate hoy = LocalDate.now();
        System.out.println("\nRecaudado hoy: " + facturador.recaudadoFecha(hoy));

        // Consultar recaudación por periodo
        System.out.println("Recaudado en periodo: " + facturador.recaudadoPeriodo(hoy.minusDays(1), hoy.plusDays(1)));

        // Producto que más recaudó hoy
        System.out.println(facturador.productoRecaudadoFecha(hoy));

        // Producto que más recaudó en el periodo
        System.out.println(facturador.productoRecaudadoPeriodo(hoy.minusDays(1), hoy.plusDays(1)));
    }
}