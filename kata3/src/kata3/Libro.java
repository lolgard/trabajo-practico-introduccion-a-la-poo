package kata3;

public class Libro {
    private String titulo;
    private String autor;
    private Integer anioDePublicacion;

    public Libro(String titulo, String autor, Integer anioDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
    }

    public String getTitulo() {
        System.out.println(titulo);
        return titulo;
    }

    public String getAutor() {
        System.out.println(autor);
        return autor;
    }

    public Integer getAnioDePublicacion() {
        System.out.println(anioDePublicacion);
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(Integer anioNuevo) {
        if (anioNuevo < 1900 || anioNuevo > 2025) {
            System.out.println("no es posible modificar el año ");
        }else anioDePublicacion = anioDePublicacion = anioNuevo;
    }
}
