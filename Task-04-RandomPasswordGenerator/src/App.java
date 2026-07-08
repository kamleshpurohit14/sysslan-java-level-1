import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Password length must be greater than 0.");
            scanner.close();
            return;
        }

        scanner.nextLine();

        System.out.print("Include Uppercase (Y/N): ");
        char upper = scanner.next().charAt(0);
        System.out.print("Include Lowercase (Y/N): ");
        char lower = scanner.next().charAt(0);
        System.out.print("Include Numbers (Y/N): ");
        char number = scanner.next().charAt(0);
        System.out.print("Include Symbols (Y/N): ");
        char symbol = scanner.next().charAt(0);

        System.out.println("\n User Preferences ");
        System.out.println("Password Length: " + length);
        System.out.println("Include Uppercase: " + upper);
        System.out.println("Include Lowercase: " + lower);
        System.out.println("Include Numbers: " + number);
        System.out.println("Include Symbols: " + symbol);

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+[]{}<>?";

        String characterPool = "";
        if (upper == 'Y' || upper == 'y') {
            characterPool += uppercase;
        }
        if (lower == 'Y' || lower == 'y') {
            characterPool += lowercase;
        }
        if (number == 'Y' || number == 'y') {
            characterPool += numbers;
        }
        if (symbol == 'Y' || symbol == 'y') {
            characterPool += symbols;
        }

        if (characterPool.isEmpty()) {
            System.out.println("No character types selected. Cannot generate password.");
            return;
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * characterPool.length());
            password.append(characterPool.charAt(randomIndex));
        }
        System.out.println("Generated Password: " + password.toString());

        scanner.close();
    }
}
