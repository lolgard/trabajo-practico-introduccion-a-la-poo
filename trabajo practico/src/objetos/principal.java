package objetos;


import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el nombre del estudiante:");
        String nombre = sc.nextLine();

        System.out.println("ingresa el apellido");
        String apellido = sc.nextLine();

        System.out.println("ingresa el curso");
        String curso = sc.nextLine();

        System.out.println("ingresa su calificacion");
        Double calificacion = sc.nextDouble();

        Estudiante alumno = new Estudiante(apellido,curso,nombre,calificacion);

        System.out.println("ingrese cuanto quiere subir la calificacion");
        Double calificaionSubir = sc.nextDouble();
        alumno.SubirCalificacion(calificaionSubir);

        System.out.println("ingrese cuanto quiere bajar la calificacion");
        Double calificaionBajar = sc.nextDouble();
        alumno.BajarCalificacion(calificaionBajar);
        
        alumno.MostrarInfo();

    }
}