import java.util.Scanner;

public class backupexam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tipe hari (weekday/weekend)
        System.out.print("Enter day type (weekday/weekend): ");
        String dayType = input.nextLine().toLowerCase();

        // Input umur penonton
        System.out.print("Enter viewer age: ");
        int age = input.nextInt();

        // Deklarasi variabel
        double basePrice;   // harga dasar tiket
        double finalPrice;  // harga akhir setelah diskon/surcharge
        double discount = 0; 
        double surcharge = 0; 

        // Validasi input
        if ((!dayType.equals("weekday") && !dayType.equals("weekend")) || age <= 0) {
            System.out.println("Invalid input! Please check your entries.");
            return;
        }

        // Tentukan harga dasar berdasarkan hari
        if (dayType.equals("weekday")) {
            basePrice = 40000;
        } else {
            basePrice = 50000;
        }

        // Aturan diskon dan surcharge
        if (dayType.equals("weekday")) {
            if (age <= 12) {
                discount = 0.5; // anak-anak weekday: diskon 50%
            } else if (age >= 60) {
                discount = 0.3; // lansia weekday: diskon 30%
            }
        } else if (dayType.equals("weekend")) {
            if (age <= 12) {
                discount = 0.3; // anak-anak weekend: diskon 30%
            } else if (age >= 60) {
                discount = 0.1; // lansia weekend: diskon 10%
            } else if (age >= 18 && age <= 25) {
                surcharge = 0.05; // tambahan biaya 5% untuk usia 18–25 weekend
            }
        }

        // Hitung harga akhir
        finalPrice = basePrice * (1 - discount) * (1 + surcharge);

        // Tampilkan hasil
        System.out.println("\n=== Ticket Calculation ===");
        System.out.println("Base price        : " + basePrice);
        if (discount > 0) {
            System.out.println("Discount applied   : " + (discount * 100) + "%");
        }
        if (surcharge > 0) {
            System.out.println("Surcharge applied  : " + (surcharge * 100) + "%");
        }
        System.out.println("Final ticket price : " + finalPrice);
    }
}
