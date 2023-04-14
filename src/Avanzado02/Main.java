package Avanzado02;

public class Main {
    public static void main(String[] args) {
        
        Producto objeto1 = new Producto("Cafe",2000);
        Producto objeto2 = new Producto("Chocolate",1500);
        Producto objeto3 = new Producto("Pan",1000);
        Producto objeto4 = new Producto("Panela",1200);
        Producto objeto5 = new Producto("Queso",5000);
        
        Persona persona1 = new Persona("Juan","1092730511");
        
        Producto[] venta = {objeto1,objeto2};
        
        Venta venta1 = new Venta(persona1,venta);
        
        //Venta venta1 = new Venta(persona1,objeto2);
        //Venta venta2 = new Venta(persona1,objeto4);
        
        System.out.println(Producto.contador);
        System.out.println(Producto.promedioVenta());
        System.out.println(venta1); // Muestra lo de ToString()
        System.out.println(Venta.getCantidad());
    }
}
