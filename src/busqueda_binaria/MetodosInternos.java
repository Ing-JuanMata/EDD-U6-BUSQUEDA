/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_binaria;

/**
 *
 * @author codeboy1028
 */
public class MetodosInternos {

    public int[] A;

    public MetodosInternos() {
        this.A = new int[Integer.MAX_VALUE];
    }

    public MetodosInternos(int[] A) {
        this.A = new int[A.length];
        System.arraycopy(A, 0, this.A, 0, A.length);
    }

    public int[] Quicksort() {
        Quicksort(A, 0, A.length - 1);
        return A;
    }

    private void Quicksort(int numeros[], int primero, int ultimo) {
        int pivote = numeros[primero];
        int i = primero;
        int j = ultimo;
        int aux;

        while (i < j) {
            while (numeros[i] <= pivote && i < j) {
                i++;
            }

            while (numeros[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }
        numeros[primero] = numeros[j];
        numeros[j] = pivote;

        if (primero < j - 1) {
            Quicksort(numeros, primero, j - 1);
        }

        if (j + 1 < ultimo) {
            Quicksort(numeros, j + 1, ultimo);
        }
    }

}
