package KnapSack;

public class KnapSack {
    public static int[] values = { 60, 100, 120 }; // Valores dos itens
    public static int[] weights = { 10, 20, 30 }; // Pesos dos itens

    public static void main(String[] args) {
        // System.out.println(knapSackMemo(50, values.length));
        System.out.println(knapSackTabulation(5, values.length));
    }

    public static int knapSackMemo(int cap, int n) {
        int[][] memo = new int[n + 1][cap + 1];
        fillMemo(memo);

        return knapSackMemo(cap, n, memo);
    }

    public static int knapSackMemo(int cap, int n, int[][] memo) {
        if (n == 0 || cap == 0) {
            return 0;
        }
        if (memo[n][cap] != -1) {
            return memo[n][cap];
        }
        if (weights[n - 1] > cap) {
            memo[n][cap] = knapSackMemo(cap, n - 1, memo);
        } else {
            int pegar = memo[n][cap] = values[n - 1] + knapSackMemo(cap - weights[n - 1], n - 1, memo);
            int passar = memo[n][cap] = knapSackMemo(cap, n - 1, memo);
            return Math.max(pegar, passar);
        }
        return memo[n][cap];
    }

    public static int knapSackTabulation(int cap, int n) {
        int[][] dp = new int[values.length + 1][cap + 1];
        return knapSackTabulation(dp, cap, 0);
    }

    public static int knapSackTabulation(int[][] dp, int cap, int n) {

        for (int i = 0; i <= dp.length-1; i++) {
            for (int j = 0; j <= cap; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (weights[i] <= cap) {
                    int pegar = dp[i - 1][j];
                    int passar = values[i] + dp[i - 1][j - weights[i]];
                    dp[i][j] = Math.max(pegar, passar);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[values.length][cap];
    }

    public static void fillMemo(int[][] memo) {
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }
    }

}