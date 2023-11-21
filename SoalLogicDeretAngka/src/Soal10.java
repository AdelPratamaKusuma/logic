import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.print("nilai n :" + n);
        System.out.println();

        for (int a = 0; a < n; a++) {
            int angka=1;
            for (int i = 0; i < n; i++) {
                System.out.print(angka+"\t");
                angka+=2;
                if( a == i){
                    break;
                }
            }
            System.out.println();


        }












        }
    }
