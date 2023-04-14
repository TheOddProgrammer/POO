package NumeroC21;

public class Numero {
    public int[] numero;
    public static int[] suma = {0};

    public Numero(int[] numero) {
        this.numero = numero;
        for (int i = 0; i < this.numero.length; i++) {
            suma[i]+= this.numero[i];
            System.out.println(suma[0]);
        }
    }
    
//    public int[] sumarNumeros() {
//        
//        if (suma.length==1) {
//            suma = this.numero;
//        } 
//        
//        for (int i = 0; i < suma.length; i++) {
//            suma[i]+= this.numero[i];
//        }
//        return suma;
//        
//    }
    
    public boolean esPar() {
        for (int i = 0; i < suma.length; i++) {
            return suma[i]%2==0;
        }
        return false;
    }
}
