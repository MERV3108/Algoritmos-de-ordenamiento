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
    int n;
    double [] datos = new double[n];
    double [] result = new double[n];
    public void Burbuja (int tam, double[] datos){
        n=tam;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <= n-i-1; j++) {
                if (datos[j]>datos[i]) {
                    datos[j]=datos[i];
                }
            }
        }
    }
    public void insercion(int tam){
        n=tam;
        
    }
}
