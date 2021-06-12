/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_binaria;

import io.ManejoArchivo;
import java.io.File;

/**
 *
 * @author ING-JUANMATA
 */
public class Main {

    public static void main(String[] args) {
        BusquedaBinaria busqueda = new BusquedaBinaria(new java.io.File("datos.u6"));
        System.out.println(busqueda.busqueda(new File("datos.u6"), 0, ManejoArchivo.contarLineas("datos.u6"), 101));
    }
}
