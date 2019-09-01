package Tencent.gzw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author goffery
 * @date 2019/08/20
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Node[] v = new Node[n];
        Long[] inc = new Long[n];

        for (int i = 0; i < n; i++) {
            v[i].val = scanner.nextInt();
            inc[i] = i == 0 ? v[i].val : inc[i - 1] + v[i].val;
            v[i].start=i;
            v[i].end=i;
        }

    }

    class Node {
        int val;
        int start;
        int end;
    }
}
