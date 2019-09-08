//package Tencent.JCP;
//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//
//	static int _min = Integer.MAX_VALUE;
//	static int[] Feature_a;
//	static int[] Feature_b;
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		// 学生数
//		int n = scanner.nextInt();
//		Feature_a = new int[n];
//		Feature_b = new int[n];
//		for (int i = 0; i < n; i++) {
//			Feature_a[i] = scanner.nextInt();
//			Feature_b[i] = scanner.nextInt();
//		}
//		_min = Integer.MAX_VALUE;
//		int[] index = new int[n];
//		for (int i = 0; i < n; i++)
//			index[i] = i;
//		int sum_t = 0;
//		process(index, sum_t, 0);
//		System.out.println(_min);
//
//	}
//
//	private static void process(int[] index, BigInteger sum_t, int i) {
//		int len = index.length;
//
//		BigInteger sum_temp = sum_t;
//		if(sum_temp > _min) {
//			return;
//		}
//		if (i == len) {
//			_min = Math.min(_min, sum_t);
//			return;
//		}
//		for (int j = i; j < len; j++) {
//			swap(index, i, j);
//			BigInteger a = BigInteger.valueOf(Feature_a[index[i]] * i);
//			BigInteger b = BigInteger.valueOf(Feature_b[index[i]] * (len - i - 1));
//			BigInteger sum = BigInteger.valueOf(sum_t);
//			BigInteger temp = a.add(b).add(sum);
//			//sum_temp = sum_t + Feature_a[index[i]] * i + Feature_b[index[i]] * (len - i - 1);
//			process(index, temp, i + 1);
//			swap(index, j, i);
//		}
//
//
//
//
//
//
//
//	}
//
//	private static void swap(int[] index, int i, int j) {
//		int temp = index[i];
//		index[i] = index[j];
//		index[j] = temp;
//
//	}
//
//}
