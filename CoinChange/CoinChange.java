package CoinChange;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChangeTabulation(coins, amount));

    }

    public static int coinChangeTabulation(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        if (dp[dp.length - 1] == amount + 1) {
            return -1;
        }
        return dp[dp.length - 1];
    }

    public static int CoinChangeMemo(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        return coinChangeMemo(coins, amount, memo);
    }

    private static int coinChangeMemo(int[] coins, int amount, int[] memo) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        if (memo[amount] != -1) {
            return memo[amount];
        }

        int minCoins = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            int subproblem = coinChangeMemo(coins, amount - coin, memo);

            if (subproblem == -1) {
                continue;
            }

            if (subproblem + 1 < minCoins) {
                minCoins = subproblem + 1;
            }
        }

        if (minCoins == Integer.MAX_VALUE) {
            memo[amount] = -1;
        } else {
            memo[amount] = minCoins;
        }

        return memo[amount];
    }
}
