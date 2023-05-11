/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package E6ProductosTienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public HashMap<String, Double> crearProdcutos(HashMap<String, Double> b){        
        String nombre, option;
        Double precio;
        
        do {
            System.out.println("Ingresa el nombre del producto");
            nombre = leer.next();
            System.out.println("Ingresa su precio");
            precio = leer.nextDouble();
            b.put(nombre, precio);
            System.out.println("Desea ingresar otro producto?");
            option = leer.next();
        } while (option.equalsIgnoreCase("si"));
        
        return b;
    }
    
    public void imprimirMap(HashMap<String, Double> a){
        System.out.println("--- Listado de Productos ---");
        for (Map.Entry<String, Double> entry : a.entrySet()) {
            System.out.println("Nombre: "+entry.getKey()+"   -- Precio: $"+entry.getValue());         
            
        }
        System.out.println("------------------------------");
    }
    
    public void menu(){
        HashMap<String, Double> mapaProductos = new HashMap();
        int option;
        do {
            System.out.println("----------------------------");
            System.out.println("Elige una opción del menú: "
                + "\n 1 - Agregar productos"
                + "\n 2 - Modificar un precio"
                + "\n 3 - Eliminar un producto"
                + "\n 4 - Modificar un nombre"
                + "\n 5 - Ver listado de productos"
                + "\n 6 - Salir");
        option = leer.nextInt();
        
        switch (option){
            case 1:                
                crearProdcutos(mapaProductos);
                break;
            case 2:
                
            case 3:
            
            case 4:
                
            case 5:
                imprimirMap(mapaProductos);
                break;
            case 6:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Opción inválida, intenta nuevamente");           
                
        }
            
        } while (option!=6);
        
    }
    
}
