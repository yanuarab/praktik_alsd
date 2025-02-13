import java.util.Scanner;

public class Pemilihan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Tugas, Kuis, UTS, UAS;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        Tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        Kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        UTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        UAS = sc.nextDouble();
        System.out.println("==============================");

        if (Tugas < 0 || Tugas > 100 || Kuis < 0 || Kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("nilai tidak valid");
        } else {

            double nilaiAkhir = (Tugas * 0.2) + (Kuis * 0.2) + (UTS * 0.3) + (UAS * 0.3);
            System.out.println("\nNilai akhir : " + nilaiAkhir);

            String nilaiHuruf;
            if (nilaiAkhir >= 85) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 75) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 55) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 40) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");

            if (nilaiAkhir >= 55) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
        sc.close();
    }
}
