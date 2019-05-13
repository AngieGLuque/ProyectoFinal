package pnt.co.edu.unisabana;

public class bibliotecarioClass {
    private final String Nombre;
    private final String Apellido;
    private final String Dependencia;
    private final String Email;
    private final String Contraseña;

    bibliotecarioClass(String Nombre, String Apellido,String Dependencia, String Email, String Contraseña){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dependencia = Dependencia;
        this.Email = Email;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDependencia() {
        return Dependencia;
    }

    public String getEmail() {
        return Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

}
