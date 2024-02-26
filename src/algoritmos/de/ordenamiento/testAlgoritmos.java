package algoritmos.de.ordenamiento;
//import java.util.Scanner;
/**
 *
 * @author manuel
 */
public class testAlgoritmos {
    Algoritmos algs = new Algoritmos();
    //Scanner ingreso = new Scanner(System.in);
    String[] metodos = new String[]{"Burbuja", "Seleccion", "Insercion", "Merge"};
    public void prueba(int tamaño){
        double[] datos = new double[tamaño];
        for (int i = 0; i < tamaño; i++) {
            datos[i]=(Math.random()*100);
        }
        //imprimir(datos);
        System.out.println("Datos a analizar: "+tamaño);
        double startTime = System.nanoTime();
        algs.Burbu(tamaño, datos);
        double endTime = System.nanoTime();
        double[] executionTime =new double[4];
        executionTime[0]= endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("\tMetodo burbuja: " + executionTime[0]);
        startTime = System.nanoTime();
        algs.seleccion(tamaño, datos);
        endTime = System.nanoTime();
        executionTime[1] = endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("\tMetodo seleccion: " + executionTime[1]);
        startTime = System.nanoTime();
        algs.insercion(tamaño, datos);
        endTime = System.nanoTime();
        executionTime[2] = endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("\tMetodo insercion: " + executionTime[2]);
        startTime = System.nanoTime();
        algs.mergeSort(datos, 0, tamaño-1);
        endTime = System.nanoTime();
        executionTime[3] = endTime - startTime; // Tiempo de ejecución en nanosegundos
        System.out.println("\tMetodo merge: " + executionTime[3]);
        Personas per = new Personas();
        double[] copia = per.copy(executionTime);
        algs.Burbu(4, copia);
        for (int i = 0; i < 4; i++) {
            if(copia[0]==executionTime[i])
                System.out.println("El mejor tiempo fue: "+copia[0]+", del metodo: "+metodos[i]+"\n");
        }
        
        //imprimir(datos);
    }
    //void imprimir (double datos[]){
    //    for (int i = 0; i < datos.length; i++) {
    //        System.out.println(datos[i]);
    //    }
    //}
}