package parcial;
import java.util.ArrayList;
public class GuardianFuerte extends Guardian {

    private double mul;
    public GuardianFuerte(String nombre, int energia, int rapidez, ArrayList<String> talentos, double mul) {
        super(nombre, energia, rapidez, new ArrayList<>(talentos));
        this.mul = mul;
    }
 

    @Override
    public double getRapidez() {
        return this.rapidez * this.mul;
    }

    @Override
    public double getEnergia() {
        return this.energia * this.mul;
    }    
}
