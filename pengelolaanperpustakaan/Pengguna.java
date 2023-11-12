package pengelolaanperpustakaan;

public abstract class Pengguna {
    private String nama;
    private String jenisKelamin;

    public Pengguna(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public abstract void identifikasi();
}

