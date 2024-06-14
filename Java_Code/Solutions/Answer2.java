package Solutions;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer n
        int n = scanner.nextInt();
        
        // Convert the integer n to a string s
        String s = Integer.toString(n);
        
        // Check if the conversion is successful
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        
        scanner.close();
    }
}
