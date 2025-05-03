package objeto;

import java.util.Scanner;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    Double calificacion;

    public Estudiante(Double calificacion, String apellido, String nombre, String curso) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.curso = curso;
        this.calificacion = calificacion;

    }

    public void MostrarInfo() {
        System.out.println("nombre: " + nombre + " apellido: " + apellido + " curso: " + curso + " calificacion: " + calificacion);
    }

    public void SubirCalificacion(double calificacionSubir) {
        calificacion = calificacion + calificacionSubir;
        if (calificacion < 0 || calificacion > 10) {
            System.out.println("la calificacion debe estar entre el 0 y el 10");
        } else calificacion = calificacionSubir;
    }

    public void BajarCalificacion(double calificacionBajar) {
        calificacion = calificacion-calificacionBajar;
        System.out.println(calificacion);
        if (calificacion < 0 || calificacion > 10) {
            System.out.println("la calificacion debe estar entre el 0 y el 10");
        }else calificacion = calificacionBajar;
    }
}



