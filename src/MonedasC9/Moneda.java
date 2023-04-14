package MonedasC9;

public class Moneda {
    public String tipo;
    public String[] cantidades;
    public static double VALOR_PESO_DOLAR = 4512.32;
    public static double totalConvertido=0;

    public Moneda(String tipo, String[] cantidades) {
        this.tipo = tipo;
        this.cantidades = cantidades;
    }
    
    public double[] convertirMoneda() {
        double[] conversiones = new double[this.cantidades.length];
        
        for (int i = 0; i < this.cantidades.length; i++) {
            if ("1".equals(tipo)) {
                conversiones[i] = Integer.parseInt(this.cantidades[i])*Moneda.VALOR_PESO_DOLAR;
                totalConvertido+=conversiones[i];
            } else if ("2".equals(tipo)) {
                conversiones[i] = Integer.parseInt(this.cantidades[i])/Moneda.VALOR_PESO_DOLAR;
                totalConvertido+=conversiones[i];
            }
        }
        
        return conversiones;
    }
}
