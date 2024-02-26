package algoritmos.de.ordenamiento;
import java.util.Scanner;

/**
 *
 * @author manuel, alejandro, juan david
 */
public class Consola{
    public int z[][];
    public Consola(int i, int j){
        z = new int[i][j];
    }
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Calculadora cal1 = new Calculadora();
        char op;
        
      do{
        System.out.println("\t-CALCULADORA MATICES- \n1. Suma de Matrices \n2. Producto de Matrices\n3. Producto de un escalar con una Matriz \n4. transpuesta de una Matriz \n5. Terminar");
       op = ingreso.next().charAt(0);
       ingreso.nextLine();
            
       switch(op){
         
           case '1' -> {
               System.out.println("Digite el numero de Filas y Columnas de la matiz");
               cal1.fila = ingreso.nextInt();
               cal1.columna = ingreso.nextInt();
               System.out.println("Digite los numeros de las filas de la matriz en orden");
               for (int i=0; i<cal1.fila; i++){
                for(int j=0; j<cal1.columna; j++){
                    System.out.println("Ingrese el numero");
               z[i][j] = ingreso.nextInt();
               
               
        }
    }
  }
           
}
           
           
}while(op!= '4');

}

}