package FechaC20;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Personas a Ingresar: ");
        int cantidad = input.nextInt();
        
        Persona[] personas = new Persona[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el Id: ");
            String iden = sc.nextLine();
            System.out.print("Ingrese el Fecha de Nacimiento (YYYY/MM/DD): ");
            String fechaNacimiento = sc.nextLine();
            
            Persona persona = new Persona(nombre,iden,fechaNacimiento);
            personas[i] = persona; 
        }
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre: "+personas[i].nombre+"\nIdentificacion: "+personas[i].id);
            if (personas[i].esMayorDeEdad()) {
                System.out.println("Es Mayor de Edad");
            }
        }
    }
}
