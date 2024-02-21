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
    int tam=10;
    double [] result = new double [tam];
    public void copy (double[] datos, int tam){
        this.tam=tam;
        System.arraycopy(datos, 0, result, 0, this.tam);
    }
    public double[] getResult(){
        return result;
    }

    /**
     *
     * @param tam = tamaño del arreglo
     * @param datos = datos ingresados
     */
    public void Burbuja (int tam, double[] datos){
        this.tam=tam;
        for (int i = 0; i < this.tam-1; i++) {
            for (int j = 0; j <= this.tam-i-1; j++) {
                if (datos[j]>datos[j+1]) {
                    double temp = datos[j];
                    datos[j]=datos[j+1];
                    datos[j+1]=temp;
                }
            }
        }
        copy(datos, this.tam);
    }
    public void insercion(int tam, double[] datos){
        this.tam=tam;
        
        for (int i = 1; i < this.tam; i++) {
             double key = datos[i];
             int j =i-1;
             while (j>=0 && datos[j]>key){
                 datos[j+1] = datos[j];
                 j--;
             }
            datos[j+1] = key;
        }
        copy(datos, this.tam);
    }
    public void seleccion(int tam, double[] datos){
        this.tam=tam;
        for (int i = 0; i < this.tam-2; i++) {
            int min = i;
            for (int j = i+1; j < this.tam-1; j++) {
                if(datos[i]<datos[min])
                    min=j;
            }
            double temp = datos[i];
            datos[i] = datos[min];
            datos[min] = temp;
        }
        copy(datos, this.tam);
    }
    public void merge(double[] datos, int inicio, int tam){
        int fin = tam-1;
        if(inicio<fin){
            int mid = (inicio+fin)/2;
            merge(datos, inicio, mid, fin);
        }
        
    }
    public void merge(double[] datos, int inicio, int mid, int fin){
        int i = inicio;
        int j = mid+1;
        while(i <= mid&& j<= fin){
             if(datos[i]<=datos[j])
                 i++;
             else{
                 double temp = datos [j];
             for (int k = j; k > i; k--) {
                datos[k]=datos[k-1];
            }
             datos[i]=temp;
             i++;
             j++;
             mid++;
        }
      }
        copy(datos, tam);
    }
}
