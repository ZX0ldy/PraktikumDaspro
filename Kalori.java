import java.util.Scanner;

public class Kalori {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double weight = input.nextDouble();

        System.out.print("Masukkan durasi Running (menit): ");
        int durationRunning = input.nextInt();
        System.out.print("Masukkan kecepatan rata-rata Running (km/h): ");
        double speedRunning = input.nextDouble();

        System.out.print("Masukkan durasi Swimming (menit): ");
        int durationSwimming = input.nextInt();
        System.out.print("Masukkan kecepatan rata-rata Swimming (km/h): ");
        double speedSwimming = input.nextDouble();

        System.out.print("Masukkan durasi Cycling (menit): ");
        int durationCycling = input.nextInt();
        System.out.print("Masukkan kecepatan rata-rata Cycling (km/h): ");
        double speedCycling = input.nextDouble();

        System.out.print("Masukkan ketinggian latihan (meter): ");
        double altitude = input.nextDouble();

        System.out.print("Masukkan target kalori harian: ");
        double targetCalories = input.nextDouble();

        double caloriesRunning = (durationRunning * 0.05 * weight) + (speedRunning * 0.5) + (altitude * 0.01);
        double caloriesSwimming = (durationSwimming * 0.04 * weight) + (speedSwimming * 0.5) + (altitude * 0.01);
        double caloriesCycling = (durationCycling * 0.03 * weight) + (speedCycling * 0.5) + (altitude * 0.01);

        double totalCalories = caloriesRunning + caloriesSwimming + caloriesCycling;
        int totalDuration = durationRunning + durationSwimming + durationCycling;
        double avgCaloriesPerMinute = totalCalories / totalDuration;
        double percentageTarget = (totalCalories / targetCalories) * 100;

        System.out.println("\n=== Hasil Perhitungan Kalori ===");
        System.out.println("Kalori terbakar Running   : " + caloriesRunning);
        System.out.println("Kalori terbakar Swimming  : " + caloriesSwimming);
        System.out.println("Kalori terbakar Cycling   : " + caloriesCycling);
        System.out.println("Total kalori terbakar     : " + totalCalories);
        System.out.println("Rata-rata kalori/menit    : " + avgCaloriesPerMinute);
        System.out.println("Pencapaian target harian  : " + percentageTarget + "%");
    }
}
