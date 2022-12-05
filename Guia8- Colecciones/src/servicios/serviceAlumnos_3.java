
package servicios;

import Archivos.aluminitos_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class serviceAlumnos_3 {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<aluminitos_3> listaAlumno = new ArrayList();
    aluminitos_3 alumno = new aluminitos_3();

    public void crearAlumno() {
        String respuesta;
        do {
            ArrayList<Integer> listaNotas = new ArrayList();
            System.out.println("Por favor, ingrese el nombre del alumno.");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Por favor, ingrese la nota N°" + (i + 1));
                listaNotas.add(leer.nextInt());
            }

            listaAlumno.add(new aluminitos_3(nombre, listaNotas));
            System.out.println("¿Desea ingresar un nuevo alumno? (Sí/No)");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Sí") || (respuesta.equalsIgnoreCase("Si")));
    }

    public void mostrarLista() {
        for (aluminitos_3 nombreAlumno : listaAlumno) {
            System.out.println(nombreAlumno.toString());
        }
    }
   
     public aluminitos_3 buscarAlumno() {
        aluminitos_3 alumnoBuscado = null;
        boolean flag = true;
        Iterator<aluminitos_3> iterator = listaAlumno.iterator();
        System.out.println("Ingrese el nombre del alumno que desea buscar");
        String nombre = leer.next();
        
        while (iterator.hasNext()) {
            aluminitos_3 next = iterator.next();
            if (next.getNombre().equalsIgnoreCase(nombre)) {
                alumnoBuscado = next;
                flag = false;
                System.out.println("La nota final es " + notaFinal(alumnoBuscado));
            }
        }
        if (flag) {
            System.out.println("El alumno no se encuentra en la lista.");
        }
        
        return alumnoBuscado;
    }

    public double notaFinal(aluminitos_3 alumnoBuscado){
        double notaFinal;
        int suma = 0;
        int aux = 0;
        for (int nota : alumnoBuscado.getNotas()) {
            suma += nota;
        }
        notaFinal = suma / 3;
        
        return notaFinal;
    }
    
}

