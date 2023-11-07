package LCS;


public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        System.out.println(longestCommonSubsequenceIterative(str1, str2));
    }

    public static int longestCommonSubsequenceRecursive(String s1, String s2) {
        int[][] memo = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                memo[i][j] = -1;
            }
        }

        return longestCommonSubsequenceRecursive(s1, s2, memo, s1.length() - 1, s2.length() - 1);
    }

    public static int longestCommonSubsequenceRecursive(String s1, String s2, int[][] memo, int i,
            int j) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (s1.charAt(i) != s2.charAt(j)) {

            return memo[i][j] = Math.max(longestCommonSubsequenceRecursive(s1, s2, memo, i - 1, j),
                    longestCommonSubsequenceRecursive(s1, s2, memo, i, j - 1));
        } else {
            return memo[i][j] = 1 + longestCommonSubsequenceRecursive(s1, s2, memo, i - 1, j - 1);
        }

    }

    public static int longestCommonSubsequenceIterative(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) != s2.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                } else {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
