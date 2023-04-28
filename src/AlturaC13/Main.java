
package AlturaC13;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        String option;
        String ubicacion = "";
        String tiempo = "";
        
        do {
            System.out.println("¿Cuantos Edicios Desea Ingresar?");
            int cantidad = input.nextInt();
            
            for (int i = 0; i < cantidad; i++) {
                System.out.print("\nIngrese la Ubicacion (Montania/Mar): ");
                ubicacion += sc.nextLine() + " ";
                System.out.print("Ingrese el Tiempo (s): ");
                tiempo += sc.nextLine() + " ";
            }
            
            System.out.print("¿Desea Ingresar Mas Ubicaciones? Y/N \nEleccion: ");
            option = sc.nextLine().toUpperCase();
        } while (option.equals("Y"));
        
        Formula datos = new Formula(ubicacion.split(" "),tiempo.split(" "));
        double[] alturas = datos.calcularAltura();
        
        for (int i = 0; i < alturas.length ; i++) {
            System.out.println("\nEdificio N°"+(i+1));
            System.out.println("Ubicacion: "+datos.ubicacion[i]);
            System.out.println("Tiempo: "+datos.tiempo[i]+ " Segundos");
            System.out.println("Altura: "+alturas[i] + " Metros");
        }
        
    }
}
