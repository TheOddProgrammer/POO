package Avanzado02;

public class Venta {
    public Persona persona;
    public Producto producto;
    public Producto[] guardar;
    private static int cantidad;

    public Venta(Persona persona,Producto[] guardar) {
        this.persona = persona;
        //this.producto = producto;
        this.guardar = guardar;
        cantidad=guardar.length;
    }

    public static int getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString() {
        return "Venta{" + "persona=" + persona + ", guardar=" + guardar[1] + '}';
    }
    
}
