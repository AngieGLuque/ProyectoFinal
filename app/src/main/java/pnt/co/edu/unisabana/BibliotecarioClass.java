package pnt.co.edu.unisabana;

public class BibliotecarioClass {
    private final String nombre;
    private final String apellido;
    private final String dependencia;
    private final String email;
    private final String contrasena;
    private static BibliotecarioClass bibliotecario;

    private BibliotecarioClass(){
        this.nombre = "";
        this.apellido = "";
        this.dependencia = "";
        this.email = "";
        this.contrasena = "";
    }

    BibliotecarioClass(String nombre, String apellido, String dependencia, String email, String contrasena){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dependencia = dependencia;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDependencia() {
        return dependencia;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public static BibliotecarioClass getInstanceOf(){
        if(bibliotecario == null){
            bibliotecario = new BibliotecarioClass();
        }
        return  bibliotecario;
    }

}
