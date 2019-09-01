package Tencent.lcq.Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            list.add(a);
            sum += a;
        }

        int out = 0;
        int max_array = Collections.max(list);
        if(m > sum){
            out = max_array;
        }else{

        }
    }
}
