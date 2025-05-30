package tp4.ej4.Elementos;
import java.util.ArrayList;

import Elementos.Enfermedad;
import Elementos.ProductoQuimico;

public class SistemaAgro{
    private ArrayList<ProductoQuimico> productos;
    private ArrayList<Enfermedad> enfermedades;

    public SistemaAgro() {
        super();
        this.productos = new ArrayList<>();
        this.enfermedades = new ArrayList<>();
    }

    public ArrayList<ProductoQuimico> prodCompatibles(Enfermedad enfermedad) {
        ArrayList<ProductoQuimico> compatibles = new ArrayList();

        for(ProductoQuimico producto : this.productos){
            if (producto.trataEnfermedad(enfermedad.getSintomas())) {
                compatibles.add(producto);
            }
        }
        return compatibles;
    }   

    public String utilesParaCultivo(Cultivo cultivo) {
        ArrayList<ProductoQuimico> pCompatibles = cultivo.productosUtiles(this.productos);
        
        String result = "Los Productos Quimico Utiles para el " + cultivo.getNombre() + " son: ";

        for (ProductoQuimico prod : pCompatibles) {
            result += prod.getNombre() + ", ";
        }
        
        return result;
    }


    public void agregarProducto(ProductoQuimico producto) {
        this.productos.add(producto);
    }

    public void agregarEnfermedad(Enfermedad enfermedad) {
        this.enfermedades.add(enfermedad);
    }

    public ArrayList<ProductoQuimico> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoQuimico> productos) {
        this.productos = productos;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

}