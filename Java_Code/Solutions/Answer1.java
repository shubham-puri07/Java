package Solutions;

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of queries
        int q = scanner.nextInt();
        
        // Loop over each query
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            // Generate the series for the current query
            generateSeries(a, b, n);
        }
        
        scanner.close();
    }
    
    private static void generateSeries(int a, int b, int n) {
        int current_value = a;
        
        // Calculate each term in the series
        for (int j = 0; j < n; j++) {
            current_value += (Math.pow(2, j) * b);
            System.out.print(current_value + " ");
        }
        System.out.println();  // Move to the next line after printing each series
    }
}

