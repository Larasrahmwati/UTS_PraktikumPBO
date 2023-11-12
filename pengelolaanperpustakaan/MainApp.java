package pengelolaanperpustakaan;

public class MainApp {
    public static void main(String[] args) {

        User user = new User("Ucup Sunandar Firdaus", "Laki-laki");
        user.identifikasi();
        user.lihatBuku();

        Admin admin = new Admin("Laras Rahmawati", "Perempuan");
        admin.identifikasi();
        admin.tambahBuku();
        admin.lihatBuku();
        admin.hapusBuku();

        Buku buku1 = new Buku("Harry Potter", "Fantasy");
        Buku buku2 = new Buku("Java Programming", "Programming");
        Buku buku3 = new Buku("Filosofi Teras", "filsafat");

        System.out.println("Judul Buku: " + buku1.getJudul() + ", Genre: " + buku1.getGenre());
        System.out.println("Judul Buku: " + buku2.getJudul() + ", Genre: " + buku2.getGenre());
        System.out.println("Judul Buku: " + buku3.getJudul() + ", Genre:" + buku3.getGenre());
    }
}
