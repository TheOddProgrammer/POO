package Avanzado02;

public class Persona {
    public String name;
    public String id;

    public Persona(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", id=" + id + '}';
    }
    
}
