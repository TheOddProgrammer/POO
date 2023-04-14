package MonedasC9;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat dosPunto = new DecimalFormat("0.##");
        
        String cantidades = "";
        String tipo;
        String change;
        
        System.out.print("Tipo de Moneda a Cambiar \n1.Dolár \n2.Peso Colombiano \nEleccion: ");
        tipo = input.nextLine();
        
        do {
            System.out.print("Ingrese Cantidad a Convetir: ");
            cantidades+= input.nextLine() + " ";
            
            System.out.println("¿Ingresar Otra Cantidad? Y/N");
            change = input.nextLine().toUpperCase();
        } while ("Y".equals(change));
        
        Moneda moneda = new Moneda(tipo,cantidades.split(" "));
        double[] conversiones = moneda.convertirMoneda();
        
        System.out.println("\n");
        for (int i = 0; i < moneda.cantidades.length; i++) {
            System.out.println(moneda.cantidades[i] + " ⋙ " + dosPunto.format(conversiones[i]));
        }
        
        System.out.println("Total: "+dosPunto.format(Moneda.totalConvertido));
    }
}
