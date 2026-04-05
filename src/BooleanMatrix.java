import java.util.Scanner;

public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions
        if (!sc.hasNextInt())
            return;
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            boolean hasOne = false;
            int[] row = new int[n];

            // Read the current row and check for any '1'
            for (int j = 0; j < n; j++) {
                row[j] = sc.nextInt();
                if (row[j] == 1) {
                    hasOne = true;
                }
            }

            // Print the output for this row based on the flag
            for (int j = 0; j < n; j++) {
                if (hasOne) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}