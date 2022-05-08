import java.util.Scanner;

public class anisa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai Anda :  ");
        int a = input.nextInt();

        int ilai = a;

        if (nilai >= 65) {
            System.out.print("Anda Lulus!");
        } else {
            System.out.println("Anda Gagal!");
        }
    }
}
