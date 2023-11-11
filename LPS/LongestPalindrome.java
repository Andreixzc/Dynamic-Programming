package LPS;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(longestPalindrome(str));
    }

    public static int longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        fillDp(dp);
        return longestPalindrome(s, 0, s.length() - 1, dp);
    }

    public static int longestPalindrome(String s, int i, int j, int[][] dp) {
        if (i > j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = 2 + longestPalindrome(s, i + 1, j - 1, dp);
        } else {
            dp[i][j] = Math.max(longestPalindrome(s, i + 1, j, dp),
                    longestPalindrome(s, i, j - 1, dp));
        }
        return dp[i][j];
    }

    public static void fillDp(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }
}

