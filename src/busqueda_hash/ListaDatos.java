/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_hash;

/**
 *
 * @author ING-JUANMATA
 */
public class ListaDatos {

    Dato ini, fin;

    public ListaDatos(int indice, int valor) {
        ini = fin = new Dato(indice, valor);
    }

    public void insertar(int indice, int valor) {
        if (ini == fin) {
            if (ini.valor != valor) {
                fin = new Dato(indice, valor);
                ini.sig = fin;
            }
            return;
        }

        Dato aux = ini;
        while (aux.sig != fin && aux.valor != valor) {
            aux = aux.sig;
        }

        if (aux.sig == fin) {
            if (valor != fin.valor) {
                fin.sig = new Dato(indice, valor);
                fin = fin.sig;
            }
        }
    }

    public int buscar(int valor) {
        if (ini == null) {
            return -1;
        }

        if (ini == fin) {
            if (ini.valor == valor) {
                return ini.indice;
            }
            return -1;
        }
        Dato aux = ini;
        while (aux.sig != fin && aux.valor != valor) {
            aux = aux.sig;
        }

        if (aux.valor == valor) {
            return aux.indice;
        }

        if (fin.valor == valor) {
            return fin.indice;
        }

        return -1;
    }
}
