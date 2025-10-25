import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket {
    private double total;
    private LocalDateTime fecha;
    private ArrayList<Renglon> renglones;

    public Ticket() {
        this.total = 0.0;
        this.fecha = LocalDateTime.now();
        this.renglones = new ArrayList<Renglon>();
    }

    public void agregarRenglon(Renglon renglon) {
        renglones.add(renglon);
        total += renglon.getTotalProd();
        }

    private String imprimirRenglones(){

        StringBuilder sb = new StringBuilder();
        for (Renglon renglon : this.renglones) {
            sb.append(renglon.toString());
        }
        return sb.toString();
    }


    


    @Override
    public String toString() {
        return "    ------ " + Facturador.NOMBRE_MERCADO + " ------\n" +
                "Fecha: " + this.fecha + "\n" +
                 imprimirRenglones() + "\n" +
                "\n           -----  Total ----- \n" + this.total; 
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Renglon> getRenglones() {
        return renglones;
    }



}