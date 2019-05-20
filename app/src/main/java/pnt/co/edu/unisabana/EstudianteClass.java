package pnt.co.edu.unisabana;

public class EstudianteClass {
    private final String nombre;
    private final String apellido;
    private final String carrera;
    private final String email;
    private final String contrasena;

    EstudianteClass(String nombre, String apellido, String carrera, String email, String contrasena){
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.email = email;
        this.contrasena = contrasena;
    }
    //Hola como estas?
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
