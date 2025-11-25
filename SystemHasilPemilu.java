import java.util.Scanner;

public class SystemHasilPemilu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah calon: ");
        int calon = sc.nextInt();
        System.out.print("Masukkan jumlah wilayah: ");
        int wilayah = sc.nextInt();

        int[][] suara = new int[wilayah][calon];

        System.out.println("\n=== INPUT DATA SUARA ===");
        for (int i = 0; i < wilayah; i++) {
            System.out.println("Wilayah " + (i+1) + ":");
            for (int j = 0; j < calon; j++) {
                System.out.print("  Suara calon " + (j+1) + ": ");
                suara[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== HASIL PEMILU ===");

        int[] totalSuara = new int[calon];
        for (int j = 0; j < calon; j++) {
            for (int i = 0; i < wilayah; i++) {
                totalSuara[j] += suara[i][j];
            }
            System.out.println("Total suara calon " + (j+1) + ": " + totalSuara[j]);
        }
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

        System.out.println("\nPemenang di setiap wilayah:");
        for (int i = 0; i < wilayah; i++) {x
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

// BEGIN

//     INPUT jumlahCalon
//     INPUT jumlahWilayah

//     DECLARE suara[jumlahWilayah][jumlahCalon]
//     DECLARE totalSuara[jumlahCalon]

//     // Input data suara
//     FOR i ← 0 TO jumlahWilayah-1 DO
//         PRINT "Wilayah", i+1
//         FOR j ← 0 TO jumlahCalon-1 DO
//             PRINT "Suara calon", j+1
//             INPUT suara[i][j]
//         END FOR
//     END FOR

//     // Hitung total suara tiap calon
//     FOR j ← 0 TO jumlahCalon-1 DO
//         totalSuara[j] ← 0
//         FOR i ← 0 TO jumlahWilayah-1 DO
//             totalSuara[j] ← totalSuara[j] + suara[i][j]
//         END FOR
//         PRINT "Total suara calon", j+1, ":", totalSuara[j]
//     END FOR

//     // Cari wilayah dengan suara terbanyak untuk tiap calon
//     FOR j ← 0 TO jumlahCalon-1 DO
//         maxSuara ← suara[0][j]
//         maxWilayah ← 0
//         FOR i ← 1 TO jumlahWilayah-1 DO
//             IF suara[i][j] > maxSuara THEN
//                 maxSuara ← suara[i][j]
//                 maxWilayah ← i
//             END IF
//         END FOR
//         PRINT "Calon", j+1, "terbanyak di Wilayah", maxWilayah+1, "(", maxSuara, "suara)"
//     END FOR

//     // Tentukan pemenang di setiap wilayah
//     FOR i ← 0 TO jumlahWilayah-1 DO
//         maxSuara ← suara[i][0]
//         pemenang ← 0
//         FOR j ← 1 TO jumlahCalon-1 DO
//             IF suara[i][j] > maxSuara THEN
//                 maxSuara ← suara[i][j]
//                 pemenang ← j
//             END IF
//         END FOR
//         PRINT "Wilayah", i+1, "dimenangkan oleh Calon", pemenang+1, "(", maxSuara, "suara)"
//     END FOR

//     // Tentukan pemenang nasional
//     maxTotal ← totalSuara[0]
//     pemenangNasional ← 0
//     FOR j ← 1 TO jumlahCalon-1 DO
//         IF totalSuara[j] > maxTotal THEN
//             maxTotal ← totalSuara[j]
//             pemenangNasional ← j
//         END IF
//     END FOR
//     PRINT "Pemenang nasional adalah Calon", pemenangNasional+1, "dengan", maxTotal, "suara"

//end