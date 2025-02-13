import java.util.Scanner;

public class Pemilihan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextDouble();
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {

            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
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
