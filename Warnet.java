package tugas.tugaspraktikum;
import java.util.ArrayList;
import java.util.Scanner;

class Pelanggan {
    String nama;
    int durasi; // Durasinya dalam jam
    int hargaPerJam = 6000; // harga tetap Rp6000/jam
    int total;

    Pelanggan(String nama, int durasi) {
        this.nama = nama;
        this.durasi = durasi;
        this.total = durasi * hargaPerJam;
    }

    // Method untuk menampilkan data pelanggan
    public String tampilData() {
        return "Nama: " + nama +
               " | Durasi: " + durasi + " jam" +
               " | Harga/jam: Rp" + hargaPerJam +
               " | Total: Rp" + total;
    }
}

public class Warnet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pelanggan> daftar = new ArrayList<>();
        int pilihan;

        do {
            // Menu
            System.out.println("=== WARNET GIMANG (6000/Jam) ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Data Pelanggan");
            System.out.println("3. Ubah Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Ini CREATE
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan durasi (jam): ");
                    int durasi = input.nextInt();
                    daftar.add(new Pelanggan(nama, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    // Ini READ
                    System.out.println("=== Daftar Pelanggan ===");
                    if (daftar.isEmpty()) {
                        System.out.println("Belum ada data pelanggan.");
                    } else {
                        for (int i = 0; i < daftar.size(); i++) {
                            System.out.println((i + 1) + ". " + daftar.get(i).tampilData());
                        }
                    }
                    break;

                case 3:
                    // Ini UPDATE
                    System.out.print("Masukkan nomor pelanggan yang ingin diubah: ");
                    int ubah = input.nextInt();
                    input.nextLine();
                    if (ubah > 0 && ubah <= daftar.size()) {
                        System.out.print("Masukkan nama baru: ");
                        String namaBaru = input.nextLine();
                        System.out.print("Masukkan durasi baru (jam): ");
                        int durasiBaru = input.nextInt();
                        daftar.set(ubah - 1, new Pelanggan(namaBaru, durasiBaru));
                        System.out.println("Data berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak ada.");
                    }
                    break;

                case 4:
                    // Ini DELETE
                    System.out.print("Masukkan nomor pelanggan yang ingin dihapus: ");
                    int hapus = input.nextInt();
                    if (hapus > 0 && hapus <= daftar.size()) {
                        daftar.remove(hapus - 1);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak ada.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih dan sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak ada, coba lagi.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
