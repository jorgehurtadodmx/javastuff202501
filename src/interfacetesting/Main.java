package interfacetesting;

import interfacetesting.classes.Coche;
import interfacetesting.classes.CocheServiceImpl;
import interfacetesting.classes.CocheServiceSportsImpl;
import interfacetesting.interfaces.CocheService;

public class Main {
    public static void main(String[] args) {
        CocheService service1 = new CocheServiceImpl();
        CocheService service2 = new CocheServiceImpl();

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service1.crearCocheDemo();


        CocheService serviceClassic = new CocheServiceImpl();
        CocheService serviceSport = new CocheServiceSportsImpl();

    }
}
