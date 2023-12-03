import java.util.Scanner;

public class Soal8DenganAarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n= scanner.nextInt();
        System.out.println("Nilai n :" + n);
        System.out.println();

        int[][] array=new int[n][n];
        for (int a = 0; a < n; a++) {
         int angka=1;
            for (int i = 0; i < n; i++) {
                if( (a + i)==8){
                    array[a][i]=angka;
                }else{
                    array[a][i]=angka;
                }angka+=2;

            }

        }for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if( (j + i)==8){
                    System.out.print(array[j][i]+"\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();

        }
    }
}
