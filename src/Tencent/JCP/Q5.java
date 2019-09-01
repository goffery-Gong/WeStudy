package Tencent.JCP;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		int max_t = 0;
		for (int i = 0; i < t; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			max_t = Math.max(max_t, b[i]);
		}
		long[] dp = new long[max_t + 1];
		dp[0] = 1L;
		for (int i = 1; i <= max_t; i++) {
			if(i >= k)
				dp[i] += dp[i - k];
			dp[i] += dp[i-1];
		}
		for (int i = 0; i < t; i++) {
			long out_t = 0;
			for (int j = a[i]; j <= b[i]; j++)
				out_t = out_t.add(new BigInteger(dp[j]+""));
			System.out.println(out_t);
		}

	}
}
