public class CalcSum implements Calculator {
    private Calculator c1, c2;

    @Override
    public double calculate(Taller t) {
        return c1.calculate(t) + c2.calculate(t);
    }

    
}
