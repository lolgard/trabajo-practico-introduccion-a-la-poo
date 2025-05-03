package objetos;

import java.util.Scanner;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    Double calificacion;

    public Estudiante(String apellido, String curso, String nombre, Double calificacion) {
        this.apellido = apellido;
        this.curso = curso;
        this.nombre = nombre;
        if (calificacion < 0) {
            this.calificacion = 0.0;
            System.out.println("la calificaicon no puede ser menor a 0");
        } else if (calificacion > 10) {
            this.calificacion = 10.0;
            System.out.println("la calificacion no puede ser mayor  a 10");
        } else this.calificacion = calificacion;
    }

    Scanner scanner = new Scanner(System.in);


    public void MostrarInfo() {
        System.out.println("nombre: " + nombre + " apellido: " + apellido + " curso: " + curso + " calificacion: " + calificacion);
    }

    public void SubirCalificacion(double calificacionSubir) {
        calificacion = calificacion + calificacionSubir;
        if (calificacion < 0) {
            calificacion = 0.0;
            System.out.println("la calificaicon no puede ser menor a 0");
        } else if (calificacion > 10) {
            this.calificacion = 10.0;
            System.out.println("la calificacion no puede ser mayor  a 10");
        } else calificacion = calificacion;
    }

    public void BajarCalificacion(double calificacionBajar) {
        calificacion = calificacion-calificacionBajar;
        System.out.println(calificacion);
        if (calificacion < 0) {
            calificacion = 0.0;
            System.out.println("la calificaicon no puede ser menor a 0");
        } else if (calificacion > 10) {
            calificacion = 10.0;
            System.out.println("la calificacion no puede ser mayor  a 10");
        } else calificacion = calificacion;
    }
}


