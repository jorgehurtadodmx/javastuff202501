package interfacetesting.classes;

import interfacetesting.interfaces.CocheService;

public class CocheServiceImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche normal");
        return null;
    }
}
