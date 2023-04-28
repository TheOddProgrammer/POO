package AlturaC13;

public class Formula {
    public String[] ubicacion;
    public String[] tiempo;
    public final static double GRAVEDAD_MAR = 9.82;
    public final static double GRAVEDAD_MONTANIA = 9.80;

    public Formula(String[] ubicacion, String[] tiempo) {
        this.ubicacion = ubicacion;
        this.tiempo = tiempo;
    }
    
    public double[] calcularAltura() {
        double[] altura = new double[ubicacion.length];
        for (int i = 0; i < ubicacion.length; i++) {
            double tiempoConvertido = Double.parseDouble(tiempo[i]);
            switch(ubicacion[i]) {
                case "Montania":
                    altura[i] = ((GRAVEDAD_MONTANIA)*(Math.pow(tiempoConvertido, 2)))/2;
                    break;
                case "Mar":
                    altura[i] = ((GRAVEDAD_MAR)*(Math.pow(tiempoConvertido, 2)))/2;
                    break;
                default:
                    System.out.println("No se identifica la Ubicacion");
                    break;
            }
        }
        return altura;
    }
}
