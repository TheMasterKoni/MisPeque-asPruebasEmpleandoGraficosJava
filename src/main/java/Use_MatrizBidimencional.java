import java.util.Scanner;
public class Use_MatrizBidimencional {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("type the value for columna " + i + " with file " + j);
                matrix[i][j] = input.nextInt();
            }
        }

        for (int c = 0; c < 4; c++) {
            for (int f = 0; f < 5; f++) {
                System.out.print(matrix[c][f] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int M[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},//aqui se pueden apreciar 4 filas y 5 columnas
                {11, 12, 13, 14, 15},//igual al ejemplo anterior
                {16, 17, 18, 19, 20}//el final no lleva coma
        };

        for (int[] fila:M) {
            for (int Z:fila) {
                System.out.print(Z + " ");
            }
            System.out.println();
        }
    }
}
