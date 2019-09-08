//package Tencent.JCP;
//
//import java.util.Scanner;
//
//public class Q5 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int t = scanner.nextInt();
//		int k = scanner.nextInt();
//		int[] a = new int[t];
//		int[] b = new int[t];
//		int max_t = 0;
//		for (int i = 0; i < t; i++) {
//			a[i] = scanner.nextInt();
//			b[i] = scanner.nextInt();
//			max_t = Math.max(max_t, b[i]);
//		}
//		long[] dp = new long[max_t + 1];
//<<<<<<< HEAD
//		dp[0] = 1L;
//		for (int i = 1; i <= max_t; i++) {
//			if(i >= k)
//				dp[i] += dp[i - k];
//			dp[i] += dp[i-1];
//=======
//		dp[0] = 1;
//		for (int i = 1; i <= max_t; i++) {
//			dp[i] = ((i >= k) ? dp[i - k] : 0) + dp[i - 1];
//>>>>>>> 6caf4b92a0ec38fbc4a67c48b881c0f069bf0e49
//		}
//		for (int i = 0; i < t; i++) {
//			long out_t = 0;
//			for (int j = a[i]; j <= b[i]; j++)
//<<<<<<< HEAD
//				out_t = out_t.add(new BigInteger(dp[j]+""));
//=======
//				out_t += dp[j];
//>>>>>>> 6caf4b92a0ec38fbc4a67c48b881c0f069bf0e49
//			System.out.println(out_t);
//		}
//
//	}
//}
