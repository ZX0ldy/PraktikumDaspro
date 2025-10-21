import java.util.Scanner;

public class DoWhileLeaveEntitlement17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement = 10;
        int numLeave;
        String confirmation;

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                while (true) {
                    System.out.print("How many day(s)? ");
                    numLeave = input.nextInt();

                    if (numLeave <= leaveEntitlement) {
                        leaveEntitlement -= numLeave;
                        System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                        break;
                    } else {
                        System.out.println("You don’t have enough leave entitlement. Please enter a valid number (max " + leaveEntitlement + ").");
                    }
                }
            } else {
                break;
            }
        } while (leaveEntitlement > 0);

        System.out.println("Program ended. Remaining leave entitlement: " + leaveEntitlement);
        input.close();
    }
}

// jobsheet