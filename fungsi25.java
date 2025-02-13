public class fungsi25 {
    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    
    static int[] harga = {75000, 50000, 60000, 10000};
    static int[] pengurangan = {-1, -2, -0, -5}; 
    
    public static void main(String[] args) {
        tampilkanPendapatan();
        tampilkanTotalStok();
        kurangiStok();
        tampilkanTotalStok();
    }
    
    static void tampilkanPendapatan() {
        System.out.println("Pendapatan jika semua bunga terjual:");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }
    
    static void tampilkanTotalStok() {
        System.out.println("Total stok setiap jenis bunga di semua cabang:");
        String[] bunga = {"Aglaonema", "Keladi", "Alocasia", "Mawar"};
        for (int j = 0; j < bunga.length; j++) {
            int totalStok = 0;
            for (int i = 0; i < stock.length; i++) {
                totalStok += stock[i][j];
            }
            System.out.println(bunga[j] + ": " + totalStok);
        }
        System.out.println();
    }
    
    static void kurangiStok() {
        System.out.println("Mengurangi stok bunga...");
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] += pengurangan[j];
                if (stock[i][j] < 0) stock[i][j] = 0;
            }
        }
        System.out.println("Pengurangan stok selesai.\n");
    }
}