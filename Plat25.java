import java.util.Scanner;

public class Plat25 {
    public static void main(String[] args) {
        String[][] KOTA = { 
            {"A", "Banten"},
            {"B", "Jakarta"},
            {"D", "Bandung"},
            {"E", "Cirebon"},
            {"F", "Bogor"},
            {"G", "Pekalongan"},
            {"H", "Semarang"},
            {"L", "Surabaya"},
            {"N", "Malang"},
            {"T", "Tegal"}
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode plat nomor: ");
        String Plat = input.next();

        String namaKota = "Kode plat tidak ditemukan";
        for (String[] kota : KOTA) {
            if (kota[0].equals(Plat)) { 
                namaKota = kota[1];
                break;
            }
        }

        System.out.println("Kota dengan kode plat " + Plat + " adalah: " + namaKota);

        input.close();
    }
}