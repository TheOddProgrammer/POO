package FechaC20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
    public String nombre;
    public String id;
    public String fNacimiento;
    public long edadPersona;
    public static final int MAYORIA_EDAD = 18;

    public Persona(String nombre, String id, String fNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.fNacimiento = fNacimiento;
    }
    
    public long calcularEdad() {
        LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(fNacimiento.split("/")[0]),Integer.parseInt(fNacimiento.split("/")[1]),Integer.parseInt(fNacimiento.split("/")[2]));
        long edad = ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        return edad;
    }
    
    public boolean esMayorDeEdad() {
        long edad = calcularEdad();
        return edad>=MAYORIA_EDAD;
    }
}
