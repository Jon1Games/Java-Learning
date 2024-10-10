
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Create a scanner and objekts
        Scanner scanner = new Scanner(System.in);
        int part;

        // Print information about program
        information();

        // Capture the input and check for right objekt type
        String input = scanner.next();
        try {
            part = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("You need to enter an Number from the top!");
            return;
        }

        switch (part) {
            case 0:
                break;
            case 1:
                HelloWorld.print();
                break;
            default:
                System.err.println("You need to enter an Number from the top!");
                return;
        }
    }

    public static void information() {
        // Print information about program
        System.err.println("Num | Projekt part");
        System.err.println("  0 | Exit");
        System.err.println("  1 | HelloWorld");
        System.err.print("Projektpart: ");
    }
}