import java.util.Scanner;

public class FuelCostTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak Malang - Surabaya (km): ");
        double distance = input.nextDouble();

        double fuelNeeded = distance / 2;
        double fuelPrice = 10000;
        double totalCost = fuelNeeded * fuelPrice;

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Jarak perjalanan : " + distance + " km");
        System.out.println("Bahan bakar perlu: " + fuelNeeded + " liter");
        System.out.println("Biaya total      : Rp " + totalCost);
    }
}
