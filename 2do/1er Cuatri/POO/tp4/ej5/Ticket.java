import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket {
    private LocalDateTime fecha;
    private double total;
    private Renglon renglones;

    public Ticket() {
        this.total = 0.0;
        this.fecha = LocalDateTime.now();
        this.renglones = new ArrayList<Renglon>();
    }
}



/*
 * un for que recorre array de renglones y hace 
 *  mod  =  impuesto(renglon.getPrecioUnitario()) * cant;
 *  subtotal = mod + precioUnitario;
 */