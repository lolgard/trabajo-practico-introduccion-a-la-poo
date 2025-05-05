import kata4.Gallina;

public class principal {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(0,0,"id1");
        Gallina gallina2 = new Gallina(2, 1,"id2");
        int Repeticiones = 10;
        for (int i = 0; i < Repeticiones; i++) {
            System.out.println("_________________________________________________");
            gallina1.setEnvejecer();
            gallina2.setPonerHuevos();
            gallina2.setEnvejecer();
            gallina1.setPonerHuevos();
        }

        System.out.println("_________________________________________________");
        gallina2.getMostrarEstado();
        gallina1.getMostrarEstado();
    }
}