package busqueda_secuencia;

import io.ManejoArchivo;

public class BusquedaSecuencial {
    private int[] arreglo;
    
    /**
     * Constructor encargado de guardar los datos
     *
     * @param datos valores
     */
    public BusquedaSecuencial(int[] datos){
        arreglo = datos;
    }
    
    /**
     * Constructor encargado de guardar los datos NUMERICOS
     *
     * @param path archivo con datos
     */
    public BusquedaSecuencial(String path){
        ManejoArchivo.eliminar("BusquedaSecuencial.u6");
        
        if (ManejoArchivo.copiarArchivo(path, "BusquedaSecuencial.u6")) {
            return;
        }
        
        System.out.println("FALLO DE INICIALIZACION");
    }
    
    /**
     * Funcion encargada de hacer una busqueda secuencial (recorriendo todas las posiciones) entre los datos facilitados
     *
     * @param dato el dato a buscar
     * @return indice del arreglo donde se encuentra el valor ó -1 si no lo ha encontrado
     */
    public int busquedaArreglo(int dato){
        long cantidad = arreglo.length;
        
        for (int i = 0; i < cantidad; i++) {
            if (arreglo[i] == dato) {
                return i;
            }
        }
        return -1;
    }
    
     /**
     * Funcion encargada de hacer una busqueda secuencial (recorriendo todas las posiciones) en un archivo
     *
     * @param dato el dato NUMERICO a buscar
     * @return indice del archivo donde se encuentra el valor ó -1 si no lo ha encontrado
     */
    public int busquedaArchivo(int dato){
        long cantidad = ManejoArchivo.contarLineas("BusquedaSecuencial.u6");
        
        for (int i = 1; i <= cantidad; i++) {
            if (Integer.parseInt(ManejoArchivo.leer("BusquedaSecuencial.u6", i)) == dato) {
                return i;
            }
        }
        return -1;
    }
    
}