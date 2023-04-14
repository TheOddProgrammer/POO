package notac7;

public class Estudiante {
    public String[] nombre;
    public String[] nota;
    public static String[][] m;
    public static int n;

    public Estudiante(String[] nombre, String[] nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String[][] crearMatriz() {
        m = new String[3][Estudiante.n];
        
        m[0] = this.nombre;
        m[1] = this.nota;
        
        for (int i = 0; i < m[2].length; i++) {
            double conv = Double.parseDouble(this.nota[i]);
            if (conv>=0 && conv<3) {
                m[2][i] = "Insuficiente";
            } else if (conv>=3 && conv<4) {
                m[2][i] = "Aceptable";
            } else if (conv>=4 && conv<4.6) {
                m[2][i] = "Sobresaliente";
            } else {
                m[2][i] = "Excelente";
            }
        }
        
        return m;
    }
}
