import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("            LOGIN PANEL                ");
        System.out.println("========================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.length() >= 8 && password.length() >= 6) {
            Random random = new Random();
            int authCode = random.nextInt(900000) + 100000;
            System.out.println("\n" + "========================================");
            System.out.println("Login successful!");
            System.out.println("Your 6-digit authentication code is: " + authCode);
            System.out.println("========================================");
        } else {
            System.out.println("\n" + "========================================");
            System.out.println("Invalid login. Username must be at least 8 characters,");
            System.out.println("and password must be at least 6 characters.");
            System.out.println("========================================");
        }
        scanner.close();
    }
}