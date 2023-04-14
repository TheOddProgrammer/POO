package Avanzado;
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pera",2500);
        Producto producto2 = new Producto("Manzana",2000);
        Producto producto3 = new Producto("Limpido",7000);
        
        double Promedio = (producto1.precio+producto2.precio+producto3.precio)/3;
        System.out.println("Promedio de Venta = $" + Promedio);
    }
}
