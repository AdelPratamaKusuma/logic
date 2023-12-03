import java.util.Scanner;

public class Soal9DenganArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("Nilai n :" + n);

        int[][] array=new int[n][n];

        for (int a = 0; a < n; a++) {
            int angka =1;
            for (int i = 0; i < n ; i++) {
                if(a == i || a + i==8){
                    array[a][i]=angka;
                }else {
                    array[a][i]=angka;
                }angka+=2;

            }

        }for (int a = 0; a < n; a++) {
            for (int i = 0; i < n; i++) {
                if(a == i || a + i==8){
                    System.out.print(array[a][i]+"\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();

        }
    }
}
