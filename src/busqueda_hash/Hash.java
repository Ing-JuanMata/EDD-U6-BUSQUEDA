/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_hash;

/**
 *
 * @author Osmar
 */
public class Hash {

    Tabla tablaHash;

    public Hash(int a[]) {
        tablaHash = new Tabla(a);
    }

    /**
     * Busca un determinado valor en la lista de valores guardados en la tabla
     * de hash
     *
     * @param valor valor a buscar
     * @return indice del valor en el arreglo
     */
    public int hashBuscar(int valor) {
        return tablaHash.buscar(valor);
    }

}
