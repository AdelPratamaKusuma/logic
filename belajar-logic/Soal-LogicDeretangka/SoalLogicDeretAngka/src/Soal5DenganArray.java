import java.util.Scanner;

public class Soal5DenganArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("Nilai n :" + n);

        int[][] array = new int[n][n];

        int angka = 1;
        for (int a = 0; a < n; a++) {
            for (int i = 0; i < n; i++) {
                if (a % 2 == 0) {
                    array[a][i] = angka;
                } else {
                    array[a][n - 1 - i] = angka;
                }
                angka += 2;
            }


        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(array[j][k] + "\t");

            }
            System.out.println();


        }
    }
}
