package NumeroC4;

public class Numero {
    public final String[] ARRAY_NUMERO = {"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"};
    public static int numero;

    public Numero(int numero) {
        Numero.numero = numero;
    }
    
    public String mostrarNombre() {
        for (int i = 1; i <= ARRAY_NUMERO.length; i++) {
            if (numero == i) {
                return ARRAY_NUMERO[i-1];
            }
        }
        return "Fuera del Rango";
    }
}
