import java.util.Scanner;

public class LibraryWifiAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Campus Access System ---");
        System.out.print("Are you a registered library member? (yes/no): ");
        String isMember = sc.nextLine().trim();

        System.out.print("Is your student ID valid? (yes/no): ");
        String validID = sc.nextLine().trim();

        if (isMember.equalsIgnoreCase("yes")) {
            System.out.println("Library access granted.");
        } else {
            System.out.println("Library access denied. Please register first.");
        }

        if (validID.equalsIgnoreCase("yes")) {
            System.out.println("WIFI access granted.");
        } else {
            System.out.println("WIFI access denied. Invalid student ID.");
        }
    }
}