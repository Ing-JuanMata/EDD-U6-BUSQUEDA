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
public class Dato {

    int indice, valor;
    Dato sig;

    public Dato(int indice, int valor) {
        this.indice = indice;
        this.valor = valor;
        sig = null;
    }
}
