import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("Nilai n :" + n);
        System.out.println();

        for (int a = 0; a < n; a++) {
            int angka =2;
            for (int i = 0; i < n; i++) {
                System.out.print(angka +"\t");
                angka +=2;

            }
            System.out.println();

        }
    }
}