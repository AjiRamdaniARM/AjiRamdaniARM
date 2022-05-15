import java.util.Scanner;

public class dataaji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, sekolah, jurusan, alamat, cita2, hobi, def = "Masukkan ";

        System.out.println("|       DATA AJI RAMDANI        |");
        System.out.println("=================================");

        System.out.println(def + "Nama \t\t: ");
        nama = input.nextLine();
        System.out.println(def + "Sekolah \t\t: ");
        sekolah = input.nextLine();
        System.out.println(def + "Jurusan \t\t: ");
        jurusan = input.nextLine();
        System.out.println(def + "Alamat \t\t: ");
        alamat = input.nextLine();
        System.out.println(def + "cita2 \t\t: ");
        cita2 = input.nextLine();
        System.out.println(def + "Hobi \t\t: ");
        hobi = input.nextLine();

        System.out.println("");

        // tampilkan datanya aji !
        System.out.println("+------------------------------------------+");
        System.out.println("|          Data  Aji Ramdani         |");
        System.out.println("+------------------------------------------+");
        System.out.println("| Nama\t\t: " + nama);
        System.out.println("| Sekolah\t\t: " + sekolah);
        System.out.println("| Jurusan\t\t: " + jurusan);
        System.out.println("| Alamat\t\t: " + alamat);
        System.out.println("| Cita-cita\t\t: " + cita2);
        System.out.println("| Hobi\t\t: " + hobi);
    }
}