package RestaurantStuff;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("nombrepizza", 4, 44, 10, "grande", "pepperoni", 50);
        Ensalada ensalada1 = new Ensalada("nombre ensalada", 5, 500, 50, "pepperoni2", "aderezo1");
        Sopa sopa1 = new Sopa("nombresopa", 60, 600, 6, 6, "peperoni3");

        System.out.println( pizza1.preparar());
        System.out.println(ensalada1.preparar());
        System.out.println(  sopa1.preparar());


        System.out.println(pizza1.servir());
        System.out.println(ensalada1.servir());
        System.out.println(sopa1.servir());




        System.out.println(pizza1.calcularPrecio());
        System.out.println(ensalada1.calcularPrecio());
        System.out.println( sopa1.calcularPrecio());

        //System.out.println(pizza1.getTamanyo());
    }

}
