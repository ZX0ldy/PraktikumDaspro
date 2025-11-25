import java.util.Scanner;

public class MotorCreditAli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga motor (Rp): ");
        double price = input.nextDouble();

        System.out.print("Masukkan uang muka (Rp): ");
        double downPayment = input.nextDouble();

        System.out.print("Masukkan lama cicilan (bulan): ");
        int months = input.nextInt();

        double balance = price - downPayment;
        double interestRate = 0.01;
        double monthlyInstallment = (balance / months) + (balance * interestRate);

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Harga motor      : Rp " + price);
        System.out.println("Uang muka        : Rp " + downPayment);
        System.out.println("Sisa pinjaman    : Rp " + balance);
        System.out.println("Lama cicilan     : " + months + " bulan");
        System.out.println("Cicilan per bulan: Rp " + monthlyInstallment);
    }
}
    
