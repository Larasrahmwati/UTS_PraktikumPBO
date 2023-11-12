package jenishewan;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();

        Hewan hewan;

        if ("Kucing".equalsIgnoreCase(jenisHewan)) {
            hewan = new Kucing();
        } else if ("Anjing".equalsIgnoreCase(jenisHewan)) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }

        hewan.bersuara();

        if (hewan.isMamalia()) {
            System.out.println("Hewan ini adalah mamalia.");
        } else {
            System.out.println("Hewan ini bukan mamalia.");
        }
    }
}

