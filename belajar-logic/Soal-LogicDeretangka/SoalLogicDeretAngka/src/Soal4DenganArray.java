import java.util.Scanner;

public class Soal4DenganArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan nilai n :");
        int n= scanner.nextInt();
        System.out.print("nilai n :"+ n);
        System.out.println();

        int[][] array = new int[n][n];
        // Mengisi array

        int angka= 1;
        for (int a = 0; a < n; a++) {
            for (int i = 0; i < n; i++) {
                if (a % 2 == 0) {
                    array[a][i] = angka;
                }else{
                    array[a][n-1-i] = angka;
                }
                angka+=3;


            }


        }
        // menampilkan array
                for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(array[b][k]+ "\t");
continue;
            }
            System.out.println();

        }

    }
}
