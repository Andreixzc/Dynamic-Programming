package DWT;

public class Dwt {
    public static void main(String[] args) {
        int[] sequence1 = {2, 5, 8, 3, 6, 9, 4, 7, 10};
        int[] sequence2 = {1, 4, 7, 2, 5, 8, 3, 6, 9};
        double[][] dp = new double[sequence1.length][sequence2.length];
        fillMatriz(dp);
        System.out.println(dwtDp(dp, sequence1, sequence2));

    }

    public static double dwtDp(double[][] dp, int[] seq1, int[] seq2) {
        dp[0][0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                double cost = Math.abs(seq1[i] - seq2[j]);
                dp[i][j] = cost + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
            }
        }
        return dp[seq1.length - 1][seq2.length - 1];

    }

    public static void fillMatriz(double[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = Double.POSITIVE_INFINITY;
            }
        }
    }
}
