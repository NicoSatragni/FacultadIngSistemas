/*
Supermercado
Un supermercado factura las compras que realiza un cliente eventual y para esto emite una
factura, que además de calcular el monto total de una compra, detalla para cada producto
comprado el total de unidades de ese producto y el valor total de estas unidades (precio *
cantidad ). Existen además casos excepcionales en los cuales se realiza un descuento: por pago
en efectivo 10%
de contado (10%) y por premios que otorga el supermercado (50 % - no tiene descuento por
pago contado).
Algunos productos del supermercado están gravados por impuestos (su valor = precio +
impuestos provinciales + impuestos nacionales) y otros no. Para el caso de los productos con
gravamen se pueden distinguir gravámenes bajos o altos para cuyo cálculo se establece:
Gravámenes Bajos:   
    ● impuestos provinciales: precio*10% + $0.10
    ● impuestos nacionales: precio*5% + ($0.25 si el año es par)
Gravámenes Altos:
    ● impuestos provinciales: precio*15% + ($.5 si es domingo)
    ● impuestos nacionales precio*10% + $0.50
Cuando se realiza una compra se debe actualizar el stock de productos disponibles. El stock es
también actualizado cuando se recibe una partida de productos que detalla los productos que
adquirió el supermercado con su respectiva cantidad. Se debe poder consultar cuáles son los
productos que escasean en el stock. Para determinar cuáles son los productos que escasean el
supermercado utiliza algunas de las siguientes políticas (solo una a la vez, y el formato no
varía):
    ● Se llego a un mínimo permitido para ese producto.
    ● Se llego a un 120% del mínimo permitido para ese producto
    ● Se llego a un 90% del mínimo permitido para ese producto
    ● Se llego a un 140% del mínimo permitido para ese producto
Implemente en Java todos los métodos involucrados en responder:
    ● El total de dinero facturado en una fecha dada
    ● El total de dinero facturado en un periodo determinado
    ● El producto que más recaudo en una fecha dada
    ● El producto que más recaudo en un periodo determinado
    ● Consultar cuales son los productos que escasean en el stock
 */

import java.time.LocalDate;

public abstract class Impuesto {
    protected double valorPorc;
    protected double valorCond;
    protected double valorFijo;
    protected boolean tieneCond;


    public Impuesto(double valorP, double valorCond) {
        this(valorP, valorCond, 0);
    }
    
    
    public Impuesto(double valorP, double valorCond, double valorFijo) {
        this.valorPorc = porcentual(valorP);
        this.valorCond= valorCond;
        this.valorFijo = valorFijo; 
        this.tieneCond = valorCond == 0 ? false : true;
    }   
    
    // Si recibe 0,26 (equivalente a 26%) lo guarda, si recibe 26, lo convierte a 0,26 y lo guarda para facilitar los calculos
    public double porcentual(double valor) {
        if (valor <= 1) {
            return valor;
        } else { 
            return valor/100;
        }
    }

    public double aplicarImpuesto(double precio){
        LocalDate fecha = LocalDate.now();
        if (cumpleCondicion(fecha)) {
            return precio * this.valorPorc + this.valorCond;
        }
        return precio * this.valorPorc + this.valorFijo;
    }

    protected abstract boolean cumpleCondicion(LocalDate fecha);
}