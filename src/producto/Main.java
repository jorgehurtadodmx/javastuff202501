package producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoRepository productoRepository = new ProductoRepository();
        // Producto producto1 = new Producto(1L, "producto1", 99, true);
        //Producto producto2 = new Producto(2L, "producto2", 199, true);
        //Producto producto3 = new Producto(3L, "producto3", 299, false);
        // Producto producto4 = new Producto(4L, "producto4", 399, true);
        productoRepository.save(new Producto(1L,"producto1",99,true));
        productoRepository.save(new Producto(2L,"producto2",199,false));
        productoRepository.save(new Producto(3L,"producto3",299,true));

        int opcion;
        //menu en metodo?
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando todos los productos");
                   //productoRepository.findAll();
                    for (Producto producto : productoRepository.findAll()) {
                        System.out.println(producto);
                    }
                    break;
                case 2:
                    System.out.println("Dame una ID");
                    Long busqueda = sc.nextLong();
                    String encontrado = productoRepository.findById(busqueda).getNombre();
                    System.out.println(encontrado);
                case 3:
                    System.out.println("Preparando guardado de producto");
                    System.out.println("Dame una ID");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Dame un nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Dame un precio");
                    double precio = sc.nextDouble();
                    System.out.println("Disponible? true / false"); //cambiar a disponible o no disponible S/N
                    boolean disponible = sc.nextBoolean();
                    Producto producto = new Producto(id, nombre, precio, disponible);
                    productoRepository.save(producto);
                    System.out.println("producto guardado");
                    break;
                case 4:
                    System.out.println("preaprando actualizacion de producto");
                    System.out.println("Dime el ID del producto a actualizar");
                    Long idUpdate = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Nuevo nombre");
                    String nuevoNombre = sc.nextLine();
                    System.out.println("Nuevo precio");
                    double nuevoPrecio = sc.nextDouble();
                    System.out.println("Disponible? /true/false");
                    boolean nuevoDisponible = sc.nextBoolean();

                    Producto productoActualizado = new Producto(idUpdate, nuevoNombre, nuevoPrecio, nuevoDisponible);
                    //confirmar update.
                    //id de producto con nueva info.
                    boolean confirmarUpdate = productoRepository.update(idUpdate, productoActualizado);
                    System.out.println(confirmarUpdate ? "Actualizado" : "No actualizado por error");
                    break;
                case 5:
                    System.out.println("Preparando para elimianr producto");
                    Long idDelete = sc.nextLong();
                    boolean deleted = productoRepository.deleteById(idDelete);
                    System.out.println(deleted ? "eliminado correctamente" : "no se ha podido eliminar");
                    break;
                case 6:
                    System.out.println("Preparando para eliminarlo TOODO");
                    productoRepository.deleteAll();
                    System.out.println("todo eliminado");
                    break;
                case 7:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("opcion no encontrada");
            }


        } while (opcion != 7);





    }
    public static void menu() {
        System.out.println("1.Mostrar todos los productos");
        System.out.println("2.Filtrar producto por ID");
        System.out.println("3.Guardar un nuevo producto");
        System.out.println("4. Actualizar un producto por ID");
        System.out.println("5. Eliminar un producto por ID");
        System.out.println("6. Eliminar todos los productos");
        System.out.println("7. Salir.");
    }
}


//mejoras, mejorar output de case 1, cambiar true por "disponible" y false por "no disponible"