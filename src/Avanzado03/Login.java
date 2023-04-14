package Avanzado03;

class Login {
    
    private String user;
    private String password;
    private boolean active;
    
    public void mostrarDatos() {
        System.out.println("El Usuario es: "+user+"\nContraseña: "+password);
    }

    public Login(String user, String password, boolean active) {
        this.user = user;
        this.password = password;
        this.active = active;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }
    
}

class Main {
    public static void main(String[] args) {
        
        Login log1 = new Login("Juan","1234",true);
        
        log1.setUser("Juanes");
        log1.mostrarDatos();
        System.out.println(log1.getUser());
        
    }
}
