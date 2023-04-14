package Avanzado02;

public class Producto {
    public String name;
    public double precio;
    public static int contador;
    public static double sumatoria;
    
    public Producto(String name, double precio) {
        this.name = name;
        this.precio = precio;
        contador++; //Productos que Creastes (Cantidad)
        sumatoria+= precio;
    }
    
    public static double promedioVenta() {
        return sumatoria/contador;
    }

    @Override
    public String toString() {
        return "Producto{" + "name=" + name + ", precio=" + precio + '}';
    }
}
