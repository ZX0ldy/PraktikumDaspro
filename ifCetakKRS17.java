import java.util.Scanner;

public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS Siakad ---");
        System.out.print("Have the tuition fees been paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String message = uktLunas ? "UKT Payment Has Been Verified" : "Registration rejected. Please pay UKT first.";
        System.out.println(message);
    }
}