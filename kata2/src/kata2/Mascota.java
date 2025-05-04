package kata2;

public class Mascota {
    public String nombre;
    public String raza;
    public Integer edad;

    public Mascota(Integer edad, String nombre, String raza) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    public void getInfo(){
        System.out.println("edad: "+ edad +" raza: "+raza+" anio "+ nombre);
    }
    public Integer setCumplirAnios() {
        edad = edad +1;
        return edad;
    }
}
