package busqueda_secuencia;

import io.ManejoArchivo;

public class BusquedaSecuencial {
    
    public BusquedaSecuencial(int[] arreglo){
        ManejoArchivo.eliminar("BusquedaSecuencial");
        
        int cantidad = arreglo.length;
        
        String numeros = "";
        
        for (int i = 0; i < cantidad; i++) {
            numeros += i == cantidad - 1 ? arreglo[i] : arreglo[i] + "\n";
        }
        
        if (ManejoArchivo.escribir(numeros, "BusquedaSecuencial.u6", true)) {
            ManejoArchivo.copiarArchivo("BusquedaSecuencial.u6", "respaldoBusquedaSecuencial.u6");
            return;
        }
        
        System.out.println("FALLO DE INICIALIZACION");
    }
    
    public BusquedaSecuencial(String path){
        ManejoArchivo.eliminar("BusquedaSecuencial.u6");
        
        if (ManejoArchivo.copiarArchivo(path, "BusquedaSecuencial.u6")) {
            return;
        }

        System.out.println("Fallo en el copiado");
    }
    
    
    /**
     * Funcion encargada de hacer una busqueda secuencial (recorriendo todas las posiciones) entre los datos facilitados
     *
     * @param dato valor buscado
     * @return indice del arreglo donde se encuentra el valor
     */
    public int busqueda(int dato){
        long cantidad = ManejoArchivo.contarLineas("BusquedaSecuencial.u6");
        
        for (int i = 1; i <= cantidad; i++) {
            if (Integer.parseInt(ManejoArchivo.leer("BusquedaSecuencial.u6", i)) == dato) {
                return i;
            }
        }
        return -1;
    }
}