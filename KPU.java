import java.util.Scanner;

public class KPU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah calon dan wilayah
        System.out.print("Masukkan jumlah calon: ");
        int calon = sc.nextInt();
        System.out.print("Masukkan jumlah wilayah: ");
        int wilayah = sc.nextInt();

        int[][] suara = new int[wilayah][calon];

        // Input suara
        System.out.println("\n=== INPUT DATA SUARA ===");
        for (int i = 0; i < wilayah; i++) {
            System.out.println("Wilayah " + (i+1) + ":");
            for (int j = 0; j < calon; j++) {
                System.out.print("  Suara calon " + (j+1) + ": ");
                suara[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== HASIL PEMILU ===");

        // Hitung total suara tiap calon
        int[] totalSuara = new int[calon];
        for (int j = 0; j < calon; j++) {
            for (int i = 0; i < wilayah; i++) {
                totalSuara[j] += suara[i][j];
            }
            System.out.println("Total suara calon " + (j+1) + ": " + totalSuara[j]);
        }

        // Wilayah dengan suara terbanyak untuk tiap calon
        System.out.println("\nWilayah dengan suara terbanyak untuk tiap calon:");
        for (int j = 0; j < calon; j++) {
            int maxSuara = suara[0][j];
            int maxWilayah = 0;
            for (int i = 1; i < wilayah; i++) {
                if (suara[i][j] > maxSuara) {
                    maxSuara = suara[i][j];
                    maxWilayah = i;
                }
            }
            System.out.println("Calon " + (j+1) + " terbanyak di Wilayah " + (maxWilayah+1) + " (" + maxSuara + " suara)");
        }

        // Pemenang di setiap wilayah
        System.out.println("\nPemenang di setiap wilayah:");
        for (int i = 0; i < wilayah; i++) {
            int maxSuara = suara[i][0];
            int pemenang = 0;
            for (int j = 1; j < calon; j++) {
                if (suara[i][j] > maxSuara) {
                    maxSuara = suara[i][j];
                    pemenang = j;
                }
            }
            System.out.println("Wilayah " + (i+1) + " dimenangkan oleh Calon " + (pemenang+1) + " (" + maxSuara + " suara)");
        }

        sc.close();
    }
}