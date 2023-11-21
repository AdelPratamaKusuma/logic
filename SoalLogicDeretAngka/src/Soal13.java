import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("nilai n :"+ n);

        for (int i = 0; i < n; i++) {
            int angka=1;
            for (int a = 0; a < n; a++) {
                if(a + i <= n-1 && a >= i){
                    System.out.print(angka+"\t");
                } else if (a + i >= n-1 && a <= i) {
                    System.out.print(angka+"\t");
                }else {
                    System.out.print("\t");
                }angka+=2;

            }
            System.out.println();

        }
    }
}
