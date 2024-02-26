/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos.de.ordenamiento;

/**
 *
 * @author manuel
 */
public class Algoritmos {

    public void Burbu(int tam, double[] datos) {
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j <= tam - i - 2; j++) {
                if (datos[j] > datos[j + 1]) {
                    double temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }
            }
        }
    }

    public void insercion(int tam, double[] datos) {
        for (int i = 1; i < tam; i++) {
            double key = datos[i];
            int j = i - 1;
            while (j >= 0 && datos[j] > key) {
                datos[j + 1] = datos[j];
                j--;
                //System.out.println("Ingreso");
            }
            datos[j + 1] = key;
        }
    }

    public void seleccion(int tam, double[] datos) {
        for (int i = 0; i < tam - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tam; j++) {
                if (datos[j] < datos[min]) {
                    min = j;
                }
            }
            double temp = datos[i];
            datos[i] = datos[min];
            datos[min] = temp;
        }
    }

    public void mergeSort(double[] A, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(A, l, m);
            mergeSort(A, m + 1, r);
            merge(A, l, m, r);
        }
    }

    public void merge(double[] arr, int l, int m, int r) {
       
        int n1 = m - l + 1;
        int n2 = r - m;

    
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = (int) arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = (int) arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
