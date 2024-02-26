package algoritmos.de.ordenamiento;

import java.util.Scanner;

/**
 *
 * @author manuel, alejandro, juan david
 */
public class consolaaaaaaa {

    public static int fi, co;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Calculadora cal1 = new Calculadora();
        char op, op2;
        do {
            System.out.println("\n\t-MENU-\n1.Calculadora matrices.\n2.Prueba algoritmos.\n3.Datos personas.\n4.Terminar.");
            op2 = ingreso.next().charAt(0);
            ingreso.nextLine();
            switch (op2) {
                case '1' -> {
                    System.out.println("\t-CALCULADORA MATICES- \n1. Suma de Matrices \n2. Producto de Matrices\n3. Producto de un escalar con una Matriz \n4. transpuesta de una Matriz \n5. Terminar");
                    op = ingreso.next().charAt(0);
                    ingreso.nextLine();
                    switch (op) {
                        case '1' -> {
                            System.out.println("Digite el numero de Filas y Columnas de las matrices");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Digite los numeros de las filas de la matriz 1 en orden");
                            for (int i = 0; i < fi; i++) {
                                for (int j = 0; j < co; j++) {
                                    System.out.println("Ingrese el numero ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }

                            }
                            System.out.println("Digite los numeros de las filas de la matriz 2 en orden");
                            for (int i = 0; i < fi; i++) {
                                for (int j = 0; j < co; j++) {
                                    System.out.println("Ingrese el numero ");
                                    cal1.b[i][j] = ingreso.nextInt();
                                }
                            }
                            cal1.sumaMatrices();
                            System.out.println("La matriz resultante es:");
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                            for (int i = 0; i < fi; i++) {
                                System.out.print("|");
                                for (int j = 0; j < co; j++) {
                                    System.out.print(String.format(" %3d", cal1.c[i][j]));
                                }
                                System.out.println(" |");
                            }
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                        }
                        case '2' -> {
                            System.out.println("Digite el numero de Filas y Columnas de las matrices");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Digite los numeros de las filas de la matriz 1 en orden");
                            for (int i = 0; i < fi; i++) {
                                for (int j = 0; j < co; j++) {
                                    System.out.println("Ingrese el numero ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }

                            }
                            System.out.println("Digite los numeros de las filas de la matriz 2 en orden");
                            for (int i = 0; i < fi; i++) {
                                for (int j = 0; j < co; j++) {
                                    System.out.println("Ingrese el numero ");
                                    cal1.b[i][j] = ingreso.nextInt();
                                }
                            }
                            cal1.multiplicacion(fi, co, fi, co);
                            System.out.println("La matriz resultante es:");
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                            for (int i = 0; i < fi; i++) {
                                System.out.print("|");
                                for (int j = 0; j < co; j++) {
                                    System.out.print(String.format(" %3d", cal1.c[i][j]));
                                }
                                System.out.println(" |");
                            }
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                        }
                        case '3' -> {
                            System.out.println("Digite el numero de Filas y Columnas de las matrices");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Digite los numeros de las filas de la matriz 1 en orden");
                            for (int i = 0; i < fi; i++) {
                                for (int j = 0; j < co; j++) {
                                    System.out.println("Ingrese el numero ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }

                            }
                            System.out.println("Digite el numero que va a multiplicar la matriz: ");
                            cal1.n = ingreso.nextInt();
                            cal1.producto(fi, co);
                            System.out.println("La matriz resultante es:");
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                            for (int i = 0; i < fi; i++) {
                                System.out.print("|");
                                for (int j = 0; j < co; j++) {
                                    System.out.print(String.format(" %3d", cal1.c[i][j]));
                                }
                                System.out.println(" |");
                            }
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                        }
                        case '4' -> {
                            System.out.println("Digite el numero de Filas y Columnas de las matrices");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Digite los numeros de las filas de la matriz 1 en orden");
                            for (int i = 0; i < fi; i++) {
                                for (int j = 0; j < co; j++) {
                                    System.out.println("Ingrese el numero ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }

                            }
                            cal1.transpuesta();
                            System.out.println("La matriz resultante es:");
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                            for (int i = 0; i < fi; i++) {
                                System.out.print("|");
                                for (int j = 0; j < co; j++) {
                                    System.out.print(String.format(" %3d", cal1.b[i][j]));
                                }
                                System.out.println(" |");
                            }
                            System.out.print(" ");
                            for (int j = 0; j < co; j++) {
                                System.out.print("----");
                            }
                            System.out.println("-");
                        }
                    }
                }
                case '2' ->{
                    testAlgoritmos testAlgs = new testAlgoritmos();
//                    System.out.println("Ingrese la cantidad de datos a analizar");
//                    int tam = ingreso.nextInt();
//                    testAlgs.prueba(tam);
                      testAlgs.prueba(100);
                      testAlgs.prueba(500);
                      testAlgs.prueba(1000);
                      testAlgs.prueba(5000);
                      testAlgs.prueba(10000);
                }
                case '3' ->{
                    Personas personas = new Personas();
                    personas.setVisible(true);
                }
            }
        } while (op2 != '4');
    }
}
