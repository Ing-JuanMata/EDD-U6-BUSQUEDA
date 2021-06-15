/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_hash;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ING-JUANMATA
 */
public class Tabla {

    private ListaDatos[] datos;
    private int tam;

    public Tabla(int[] datos) {
        this.tam = datos.length;
        dimensionarTabla();
        crearTabla(datos);
    }

    /**
     * Funcion encargada de dimensionar la tabla de hash con algun numero primo
     * usando el algoritmo de Criba de Eratóstenes
     */
    private void dimensionarTabla() {
        int tope = (int) Math.floor(Math.sqrt(tam)) + 1;

        List<Long> compuestos = new ArrayList<>();
        int pos = 0;
        for (int i = 2; i <= tope; i++) {
            if (!compuestos.contains(Long.valueOf(i))) {
                for (int j = i; j <= tam / i + 1; j++) {
                    compuestos.add(Long.valueOf(i * j));
                }
            }
        }

        int c = 0;
        for (pos = 2; pos < tam; pos++) {
            if (!compuestos.contains(Long.valueOf(pos))) {
                c = pos;
            }
            datos = new ListaDatos[c];
        }
    }

    /**
     * Se encarga de darles una posicion en la tabla de hash a los datos proporcionados
     * @param datos arreglo de datos que van a ser mapeados
     */
    private void crearTabla(int[] datos) {
        int x = 0;
        for (int i : datos) {
            if (this.datos[i % this.datos.length] == null) {
                this.datos[i % this.datos.length] = new ListaDatos(x++, i);
                continue;
            }

            this.datos[i % this.datos.length].insertar(x++, i);
        }
    }

    public int buscar(int valor) {
        return datos[valor % datos.length] == null ? -1 : datos[valor % datos.length].buscar(valor);
    }
}
