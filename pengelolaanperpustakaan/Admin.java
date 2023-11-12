package pengelolaanperpustakaan;

public class Admin extends Pengguna {
    public Admin(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    @Override
    public void identifikasi() {
        System.out.println("Ini adalah admin dengan nama: " + getNama());
    }

    public void tambahBuku() {
        System.out.println("Admin dapat menambahkan buku.");
    }

    public void lihatBuku() {
        System.out.println("Admin dapat melihat buku.");
    }

    public void hapusBuku() {
        System.out.println("Admin dapat menghapus buku.");
    }
}

