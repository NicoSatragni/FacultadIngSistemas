public class CalcHoras implements Calculator {

    @Override
    public double calculate(Taller t) {
        return t.getDuracion();
    }
    
    
}
