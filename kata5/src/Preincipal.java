import kata5.NaveEspacial;

import java.util.Scanner;

public class Preincipal {
    public static void main(String[] args) {
        NaveEspacial apolo =new NaveEspacial(50,"apolo");
        Scanner sc =new Scanner(System.in);

        apolo.avanzar(60);
        apolo.recargarCombustible(40);
        apolo.mostrarEstado();
        System.out.println("____________________________________________");
        apolo.avanzar(60);
        apolo.mostrarEstado();
        System.out.println("____________________________________________");
        apolo.recargarCombustible(2000);
        apolo.mostrarEstado();

    }
}