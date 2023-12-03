import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan angka :");
        int n = scanner.nextInt();
        System.out.println("Nilai n :"+ n);

        for (int a = 0; a < n; a++) {
            int angka=1;
            for (int i = 0; i < n; i++) {
                if(a == i || a + i==8){
                    System.out.print(angka+"\t");
                }else{
                    System.out.print("\t");
                }angka+=2;

            }
            System.out.println();




        }
    }
}
