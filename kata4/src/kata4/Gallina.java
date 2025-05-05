package kata4;

public class Gallina {
    private String idGallina;
    private Integer edad;
    Integer huevosPuestos;

    public Gallina(Integer edad, Integer huevosPuestos, String idGallina) {

        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
        this.idGallina = idGallina;
    }
    public Integer setPonerHuevos(){
        huevosPuestos = huevosPuestos+1;
        System.out.println("huevos puestos "+idGallina+": "+huevosPuestos);
        return huevosPuestos;
    }
    public Integer setEnvejecer(){
        edad = edad+1;
        System.out.println("edad "+idGallina+": "+edad);
        return edad;
    }
    public void getMostrarEstado(){
        System.out.println("idgallina "+idGallina+" edad: "+edad+" huevos puestos: " +huevosPuestos);
    }

}
