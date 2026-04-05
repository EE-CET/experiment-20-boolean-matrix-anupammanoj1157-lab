import java.util.Scanner;

public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt())
            return;
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            boolean hasOne = false;
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() == 1) {
                    hasOne = true;
                }
            }

            for (int j = 0; j < n; j++) {
                if (hasOne) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}