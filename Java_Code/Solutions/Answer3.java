package Solutions;

import java.util.Scanner;

public class Answer3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine();  // consume the newline character
        
        for (int i = 0; i < t; i++) {
            String numStr = scanner.nextLine();
            try {
                long num = Long.parseLong(numStr);
                System.out.println(numStr + " can be fitted in:");
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(numStr + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
    
    
}
