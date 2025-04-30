package oop1.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Author {

    public Author(Long id, String firstNMame, String lastName) {
        this.id = id;
        this.firstNMame = firstNMame;
        this.lastName = lastName;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNMame() {
        return firstNMame;
    }

    public void setFirstNMame(String firstNMame) {
        this.firstNMame = firstNMame;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private Long id;
    private String firstNMame;
    private String lastName;
    private List<Libro> libros = new ArrayList<>();

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstNMame='" + firstNMame + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
