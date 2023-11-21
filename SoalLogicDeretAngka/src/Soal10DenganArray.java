import java.util.Scanner;

public class Soal10DenganArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("Nilai n :"+ n);
        System.out.println();

        int[][] array=new int[n][n];

        for (int a = 0; a < n; a++) {
            int angka=1;
            for (int i = 0; i < n; i++) {
                if(a == i){
                    array[a][i]=angka;
                }else{
                    array[a][i]=angka;
                }angka+=2;

            }
        }
        for (int a = 0; a < n; a++) {
            for (int i = 0; i < n; i++) {
                System.out.print(array[a][i]+"\t");

                if(a == i){
                    break;

                }

            }
            System.out.println();

        }
    }
}
