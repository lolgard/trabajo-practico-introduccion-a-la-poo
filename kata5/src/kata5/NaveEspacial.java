package kata5;

import javax.swing.*;

public class NaveEspacial {

   private String nombre;
   private Integer combustible;

    public NaveEspacial(Integer combustible, String nombre) {
        this.combustible = combustible;
        this.nombre = nombre;
    }
    public void despegar(){
        if (combustible < 10) {
            System.out.println("combustible insuficiente");

        } else{
            combustible = combustible -10;
        }
    }
    public Integer avanzar (Integer distancia){
        if (combustible <= 0 || combustible < distancia){
            System.out.println(" no hay suficiente combustible");
        } else {
            combustible = combustible- distancia;
            System.out.println("la distancia  recorrida fue  de "+ distancia);
        }
        return combustible;
    }
    public Integer recargarCombustible(Integer cantidad){
        if (cantidad <= 0){
            System.out.println("no se pueden cargar unidades negativas");
            return combustible;
        }
        if (combustible+cantidad >100) {
            combustible = cantidad = 100;
            System.out.println(" no puedes cargar mas de 100 unidades");
            System.out.println("el tamque se ha llenado");

        } else {
           combustible= combustible + cantidad;
            System.out.println("se cargaron "+cantidad+" unidades");

        }
        return combustible;
    }
public void mostrarEstado(){
    System.out.println("nombre nave "+nombre+ "| unidades de combustibles: " +combustible);

}

}
