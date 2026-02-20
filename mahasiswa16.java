class mahasiswa {
    String nama;
    String kelas;
    String nim;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
        if (ipk >= 0 && ipk <= 4) {
            return;
        } else {
            System.out.println("IPK tidak valid. harus antara 0.0 sampai 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    //konstruktor default
    public mahasiswa() {

    }
    //konstruktor dengan parameter
    public mahasiswa (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}