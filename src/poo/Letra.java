package poo;

public class Letra {
    public String nombreLetra;
    
    public void encontrarVocal() {
        String mensaje = "";
        String[] vocales = {"a","e","i","o","u"};
        
        for (int i = 0; i < vocales.length; i++) {
            if (nombreLetra.equals(vocales[i])) {
                mensaje = "Es Vocal";
            }
        }
        
        if (!"".equals(mensaje)) {
            System.out.println("No es Vocal");
        } else {
            System.out.println(mensaje);
        }
    }
    
}
