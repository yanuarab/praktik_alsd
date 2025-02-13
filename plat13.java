import java.util.Scanner;

public class plat13 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

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

        System.out.print("Masukkan kode plat nomor (huruf kapital): ");
        char kodePlat = input.next().charAt(0);

        String namaKota = "Kode plat tidak ditemukan";
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                namaKota = KOTA[i][1];
                break;
            }
        }

        System.out.println("Kota untuk kode plat " + kodePlat + " adalah: " + namaKota);

        input.close();
    }
}