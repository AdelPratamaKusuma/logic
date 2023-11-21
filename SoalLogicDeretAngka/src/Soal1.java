import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("Nilai n :"+ n);

        for (int a = 0; a < n; a++) {
            int angka=1;
            for (int i = 0; i < n; i++) {
                if ( a % 2 == 0){
                    System.out.print(angka+"\t");
                    angka+=2;
                }

            }
            System.out.println();

        }

    }
}





