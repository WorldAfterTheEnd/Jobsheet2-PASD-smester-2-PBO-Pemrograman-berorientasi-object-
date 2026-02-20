class Dosen {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2026) + " tahun");
        System.out.println("Bidang Keahlian: " + bidangKeahlian);

    }

    void ubahStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
        
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}