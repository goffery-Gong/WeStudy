package iqy.lcq.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int n = 0;
    static List<Integer[]> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arrA = new int[n-1];
        Integer[] arrP = new Integer[n];
        for(int i=0;i<n-1;i++){
            arrA[i] = scanner.nextInt();
        }
        int[] flag = new int[n];
        dfs(0, flag, arrP);

        for(int i=0;i<list.size();i++){
            Integer[] arr = list.get(i);
            for(int j=0;i<arr.length;j++)
                System.out.println(arr[i]);
        }
    }

    private static void dfs(int idx, int[] flag, Integer[] arrP) {
        int i = 0;
        if(idx == n){
            Integer[] arr = Arrays.copyOf(arrP, n);
            list.add(arr);
            return;
        }
        for(i=0;i<n;i++){
            if(flag[i] ==0){
                arrP[idx] = i+1;
                flag[i] = 1;
                dfs(idx+1, flag, arrP);
                flag[i] = 0;
            }
        }
    }
}
