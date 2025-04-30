package interfacetesting.classes;

import interfacetesting.interfaces.CocheService;

public class CocheServiceSportsImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche de carreras");
        return null;
    }
}
