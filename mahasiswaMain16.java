public class mahasiswaMain16 {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.nama = "Muhammad Abhirama Putra";
        mhs1.nim = "254107060032";
        mhs1.kelas = "SIB 1D";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB 2D");
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        
        mahasiswa mhs2 = new mahasiswa ("Dodo", "254107060033", 3.2, "SIB 1D");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        //object baru
        mahasiswa mhsMuhammadAbhiramaPutra = new mahasiswa("Muhammad Abhirama Putra", "254107060032", 3.7, "SIB 1D");
        mhsMuhammadAbhiramaPutra.tampilkanInformasi();
    }
}
