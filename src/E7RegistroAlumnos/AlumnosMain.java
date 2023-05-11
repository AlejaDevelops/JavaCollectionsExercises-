/*
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA solamente.
Necesidades:
 Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los objetos de este tipo.
 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros , para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su apellido de forma ascendente.
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su nombre de forma descendente.
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas, utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.
Recordar:
 Hacer uso de paquetes y clases correspondientes para buena estructura de nuestro proyecto.
 Todos los métodos deben ser pensados para reutilizar y adaptarse a futuros cambios (por ejemplo, mañana quiero carga de 30 alumnos, y las instrucciones deben prevenir esta modificación)
 */
package E7RegistroAlumnos;

import E7RegistroAlumnos.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author AlejaDevelops
 */
public class AlumnosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***LISTA DE ESTUDIANTES ***");
        AlumnosService as = new AlumnosService();
        ArrayList<Alumnos> listaAlumnos = as.crearListaAlumnos();
        System.out.println("Cargando lista...");
       
        System.out.println("---------------------------------------------------");        
        System.out.println("Lista de estudiantes ordenados por apellido, forma ascendente: ");
        Collections.sort(listaAlumnos, Comparadores.ordenPorApellidoAsce); 
        as.imprimirArrayList(listaAlumnos);
        
        System.out.println("---------------------------------------------------");
        System.out.println("Lista de estudiantes ordenados por nombre, forma descendente: ");
        Collections.sort(listaAlumnos, Comparadores.ordenPorNombreDescen);
        as.imprimirArrayList(listaAlumnos);
        
        System.out.println("---------------------------------------------------");
        Alumnos alumno = as.validarEstudiante(listaAlumnos);
        System.out.println("La edad de "+alumno.getNombre()+" es "+as.calculadoraEdad(alumno)+ " años");        
        
       
        
        
        System.out.println("---------------------------------------------------");
        System.out.println("*** Reporte final ***");
        as.alumnosMayores25(listaAlumnos);
        as.inicialesAlumnos(listaAlumnos);
        as.clasificacionNacionalidad(listaAlumnos);
        
    }
    
    
}
