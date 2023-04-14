package NumeroC21;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Cantidad de Numeros por Arreglo: ");
        int size = input.nextInt();
        
        int[] array = new int[size];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Array N°"+i+" Posicion: "+j);
                array[j] = input.nextInt();
            }
            Numero numero = new Numero(array);
//            numero.sumarNumeros();
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println("La suma de las Casillas "+i+" es: "+Numero.suma[i]);
        }
    }
}
