import java.time.LocalDate;

public class ImpNacional extends Impuesto {

    protected double valorPorc;
    protected double valorCond;
    protected double valorFijo;

    public ImpNacional(double valorPorc, double valorCond, double valorFijo) {
        super(valorPorc, valorCond, valorFijo);
    }
    public ImpNacional(double valorPorc, double valorCond) {
        super(valorPorc, valorCond, 0);
    }



    @Override
    protected boolean cumpleCondicion(LocalDate fecha){
        return this.tieneCond && fecha.getYear() % 2 == 0;
    }
}