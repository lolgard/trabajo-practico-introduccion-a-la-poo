import kata3.Libro;

public class principal {
    public static void main(String[] args) {
        Libro aladin = new Libro("pedro","aladin",2000);
        aladin.getAnioDePublicacion();
        aladin.getAutor();
        aladin.getTitulo();

        System.out.println("año2020");
        aladin.setAnioDePublicacion(2020);//año dentro de la validacion permitida
        aladin.getAnioDePublicacion();
        System.out.println("año1000");
        aladin.setAnioDePublicacion(1000);//año fuera de la validacion permitida
        aladin.getAnioDePublicacion();
        System.out.println("año3000");
        aladin.setAnioDePublicacion(3000);
        aladin.getAnioDePublicacion();
    }
}