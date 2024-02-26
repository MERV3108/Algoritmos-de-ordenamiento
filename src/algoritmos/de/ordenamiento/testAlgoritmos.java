package algoritmos.de.ordenamiento;
//import java.util.Scanner;
/**
 *
 * @author manuel
 */
public class testAlgoritmos {
    Algoritmos algs = new Algoritmos();
    //Scanner ingreso = new Scanner(System.in);
    public void prueba(int tamaño){
        double[] datos = new double[tamaño];
        for (int i = 0; i < tamaño; i++) {
            datos[i]=(Math.random()*100);
        }
        //imprimir(datos);
        long startTime = System.nanoTime();
        algs.Burbu(tamaño, datos);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("Metodo burbuja: " + executionTime);
        startTime = System.nanoTime();
        algs.seleccion(tamaño, datos);
        endTime = System.nanoTime();
        executionTime = endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("Metodo seleccion: " + executionTime);
        startTime = System.nanoTime();
        algs.insercion(tamaño, datos);
        endTime = System.nanoTime();
        executionTime = endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("Metodo insercion: " + executionTime);
        startTime = System.nanoTime();
        algs.mergeSort(datos, 0, tamaño-1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("Metodo merge: " + executionTime);
        //imprimir(datos);
    }
    //void imprimir (double datos[]){
    //    for (int i = 0; i < datos.length; i++) {
    //        System.out.println(datos[i]);
    //    }
    //}
}