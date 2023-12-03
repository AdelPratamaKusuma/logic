import java.util.Scanner;

public class Soal13DenganArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n= scanner.nextInt();
        System.out.println("nilai n :"+ n);

        int[][] array=new int[n][n];

        for (int i = 0; i < n; i++) {
            int angka=1;
            for (int a = 0; a < n; a++) {
                if(i % 2 ==0){
                    array[a][i]=angka;
                }else{
                    array[a][i]=angka;
                }angka+=2;

            }

        }
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++) {
                if(a + i <= n-1 && a >= i){
                    System.out.print(array[a][i]+"\t");
                }else if(a + i >= n-1 && a <= i){
                    System.out.print(array[a][i]+"\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();

        }
    }
}
