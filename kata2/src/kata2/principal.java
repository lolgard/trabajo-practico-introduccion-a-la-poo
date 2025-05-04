package kata2;

public class principal {
    public static void main(String[] args) {
        String nombre = "manolo";
        String raza = "salchicha";
        Integer edad = 0;
        Mascota mascota1 = new Mascota(edad, nombre, raza);
        mascota1.getInfo();
        mascota1.setCumplirAnios();
        mascota1.getInfo();
        mascota1.setCumplirAnios();
        mascota1.getInfo();
        mascota1.setCumplirAnios();
        mascota1.getInfo();
        mascota1.setCumplirAnios();
        mascota1.getInfo();
        mascota1.setCumplirAnios();
        mascota1.getInfo();
        mascota1.setCumplirAnios();
        mascota1.getInfo();
    }
}
