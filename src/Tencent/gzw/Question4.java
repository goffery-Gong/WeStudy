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
        List<Integer> scores =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores.add(scanner.nextInt());
        }

    }

    class Node{
        int val;
        int start;
        int end;
    }
}
