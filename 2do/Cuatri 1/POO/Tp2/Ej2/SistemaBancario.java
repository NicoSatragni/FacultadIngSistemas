

/*Para un sistema bancario, implementar las clases necesarias para modelar cajas de 
ahorro, clientes y el banco en sí. La funcionalidad mínima que debe soportar el sistema 
es  crear cajas de ahorro, depositar y extraer sobre una cuenta en particular, retornar el 
saldo de una cuenta (dinero disponible), listar las cuentas de un cliente y cerrar cuentas. 
¿Cómo modificaría el diseño anterior para incorporar cuentas corrientes? Las cuentas 
corrientes, a diferencia de las cajas de ahorro, poseen un monto fijo de dinero “en 
descubierto”, es decir, que al momento de extraer, se permite tener el saldo en negativo 
hasta el tope delimitado por el “descubierto”. */

public class SistemaBancario {
    public static void main(String[] args) {
        
        Banco patagonia = new Banco("Patagonia");
        //Agrego clientes
        System.out.print(patagonia.agregarCliente(new Cliente("Marcos Sincovich", "46529365")));
        System.out.print(patagonia.agregarCliente(new Cliente("Juan Perez", "12345678")));
        System.out.print(patagonia.agregarCliente(new Cliente("Maria Gonzalez", "87654321")));
        System.out.print(patagonia.agregarCliente(new Cliente("Ana Lopez", "23456789")));

        //Creo cuentas a los clientes
        System.out.print(patagonia.crearCuenta("ca", 100.00, "46529365"));
        System.out.print(patagonia.crearCuenta("cc", 2300, 1000, "46529365"));
        System.out.print(patagonia.crearCuenta("ca", 3000, "12345678"));
        System.out.print(patagonia.crearCuenta("ca", 0, "12345678"));
        System.out.print(patagonia.crearCuenta("cc", 10000, 5000, "23456789"));

        System.out.print(patagonia.extraer(100, ))
        
    }
}