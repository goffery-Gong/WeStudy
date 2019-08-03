package NetEase.lcq;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] score = new int[num];
        for(int i=0;i<num;i++){
            score[i] = scanner.nextInt();
        }
        int queryNum =  scanner.nextInt();
        int[] query = new int[queryNum];
        for(int i=0;i<queryNum;i++){
            query[i] = scanner.nextInt();
        }
        for(int i = 0;i<queryNum;i++){
            String result = calculate(score, queryNum, query[i]-1, num);
            System.out.println(result);
        }
    }
    public static String calculate(int[] score, int queryNum, int index, int num){
        int s = score[index];
        int count = 0;
        int[] sortScore = new int[num];
        sortScore = Arrays.copyOf(score, num);
        Arrays.sort(sortScore);
//        int lo = 0;
//        int hi = num-1;
//        int mid = lo+(hi-lo)/2;
//        while(lo <= hi){
//            mid = lo+(hi-lo)/2;
//            if(sortScore[mid] > s){
//                hi = mid-1;
//            }else if(sortScore[mid] < s){
//                lo = mid+1;
//            }
//            else{
//                break;
//            }
//        }
        if( s<= score[sortScore.length/2]){
            for(int i=0;i<sortScore.length;i++){
                if(sortScore[i] <= s) {
                    count++;
                }else{
                    break;
                }
            }
        }else{
            for(int i=sortScore.length-1;i>=0;i--){
                if(sortScore[i] > s) {
                    count++;
                }else{
                    break;
                }
            }
            count = num - count;
        }
        double res = (count-1)/(double)num;
        //double res = (mid)/(double)num;
        res = res*100;
        String result = String.format("%.6f", res);
        return result;
    }
}
