import java.util.Random;
import java.util.Scanner;

public class MatrizApp {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
                System.out.print(matriz[i][j] + " ");
                suma += matriz[i][j];
            }
            System.out.println();
        }

        System.out.print("Ingrese un número a buscar: ");
        int numero = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Encontrado en: " + i + ", " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado");
        }

        System.out.println("Suma de todos los números: " + suma);
        scanner.close();
    }
}