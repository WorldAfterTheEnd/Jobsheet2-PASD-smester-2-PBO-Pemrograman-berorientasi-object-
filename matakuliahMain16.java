public class matakuliahMain16 {
    public static void main(String[] args) {
        
        matakuliah mk1 = new matakuliah();
        mk1.nama = "Matdas";
        mk1.kodeMK = "SIB123";
        mk1.sks = 3;
        mk1.jumlahJam = 24;

        mk1.tampilkanInformasi();
        mk1.ubahSks(4);
        mk1.tambahJam(8);
        mk1.tampilkanInformasi();

        //construction berparameter
        matakuliah mk2 = new matakuliah("Struktur Data", "SIB456", 3, 24);
        mk2.tampilkanInformasi();
    }
}
