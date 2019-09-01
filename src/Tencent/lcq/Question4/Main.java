package Tencent.lcq.Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            int w = arr[i];
            int idx_start = 0;
            int idx_end = 0;
            for(int p=i-1;p>=0;p--){
                if(arr[p]<w){
                    idx_start = p+1;
                }
            }
            for(int p=i+1;p<n;p++){
                if(arr[p]<w){
                    idx_end = p-1;
                }
            }
            int sum = 0;
            for(int q = idx_start;q<=idx_end;q++){
                sum += arr[q];
            }
            int res = arr[i] * sum;
            list.add(res);
        }
        int out = Collections.max(list);
        System.out.println(out);
    }
}
