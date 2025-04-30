package producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {

    ArrayList<Producto> productos = new ArrayList<>();

   // Producto producto1 = new Producto(1L, "producto1", 99, true);
  //Producto producto2 = new Producto(2L, "producto2", 199, true);
   //Producto producto3 = new Producto(3L, "producto3", 299, false);
   // Producto producto4 = new Producto(4L, "producto4", 399, true);


    public List<Producto> findAll() {
        return new ArrayList<>(productos);
    }

    //foreach iterar todos los productos y buscar coincidencia ID
    public Producto findById(Long id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public void save(Producto producto) {
        productos.add(producto);

    }

    public boolean update(Long id, Producto productoActualizado) {
        for (int i = 0; i < productos.size() ; i++) {
            //mejorar?
            //if (productos.get(i).getId().equals(i)) {
            if (productos.get(i).getId().equals(id)) {
                productos.set(i, productoActualizado);
                return true;
            }
        }
        return false;
    }



    public boolean deleteById(Long id) {
        return productos.removeIf(producto -> producto.getId().equals(id));
    }

    public void deleteAll() {
        //productos.removeAll();¿
        productos.clear();
    }
}
