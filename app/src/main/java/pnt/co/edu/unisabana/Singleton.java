package pnt.co.edu.unisabana;

public class Singleton {
    private static EstudianteClass estudiante;
    public static  BibliotecarioClass bibliotecario;

    public static  EstudianteClass getInstanceEstudiante(){
        if(estudiante == null){
            Singleton.estudiante = EstudianteClass.getInstanceOf();
        }
        return estudiante;
    }

}
