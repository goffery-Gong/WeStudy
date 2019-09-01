package Tencent.lcq.Question5;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrs=new int[n];
        for(int i=0;i<n;i++){
            arrs[i]=sc.nextInt();
        }

        System.out.println(findMax(arrs));
    }
    private static int findMax(int[] arrs) {
        int n=arrs.length;
        int[] sum=new int[n];
        sum[0]=arrs[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+arrs[i];
        }

        Stack<Integer> stack=new Stack<Integer>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&arrs[stack.peek()]>=arrs[i]){
                int k=stack.pop();
                max=Math.max(max, stack.isEmpty()?sum[i-1]*arrs[k]:
                        (sum[i-1]-sum[stack.peek()])*arrs[k]);
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int j=stack.pop();
            max=Math.max(max,stack.isEmpty()?sum[n-1]*arrs[j]:
                    (sum[n-1]-sum[stack.peek()])*arrs[j]);
        }

        return max;
    }
}
