/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_binaria;

import io.ManejoArchivo;
import java.io.File;

public class BusquedaBinaria {

    String datos;

    public BusquedaBinaria(String datos) {
        this.datos = datos;
    }

    public BusquedaBinaria(File path) {
        ManejoArchivo.copiarArchivo(path.getAbsolutePath(), "datos.u6");
    }

    public int busqueda(int[] datos, int min, int max, int buscado) {
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
