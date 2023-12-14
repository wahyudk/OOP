package ProjectPratikum.Bab5;


public class Mahasiswa {
    // Atribut
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String prodi;
    private String angkatan;
    private String alamat;

    // Method untuk mengatur data
    public void dataNIM(String nim) {
        this.nim = nim;
    }

    public void dataNama(String nama) {
        this.nama = nama;
    }

    public void dataJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void dataProdi(String prodi) {
        this.prodi = prodi;
    }

    public void dataAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public void dataAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method untuk mencetak data
    public String cetakNIM() {
        return nim;
    }

    public String cetakNama() {
        return nama;
    }

    public String cetakJenisKelamin() {
        return jenisKelamin;
    }

    public String cetakProdi() {
        return prodi;
    }

    public String cetakAngkatan() {
        return angkatan;
    }

    public String cetakAlamat() {
        return alamat;
    }
}
