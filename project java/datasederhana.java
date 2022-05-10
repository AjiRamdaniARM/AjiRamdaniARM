class datasederhana {
    public static void main(String[] args) {
        int umur = 10; // tipe data integer
        // create strings
        String nama = "Aji Ramdani";
        String kelas = "10 RPL";
        String sekolah = "Smk Terpadu Ibadurrahman";

        // print strings
        System.out.println("Nama Saya : " + nama); // print nama
        System.out.println("Saya Kelas : " + kelas); // print kelas
        System.out.println("Sekolah Saya : " + sekolah); // print sekolah
        System.out.println("umur saya :" + umur + " tahun ");
        // waktu sekarang
        int time = 11;
        if (time < 18) {
            System.out.println("Good Night :)");
        } else {
            System.out.println("Good Evernoon");
        }
    }
}