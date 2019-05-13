package pnt.co.edu.unisabana;

public class estudianteClass {
    private final String Nombre;
    private final String Apellido;
    private final String Carrera;
    private final String Email;
    private final String Contraseña;

    estudianteClass(String Nombre, String Apellido,String Carrera, String Email, String Contraseña){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Carrera = Carrera;
        this.Email = Email;
        this.Contraseña = Contraseña;
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

    public String getContraseña() {
        return Contraseña;
    }

}
