import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan nilai n :");
        int n = scanner.nextInt();
        System.out.print("nilai n :"+ n);
        System.out.println();

        for (int a = 0; a < n; a++) {
            int angka=1;
            for (int i = 0; i < n; i++) {
                if( (a + i)==8){
                    System.out.println(angka+"\t");
                }else{
                    System.out.print("\t");
                }angka+=2;

            }
            System.out.println();


        }
    }
}
