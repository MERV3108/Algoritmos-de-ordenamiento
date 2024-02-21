package algoritmos.de.ordenamiento;
import java.util.Scanner;
public class Calculadora{
    
    public int m[][],a[][],b[][],c[][];
    public int fila, columna;
    
    public void leerMatriz(){
    Scanner ja = new Scanner(System.in);
    for (int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
            m[i][j] = ja.nextInt();
        }
    }
}
    public void imprimirDatos(){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
               System.out.println(m[i][j]);
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
    public void multiMatrices(){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                c[i][j]=a[i][j] * b[i][j];
            }
        }
    }
}