package poo;

public class Persona {
    
    public static final int MAYORIA_EDAD = 18;
    
    public int edad;
    public String nombre;
    public String id;
    
    public void mayoriaEdad() {
        if (edad>=MAYORIA_EDAD) {
            System.out.println(nombre + " es Mayor de Edad con N° Documento "+id);
        } else {
            System.out.println(nombre + " es Mayor de Edad con N° Documento "+id);
        }
    }
}
