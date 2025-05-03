package Datos;
//creamos la clase estudiante
public class Estudiante {
    //le agregamos sus atributos
    String nombre;
    String apellido;
    String curso;
    Double calificacion;
// creaamos los contructores delos atributos
    public Estudiante(String apellido, Double calificacion, String curso, String nombre) {
        this.apellido = apellido;
        this.calificacion = calificacion;
        this.curso = curso;
        this.nombre = nombre;
    }
    public void MostrarInfo(){
        System.out.println("nombre: "+nombre);
        System.out.println("apellido: "+apellido);
        System.out.println("curso: "+curso);
        System.out.println("calificacion: "+calificacion);
    }
    // creamos metodos para subir y bajar la calificacion
    public void SubirCalificacion(Double suma){
        calificacion = calificacion+suma;
        if (calificacion >10){
            calificacion = 10.0;
        }

    }
    public void BajarCalificacion(Double resta){
    calificacion = calificacion-resta;
        if (calificacion < 0){
            calificacion = 0.0;
        }
    }


}
