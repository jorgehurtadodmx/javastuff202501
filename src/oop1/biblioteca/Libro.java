package oop1.biblioteca;

import java.time.LocalDate;

public class Libro {

    private Long id;
    private String titulo;
    private Integer numeroPaginas;
    private Double precio;
    private Boolean publicado;
    private LocalDate fechaPublicacion;
    Author autor;

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", precio=" + precio +
                ", publicado=" + publicado +
                ", fechaPublicacion=" + fechaPublicacion +
                ", autor=" + autor +
                '}';
    }

    public Libro() {

    }

    public Libro(Long id, String titulo, Integer numeroPaginas, Double precio, Boolean publicado, LocalDate fechaPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
        this.publicado = publicado;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro(String titulo, Double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public Libro(Long id, String titulo, Integer numeroPaginas, Double precio, Boolean publicado, LocalDate fechaPublicacion, Author autor) {
        this.id = id;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
        this.publicado = publicado;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getPublicado() {
        return publicado;
    }

    public void setPublicado(Boolean publicado) {
        this.publicado = publicado;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }



    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }
}
