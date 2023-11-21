import java.util.Scanner;

public class Soal11DenganArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("nilai n :" + n);

        int[][] array=new int[n][n];
        for (int i= 0; i < n; i++) {
            int angka=1;
            for (int j = 0; j < n; j++) {
                if(i % 2 == 0) {
                    array[i][j] = angka;
                }else {
                    array[i][j] = angka;
                }
                angka+=2;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");

            }
            for (int j = i; j < n; j++) {
                System.out.print(array[i][j]+"\t");

            }
            System.out.println();

        }
    }
}
