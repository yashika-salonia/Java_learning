package arrays;
public class MCM {
    static int count = 0;
    public static void main(String[] args) {
//        int[] p = {1, 5, 7};  // Example Input
        int[] p = {1, 6, 5, 4, 3};
        int n = p.length - 1;
        int[][] m = new int[n][n];
        int[][] s = new int[n - 1][n - 1];

        // Matrix Chain Multiplication DP Table Filling
        for (int l = 2; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    count++;  // Counting main multiplication operation
                    int q = m[i][k] + m[k + 1][j] + p[i] * p[j + 1] * p[k + 1];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j - 1] = k;
                    }
                }
            }
        }

        // Printing results
        System.out.println("\nMatrix M:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix S:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nOptimal Parenthesization: ");
        Parenthesis(s, 0, n - 1);
        System.out.println("\nOperation Count: " + count);
    }

    static void Parenthesis(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + (i + 1));
            return;
        }
        System.out.print("(");
        Parenthesis(s, i, s[i][j - 1]);
        Parenthesis(s, s[i][j - 1] + 1, j);
        System.out.print(")");
    }
}
