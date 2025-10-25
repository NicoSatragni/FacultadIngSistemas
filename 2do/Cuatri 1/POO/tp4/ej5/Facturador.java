import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Facturador {

    public static final String NOMBRE_MERCADO = "Mercado Tandil";
    static private int codProducto = 1000;

    private Map<String, Impuesto[]> gravamenes;
    private Map<String, Double> descuentos;
    private ArrayList<Producto> productos;
    private ArrayList<Ticket> compras;
    
    public Facturador() {
        this.gravamenes = new HashMap<>();
        this.productos = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.descuentos = new HashMap<>();

        this.gravamenes.put("bajo", new Impuesto[]{
            new ImpProvincial(10, 0, 0.10),
            new ImpNacional(0.5, 0.25)
        });
        this.gravamenes.put("alto", new Impuesto[]{
            new ImpProvincial(0.15, 0.5),
            new ImpNacional(10, 0, 0.5)
        });

        this.descuentos.put("efectivo", 0.1);
        this.descuentos.put("Promo50OFF", 0.5);
        this.descuentos.put("F3licesFiest4s", 0.3);
    }

    private void agregarProducto(Producto producto) {
        codProducto++;
        producto.setCodProducto(codProducto);
        this.productos.add(producto);
    }

    public String Reabastecer(ArrayList<Producto> productos) {
        String rslt = "";

        for (Producto productoB : productos) {

            int i = 0;
            while (i < this.productos.size()) {
                if (this.productos.get(i).getCodProducto() == productoB.getCodProducto() || this.productos.get(i).getNombre() == productoB.getNombre()) {

                    this.productos.get(i).ActualizarStock(productoB.getStock());
                    rslt += "\n Se reabastecio " + productoB.getStock() + " con " + productoB.getNombre() + " Unidades.";
                }
                i ++;
            }
            if (i == this.productos.size()) {
                agregarProducto(productoB);
                rslt += "\n Se agrego un nuevo producto: " + productoB.getNombre() + " con " + productoB.getStock() + " Unidades.";
            }
        
        }
        return rslt;
    }

    public String consultarStock(){
        String rslt = "";
        for (Producto producto : productos) {
            rslt += stockProducto(producto);
        }
        return rslt;
    }

    public String stockProducto(Producto producto) {
        return "\n" + producto.getNombre() + ": " + String.valueOf(producto.getStock() + " Unidades.");
    }


    private double getDescuento(String dcto){
        if(this.descuentos.get(dcto) != null) {
            return this.descuentos.get(dcto);
        }
        return 0;
        
    }


    public Ticket comprar(Map<Integer, Integer > productosComp, String dcto){
        Ticket ticket = new Ticket();

        //Asumiendo que no se pueden comprar productos que no existen o no estan disponibles ni hay menos cantidad
        for (Map.Entry<Integer, Integer> prodComp : productosComp.entrySet()) {

            for (Producto producto : this.productos) {

                if (prodComp.getKey() == producto.getCodProducto()) {

                    double impProvincial = 0;
                    double impNacional = 0;
                    if (producto.getGravamen() != "") {
                        
                        impProvincial += this.gravamenes.get(producto.getGravamen())[0].aplicarImpuesto(producto.getPrecio());
                        impNacional += this.gravamenes.get(producto.getGravamen())[1].aplicarImpuesto(producto.getPrecio());
                    }

                    ticket.agregarRenglon(new Renglon(producto, impNacional, impProvincial, getDescuento(dcto)));
                    
                    producto.ActualizarStock(-prodComp.getValue());
                }
                    
            }
        }
        this.compras.add(ticket);
        return ticket;
    }

    public double recaudadoFecha(LocalDate fecha){
        return recaudadoPeriodo(fecha, fecha);
    }

    public double recaudadoPeriodo(LocalDate ini, LocalDate fin){
        double total = 0; 
        for (Ticket ticket : ticketsPeriodo(ini, fin)) {
            total += ticket.getTotal();
        }
        return total;
    }


    public String productoRecaudadoFecha(LocalDate fecha) {
        return productoRecaudadoPeriodo(fecha, fecha);
    }

    public String productoRecaudadoPeriodo(LocalDate ini, LocalDate fin) {
        Map<String, Double> productos = new HashMap<>();

        for (Ticket ticket : ticketsPeriodo(ini, fin)) {
            for (Renglon renglon : ticket.getRenglones()) {
                productos.merge(renglon.getNomProd(), renglon.getTotalProd(), Double::sum);
            }
        }

        String maxClave = null;
        double maxValor = 0;


        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            if (producto.getValue() > maxValor) {
                maxValor = producto.getValue();
                maxClave = producto.getKey();
            }
        }
        return "El producto que mas recaudo es: " + maxClave + " con un monto de: " + maxValor;
    }


    public ArrayList<Ticket> ticketsPeriodo(LocalDate fechaInicio, LocalDate fechaFin){
        ArrayList<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : compras) {
            if ((ticket.getFecha().toLocalDate().isBefore(fechaInicio) || ticket.getFecha().toLocalDate().isEqual(fechaInicio))
                && (ticket.getFecha().toLocalDate().isBefore(fechaFin) || ticket.getFecha().toLocalDate().isEqual(fechaFin))) {
                tickets.add(ticket);
            }
        }
        return tickets;
    }




    public String escaseoStock() {
        String enFalta = "Productos en minimos de stock: ";

        for (Producto producto : this.productos) {
            if (producto.enMinimo()) {
                enFalta += " -" + stockProducto(producto); 
            }
        }

        return enFalta;
    }
    




}
