/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_binaria;

import io.ManejoArchivo;
import java.io.File;

public class BusquedaBinaria {

    int[] datos;

    public BusquedaBinaria(int[] datos) {
        this.datos = datos;
    }

    /**
     * Funcion encargada de hacer una busqueda binaria (similar a recorrer un
     * arbol binario en busca de algun valor) entre los datos facilitados
     *
     * @param valor valor buscado
     * @return indice del arreglo donde se encuentra el valor
     */
    public int busqueda(int valor) {
        return busqueda(datos, 0, datos.length - 1, valor);
    }

    /**
     * Busca comparando el dato del centro, si este es mayor que el numero
     * buscado procede a olvidar la parte izquierda eliminando la mitad del
     * vector, mientras que si es menor elimina el lado derecho
     *
     * @param datos arreglo de datos donde se va a buscar
     * @param min inicio del subarreglo donde se va a buscar el dato
     * @param max fin del subarreglo donde se va a buscar el dato
     * @param buscado valor que se quiere encontrar
     * @return indice de la posicion del arreglo donde se puede encontrar el
     * dato
     */
    private int busqueda(int[] datos, int min, int max, int buscado) {
        if (min > max) {
            return -1;
        }

        int mid = min + (max - min) / 2;
        if (datos[mid] == buscado) {
            return mid;
        }
        if (datos[mid] < buscado) {
            return busqueda(datos, mid + 1, max, buscado);
        }

        return busqueda(datos, min, mid - 1, buscado);
    }

    public long busqueda(File datos, long min, long max, int buscado) {
        if (min > max) {
            return -1;
        }

        if ((max - min) <= Integer.MAX_VALUE) {
            int[] nuevos = new int[(int) (max - min)];
            long inicio = min;
            for (int i = 0; i < nuevos.length; i++) {
                nuevos[i] = Integer.parseInt(ManejoArchivo.leer(datos.getAbsolutePath(), inicio + i + 1));
            }

            return min + busqueda(nuevos, 0, (int) (max - min) - 1, buscado);
        }

        long mid = min + (max - min) / 2;
        int val = Integer.parseInt(ManejoArchivo.leer("datos.u6", mid));
        if (val == buscado) {
            return mid;
        }
        if (val < buscado) {
            return busqueda(datos, mid + 1, max, buscado);
        }

        return busqueda(datos, min, mid - 1, buscado);
    }
}
