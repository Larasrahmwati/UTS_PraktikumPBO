package pengelolaanperpustakaan;

public class User extends Pengguna {
    public User(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    @Override
    public void identifikasi() {
        System.out.println("Ini adalah pengguna dengan nama: " + getNama());
    }

    public void lihatBuku() {
        System.out.println("Pengguna dapat melihat buku.");
    }
}

