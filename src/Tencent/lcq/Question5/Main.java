package Tencent.lcq.Question5;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] state = new int[101];
            int[] sum = new int[n];
            int[] last = new int[101];
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < 101; i++) {
                last[i] = -1;
                state[i] = 0;
                list.add(new ArrayList<Integer>());
            }

            for(int i = 0; i < n; i++) {
                int data = scanner.nextInt();
                if(i == 0) {
                    sum[i] = data;
                }
                else {
                    sum[i] = sum[i-1]+data;
                }
                last[data] = i;
                if(state[data] == 0) {
                    int first = -1;
                    for(int j = 0; j < data; j++) {
                        if(last[j] > first) {
                            first = last[j];
                        }
                    }
                    list.get(data).add(first);
                    state[data] = 1;
                }
                for(int j = data+1; j < 101; j++) {
                    if(state[j] == 1) {
                        list.get(j).add(i-1);
                        state[j] = 0;
                    }
                }
            }

            int max = -1;
            for(int i = 0; i < 101; i++) {
                if(state[i] == 1) {
                    list.get(i).add(n-1);
                }
                for(int j = 0; j < list.get(i).size(); ) {
                    int start = 0;
                    if(list.get(i).get(j) != -1) {
                        start = sum[list.get(i).get(j)];
                    }
                    int end = sum[list.get(i).get(j+1)];

                    int ans = i*(end-start);
                    if(ans > max) {
                        max = ans;
                    }
                    j += 2;
                }
            }
            System.out.println(max);
        }
    }
}
