

import java.util.ArrayList;

import Elementos.Enfermedad;
import Elementos.ProductoQuimico;
import Elementos.AgroElemento;

public class Main {
    public static void main(String[] args) {
        // Crear enfermedades
        Enfermedad cochinilla = new Enfermedad("Cochinilla", new String[]{"deshidratación", "hojas amarillas"});
        Enfermedad hongo = new Enfermedad("Hongo", new String[]{"manchas negras", "hojas caídas"});

        // Crear listas de enfermedades
        ArrayList<Enfermedad> enfermedadesMaiz = new ArrayList<>();
        enfermedadesMaiz.add(cochinilla);

        ArrayList<Enfermedad> enfermedadesGirasol = new ArrayList<>();
        enfermedadesGirasol.add(hongo);

        // Crear cultivos con enfermedades frecuentes
        Cultivo maiz = new Cultivo("Maíz", enfermedadesMaiz);
        Cultivo girasol = new Cultivo("Girasol", enfermedadesGirasol);

        // Crear productos químicos
        ProductoQuimico prod1 = new ProductoQuimico("AgroPlus",
                new String[]{"hojas amarillas", "deshidratación", "hojas mordidas"},
                new Cultivo[]{girasol}); // desaconsejado en girasol

                ProductoQuimico prod4 = new ProductoQuimico("ELMIOO",
                new String[]{"hojas amarillas", "deshidratación", "hojas mordidas"},
                new Cultivo[]{girasol}); // desaconsejado en girasol

        ProductoQuimico prod2 = new ProductoQuimico("FungiStop",
                new String[]{"manchas negras", "hojas caídas"},
                new Cultivo[]{}); // compatible con todos

        ProductoQuimico prod3 = new ProductoQuimico("MildProtect",
                new String[]{"hojas amarillas"},
                new Cultivo[]{maiz}); // no trata completamente cochinilla

        // Crear sistema agro
        SistemaAgro sistema = new SistemaAgro();

        // Agregar productos al sistema
        sistema.agregarProducto(prod1);
        sistema.agregarProducto(prod2);
        sistema.agregarProducto(prod3);
        sistema.agregarProducto(prod4);

        // Test 1: productos que pueden tratar Cochinilla
        System.out.println("Productos que pueden tratar Cochinilla:");
        for (ProductoQuimico prod : sistema.prodCompatibles(cochinilla)) {
            System.out.println("- " + prod.getNombre());
        }

        // Test 2: productos que pueden tratar Hongo
        System.out.println("\nProductos que pueden tratar Hongo:");
        for (ProductoQuimico prod : sistema.prodCompatibles(hongo)) {
            System.out.println("- " + prod.getNombre());
        }

        // Test 3: productos útiles para Maíz
        System.out.println("\nProductos útiles para Maíz:");
        for (ProductoQuimico prod : sistema.getProductos()) {
            if (maiz.esUtil(prod)) {
                System.out.println("- " + prod.getNombre());
            }
        }

        // Test 4: productos útiles para Girasol
        System.out.println("\nProductos útiles para Girasol:");
        for (ProductoQuimico prod : sistema.getProductos()) {
            if (girasol.esUtil(prod)) {
                System.out.println("- " + prod.getNombre());
            }
        }



        System.out.println(sistema.utilesParaCultivo(maiz));
    }
}
