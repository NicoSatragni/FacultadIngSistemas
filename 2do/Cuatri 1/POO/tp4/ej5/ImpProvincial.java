import java.time.DayOfWeek;
import java.time.LocalDate;

public class ImpProvincial extends Impuesto {

    protected double valorPorc;
    protected double valorCond;
    protected double valorFijo;


    public ImpProvincial(double valorPorc, double valorCond, double valorFijo) {
        super(valorPorc, valorCond, valorFijo);
    }

    public ImpProvincial(double valorPorc, double valorCond) {
        super(valorPorc, valorCond, 0);
    }

    @Override
    protected boolean cumpleCondicion(LocalDate fecha){
        return this.tieneCond && (fecha.getDayOfWeek() == DayOfWeek.SUNDAY);
    }
}