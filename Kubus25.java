import java.util.Scanner;

public class Kubus25 {
    
    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }
    
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
    
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu Perhitungan Kubus:");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = scanner.nextInt();
            
            if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }
            
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = scanner.nextDouble();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        
        scanner.close();
    }
}
