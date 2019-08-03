package NetEase.gzw;

import java.util.Scanner;

/**
 * @Author LingLong.gzw
 * @create 2019-08-03
 */
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for (int i=0; i<n ;i++){
            nums[i]=scanner.nextInt();
        }

        boolean flag=false;
        for(int i=1; i<n-1; i++){
            if(nums[i]<(nums[i-1]+nums[i+1])){
                flag=true;
            }
        }
        if(nums[0]>=(nums[1]+nums[n-1]) || nums[n-1]>=(nums[n-2]+nums[0])){
            flag=false;
        }
        if(flag==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
