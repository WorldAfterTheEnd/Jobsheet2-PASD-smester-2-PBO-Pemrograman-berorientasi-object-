public class dosenMain16 {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.idDosen = "1";
        dosen1.nama = "Dr. Budi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        dosen1.tampilkanInformasi();
        dosen1.ubahStatusAktif(false);
        dosen1.ubahKeahlian("Data Science");
        dosen1.tampilkanInformasi();

        
        Dosen dosen2 = new Dosen();
        dosen2.idDosen = "2";
        dosen2.nama = "Dr. Siti";
        dosen2.statusAktif = true;
        dosen2.tahunBergabung = 2015;
        dosen2.bidangKeahlian = "Jaringan Komputer";

        dosen2.tampilkanInformasi();

    }
}
