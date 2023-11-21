import java.util.Scanner;

public class Soal3DenganArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n=scanner.nextInt();
        System.out.println("nilai n :"+ n);
        System.out.println();

        int[][] array=new int[n][n];


        int angka=1;
        for (int a = 0; a < n; a++) {
            for (int i = 0; i < n; i++) {
                if(a % 2 ==0){
                    array[a][i]= angka;
                }else{
                    array[a][i]= angka;
                }
                angka+=2;

            }

        }
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[k][j] + "\t");

            }
            System.out.println();
        }
    }
}
