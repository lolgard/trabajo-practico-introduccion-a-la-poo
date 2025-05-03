package Datos;

import java.util.Scanner;

public class Ejecutable {
    // vovlvemos ejecutables en el main
    public static void main(String[] args) {
        String nombre= "Enzo";
        String apellido= "Cercola";
        String curso= "2-3";
        Double calificacion;
        //creamos el objeto escaner para poder ingresar la calificacion deseada
        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese una calificacion entre el 0 y el 10");
        calificacion = sc.nextDouble();
        // este while marca los limites para que no se pueda ingresar una nota invalida
        while (calificacion < 0 || calificacion > 10){
            System.out.println("calificacion invalida, ingrese uno entre el 0 y rl 10");
            calificacion = sc.nextDouble();
        }
       // mostramos que la calificacion ingresada sea corracta

        //creamos un objeto estudiantes
        Estudiante alumno =new Estudiante(apellido,calificacion,curso, nombre);
        alumno.MostrarInfo();
        //creamos un menu con un atributo de las opciones
        Integer opciones;
        System.out.println("\nla califcacion ingresada es "+calificacion);
        System.out.println("Elige una opcion");
        System.out.println("1. subir la calificacion");
        System.out.println("2. bajar la nota");
        System.out.println("3. terminar/salir");
        // el siguiente scaner recibe el numero ingresado
        opciones = sc.nextInt();
        while (opciones <1 || opciones >3){
            System.out.println("porfaor ingrese un valor valido(opcion1 , 2 o 3)");
            opciones = sc.nextInt();
        }
        // creamos el shich para realizar  el metodo elejido
        switch (opciones){
            case 1:
                System.out.println("cuantos puntos quiere subir");
                Double suma;
                suma = sc.nextDouble();
                alumno.SubirCalificacion(suma);
                System.out.println("la nueva calificacion es "+alumno.calificacion);

                break;
            case 2:
                System.out.println("cuantos puntos quiere bajar");
                Double resta;
                resta = sc.nextDouble();
                alumno.BajarCalificacion(resta);
                System.out.println("la nueva calificaion es"+alumno.calificacion);

                break;
            case 3:
                System.out.println("nos vemos ");
                break;
        }
    }
}
