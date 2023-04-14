package notac7;
import java.util.Scanner;
public class NotaC7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputA = new Scanner(System.in);
        
        System.out.print("Cantidad de Estudiantes: ");
        Estudiante.n = inputA.nextInt();
        
        String[] nombre = new String[Estudiante.n];
        String[] nota = new String[Estudiante.n];
        
        for (int i = 0; i < Estudiante.n; i++) {
            System.out.println("Estudiante N°"+(i+1));

            System.out.print("Nombre: ");
            nombre[i] = input.nextLine();

            System.out.print("Nota: ");
            nota[i] = input.nextLine();
            
            System.out.println("\n");
        }
        
        Estudiante estudiante = new Estudiante(nombre,nota);
        estudiante.crearMatriz();
        
        for (int i = 0; i < Estudiante.m[0].length; i++) {
            System.out.println("Estudiante N°"+(i+1));
            System.out.println("Nombre: "+Estudiante.m[0][i]);
            System.out.println("Nota: "+Estudiante.m[1][i]);
            System.out.println("Valoracion: "+Estudiante.m[2][i]+"\n");
        }
    }
}
