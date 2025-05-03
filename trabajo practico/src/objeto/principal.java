package objeto;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        String curso = "2 2";
        String apellido = "Cercola";
        String nombre = "Enzo";

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la calificacion del alumno entre el 0 y el 10");
        Double calificacion = sc.nextDouble();
        while (calificacion < 0 || calificacion > 10) {

            System.out.println("la calificacion debe estar entre el 0 y el 10 intente nuevamente");
            calificacion = sc.nextDouble();

        }
        System.out.println("perfecto la calificacion elegida es " + calificacion);
        Estudiante alumno =new Estudiante(calificacion,apellido,nombre,curso);
        alumno.MostrarInfo();

        System.out.println(" ingrese el valor si quiere aumentar la clasificacion, sino coloque 0");
        Double suma =sc.nextDouble();
        alumno.SubirCalificacion(suma);

        System.out.println(" ingrese el valor si quiere disminuir la clasificacion, sino coloque 0");
        Double resta =sc.nextDouble();
        alumno.BajarCalificacion(resta);
        alumno.MostrarInfo();
    }
}