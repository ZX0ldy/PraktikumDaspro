import java.util.Scanner;

public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // gunakan nama sc
        System.out.println("--- Print KRS Siakad ---");
        System.out.print("Have the tuition fees been paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // contoh penggunaan
        if (uktLunas) {
            System.out.println("UKT Payment Has Been Verified");
         } else {
            System.out.println("Registration rejected. Please pay UKT first.");
        }

    }
}