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
    
    int n,buscar,a[];
    public Hash (int n, int buscar, int a[]){
       this.n = n;
       this.buscar = buscar;
       this.a = a;
    }
    
    public int hashBuscar(){
    int s=0;
    for(int i = 0; i < a.length;i++){
        if (a[i] == buscar){
            s = a[i];
        }
        
    }
    return s%n;
}
    
}
