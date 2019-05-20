package pnt.co.edu.unisabana;

public class BibliotecarioClass {
    private final String Nombre;
    private final String Apellido;
    private final String Dependencia;
    private final String Email;
    private final String Contrasena;

    BibliotecarioClass(String Nombre, String Apellido, String Dependencia, String Email, String Contrasena){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dependencia = Dependencia;
        this.Email = Email;
        this.Contrasena = Contrasena;
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

    public String getContrasena() {
        return Contrasena;
    }

}
