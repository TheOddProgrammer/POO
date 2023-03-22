package poo;

public class Materia {
    
    public String materia;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaExamenFinal;
    
    public double calcularSetenta() {
        double notaSetenta = ((nota1+nota2+nota3)/3)*0.7;
        return notaSetenta;
    }
    
    public double calcularTreinta() {
        double notaTreinta = notaExamenFinal*0.3;
        return notaTreinta;
    }
    
    public void calcularNota() {
        System.out.println("Su Nota es: " + (calcularTreinta() + calcularSetenta()));
    }
}
