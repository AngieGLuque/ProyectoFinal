package pnt.co.edu.unisabana;

public class EstudianteClass {
    private final String Nombre;
    private final String Apellido;
    private final String Carrera;
    private final String Email;
    private final String Contrasena;

    EstudianteClass(String Nombre, String Apellido, String Carrera, String Email, String Contrasena){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Carrera = Carrera;
        this.Email = Email;
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCarrera() {
        return Carrera;
    }

    public String getEmail() {
        return Email;
    }

    public String getContrasena() {
        return Contrasena;
    }

}
