import java.util.Scanner;

public class BensinMotor {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // U pengguna memasukkan kapasitas mesin (liter per km)
        System.out.print("Masukkan kapasitas mesin (liter/km): ");
        double kapasitasMesin = input.nextDouble();

        // Meminta data untuk perjalanan di jalan kota
        System.out.print("Masukkan kecepatan rata-rata di jalan kota (km/jam): ");
        double kecepatanKota = input.nextDouble();
        System.out.print("Masukkan durasi perjalanan di jalan kota (jam): ");
        double durasiKota = input.nextDouble();

        // Meminta data untuk perjalanan di jalan tol
        System.out.print("Masukkan kecepatan rata-rata di jalan tol (km/jam): ");
        double kecepatanTol = input.nextDouble();
        System.out.print("Masukkan durasi perjalanan di jalan tol (jam): ");
        double durasiTol = input.nextDouble();

        // Meminta data untuk perjalanan di pegunungan
        System.out.print("Masukkan kecepatan rata-rata di pegunungan (km/jam): ");
        double kecepatanGunung = input.nextDouble();
        System.out.print("Masukkan durasi perjalanan di pegunungan (jam): ");
        double durasiGunung = input.nextDouble();

        // Meminta target konsumsi bahan bakar harian
        System.out.print("Masukkan target konsumsi bahan bakar harian (liter): ");
        double targetBahanBakar = input.nextDouble();

        // Menghitung konsumsi bahan bakar di jalan kota
        double konsumsiKota = ((kecepatanKota * durasiKota) / 100) * kapasitasMesin * 0.5;

        // Menghitung konsumsi bahan bakar di jalan tol
        double konsumsiTol = ((kecepatanTol * durasiTol) / 100) * kapasitasMesin * 0.3;

        // Menghitung konsumsi bahan bakar di pegunungan
        double konsumsiGunung = ((kecepatanGunung * durasiGunung) / 100) * kapasitasMesin * 0.7;

        // Menghitung total konsumsi bahan bakar
        double totalKonsumsi = konsumsiKota + konsumsiTol + konsumsiGunung;

        // Menghitung total jarak tempuh (km)
        double totalJarak = (kecepatanKota * durasiKota)
                          + (kecepatanTol * durasiTol)
                          + (kecepatanGunung * durasiGunung);

        // Menghitung rata-rata konsumsi per km
        double rataPerKm = totalKonsumsi / totalJarak;

        // Menghitung persentase dari target konsumsi harian
        double persentaseTarget = (totalKonsumsi / targetBahanBakar) * 100;

        // Menampilkan hasil perhitungan
        System.out.println("\n=== Hasil Perhitungan Konsumsi Bahan Bakar ===");
        System.out.println("Konsumsi di jalan kota       : " + konsumsiKota + " liter");
        System.out.println("Konsumsi di jalan tol        : " + konsumsiTol + " liter");
        System.out.println("Konsumsi di daerah pegunungan: " + konsumsiGunung + " liter");
        System.out.println("Total konsumsi bahan bakar   : " + totalKonsumsi + " liter");
        System.out.println("Rata-rata konsumsi per km    : " + rataPerKm + " liter/km");
        System.out.println("Pencapaian target harian     : " + persentaseTarget + "%");
    }
}
