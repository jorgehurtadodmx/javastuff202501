public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    private boolean disponible;


    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        disponible = true;
    }

    public boolean prestar() {
        if (disponible)  {
           return disponible = false;
        } else {
            return false;
        }
    }

    public boolean devolver() {
        if (!disponible) {
              disponible = true;
              return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("titulo1","autor1",444);

        System.out.println(libro1.prestar());

        libro1.devolver();
        System.out.println("Estado de libro tras devolución: " + libro1.disponible);
       //libro2.prestar();
        System.out.println(libro1.toString());

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public String toString() {
        return titulo + " escrito por " + autor + " - " + numeroPaginas + " páginas. " +
                (disponible ? "Disponible" : "No disponible");
    }
   /* @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", disponible=" + disponible +
                '}';
    }*/
}
