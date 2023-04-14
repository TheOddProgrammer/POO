package IMC3;

public class Persona {
    public String nombre;
    public double altura;
    public double peso;

    public Persona(String nombre, double altura, double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }
    
//    public String obtenerIMC() {
//        if (data<18.4) {
//            return "Bajo Peso";
//        } else if (data<25 && data>18.4) {
//            return "Normal Peso";
//        } else if (data>=25 && data<30) {
//            return "Sobrepeso";
//        } else if (data>=30 && data<35) {
//            return "Obesidad Grado I";
//        } else if (data>=35 && data<40) {
//            return "Obesidad Grado II";
//        } else {
//            return "Obesidad Grado III";
//        }
//    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + '}';
    }
}
