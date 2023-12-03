import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan nilai n :");
        int n = scanner.nextInt();
        System.out.print("nilai n :"+ n);
        System.out.println();


        int angka=1;
        for (int a = 0; a < n; a++) {

            for (int i = 0; i < n; i++) {
                System.out.print(angka+"\t");
                angka+=2;


            }
            System.out.println();

        }
    }
}
