public class pemjumlahan {
    public static void main(String[] args) {
        // data number
        int data1 = 120;
        int data2 = 32000;
        int data3 = 1000;
        int data4 = 10000;

        // maka akan dijumlahkan
        int jumlah = data1 + data2;
        int kurang = data2 - data3;
        int perkalian = data3 * data4;
        int jumlahkan = data4 + data3 - data2 * data1;

        // hasil dari data yang di jumlahkan
        System.out.println("data1 = " + data1 + " + " + data2 + " = " + jumlah);
        System.out.println("data2 = " + data2 + " - " + data3 + " = " + kurang);
        System.out.println("data3 = " + data3 + " x " + data4 + " = " + perkalian);
        System.out.println("data4 = " + data4 + " + " + data1 + " - " + data2 + " * " + data3 + " = " + jumlahkan);
    }
}
