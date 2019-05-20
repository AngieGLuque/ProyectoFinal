package pnt.co.edu.unisabana;

public class EstudianteClass {
    private final String nombre;
    private final String apellido;
    private final String carrera;
    private final String email;
    private final String contrasena;

    EstudianteClass(String Nombre, String Apellido, String Carrera, String Email, String Contrasena){
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.carrera = Carrera;
        this.email = Email;
        this.contrasena = Contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

}
