package shopee;

import java.util.Scanner;

/**
 * @Author LingLong.gzw
 * @create 2019-08-03
 */
public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(reverse(x));
    }


    public static int reverse2(int x){
        int rev=0;
        while(x!=0){
            int pop=x%10;
            x/=10;
            if(rev>Integer.MAX_VALUE/10 || (rev ==Integer.MAX_VALUE/10 &&pop>7)) return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev ==Integer.MIN_VALUE/10 &&pop<-8)) return 0;
            rev=rev*10+pop;
        }
        return rev;
    }
    public static int reverse(int x) {
        long a = 0;
        int b = 0;
        if (x >= 0) {
            b = (x + "").length();//正数
        } else {
            b = (x + "".length()) - 1;//负数
        }

        for (int i = 0; i < b; i++) {
            int a1 = x % 10;
            x = (x - a1) / 10;
            a += (int) (a1 * Math.pow(10, b - i - 1));
        }

        if ((a > Math.pow(2, 31) - 1) || (a < (-1) * Math.pow(2, 31))) {
            return 0;
        }
        return (int) a;
    }
}
