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
package E7RegistroAlumnos.utilidades;

import E7RegistroAlumnos.Alumnos;
import java.util.Comparator;

/**
 *
 * @author AlejaDevelops
 */
public class Comparadores {
     public static Comparator<Alumnos> ordenPorApellidoAsce = new Comparator<Alumnos>() {
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t.getApellido().compareToIgnoreCase(t1.getApellido());
        }
    };
     
     public static Comparator<Alumnos> ordenPorNombreDescen = new Comparator<Alumnos>() {
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t1.getNombre().compareToIgnoreCase(t.getNombre());
        }
    };

}


