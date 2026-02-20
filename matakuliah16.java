class matakuliah{
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);

    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Jumlah jam tidak bisa dikurangi.");
        }
    }

    //construction default
    public matakuliah() {

    }
    //construction berparameter
    public matakuliah(String kd, String nm, int sks, int jam) {
        kodeMK = kd;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }



}
