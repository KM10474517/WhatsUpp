package whatsupp;

import java.util.Scanner;
public class WhatsUpp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Validate Username
        System.out.print("Enter username (must contain '_' and be ≤5 chars): ");
        String username = scanner.nextLine();
        if (!ValidUser.validateUsername(username)) {
            System.exit(1); // Exit if invalid
        }
        
        // 2. Validate Password
        System.out.print("Enter password (≥8 chars, 1 uppercase, 1 number, 1 special char): ");
        String password = scanner.nextLine();
        if (!ValidUser.validatePassword(password)) {
            System.exit(1); // Exit if invalid
        }
        
        // 3. Validate Cellphone
        System.out.print("Enter cellphone (+ followed by 10 digits): ");
        String cellphone = scanner.nextLine();
        if (!ValidUser.validateCellNumber(cellphone)) {
            System.exit(1); // Exit if invalid
        }
        
        // Only reach here if all validations passed
        System.out.println("\nSUCCESS! All inputs are valid:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Cellphone: " + cellphone);
    }
}
    
  
