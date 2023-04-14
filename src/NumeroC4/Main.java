package NumeroC4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nombre;
        
        System.out.print("Cantidad de Numeros a Ingresar: ");
        int size = input.nextInt();
        
        int[] number = new int[size];
        
        for (int i = 0; i < size; i++) {
            number[i] = input.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            Numero numero = new Numero(number[i]);
            nombre = numero.mostrarNombre();
            System.out.println("El nombre del Numero " + Numero.numero + " es "+ nombre);
        }
        
    }
}
