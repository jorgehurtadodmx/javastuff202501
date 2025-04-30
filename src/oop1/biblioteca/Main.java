package oop1.biblioteca;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author cervantes = new Author();
        var espronceda = new Author();
        cervantes.setFirstNMame("first1");
        System.out.println(cervantes.getFirstNMame());


        Author george = new Author(1L, "george", "hurtado");

        // crear objnetos libro

        Libro quijote = new Libro();
        Author autor1 = new Author( 1L, "name1", "surname1");
        quijote.setAutor(autor1);
        Libro celestina = new Libro("la celestina",10.0);
        System.out.println(celestina);
        Libro crepusculo = new Libro(1L, "crepus", 550, 254.44, true, LocalDate.now(), autor1);
        //

        System.out.println(LocalDate.now());

        crepusculo.setTitulo("modificadocrep1");
        crepusculo.setPrecio(2000.00);
        System.out.println(crepusculo);
        System.out.println(quijote.getAutor().getFirstNMame());

        //

        //agregamos 2 libros a un autor

        Author george2 = new Author();
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        //List libros =
        george2.getLibros().add(libro1);
        george2.getLibros().add(libro2);
       // george2.setLibros(libro1, libro2);
        libro1.setAutor(george2);
        System.out.println(libro1);

    }
}
