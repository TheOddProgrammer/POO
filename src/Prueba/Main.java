 package Prueba;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] prueba = {"","",""};
        String check;
        
        do {
            System.out.print("Ingrese el Nombre: ");
            prueba[0] += input.nextLine() + " ";
            System.out.print("Ingrese el Apellido: ");
            prueba[1] += input.nextLine() + " ";
            System.out.print("Ingrese el Codigo: ");
            prueba[2] += input.nextLine() + " ";

            System.out.println("¿Desea Ingresar otra Persona? Y/N");
            check = input.nextLine().toUpperCase();
        } while ("Y".equals(check));
        
        Estudiante estudiante = new Estudiante(prueba[0].split(" "),prueba[1].split(" "),prueba[2].split(" "));
        
        System.out.println(estudiante.name[0]);
        
//        String[][] matriz = {prueba[0].split(" "),prueba[1].split(" "),prueba[2].split(" ")};
//        
//        for (int i = 0; i < matriz[0].length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                System.out.println(matriz[j][i]);
//            }
//            System.out.println("");
//        }
    }
}
