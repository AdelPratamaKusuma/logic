import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();
        System.out.println("nilai n :" + n);
        System.out.println();
        int angka=1;
        for (int a = 0; a < n; a++) {

            for (int i = 0; i < 8; i++) {
                System.out.print(angka+"\t");
                if(angka>28){
                    angka+=2;


                }else{
                    angka+=3;
                }

            }
            System.out.println();

        }
    }
}
