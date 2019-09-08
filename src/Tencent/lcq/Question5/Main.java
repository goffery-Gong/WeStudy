//package Tencent.lcq.Question5;
//
//import java.util.Scanner;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] array=new int[n];
//        for(int i=0;i<n;i++){
//            array[i]=sc.nextInt();
//        }
//
//        System.out.println(findMax(array));
//    }
//    private static int findMax(int[] array) {
//        int n=array.length;
//        int[] sum=new int[n];
//        sum[0]=array[0];
//        for(int i=1;i<n;i++){
//            sum[i]=sum[i-1]+array[i];
//        }
//
//        Stack<Integer> stack=new Stack<Integer>();
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            while(!stack.isEmpty()&&array[stack.peek()]>=array[i]){
//                int k=stack.pop();
//                while(!stack.isEmpty()){
//                    int value1 = sum[i-1]*array[k];
//                    int value2 = sum[i-1]-sum[stack.peek()])*array[k];
//                }
//                max=Math.max(max, stack.isEmpty()?sum[i-1]*array[k]:
//                        (sum[i-1]-sum[stack.peek()])*array[k]);
//            }
//            stack.push(i);
//        }
//
//        while(!stack.isEmpty()){
//            int j=stack.pop();
//            max=Math.max(max,stack.isEmpty()?sum[n-1]*array[j]:
//                    (sum[n-1]-sum[stack.peek()])*array[j]);
//        }
//
//        return max;
//    }
//}
