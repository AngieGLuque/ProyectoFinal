package pnt.co.edu.unisabana;

public class Singleton {
    private static EstudianteClass estudiante;
    private static  BibliotecarioClass bibliotecario;

    public static  EstudianteClass getInstanceEstudiante(){
        if(estudiante == null){
            Singleton.estudiante = EstudianteClass.getInstanceOf();
        }
        return estudiante;
    }

    public  static  BibliotecarioClass getInstanceBibliotecario(){
        if(bibliotecario == null){
            Singleton.bibliotecario = BibliotecarioClass.getInstanceOf();
        }
        return  bibliotecario;

    }

}
