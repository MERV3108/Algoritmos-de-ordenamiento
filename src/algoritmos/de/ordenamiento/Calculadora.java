package algoritmos.de.ordenamiento;
public class Calculadora{
    public int fila, columna, n;
    int[][] a=new int[100][100];
    int[][] b=new int[100][100];
    int[][] c=new int[100][100];
    
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
        if(colA==filB){
            int[][] C= new int[filA][colB];
            for(int i=0; i<filA; i++){
                for(int j=0; j<colB; j++){
                    int suma=0;
                    for(int k=0; k<colA; k++){
                        suma+=a[i][k]*b[k][j];
                    }
                    C[i][j]=suma;
                }
            }   
            this.c = C;
        } 
        else {
        System.out.println("No se puede multiplicar matrices que no sean compatibles");
        }
    }
    public void producto(int filA, int colA) {
        int[][] C = new int[filA][colA];
        for (int i = 0; i < filA; i++) {
            for (int j = 0; j < colA; j++) {
                C[i][j] = n * a[i][j];
            }
        }
        this.c = C;
    }
    public void transpuesta(){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                b[j][i]=a[i][j];
            }
        }
    }
}

    