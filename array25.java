import java.util.Scanner;

public class array25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Menghitung IP semester");
        System.out.println("===============");
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
        "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        int jumlahMK = namaMK.length;
        
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        int[] sks = {2, 3, 3, 3, 3, 3, 2, 3};
        
        double totalBobotXSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai Angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobot(nilaiHuruf[i]);

            totalBobotXSKS += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobotXSKS / totalSKS;

        System.out.println("\n============================================================");
        System.out.printf("%-35s %-15s %-15s %-15s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("============================================================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s %-15.2f %-15s %-15.2f\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("============================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }

    public static String konversiHuruf(double nilai) {
        if (nilai >= 80 && nilai <= 100) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }

    public static double konversiBobot(String huruf) {
        switch (huruf) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }
}