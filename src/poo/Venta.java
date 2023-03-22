package poo;

public class Venta {
    public double valor;
    public Producto producto;
    public Persona persona;
    
    public double CalcularTotal() {
        
        switch (producto.tipo) {
            case "Fruta":
                return producto.precio * 1.05;
            case "Aseo":
                return producto.precio * 1.1;
            default:
                return producto.precio;
        }
        
    }
}
