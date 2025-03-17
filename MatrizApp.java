import java.util.Random;
import java.util.Scanner;

public class MatrizApp {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        //Buscar un numero.
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

        scanner.close();
    }
}
