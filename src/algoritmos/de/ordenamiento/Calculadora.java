package algoritmos.de.ordenamiento;
import java.util.Scanner;
public class Calculadora{
    
    public int m[][],a[][],b[][],c[][];
    public int fila, columna;
    
    public void leerMatrizA(){
    Scanner ja = new Scanner(System.in);
    for (int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
            a[i][j] = ja.nextInt();
        }
    }
}
     public void leerMatrizB(){
    Scanner ja = new Scanner(System.in);
    for (int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
            b[i][j] = ja.nextInt();
        }
    }
    }
    public void imprimirDatos(){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
               System.out.println(c[i][j]);
            }
        }
    }
    public void sumaMatrices(){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                c[i][j]=a[i][j] + b[i][j];
            }
        }
    }
    public void restaMatrices(){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                c[i][j]=a[i][j] - b[i][j];
            }
        }
    }
    public void multiplicacion(int filA, int colA, int filB, int colB) {
  if (colA == filB) {
    for (int i = 0; i < filA; i++) {
      for (int j = 0; j < colB; j++) {
        c[i][j] = a[i][j]*b[j][i];
        
      }
    }
  } else {
     System.out.println("No se puede multiplicar matrices que no sean compatibles");
  }
}

    public void transpuesta(){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                b[j][i]=a[i][j];
            }
        }
    }
    public void determinante2x2(){
         
    }
    
}